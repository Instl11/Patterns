package patterns.streamHomework.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.http.WebSocket;

public class TcpServer {
    public static void main(String[] args) {

        int port = 8080;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Порт занят: " + port);
            System.exit(-1);
        }

        /*
         * Если порт был свободен и сокет был успешно создан, можно переходить к
         * следующему шагу - ожиданию клиента
         */
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.out.println("Ошибка при подключении к порту: " + port);
        }

        InputStream in = null;
        try {
            in = clientSocket.getInputStream();
        } catch (IOException e) {
            System.out.println("Не удалось получить поток ввода.");
            System.exit(-1);
        }
        /*
         * В этой реализации сервер будет читать поток и выводить его
         * содержимое на консоль
         */
        try {
            in.transferTo(System.out);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении сообщения.");
            System.exit(-1);
        }
    }
}

