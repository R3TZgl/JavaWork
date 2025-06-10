package br.univille.log;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LoggerConsole implements Logger {

    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";

    @Override
    public void log(Level level, String message) {
        String color;

        switch (level) {
            case DEBUG:
                color = GREEN;
                break;
            case WARNING:
                color = YELLOW;
                break;
            case ERROR:
                color = RED;
                break;
            default:
                color = RESET;
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String output = String.format("[%s] [%s] %s", timestamp, level, message);
        System.out.println(color + output + RESET);
    }
}
