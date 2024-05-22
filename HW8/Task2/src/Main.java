import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int numberOfPeople = 10;
        int minWeight = 40;
        int maxWeight = 100;

        int[] weights = new int[numberOfPeople];

        Random random = new Random();

        for (int i = 0; i < numberOfPeople; i++) {
            weights[i] = random.nextInt((maxWeight - minWeight) + 1) + minWeight;
        }
        System.out.println("Generated weights for 10 people:");

        for (int weight : weights) {
            System.out.println(weight);
        }

        System.out.println("*****************\n");

        int averageWeight = 0;
        for (int weight : weights) {
            averageWeight += weight;
        }
        System.out.println("Average weight for 10 people: " + averageWeight / numberOfPeople + "kg");

        System.out.println("\n*****************\n");

        int peopleCounter = 0;
        for (int weight : weights) {
            if (weight >= 60 && weight <= 80) {
                peopleCounter++;
            }
        }
        System.out.println("The number of people in the range from 60kg to 80kg: " + peopleCounter);

    }
}