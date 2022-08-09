import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Здравствуйте!");
        System.out.println("Вас приветствует генеологическое древо семей Дмитриевых и Байковых");
        System.out.println("Вот перечень всех членов семьи:");
        String[] link = new String[] { "Husband/Wife", "Parents/Children",
                "Grandmother/Granddaughter", "Grandfather/Granddaughter" };

        List<People> Family = new ArrayList<People>();
        Family.add(new People("Andrey", "Baikov", "Alekseevich", 13_05_1964));
        Family.add(new People("Elena", "Baikova", "Sergeevna", 14_06_1966));
        Family.add(new People("Anatoliy", "Baikov", "Andreyevich", 13_06_1990));
        Family.add(new People("Semen", "Baikov", "Andreyevich", 10_10_1991));

        Family.add(new People("Elena", "Dmitrieva", "Vadimovna", 20_05_1964));
        Family.add(new People("Nikolay", "Dmitriev", "Nikolaevich", 25_07_1953));
        Family.add(new People("Fedor", "Dmitriev", "Nikolaevich", 14_12_1985));
        Family.add(new People("Anna", "Dmitrieva", "Igorevna", 14_06_1994));
        Family.add(new People("Olga", "Dmitrieva", "Fedorovna", 20_08_2015));

        List<Links> GeneticTree = new ArrayList<Links>();
        GeneticTree.add(new Links(Family.get(0), Family.get(1), link[0]));
        GeneticTree.add(new Links(Family.get(0), Family.get(2), link[1]));
        GeneticTree.add(new Links(Family.get(1), Family.get(2), link[1]));
        GeneticTree.add(new Links(Family.get(0), Family.get(3), link[1]));
        GeneticTree.add(new Links(Family.get(1), Family.get(3), link[1]));

        GeneticTree.add(new Links(Family.get(5), Family.get(4), link[0]));
        GeneticTree.add(new Links(Family.get(4), Family.get(6), link[1]));
        GeneticTree.add(new Links(Family.get(5), Family.get(6), link[1]));
        GeneticTree.add(new Links(Family.get(6), Family.get(7), link[0]));
        GeneticTree.add(new Links(Family.get(6), Family.get(8), link[1]));
        GeneticTree.add(new Links(Family.get(7), Family.get(8), link[1]));
        GeneticTree.add(new Links(Family.get(4), Family.get(8), link[2]));
        GeneticTree.add(new Links(Family.get(5), Family.get(8), link[3]));

        for (People j : Family) {
            System.out.println(j.toString());
        }
        System.out.println("Нажмите 1 если хотите увидеть список жен/мужей");
        System.out.println("Нажмите 2 если хотите увидеть список родителей/детей");
        System.out.println("Нажмите 3 если хотите увидеть список дедушек(бабушек)/внуков");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        int num = in.nextInt();
        if (num == 1) {
            for (int i = 0; i < GeneticTree.size(); i++) {
                if (GeneticTree.get(i).contains(link[1])==true){
                    System.out.println(GeneticTree.get(i).toString());
            }
        }
    }
        // for (Links i : GeneticTree) {
        // System.out.println(i.toString());
        // }
        in.close();
    }

}
