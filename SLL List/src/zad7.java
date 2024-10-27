//Дадена е линеарно поврзана листа. Да се напише функција која пред секој елемент кој
//во info полето има вредност x ќе вметне нов јазел со информација y. Како резултат
//функцијата да врати колку нови јазли биле вметнати.
//Пр. →3→4→7→6→4→7→3→2; 3; 1
//        →1→3→4→7→6→4→7→1→3→2; вметнати 2 нови јазли
//
//

import java.util.Scanner;

public class zad7 {
    public static int zadaca(SLL<Integer> sll,int x,int y){
        SLLNode<Integer> tmp=sll.getFirst();
        int br=0;
        while(tmp!=null){
            if(tmp.element==x){
                sll.insertBefore(y,tmp);
                br++;
            }


            tmp=tmp.succ;
        }
        return br;
    }

    public static void main(String[] args) {
        SLL<Integer> sll=new SLL<Integer>();
        Scanner in= new Scanner(System.in);
        String list=in.nextLine();
        String [] pom=list.split(" ");
        for(int i=0;i<pom.length;i++){
            sll.insertLast(Integer.parseInt(pom[i]));
        }
        int x=in.nextInt();
        int y=in.nextInt();

        int pozicija=zadaca(sll,x,y);
        System.out.println(sll);
        System.out.println(pozicija);


    }
}
