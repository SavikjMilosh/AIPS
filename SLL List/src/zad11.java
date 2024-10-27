//Дадена е линеарно поврзана листа. Да се напише функција која ќе ги замени местата на
//        првиот и последниот јазел во листата. Да се заменат местата на целите јазли, а не само
//        на информациите во нив!
//        Пр. →3→4→7→6→4→7→3→2
//        →2→4→7→6→4→7→3→3
//







import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>();
        String line = sc.nextLine(); // 1 2 3 4 5
        String[] pom = line.split(" ");
        for (int i = 0; i < pom.length; i++) {
            lista.insertLast(Integer.parseInt(pom[i]));
        }
        listaMetoda(lista);
        System.out.println(lista);
    }

    private static void listaMetoda(SLL<Integer> lista) {
        SLLNode<Integer> tmp = lista.getFirst();
        SLLNode<Integer> last = null;
        while (tmp != null) {
            if (tmp.succ == null) {
                last = tmp;
            }
            tmp = tmp.succ;
        }
        SLLNode<Integer> first = lista.getFirst();
        lista.deleteFirst();
        lista.insertFirst(last.element);
        lista.delete(last);
        lista.insertLast(first.element);


    }
}

