package com.company;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);

        String URL = ConnectionDB.GetConnectionString();
        System.out.println("Enter login");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        try{
            Connection connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Connected");
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("Connection error");
        }
    }
}
