import java.util.Scanner;
class calculator{
    public int add(int num1,int num2){
        int result=num1+num2;
        return result; 
        
    }

}

public class Demo {
    public static void main(String[] args) {
        // int num1=4;
        // int num2=5;
        // int result=num1+num2;
        // System.out.println(result);


        int num1,num2,result;
        Scanner userInput=new Scanner(System.in); 
        
        System.out.println("Please enter numbers:");
        num1=userInput.nextInt();
        num2=userInput.nextInt();  

        calculator obj1=new calculator();
        result=obj1.add(num1,num2);
        System.out.println(result);
    }
    
}
