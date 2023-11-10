package org.example;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class AverageStudents {
    public static void main(String[] args) {
//        url
//        user
//        pass

        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            Map<String, Integer> courseTotalAges = new HashMap<>();
            Map<String, Integer> courseStudentsCount = new HashMap<>();

            int courseCounter = 1;

            String query = "SELECT c.name AS course_name, c.type AS type, s.age " +
                    "FROM courses c " +
                    "JOIN subscriptions sub ON c.id = sub.course_id " +
                    "JOIN students s ON sub.student_id = s.id";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String courseName = resultSet.getString("course_name");
                int studentAge = resultSet.getInt("age");
                String courseType = resultSet.getString("type");

                if ("DESIGN".equals(courseType)) {
                    courseTotalAges.put(courseName, courseTotalAges.getOrDefault(courseName,0) + studentAge);
                    courseStudentsCount.put(courseName, courseStudentsCount.getOrDefault(courseName, 0) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : courseTotalAges.entrySet()) {
                String courseName = entry.getKey();
                int totalAge = entry.getValue();
                int studentCount = courseStudentsCount.get(courseName);
                int averageAge = totalAge / studentCount;
                System.out.println("Course " + courseCounter + " - " + courseName + ", среднее значение: " + averageAge);
                courseCounter++;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}