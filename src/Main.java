import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите: ФИО /Дата рождения в формате дд-мм-гггг");
        String[] splitInput = console.nextLine().split("/");
        String[] fullname = splitInput[0].split(" ");

        String dateString = splitInput[1].replaceAll(" ", "");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate specifiedDate = LocalDate.parse(dateString, formatter);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(specifiedDate, currentDate);
        int years = period.getYears();



        StringBuilder output = new StringBuilder();
        output.append(fullname[0])
                .append(" ")
                .append(fullname[1].charAt(0))
                .append(".")
                .append(fullname[2].charAt(0))
                .append(". Возраст: ")
                .append(years);

        System.out.println(output.toString());
    }
}