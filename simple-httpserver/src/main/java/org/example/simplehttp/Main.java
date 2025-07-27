package org.example.simplehttp;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
            server.createContext("/hello", new HelloHandler());
            server.setExecutor(null); // Use default executor
            server.start();
            System.out.println("Server started at http://localhost:8080/hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
