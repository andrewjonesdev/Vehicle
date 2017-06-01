package mobileTransportation;

public class Plane implements Vehicle {

	private int speed = 60;
	private boolean started = false;
	private boolean accelerating = false;
	private boolean flying = false;
	private String color = "Gold";
	private String model = "Boeing 747";
	
	
	public Plane (int spe, boolean sta, boolean acc, boolean fly, String col, String mod){
		speed = spe;
		started = sta;
		accelerating = acc;
		flying = fly;
		color = col;
		model = mod;
	}
	public Plane (){
		
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public boolean hasStarted(){
		return started;
	}
	
	public boolean hasStopped(){
		return !started;
	}
	
	public boolean isAccelerating(){
		return accelerating;
	}
	
	public boolean isDecelerating(){
		return !accelerating;
	}
	
	public boolean isFlying(){
		return flying;
	}
	
	public boolean isOnGround(){
		return !flying;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setSpeed(int sp){
		speed = sp;
	}
	
	public void accelerate(){
		accelerating = true;
	}
	
	public void decelerate(){
		accelerating = false;
	}
	
	public void start(){
		started = true;
	}
	
	public void stop(){
		started = false;
	}
	
	public void setColor(String co){
		color = co;
	}
	
	public void setModel(String mo){
		model = mo;
	}

}
