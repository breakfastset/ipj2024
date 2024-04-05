package lesson02;

public class SelectionFour {

    public static void main(String[] args) {
        int age = 75;
        boolean isEmployed = true;
        double bonusPackage = 0;
        if(age >= 65 && isEmployed) {
            bonusPackage = 600;
        } else if (age >= 65 && !isEmployed) {
            bonusPackage = 1000;
        } else if (age >= 40 && isEmployed) {
            bonusPackage = 100;
        } else if (age >= 40 && !isEmployed) {
            bonusPackage = 500;
        }
        System.out.printf("You will receive $%.2f\n", bonusPackage);
        System.out.println();

        if(age >= 65) {
            if(isEmployed) {
                bonusPackage = 600;
            } else {
                bonusPackage = 1000;
            }
        } else if(age >= 40) {
            if (isEmployed) {
                bonusPackage = 100;
            } else {
                bonusPackage = 500;
            }
        }
    }
}
