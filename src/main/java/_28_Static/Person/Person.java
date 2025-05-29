package _28_Static.Person;

public class Person {

    public static int population = 0;
    public String name;

    public Person(String name) {
        this.name = name;
        population++;
        System.out.println("객체가 생성됨");
    }

    public static void showPopulation() {
    }

    public void sayHello() {
        System.out.println("안녕하세요, 저는 " + name + " 입니다 .");

    }
}
