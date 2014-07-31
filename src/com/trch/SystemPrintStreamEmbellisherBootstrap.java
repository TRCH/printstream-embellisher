package com.trch;

/**
 * 
 * @author thomas hutchinson
 *
 */
public class SystemPrintStreamEmbellisherBootstrap {

	private final boolean ENABLED;
	private boolean hasInit = false; 
	
	public SystemPrintStreamEmbellisherBootstrap(){
		ENABLED = isEnabled();
	}

	public SystemPrintStreamEmbellisherBootstrap(final boolean enabled){
		this.ENABLED = enabled;
	}
	
	private boolean isEnabled() {
		return Boolean.valueOf(System.getProperty("system.printstream.embellisher.enabled", "false"));
	}
	
		
	public void init(){
		
		if(hasInit){
			throw new IllegalStateException("init method has already been called");
		}
		
		if(ENABLED){
			System.setOut(new PrintStreamEmbellisher(System.out));
			System.setErr(new PrintStreamEmbellisher(System.err));
			hasInit = true;
		}
	}
	
}
