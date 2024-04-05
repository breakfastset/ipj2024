package lesson02;

public class SwitchExample {

    // 1, 2 - $1000
    // 3, 4 - $600
    // 5 - $150
    // others - $0
    public static void main(String[] args) {
        int roomCount = 2;
        int rebateValue = 0;
        switch(roomCount) {
            case 1:    // either 1 or 2
            case 2:
                rebateValue = 1000;
                break;
            case 3:    // either 3 or 4
            case 4:
                rebateValue = 600;
                break;
            case 5:
                rebateValue = 150;
                break;
            default:
                rebateValue = 0;
        }
        System.out.printf("You get $%d in rebate for your %d-room flat.\n", rebateValue, roomCount);

        if (roomCount == 1 || roomCount == 2) {
            rebateValue = 1000;
        } else if (roomCount == 3 || roomCount == 4) {
            rebateValue = 600;
        } else  if (roomCount == 5) {
            rebateValue = 150;
        }
    }
}
