import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название задачи и время на ее выполнение:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int startpos = input.indexOf("начинается в");
        String startTimeString = input.substring(startpos + 12, startpos + 15);
        startTimeString = startTimeString.trim();
        int startTime = Integer.parseInt(startTimeString);

        int endpos = input.indexOf("заканчивается в");
        String endTimeString = input.substring(endpos + 15, endpos + 18);
        endTimeString = endTimeString.trim();
        int endTime = Integer.parseInt(endTimeString);

        if (endTime - startTime < 0) {
            System.out.println("Ошибка");
        } else {
            System.out.println(endTime - startTime + " " + "часа(-ов) на выполнение задания");
        }
    }
}