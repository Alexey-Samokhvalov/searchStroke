import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int totalScore = 0;
        int studentCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Я\\students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String lastname = parts[0];
                String name = parts[1];
                int score = Integer.parseInt(parts[2]);

                if (score < 3) {
                    System.out.println(lastname + " " + name);
                }

                totalScore += score;
                studentCount++;
            }
        } catch (IOException e) {
        }

        double avgScore = (double) totalScore / studentCount;
        System.out.println("Средний балл по классу: " + avgScore);
    }
}