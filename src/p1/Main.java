package p1;//change

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Katy");//6
        System.out.println(person.getName());//7
        changePerson(person);   //13                                  //8 changeName(person);
        System.out.println(person.getName());//9


    }

    static void changePerson(Person p){//10
        p = new Person("Dasha");//11
        p.setName("Tanya");//12;
    }

    static void changeName(Person person){          //4
        person.setName("Masha");                   //5
    }
}