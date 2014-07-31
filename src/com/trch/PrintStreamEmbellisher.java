package com.trch;
import java.io.OutputStream;
import java.io.PrintStream;


public class PrintStreamEmbellisher extends PrintStream {

	public PrintStreamEmbellisher(OutputStream out) {
		super(out);
	}

	@Override
	public void print(String s) {
		super.print(s);
	}
	
	@Override
	public void println(String message) {
		super.println(message + " " + generateDebugString());
	}
	
	private String generateDebugString(){
		return "[ " + getThreadName() + " " + getStackFrameOfInvokingMethod() + " ]";
	}

	private String getThreadName(){
		return "thread=" + Thread.currentThread().getName();
	}
	
	private String getStackFrameOfInvokingMethod(){
		
		final String unknown = "frame=unknown";
		
		final StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		if(stackTraceElements.length < 5){
			return unknown;
		}
		return "frame="+stackTraceElements[4].toString();
	}

}
