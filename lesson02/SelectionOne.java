package lesson02;

public class SelectionOne {

    public static void main(String[] args) {
        double purchasePrice = 299.90;
        boolean isMember = true;

        if(isMember) {    // if(isMember == true)
            purchasePrice = purchasePrice * 0.9;   // 10% discount
        }

        System.out.printf("Amount to pay: $%.2f\n", purchasePrice);
    }
}
