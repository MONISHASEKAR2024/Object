class calculator{
  int a;                      //instant variable
  public int add(int n1, int n2)        //methods
  {
    int i =n1+n2;         // local variable
     return i;      // keyword
  }
}

public class hello {

  public static void main(String args[])
  {
    int num1=10;
    int num2=30;

    calculator cal=new calculator();         //calculator is a type
          // this method is called constractor                                    //  the new calculaor is a object   
    
   int result= cal.add(num1,num2);            // mention the method name 
    // int result= num1+num2;           //behaviour

    System.out.println(result);
   


    }
    }
 

