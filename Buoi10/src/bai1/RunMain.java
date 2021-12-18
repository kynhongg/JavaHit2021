package bai1;

import java.util.*;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     List<Person> persons = new ArrayList<>();

    try {

        System.out.print("Enter the number of person: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            Person person =new Person();
            System.out.print("Enter id: ");
            person.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter name: ");
            person.setName(sc.nextLine());
            System.out.print("Enter address: ");
            person.setAddress(sc.nextLine());
            persons.add(person);
        }
    }catch (Exception ex){
        System.out.println("Import data error, please enter back! " + ex.getMessage());
    }
        System.out.println("_______SORT BY ID_________");
        Collections.sort(persons);

        for (Person i : persons){
        System.out.println(i.toString());
    }
        System.out.println("_______SORT BY NAME_______");
        Collections.sort(persons, new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            if(o1.getName().compareTo(o2.getName())==0)
                return o2.getAddress().compareTo(o1.getAddress());
            return o1.getName().compareTo(o2.getName());
        }
    });

        for (Person i : persons){
        System.out.println(i.toString());
    }
}
}
