package lesson02;

public class SelectionThree {

    public static void main(String[] args) {
        // 80 - 100 -> A
        // 70 - < 80 -> B
        // 50 - < 70 -> C
        // 0 - < 50 -> F
        double score = 13.5;
        char grade = 'U';
        if(score >= 80 && score <= 100) {
            grade = 'A';
        } else if (score >= 70 && score < 80) {
            grade = 'B';
        } else if (score >= 50 && score < 70) {
            grade = 'C';
        } else if (score >= 0 && score < 50){
            grade = 'F';
        }
        System.out.printf("Your grade is : %c\n", grade);
    }
}
