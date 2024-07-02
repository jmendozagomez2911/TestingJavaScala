package javas.test.dataStructures.arrays;
import java.util.Scanner;

public class TemperatureCalculator {

    private Scanner scanner;

    public TemperatureCalculator() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        TemperatureCalculator calculator = new TemperatureCalculator();

        int numberOfTemperatures = calculator.askForNumberOfTemperatures();
        double[] temperatures = calculator.askForTemperatures(numberOfTemperatures);
        double averageTemperature = calculator.calculateAverageTemperature(temperatures);

        System.out.println("La temperatura media es: " + averageTemperature);
    }

    // Método para solicitar el número de temperaturas
    private int askForNumberOfTemperatures() {
        System.out.print("¿Cuántas temperaturas va a introducir? ");
        return scanner.nextInt();
    }

    // Método para solicitar las temperaturas
    private double[] askForTemperatures(int numberOfTemperatures) {
        double[] temperatures = new double[numberOfTemperatures];
        for (int i = 0; i < numberOfTemperatures; i++) {
            System.out.print("Introduce la temperatura " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        return temperatures;
    }

    // Método para calcular la temperatura media
    private double calculateAverageTemperature(double[] temperatures) {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }
}
