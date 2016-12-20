package com.rayeston.chapter.one;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Rayest on 2016/12/18 0018.
 */
public class Application {
    public static final String BASE_URI = "http://localhost:8080/myapp/";

    public static HttpServer startServer() {
        final ResourceConfig resourceConfig = new ResourceConfig().packages("com.rayeston.chapter.one");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(Application.BASE_URI), resourceConfig);
    }

    public static void main(String[] args) throws IOException {
        final HttpServer server = Application.startServer();
        System.out.println(String.format("Jersey app started with WADL available at " + "%sapplication.wadl\nHit enter to stop it...", Application.BASE_URI));
        System.in.read();
        server.shutdownNow();
    }
}
