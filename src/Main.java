public class Main {
    public static void main(String[] args) {
        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задание 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Задание 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Задание 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задание 6
        System.out.println("Задание 6");
        var theBoxer1 = 78.2;
        var theBoxer2 = 82.7;
        var massBoxer = theBoxer1 + theBoxer2;
        System.out.println("Масса двух бойцов " + massBoxer + " кг");
        var differencBoxer = theBoxer2 - theBoxer1;
        System.out.println("Разницу между массами двух бойцов " + differencBoxer + " кг");

        // Задание 7
        System.out.println("Задание 7");
        var remainsBoxer = theBoxer2 % theBoxer1;
        System.out.println("Остаток от деления между двумя весами " + remainsBoxer + " кг!");

        // Задание 8
        System.out.println("Задание 8");
        var openingHours = 640;
        var workingHours = 8;
        var totalEmployees = openingHours / workingHours;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        var netotalEmployees = totalEmployees + 94;
        var neworkingHours = netotalEmployees * workingHours;
        System.out.println("Если в компании работает " + netotalEmployees + " человек " + "то всего " + neworkingHours + " часа работы может быть поделено между сотрудниками");
    }
}