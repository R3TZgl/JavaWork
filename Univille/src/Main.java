import br.univille.log.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = LoggerFactory.onConsole();
        logger1.log(Level.DEBUG, "Executando em modo console.");
        logger1.log(Level.WARNING, "Atenção: possível problema.");
        logger1.log(Level.ERROR, "Erro fatal.");

        Logger logger2 = LoggerFactory.onFile();
        logger2.log(Level.DEBUG, "Mensagem salva no arquivo.");
        logger2.log(Level.WARNING, "Alerta gravado.");
        logger2.log(Level.ERROR, "Erro registrado em log.txt.");
    }
}
