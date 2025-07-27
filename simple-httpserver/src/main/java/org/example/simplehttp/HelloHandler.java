package org.example.simplehttp;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("GET".equalsIgnoreCase(exchange.getRequestMethod())) {
            ResponseUtils.sendText(exchange, 200, "Hello, world!");
        } else {
            ResponseUtils.sendText(exchange, 405, "Method Not Allowed");
        }
    }
}
