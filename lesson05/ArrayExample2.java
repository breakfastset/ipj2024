package lesson05;

import java.util.Scanner;

public class ArrayExample2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many scores are there to key in? ");
        int numScores = input.nextInt();  // 3

        double[] scores = new double[numScores];
        for(int i = 0; i < scores.length; i++) {  // i++ => i = i + 1
            System.out.printf("Score for student %d: ", i+1);  // temp = i + 1
            double score = input.nextDouble(); // 67.9, 58.8, 99.9
            scores[i] = score;  // scores[0] = 67.9, scores[1] = 58.8, scores[2] = 99.9
        }
        // scores = {67.9, 58.8, 99.9}
        // very much later...
        System.out.println();
        for(int i = 0; i < scores.length; i++) {
            System.out.printf("Score for student %d: %.1f\n", i, scores[i]);
        }

        System.out.println();
        System.out.println("-- Enhanced for loop --");
        for(double score : scores) {
            System.out.println("The score is " + score);
        }

    }
}
