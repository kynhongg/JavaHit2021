package bai1;
import java.util.Scanner;
import java.util.ArrayList;
public class RunMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n ;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        ArrayList<DieuHoa> List= new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
        {
            DieuHoa nb = new DieuHoa();
            System.out.println("Enter AirConditonal " + (i+1));
            nb.Inputs();
            List.add(nb);
        }
        System.out.println("=====> SHOW RESULT <=====");
        CheckFunction(List, "Electrolux");
    }
    public static void CheckFunction(ArrayList<DieuHoa>List , String BrandElectrolux){

        double MinPrice = List.get(0).getPrice();
        int mark = 0;


        for(int i = 0 ; i < List.size() ; i++){
            if(List.get(i).getPrice()< MinPrice){
                MinPrice = List.get(i).getPrice();
            }
        }

        for(int i = 0 ; i < List.size() ; i++){
            if(List.get(i).getPrice() == MinPrice &&
                    List.get(i).getBrandName().compareTo(BrandElectrolux) == 0){

                List.get(i).Outputs(); mark = 1;
            }
        }
        if(mark == 0){
            System.out.println("Does not exits brand Electrolux");
            return;
        }

    }
}