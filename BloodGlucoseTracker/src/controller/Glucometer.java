package controller;

public class Glucometer {
	private double blood_glucose = 0.0;
	private String patient_name;
	private Long time_stamp = System.currentTimeMillis();
	private double grams_of_sugar = 0;
	
	//private String time_of_reading = java.util;
	
	public Glucometer(double blood_glucose, String patient_name, Long time_stamp,double grams_of_sugar) {
		this.blood_glucose = blood_glucose;
		this.patient_name = patient_name;
		this.time_stamp = time_stamp;
		this.grams_of_sugar = grams_of_sugar;
	}
	
	public Glucometer() {
		this.blood_glucose = 0;
		this.patient_name = " ";
		this.time_stamp = System.currentTimeMillis();
		this.grams_of_sugar = 0;
	}

	public double getBlood_glucose() {
		return blood_glucose;
	}

	public void setBlood_glucose(double blood_glucose) {
		this.blood_glucose = blood_glucose;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public Long getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(Long time_stamp) {
		this.time_stamp = time_stamp;
	}

	public double getGrams_of_sugar() {
		return grams_of_sugar;
	}

	public void setGrams_of_sugar(double grams_of_sugar) {
		this.grams_of_sugar = grams_of_sugar;
	}
	
	
	
	
	
	
	
}
