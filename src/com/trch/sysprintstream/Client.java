package com.trch.sysprintstream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Client {
	public static void main(String[] args) throws FileNotFoundException {
		new SystemPrintStreamEmbellisherBootstrap().init();
		System.out.println("info");
		System.err.println("error");
	}
}
