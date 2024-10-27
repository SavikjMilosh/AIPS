//Дадена е линеарно поврзана листа. Да се напише функција која во листата ќе го
//пронајде првиот јазол со информација x и ќе го префрли на крајот на листата. Како
//резултат функцијата да ја враќа позицијата (броено од почетокот на листата) на која
//бил пронајден бараниот јазол или -1 ако таков јазол не бил пронајден во листата.
//Пр. →3→4→7→6→4→7→3→2; x=7
//        →3→4→6→4→7→3→2→7; позиција 3

import java.util.Scanner;

public class zad2{
public static int zadaca(SLL<Integer> sll,int x){
    SLLNode<Integer> find =sll.find(x);


    if(find!=null){ // proverka dali postoi leementot vo listata
    SLLNode<Integer> tmp=sll.getFirst();
    int pozicija=1;
    while(tmp!=null && tmp!=find) {
        tmp = tmp.succ;
        pozicija++;
    }
    sll.delete(tmp);
    sll.insertLast(tmp.element);
    return pozicija;
    }
    return -1;
}

    public static void main(String[] args) {
        SLL<Integer> sll=new SLL<Integer>();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String [] pom=line.split(" ");
        for(int i=0;i<pom.length;i++){
            sll.insertLast(Integer.parseInt(pom[i]));
        }
        int x=sc.nextInt();
        int pozicija=zadaca(sll,x);
        System.out.println(sll);
        System.out.println(pozicija);
    }
}