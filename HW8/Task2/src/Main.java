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
    }
}
