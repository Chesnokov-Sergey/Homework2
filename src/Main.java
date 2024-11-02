public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var theBoxer1 = 78.2;
        var theBoxer2 = 82.7;
        var massBoxer = theBoxer1 + theBoxer2;
        System.out.println("Масса двух бойцов " + massBoxer + " кг!");
        var remains = theBoxer2 % theBoxer1;
        System.out.println("Остаток от деления между двумя весами " + remains + " кг!");
        var openingHours = 640;
        var workingHours = 8;
        var totalEmployees = openingHours / workingHours;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        workingHours = openingHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек " + "то всего " + workingHours + " часа работы может быть поделено между сотрудниками");



    }
}