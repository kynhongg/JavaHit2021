package bai1;

public class RunMain {
    public static void main(String[] args) {
        Person Me = new Person("Phong", 19, "Nam", "listen to music");
        System.out.println(Me.toString());
        Person You = new Person();
        You.setName("Rose");
        You.setAge(19);
        You.setGender("Nu");
        You.setHobby("travel");
        System.out.println("Name: " + You.getName());
        System.out.println("Age: " + You.getAge());
        System.out.println("Gender: " + You.getGender());
        System.out.println("Hobby: " + You.getHobby());
    }
}
