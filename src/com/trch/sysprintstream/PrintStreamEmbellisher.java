package com.trch.sysprintstream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;

/**
 * 
 * @author thomash
 *
 */
public class PrintStreamEmbellisher extends PrintStream {

	public PrintStreamEmbellisher(OutputStream out) {
		super(out);
	}

	@Override
	public void print(String s) {
		super.print(s + " " + generateDebugString());
	}
	
	@Override
	public void print(boolean b) {
		super.print(b + " " + generateDebugString());
	}

	@Override
	public void print(char c) {
		super.print(c + " " + generateDebugString());
	}

	@Override
	public void print(int i) {
		super.print(i + " " + generateDebugString());
	}

	@Override
	public void print(long l) {
		super.print(l + " " + generateDebugString());
	}

	@Override
	public void print(float f) {
		super.print(f + " " + generateDebugString());
	}

	@Override
	public void print(double d) {
		super.print(d + " " + generateDebugString());
	}

	@Override
	public void print(char[] s) {
		super.print(s + " " + generateDebugString());
	}

	@Override
	public void print(Object obj) {
		super.print(obj + " " + generateDebugString());
	}

	@Override
	public void println() {
		super.println(generateDebugString());
	}

	@Override
	public void println(boolean x) {
		super.println(x + " " + generateDebugString());
	}

	@Override
	public void println(char x) {
		super.println(x + " " + generateDebugString());
	}

	@Override
	public void println(int x) {
		super.println(x + " " + generateDebugString());
	}

	@Override
	public void println(long x) {
		super.println(x + " " + generateDebugString());
	}

	@Override
	public void println(float x) {
		super.println(x + " " + generateDebugString());
	}

	@Override
	public void println(double x) {
		super.println(x + " " + generateDebugString());
	}

	@Override
	public void println(char[] x) {
		super.println(x + " " + generateDebugString());
	}

	@Override
	public void println(Object x) {
		super.println(x + " " + generateDebugString());
	}

	@Override
	public PrintStream printf(String format, Object... args) {
		return super.printf(format, args);
	}

	@Override
	public PrintStream printf(Locale l, String format, Object... args) {
		return super.printf(l, format, args);
	}

	@Override
	public void println(String message) {
		super.println(message);
	}
	
	private String generateDebugString(){
		return "[ " + getThreadName() + ", " + getStackFrameOfInvokingMethod() + " ]";
	}

	private String getThreadName(){
		return "thread = " + Thread.currentThread().getName();
	}
	
	private String getStackFrameOfInvokingMethod(){
		
		final String unknown = "frame = unknown";
		
		final StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		if(stackTraceElements.length < 7){
			return unknown;
		}
		return "frame = " + stackTraceElements[6].toString();
	}

}
