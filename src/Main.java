import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Заполните лист \"A\":  Заполнено " + i + " из 5");
           listA.add(scanner.next());
        }

        System.out.println("-------------------------------------");
        System.out.println("Лист А заполнен: ");
        System.out.println(listA);

        System.out.println("-----------------------------------");


        ArrayList<String>arrayListB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Заполните лист \"B\":  Заполнено " + i + " из 5");
            arrayListB.add(scanner.next());
        }

        System.out.println("-------------------------------------");
        System.out.println("Лист B заполнен: ");
        System.out.println(arrayListB);

        System.out.println("---------------------------------------");
        System.out.println("Общие списки А и Б");
        System.out.println("Список листа \"А\"- " + listA);
        System.out.println("Список листа \"B\"- " + arrayListB);

        System.out.println("-------------------------------------");

        Collections.reverse(arrayListB);

        int lengthList = listA.size();

        ArrayList<String> arrayListC = new ArrayList<>(lengthList);
        for (int i = 0; i < lengthList; i++) {
            arrayListC.add(listA.get(i));
            arrayListC.add(arrayListB.get(i));
        }
        System.out.println(arrayListC);

        System.out.println("-----------------------------------");
        System.out.println("Отсортированный список: \n\"A\" и \"B\"");
        ArrayList<String> arrayListSorting = new ArrayList<>();
        arrayListC.sort(Comparator.comparingInt(String::length));
        System.out.println(arrayListC);
    }
}