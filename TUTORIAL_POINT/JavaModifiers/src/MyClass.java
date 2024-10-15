class AudioPlayer{
	protected boolean openSpeaker(String sp) {
		// Implementation details
		return true;
	}
}

class StreamingAudioPlayer{
	boolean openSpeaker(String sp) {
		// Implementation details
		return true;
	}
}

public class MyClass {
	
	// public member
	public int x=100;
	
	// private member
	private String format;
	
	// default
	boolean processOrder() {
		return true;
	}
	
	// getter for private member
	public String getformat() {
		return format;
	}
	// setter for private nenber
	public void setFormat(String format) {
		this.format=format;
	}
	
}
