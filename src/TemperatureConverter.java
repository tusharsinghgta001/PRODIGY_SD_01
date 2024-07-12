import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();
        System.out.println("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                double fahrenheitFromCelsius = celsiusToFahrenheit(temperature);
                double kelvinFromCelsius = celsiusToKelvin(temperature);
                System.out.printf("%.2f°C is equal to %.2f°F and %.2fK\n", temperature, fahrenheitFromCelsius, kelvinFromCelsius);
                break;
            case 'F':
                double celsiusFromFahrenheit = fahrenheitToCelsius(temperature);
                double kelvinFromFahrenheit = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f°F is equal to %.2f°C and %.2fK\n", temperature, celsiusFromFahrenheit, kelvinFromFahrenheit);
                break;
            case 'K':
                double celsiusFromKelvin = kelvinToCelsius(temperature);
                double fahrenheitFromKelvin = kelvinToFahrenheit(temperature);
                System.out.printf("%.2fK is equal to %.2f°C and %.2f°F\n", temperature, celsiusFromKelvin, fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid unit entered. Please enter C for Celsius, F for Fahrenheit, or K for Kelvin.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
