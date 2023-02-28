package ru.geekbrains;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8088)) {
            Socket socket = serverSocket.accept();

            System.out.println("New client connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}