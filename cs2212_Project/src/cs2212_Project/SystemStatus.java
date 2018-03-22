package cs2212_Project;


public class SystemStatus {
	
	private boolean status;
	
	public SystemStatus() {
		status = false;
	}
	
	public void start() {
		status = true;
	}
	
	public void stop() {
		status = false;
	}
	
	public boolean isStarted() {
		return status;
	}
}
