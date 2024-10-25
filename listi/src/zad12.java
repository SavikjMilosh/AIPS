public class zad12<E extends Comparable<E>> {
    public SLL<E> mergeListSorted(SLL<E> sll1, SLL<E> sll2) {
        SLL<E> result = new SLL<E>();
        SLLNode<E> tmp1 = sll1.getFirst(), tmp2 = sll2.getFirst();
        while (tmp1 != null) {
            if (tmp1.element.compareTo(tmp2.element) < 0) {
                result.insertLast(tmp1.element);
                tmp1 = tmp1.succ;
            } else {
                result.insertLast(tmp2.element);
                tmp2 = tmp2.succ;
            }

        }
        while (tmp1 != null) { //
            result.insertLast(tmp1.element);
            tmp1 = tmp1.succ;
        }
        while (tmp2 != null) {
            result.insertLast(tmp1.element);
            tmp2 = tmp2.succ;
        }
        return result;
    }


    public static void main(String[] args) {
        SLL<Integer> sll=new SLL<Integer>();

    }
}
