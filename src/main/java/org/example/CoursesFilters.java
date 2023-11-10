package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CoursesFilters {
    public static void main(String[] args) {
//        url
//        user
//        pass

        //1.1
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            ResultSet resultSet =  statement.executeQuery("SELECT name FROM top.courses");
            while (resultSet.next()) {
                String courseName = resultSet.getString("name");
                System.out.println("Курс: " + courseName);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //1.2
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            ResultSet resultSet =  statement.executeQuery("SELECT name FROM top.students");
            while (resultSet.next()) {
                String studName = resultSet.getString("name");
                System.out.println("Студент: " + studName);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //2.1
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            ResultSet resultSet =  statement.executeQuery("SELECT name, duration FROM top.courses WHERE duration > 30 ORDER BY duration DESC");
            while (resultSet.next()) {
                String courseName = resultSet.getString("name");
                String Duration = resultSet.getString("duration");
                System.out.println("Курс: " + courseName + " Продолжительность: " + Duration);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //2.2
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            ResultSet resultSet =  statement.executeQuery("SELECT name, age FROM top.students WHERE age > 25 ORDER BY name ASC");
            while (resultSet.next()) {
                String studName = resultSet.getString("name");
                String Age = resultSet.getString("age");
                System.out.println("Студент: " + studName + " Возраст: " + Age);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //3.1
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            ResultSet resultSet =  statement.executeQuery("SELECT students_count FROM top.courses GROUP BY students_count HAVING SUM(students_count)");
            while (resultSet.next()) {
                String studCount = resultSet.getString("students_count");
                System.out.println("Количество студентов: " + studCount);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //3.2
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            ResultSet resultSet =  statement.executeQuery("SELECT price FROM top.courses GROUP BY price HAVING AVG(price)");
            while (resultSet.next()) {
                String Price = resultSet.getString("price");
                System.out.println("Цена: " + Price);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //4.1
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            String studIn = "INSERT INTO students (name, age, registration_date) VALUES ('Александр Ефимов', 31, '2023-11-02 00:00:00')";
            statement.executeUpdate(studIn);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //4.2
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            String purcIn = "INSERT INTO purchaselist (student_name, course_name, price, subscription_date) VALUES ('Александр Ефимов', 'Java-разработчик', 82000 ,'2023-11-02 00:00:00')";
            statement.executeUpdate(purcIn);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}