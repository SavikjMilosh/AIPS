import java.util.Scanner;

public class DLL_zad1 {
    public static void main(String[] args) {
        DLL<String> dll=new DLL<String>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String [] pom=line.split(" ");
        for(int i=0;i< pom.length;i++){
            dll.insertLast(pom[i]);
        }
        System.out.println(dll);
    }
}