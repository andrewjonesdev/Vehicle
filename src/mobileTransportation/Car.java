package mobileTransportation;

public class Car implements Vehicle {

	private int speed = 60;
	private boolean started = false;
	private boolean accelerating = false;
	private String color = "Black";
	private String model = "Masarati";
	
	
	public Car (int spe, boolean sta, boolean acc, String col, String mod){
		speed = spe;
		started = sta;
		accelerating = acc;
		color = col;
		model = mod;
	}
	public Car (){
		
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
