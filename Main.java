import java.util.*;

class Cptor implements Comparator<Integer> {
  public int compare(Integer a, Integer b) {
    return (a%3) - (b%3);
  }
}


class Main {
  public static void main(String[] args) {
    
    int arraySize = 10;
    Integer[] ra = new Integer[arraySize];
    int a = 1;
    int b = 0;
    for (int i=0; i < arraySize; i++) {
      ra[i] = a + b;
      int t = b;
      b += a;
      a = t;
    }
    
    Comparator<Integer> cp = new Cptor();
    Arrays.sort(ra, cp);
    System.out.println(Arrays.toString(ra));

    Arrays.sort(ra, (Integer aa, Integer bb) -> aa - bb);
    System.out.println(Arrays.toString(ra));

    System.out.println(Arrays.toString(new Integer[]{1,2,3}));
  }
}