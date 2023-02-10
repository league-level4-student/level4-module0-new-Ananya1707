package _03_Intro_to_Enums;

public enum StatesOfMatter {
	
	SOLID(0), LIQUID(25.55), GAS(100);
	
	private double celsiusTemp;
	
	StatesOfMatter(double celsiusTemp) {
		// TODO Auto-generated constructor stub
		this.celsiusTemp = celsiusTemp;
	}

	public void setCelsiusTemp(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
		
	}
	
	public double getCelsiusTemp() {
		return celsiusTemp;
		
	}
	
	public double convertToFahrenheit(double celsiusTemp) {
		return (celsiusTemp * 9/5) + 32;
		
	}
	
	
	

}
