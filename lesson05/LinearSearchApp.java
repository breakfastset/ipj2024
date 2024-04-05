package lesson05;

public class LinearSearchApp {

    public static void main(String[] args) {

        int[] numbers = {44, 55, 33, 12, 38, 99, 50, 9, 8, 15};
        //                0   1   2   3   4   5   6
        int target = 121;
        int targetIndex = linearSearch(numbers, target);  // 6 if found, -1 if not found
        // Target 50 is found at index 6.
        if(targetIndex != -1) {
            System.out.printf("Target %d is found at index %d.\n", target, targetIndex);
        } else {
            System.out.printf("Target %d is not found.\n", target);
        }
    }

    // <access modifier> <static> <return type> <method name> (params)
    public static int linearSearch(int[] numArray, int target) {
        int targetIndex = -1;
        int index = 0;
        while(targetIndex == -1 && index < numArray.length) {
            if(numArray[index] == target) {
                targetIndex = index;
            }
            index++;
        }
        return targetIndex;
    }
}
