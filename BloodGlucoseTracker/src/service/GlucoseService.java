package service;
import java.util.Scanner;
import controller.Glucometer;


public class GlucoseService {
	//Creates glucometer as an object of the Glucometer class
	private Glucometer glucometer;
	private long time_stamp = System.currentTimeMillis();
	
	public GlucoseService() {
		//Initializes glucometer 
		this.glucometer = new Glucometer();
		
		
	}
	
	
	
	public static void main(String[] args) {

		
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Glucometer							" + System.currentTimeMillis());
		
		System.out.println("Enter your name: ");
		String patient_name = scanner.next();
		
		System.out.println("Enter your blood sugar level ");
		double blood_glucose = scanner.nextDouble();
		
		System.out.println("Enter the amount of sugar(g) consumed: ");
		double grams_of_sugar = scanner.nextDouble();
		
		time_stamp = System.currentTimeMillis();
		
		setUserInput(patient_name, blood_glucose, grams_of_sugar, time_stamp);
		
		scanner.close();
	}
	
	//This method will process data from the user
	public static void ProcessUserInput() {
		
	}
	
	public void setUserInput(String patient_name, double blood_glucose, double grams_of_sugar, Long time_stamp) {
		Long times_stamp = System.currentTimeMillis();
		glucometer.setBlood_glucose(blood_glucose);
		glucometer.setPatient_name(patient_name);
		glucometer.setGrams_of_sugar(grams_of_sugar);
		
		
		
		
	}
	
	public static void display() {
		
	}
	
	
}
