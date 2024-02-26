package converson.converson;

import java.util.stream.IntStream;

public class conversonTable {
    public static void main(String[] args) {

        System.out.printf("%-12s%8s\n", "Kilograms", "Pounds");

        IntStream.rangeClosed(1, 200).forEach(i -> {
            System.out.printf("%-12d%8.1f\n", i, i * 2.2);
        });
    }
}
