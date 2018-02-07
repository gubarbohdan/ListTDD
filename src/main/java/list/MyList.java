package list;

import java.util.Arrays;
import java.util.Optional;

public class MyList {

    private String[] list;
    private int lastElementIndex;

    public MyList() {
        list = new String[5];
        lastElementIndex = 0;
    }

    public int getSize() {
        return lastElementIndex;
    }

    public String add(String string) {
        if(lastElementIndex == list.length){
            list = Arrays.copyOf(list, lastElementIndex * 2);
        }
        list[lastElementIndex] = string;
        lastElementIndex++;
        return string;
    }

    public String get(int index) {
        return list[index];
    }

    public boolean contains(String string) {
        return Arrays.stream(list)
                .anyMatch((x) -> Optional.ofNullable(x).equals(Optional.of(string)));
    }

    public String remove(String string) {
        list = Arrays.stream(list)
                .filter((x) -> !Optional.ofNullable(x).equals(Optional.of(string)))
                .toArray(String[]::new);
        return string;
    }

}
