package org.academiadecodigo.gnunas.captaindrink;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    private ServerSocket serverSocket;

    public Server(int portNumber) throws IOException {

        serverSocket = new ServerSocket(portNumber);
    }

    public void init() {

        new ClientHandler(serverSocket).acceptClient();
    }


    public static void main(String[] args) {

        try {
            new Server(8888).init();
        } catch (IOException e) {

            System.err.println(e.getMessage());
        }


    }
}
