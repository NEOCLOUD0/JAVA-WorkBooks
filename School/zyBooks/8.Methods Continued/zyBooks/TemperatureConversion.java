package zyBooks;

import java.util.Scanner;

public class TemperatureConversion {
	public double celsiusToKelvin(double valueCelsius) {
		double valueKelvin;

		valueKelvin = valueCelsius + 273.15;

		return valueKelvin;
	}

	/* Your solution goes here */
	public static double kelvinToCelsius(double valueKelvin) {
		double valueCelsius;
		valueCelsius = valueKelvin - 273.15;
		return valueCelsius;
	}

	public static void main(String[] args) {
		double valueC;
		double valueK;
		TemperatureConversion tempConverter = new TemperatureConversion();

		valueC = 10.0;
		System.out.println(valueC + " C is " + tempConverter.celsiusToKelvin(valueC) + " K");

		valueK = 283.15;
		System.out.println(valueK + "  is " + tempConverter.kelvinToCelsius(valueK) + " C");
	}
}