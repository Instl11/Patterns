package patterns.streamHomework.socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;

public class TcpClient {
    public static void main(String[] args) {
        /* Определяем хост сервера и порт */
        String host = "localhost";
        int port = 8080;
        /*
         * Создаем сокет для полученной пары хост/порт
         */
        Socket socket = null;
        try {
            socket = new Socket(host, port);
        } catch (UnknownHostException e) {
            System.out.println("Неизвестный хост: " + host);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода при создании сокета " + host
                    + ":" + port);
            System.exit(-1);
        }
        /*
         * Получаем поток вывода, через который будут передаваться сообщения
         * серверу
         */
        OutputStream out = null;
        try {
            out = socket.getOutputStream();
        } catch (IOException e) {
            System.out.println("Не удалось получить поток вывода.");
            System.exit(-1);
        }

        try (BufferedInputStream inputStream = new BufferedInputStream(System.in)) {
            inputStream.transferTo(out);
        } catch (IOException e) {
            System.out.println("Ошибка при записи сообщения.");
            System.exit(-1);
        }
    }
}
