package test;

import httpServer.booter;

public class TestKeyWords {
	public static void main(String[] args) {
		booter booter = new booter();
		 try {
		 System.out.println("GrapeSense!");
		 System.setProperty("AppName", "GrapeSense");
		 booter.start(1003);
		 } catch (Exception e) {
		 }
	}
}
