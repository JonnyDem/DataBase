package database;

import java.util.Scanner;

/**
 * Created by Ваня on 11.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Service service=new Service();
        service.getAllDataBase();
        service.getFirst();
        service.getLast();
        System.out.println("Введите имя.");
        String name=scan.nextLine();
        service.getByName(name);
        System.out.println("Введите возраст");
        String age=scan.nextLine();
        service.getByAge(age);
        System.out.println("Введите фамилию");
        String surname=scan.nextLine();
        service.getBySurname(surname);
    }
}
