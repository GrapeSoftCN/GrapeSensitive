package model;

import org.json.simple.JSONObject;

import apps.appsProxy;
import check.formHelper;
import check.formHelper.formdef;
import database.DBHelper;
import database.db;

public class KeyWordsModel {
	private DBHelper KeyWords;
	private formHelper form;

	public KeyWordsModel() {
		KeyWords = new DBHelper(appsProxy.configValue().get("db").toString(), "SensitiveWords");
		form = KeyWords.getChecker();
		form.putRule("content", formdef.notNull);
	}

	public int checkWord(JSONObject object) {
		return !form.checkRuleEx(object) ? 1 : 0;
	}

	public db getdb() {
		return KeyWords;
	}
}
