//Дадена е линеарно поврзана листа. Да се напише функција која од листата ќе ги
//избрише сите елементи кои во info полето имаат непарен број. Како резултат
//функцијата да враќа колку јазли биле избришани.
//        Пр. →3→4→7→6→4→7→3→2;
//        →4→6→4→2; избришани 4 јазли


import java.util.Scanner;

public class zad6 {

    public  static int zadaca(SLL<Integer> sll){
        SLLNode<Integer> tmp=sll.getFirst();
        SLLNode<Integer> pom=null;
        int br=0;
        while(tmp!=null){
            if(tmp.element%2==1){
                pom=tmp;
                sll.delete(pom);
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

        int pozicija=zadaca(sll);
        System.out.println(sll);
        System.out.println(pozicija);


    }
}
