package org.example;

import java.sql.*;
import java.util.Scanner;

public class AverageDuration {
    public static void main(String[] args) {
//        url
//        user
//        pass

        String m1 = "_____________________";
        String m2 = "Выбрать месяц покупки";
        String m3 = "=====================";
        String m4 = "1 <| Январь";
        String m5 = "2 <| Февраль";
        String m6 = "3 <| Март";
        String m7 = "4 <| Апрель";
        String m8 = "5 <| Май";
        String m9 = "6 <| Июнь";
        String m10 = "7 <| Июль";
        String m11 = "8 <| Август";
        String m12 = "9 <| Сентябрь";
        String m13 = "0 <| Выход";
        String m14 = "Выбор: ";
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println(m1);
            System.out.println(m2);
            System.out.println(m3);
            System.out.println(m4);
            System.out.println(m5);
            System.out.println(m6);
            System.out.println(m7);
            System.out.println(m8);
            System.out.println(m9);
            System.out.println(m10);
            System.out.println(m11);
            System.out.println(m12);
            System.out.println(m13);
            System.out.println(m14);
            switch (choice = input.next().charAt(0)) {
                case '1':
                    try {
                        Connection connection_1 = DriverManager.getConnection(url, user, pass);
                        Statement statement_1 = connection_1.createStatement();
                        ResultSet resultSet_1 =  statement_1.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-01-01 00:00:00' AND '2018-01-31 00:00:00'");
                        while (resultSet_1.next()) {
                            String Name = resultSet_1.getString("name");
                            int Duration = resultSet_1.getInt("duration");
                            String SubscriptionDate = resultSet_1.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_1.close();
                        statement_1.close();
                        connection_1.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '2':
                    try {
                        Connection connection_2 = DriverManager.getConnection(url, user, pass);
                        Statement statement_2 = connection_2.createStatement();
                        ResultSet resultSet_2 =  statement_2.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-02-01 00:00:00' AND '2018-02-28 00:00:00'");
                        while (resultSet_2.next()) {
                            String Name = resultSet_2.getString("name");
                            int Duration = resultSet_2.getInt("duration");
                            String SubscriptionDate = resultSet_2.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_2.close();
                        statement_2.close();
                        connection_2.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '3':
                    try {
                        Connection connection_3 = DriverManager.getConnection(url, user, pass);
                        Statement statement_3 = connection_3.createStatement();
                        ResultSet resultSet_3 =  statement_3.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-03-01 00:00:00' AND '2018-03-31 00:00:00'");
                        while (resultSet_3.next()) {
                            String Name = resultSet_3.getString("name");
                            int Duration = resultSet_3.getInt("duration");
                            String SubscriptionDate = resultSet_3.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_3.close();
                        statement_3.close();
                        connection_3.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '4':
                    try {
                        Connection connection_4 = DriverManager.getConnection(url, user, pass);
                        Statement statement_4 = connection_4.createStatement();
                        ResultSet resultSet_4 =  statement_4.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-04-01 00:00:00' AND '2018-04-30 00:00:00'");
                        while (resultSet_4.next()) {
                            String Name = resultSet_4.getString("name");
                            int Duration = resultSet_4.getInt("duration");
                            String SubscriptionDate = resultSet_4.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_4.close();
                        statement_4.close();
                        connection_4.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '5':
                    try {
                        Connection connection_5 = DriverManager.getConnection(url, user, pass);
                        Statement statement_5 = connection_5.createStatement();
                        ResultSet resultSet_5 =  statement_5.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-05-01 00:00:00' AND '2018-05-31 00:00:00'");
                        while (resultSet_5.next()) {
                            String Name = resultSet_5.getString("name");
                            int Duration = resultSet_5.getInt("duration");
                            String SubscriptionDate = resultSet_5.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_5.close();
                        statement_5.close();
                        connection_5.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '6':
                    try {
                        Connection connection_6 = DriverManager.getConnection(url, user, pass);
                        Statement statement_6 = connection_6.createStatement();
                        ResultSet resultSet_6 =  statement_6.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-06-01 00:00:00' AND '2018-06-30 00:00:00'");
                        while (resultSet_6.next()) {
                            String Name = resultSet_6.getString("name");
                            int Duration = resultSet_6.getInt("duration");
                            String SubscriptionDate = resultSet_6.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_6.close();
                        statement_6.close();
                        connection_6.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '7':
                    try {
                        Connection connection_7 = DriverManager.getConnection(url, user, pass);
                        Statement statement_7 = connection_7.createStatement();
                        ResultSet resultSet_7 =  statement_7.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-07-01 00:00:00' AND '2018-07-31 00:00:00'");
                        while (resultSet_7.next()) {
                            String Name = resultSet_7.getString("name");
                            int Duration = resultSet_7.getInt("duration");
                            String SubscriptionDate = resultSet_7.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_7.close();
                        statement_7.close();
                        connection_7.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '8':
                    try {
                        Connection connection_8 = DriverManager.getConnection(url, user, pass);
                        Statement statement_8 = connection_8.createStatement();
                        ResultSet resultSet_8 =  statement_8.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-08-01 00:00:00' AND '2018-08-31 00:00:00'");
                        while (resultSet_8.next()) {
                            String Name = resultSet_8.getString("name");
                            int Duration = resultSet_8.getInt("duration");
                            String SubscriptionDate = resultSet_8.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_8.close();
                        statement_8.close();
                        connection_8.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '9':
                    try {
                        Connection connection_9 = DriverManager.getConnection(url, user, pass);
                        Statement statement_9 = connection_9.createStatement();
                        ResultSet resultSet_9 =  statement_9.executeQuery("SELECT name, duration, subscription_date FROM top.courses INNER JOIN top.subscriptions ON subscriptions.course_id = courses.id WHERE subscription_date BETWEEN '2018-09-01 00:00:00' AND '2018-09-30 00:00:00'");
                        while (resultSet_9.next()) {
                            String Name = resultSet_9.getString("name");
                            int Duration = resultSet_9.getInt("duration");
                            String SubscriptionDate = resultSet_9.getString("subscription_date");
                            System.out.println("Название курса: " + Name + " | ");
                            System.out.println("Количество покупок: " + Duration + " | ");
                            System.out.println("Дата покупки: " + SubscriptionDate + " | ");
                            int totalDuration = Duration * 6;
                            int AVGDuration = totalDuration / 2;
                            System.out.println("Общее количество покупок данного курса: " + totalDuration);
                            System.out.println("Среднее количество покупок данного курса: " + AVGDuration);
                            System.out.println(" - ");
                        }
                        resultSet_9.close();
                        statement_9.close();
                        connection_9.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case '0':
                    break;
                default:
                    System.out.println("Ошибка ввода. Выберите категорию");
            }
        } while (choice != '0');
    }
}