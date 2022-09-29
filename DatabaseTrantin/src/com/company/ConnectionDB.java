package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Struct;
import java.util.List;

public class ConnectionDB {

    public static String GetConnectionString() throws IOException {
        Path configPath = Path.of("C:\\Users\\student\\IdeaProjects\\DatabaseTrantin\\src\\config");
        return Files.readString(configPath);
    }
}
