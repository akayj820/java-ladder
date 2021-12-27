package nextstep.fp;

import java.util.List;
import java.util.function.Function;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }

    public static int sumAll(List<Integer> numbers) {
        return sumAllByCondition(numbers, (num) -> true);
    }

    public static int sumAllEven(List<Integer> numbers) {
        return sumAllByCondition(numbers, (num) -> num % 2 == 0);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return sumAllByCondition(numbers, (num) -> num > 3);
    }

    public static int sumAllByCondition(List<Integer> numbers, Function<Integer, Boolean> condition) {
        int total = 0;

        for (int number : numbers) {
            if (condition.apply(number)) {
                total += number;
            }
        }

        return total;
    }
}
