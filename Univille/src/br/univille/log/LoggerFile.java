package br.univille.log;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LoggerFile implements Logger {

    private static final String FILENAME = "log.txt";

    @Override
    public void log(Level level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String log = String.format("[%s] [%s] %s\n", timestamp, level, message);

        try (FileWriter writer = new FileWriter(FILENAME, true)) {
            writer.write(log);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
