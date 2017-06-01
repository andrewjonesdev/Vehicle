package mobileTransportation;

public interface Vehicle {

	public int getSpeed();
	
	public boolean hasStarted();
	
	public boolean hasStopped();
	
	public boolean isAccelerating();
	
	public boolean isDecelerating();
	
	public String getColor();
	
	public String getModel();
	
	public void setSpeed(int sp);
	
	public void accelerate();
	
	public void decelerate();
	
	public void start();
	
	public void stop();
	
	public void setColor(String co);
	
	public void setModel(String mo);
	
}
