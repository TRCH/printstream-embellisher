package com.trch;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;


public class Client {

	
	public static void main(String[] args) throws FileNotFoundException {
		new SystemPrintStreamEmbellisherBootstrap().init();
		System.err.println("foo");
	}
	

}
