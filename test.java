import java.util.Scanner ; 
public class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter your name");
        int count=0;
        for (i=0;i<name.length();i++)
           if(name.charAt[i]==' ')
              count=+1;
        system.out.println(count+1);
    }
}

//2nd method
//string[] n= name.split(" ");
//system.out.println(n.length);


//3rd method 
//Scanner sc=new Scanner("name");
//int c=0;
//while(sc.hasNext()){
 // sc.next();
 // c++;
 //}
// system.out.println(c);
//}
