package nextstep.ladder.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final static String DELIMITER = ",";
    private final static Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static List<String> inputPeople(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String people = scanner.nextLine();
        return Arrays.asList(people.split(DELIMITER));
    }

    public static List<String> inputResult(){
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        String people = scanner.nextLine();
        return Arrays.asList(people.split(DELIMITER));
    }

    public static int inputMaxHeight(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return scanner.nextInt();
    }

    public static String inputMoveUser(){
        System.out.println("결과를 보고 싶은 사람은?");
        return scanner.next();
    }
}