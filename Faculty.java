import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.NullPointerException;
import java.util.Scanner;


public class Faculty {
     String username, password; 
    Boolean flag;
    public void login() throws FileNotFoundException, IOException, NullPointerException {    
    String uname,paswd;
    Scanner s = new Scanner(System.in);
    System.out.println("---------------------------------------------------");
    System.out.println("               Faculty Login"                       );
    System.out.println("---------------------------------------------------");
    System.out.println("Enter username : ");
    uname = s.nextLine();
    System.out.println("Enter password :");
    paswd = s.nextLine();
    BufferedReader br = new BufferedReader(new FileReader("Facultylog.txt"));
    String inpt = null ;
   while((inpt =br.readLine()) != null){
       String[] element;
        element = inpt.split(",");
            if(uname.equals(element[0])) {
                if(paswd.equals(element[1])){
                    flag=true;
                } 
                else{
                System.out.println("\n\nInvalid Credentials");
                }}
            
           
        }
        if(flag == true){
            System.out.println("\n\nLogin successful*\n\n");
        }
        else{
            System.out.println("No such username");
        }
        choice();
     
}
    public void choice(){
        System.out.println("---------------------------------------------------");
        System.out.println("               Faculty Login"                       );
        System.out.println("---------------------------------------------------");
        System.out.println("\nWhich one you want to edit :");
        System.out.println("\n1. Add user name and password for the user\n2.Set number of questions\n3.Logout ");
        Scanner b = new Scanner (System.in);
        int ch = b.nextInt();
        switch(ch){
            case 1 : 
                this.usnps();
                break;
            case 2 :
                this.setqns();
                break;
            // case 3:
            //     this.settime();
            //     break;
            case 3:
                this.logout();
                break;
            
            default :
                System.out.println("Wrong choice");
                choice();
                break;
        }
    }
    public void usnps(){
        AddStudent as = new AddStudent();
        as.student();
    }
    public void setqns(){
        SetQns q = new SetQns();
        q.qns();
    }
    
   
    public void logout(){
        System.exit(0);
    }
    // public void settime(){
    //     Reminder q = new Reminder();
    //     q.Reminder();
    // }
}