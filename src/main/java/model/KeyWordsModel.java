package model;

import org.json.simple.JSONObject;

import apps.appsProxy;
import database.db;
import esayhelper.DBHelper;
import esayhelper.formHelper;
import esayhelper.formHelper.formdef;

public class KeyWordsModel {
	private static DBHelper KeyWords;
	private static formHelper form;
	static {
		KeyWords = new DBHelper(appsProxy.configValue().get("db").toString(), "SensitiveWords");
		form = KeyWords.getChecker();
	}

	public KeyWordsModel() {
		form.putRule("content", formdef.notNull);
	}

	public int checkWord(JSONObject object) {
		return !form.checkRuleEx(object) ? 1 : 0;
	}

	public db getdb() {
		return KeyWords;
	}
}
