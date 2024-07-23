import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
Human Ded = new Human();
Ded.id = 1;
Ded.name = "Борис Краснов";
Ded.gender = Gender.Man;
Ded.birthDate = LocalDate.of(1953, 7, 25);


        Human Babushka = new Human();
        Babushka.id = 2;
        Babushka.name = "Надежда Краснова";
        Babushka.gender = Gender.Woman;
        Babushka.birthDate = LocalDate.of(1957, 4, 13);
        Babushka.deathDate = LocalDate.of(2015, 6, 25);

        Human Otec = new Human();
        Otec.id = 3;
        Otec.name = "Владимир Краснов";
        Otec.gender = Gender.Man;
        Otec.birthDate = LocalDate.of(1977, 12, 23);
        Otec.deathDate = LocalDate.of(2022, 8, 12);

        Human Matb = new Human();
        Matb.id = 4;
        Matb.name = "Татьяна Плотникова";
        Matb.gender = Gender.Woman;
        Matb.birthDate = LocalDate.of(1982, 7, 7);

        Human Son = new Human();
        Son.id = 5;
        Son.name = "Игорь Краснов";
        Son.gender = Gender.Man;
        Son.birthDate = LocalDate.of(1999, 5, 1);

        Human Doch = new Human();
        Doch.id = 6;
        Doch.name = "Ксения Краснова";
        Doch.gender = Gender.Woman;
        Doch.birthDate = LocalDate.of(2001, 6, 15);

        Ded.children = new ArrayList<>();
        Babushka.children = new ArrayList<>();
        Otec.children = new ArrayList<>();
        Matb.children = new ArrayList<>();
        Otec.parents = new ArrayList<>();
        Matb.parents = new ArrayList<>();
        Son.parents = new ArrayList<>();
        Doch.parents = new ArrayList<>();
        Ded.children.add(Matb);
        Babushka.children.add(Matb);
        Otec.children.add(Son);
        Otec.children.add(Doch);
        Otec.parents.add(Ded);
        Otec.parents.add(Babushka);
        Matb.children.add(Son);
        Matb.children.add(Doch);
        Son.parents.add(Otec);
        Son.parents.add(Matb);
        Doch.parents.add(Otec);
        Doch.parents.add(Matb);

        List<Human> allFamily = new ArrayList<>();
        addFamily(allFamily, Ded, Babushka, Otec, Matb, Son, Doch);
        printFamily(allFamily);

        FileHeandler fileHeandler = new FileHeandler();
        fileHeandler.Save(allFamily, Ded, Babushka, Otec, Matb, Son, Doch);

        FileHeandler fileHeandler1 = new FileHeandler();
        fileHeandler1.Download();


    }


    private static void printFamily(List<Human> allFamily) {
        Scanner sc = new Scanner(System.in);
        String members = sc.nextLine();
        switch (members) {
            case "Вся семья" -> {
                System.out.println("Члены семьи:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
            case "Родители отца" -> {
                System.out.println("Родители отца:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
            case "Родители матери" -> {
                System.out.println("Родители матери:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
            case "Дети деда" -> {
                System.out.println("Дети деда:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
            case "Дети бабушки" -> {
                System.out.println("Дети бабушки:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
            case "Дети отца" -> {
                System.out.println("Дети отца:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
            case "Дети матери" -> {
                System.out.println("Дети матери:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
            case "Родители сына" -> {
                System.out.println("Родители сына:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
            case "Родители дочери" -> {
                System.out.println("Родители дочери:");
                for (Human human : allFamily) {
                    System.out.println(human);
                }
            }
        }

    }

    private static void addFamily(List<Human> allFamily, Human Ded, Human Babushka, Human Otec, Human Matb, Human Son, Human Doch) {
        allFamily.add(Ded);
        allFamily.add(Babushka);
        allFamily.add(Otec);
        allFamily.add(Matb);
        allFamily.add(Son);
        allFamily.add(Doch);
    }
}