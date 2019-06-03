import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author flo
 * @since 30/06/2018.
 */
public class GenericsExample {

    public static void multiplyByTwo(List<Integer> integers) {
        for (Integer integer : integers) {
            int value = integer;
            System.out.println(value * 2);
        }

    }
    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();

        int value = 15;
        Integer boxed = new Integer(value);
        elements.add(boxed);
        elements.add("Sambata".hashCode());
        elements.add("c".hashCode());
        elements.add(new Double(4.9).hashCode());
        elements.add(Double.valueOf(5.4).hashCode());



        Integer x = elements.get(2);
        System.out.println(x);
        for (Integer element : elements) {
            System.out.println(element);
        }


        multiplyByTwo(elements);

    }
}
