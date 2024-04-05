package lesson03;
import java.util.Arrays;

public class ArraysUtilExample {

    public static void main(String[] args) {
        int[] numbers= {55, 31, 23, 4, 10, 20, 87};

        String output = Arrays.toString(numbers);
        System.out.println("~=~= Before Sorting ~=~=");
        System.out.println(output);

        Arrays.sort(numbers);
        output = Arrays.toString(numbers);
        System.out.println("~=~= After Sorting ~=~=");
        System.out.println(output);

    }
}
