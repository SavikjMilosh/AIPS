//Дадена е линеарно поврзана листа. Да се напише функција која ќе ги удвои елементите
//кои во info полето имаат вредност x (до нив ќе вметне нов јазел со иста информација).
//Како резултат функцијата да врати колку нови јазли биле вметнати.
//Пр. →3→4→7→6→4→7→3→2; 4
//        →3→4→4→7→6→4→4→7→3→2; вметнати 2 нови јазли


import java.util.Scanner;

public class zad9 {

    public static int zadaca(SLL<Integer> sll,int x){
        SLLNode<Integer> tmp=sll.getFirst();
        SLLNode<Integer> pom=null;
        int brojac=0;
        while(tmp!=null){
            if(tmp.element==x){
                pom=tmp;
                sll.insertAfter(tmp.element,pom);
                tmp=tmp.succ;
                brojac++;
            }

            tmp=tmp.succ;
        }
        return brojac;
    }



    public static void main(String[] args) {
        SLL<Integer> sll =new SLL<Integer>();
        Scanner in= new Scanner(System.in);
        String line= in.nextLine();
        String [] pom = line.split(" ");

        for(int i=0;i<pom.length;i++){
            sll.insertLast(Integer.parseInt(pom[i]));
        }
        int x=in.nextInt();
        int pozicija=zadaca(sll,x);
        System.out.println(sll);
        System.out.println(pozicija);

    }
}
