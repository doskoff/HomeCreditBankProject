package Utils;

import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {
    public static void saveCreds(String filePath, String login) throws IOException {
        String result = "Регистрация:\nПочта: " + login+ "@mail.ru"+  "\nЛогин: " + login;
        FileWriter writer = new FileWriter(filePath);
        writer.write(result);
        writer.close();
    }
}
