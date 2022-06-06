package ladder.view;

import ladder.domain.*;

public class ResultView {
    private static final String DEFAULT_LINE = "     |";
    private static final String CROSSABLE_LINE = "-----|";
    private static final String ENTER = System.lineSeparator();
    private static final String NAMES_FORMAT = "%5s ";
    public static final String EXECUTION_RESULT_DELIMITER = " : ";
    private static StringBuilder sb = new StringBuilder();

    private ResultView() {}

    public static void printLadderResult(Participants participants, ExecutionResult result, Ladder ladder) {
        sb.append("실행결과\n");
        printParticipants(sb, participants);
        printLadder(sb, ladder);
        printExecutionResult(sb, result);
        System.out.println(sb);
    }

    private static void printParticipants(StringBuilder sb, Participants participants) {
        sb.append(ENTER);
        participants.getParticipants().forEach(participant -> sb.append(String.format(NAMES_FORMAT, participant.name())));
    }

    private static void printExecutionResult(StringBuilder sb, ExecutionResult result) {
        sb.append(ENTER);
        result.getResults().forEach(r -> sb.append(String.format(NAMES_FORMAT, r)));
    }

    private static void printLadder(StringBuilder sb, Ladder ladder) {
        for (Line line : ladder.getLines()) {
            sb.append(ENTER);
            printLine(sb, line);
        }
    }

    private static void printLine(StringBuilder sb, Line line) {
        for (Point point : line.getPoints()) {
            sb.append(makeLine(point));
        }
    }

    private static String makeLine(Point point) {
        if (point.hasBridge()) {
            return CROSSABLE_LINE;
        }
        return DEFAULT_LINE;
    }

    public static void printExecutionResult(String participantName, Participants participants, ExecutionResult executionResult, LadderResult result) {
        System.out.println(makeExecutionResult(participantName, participants, executionResult, result));
    }

    private static String makeExecutionResult(String participantName, Participants participants, ExecutionResult executionResult, LadderResult ladderResult) {
        if (!"all".equals(participantName)) {
            Position positionOfParticipant = ladderResult.goalOf(participants.positionOf(Participant.from(participantName)));
            return executionResult.results(positionOfParticipant);
        }

        sb.setLength(0);
        sb.append(ENTER).append("실행결과").append(ENTER);

        for (Participant participant : participants.getParticipants()) {
            Position positionOfParticipant = ladderResult.goalOf(participants.positionOf(participant));
            String executionResultOfParticipant = executionResult.results(positionOfParticipant);

            sb.append(participant.name()).append(EXECUTION_RESULT_DELIMITER).append(executionResultOfParticipant).append(ENTER);
        }
        return sb.toString();
    }
}
