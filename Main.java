import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

class Cptor implements Comparator<Integer> {
  public int compare(Integer a, Integer b) {
    return (a%3) - (b%3);
  }
}

class Fibs implements IntSupplier {
  private int a = 1;
  private int b = 0;
  public int getAsInt() {
    int r = a + b;
    a = b;
    b = r;
    return r;
  }
}

class Main {
  public static void main(String[] args) {
    
    IntSupplier isup = new Fibs();
    Integer[] ra = IntStream.generate(isup).limit(10).boxed().toArray(Integer[]::new);
    System.out.println(Arrays.toString(ra));
    
    Comparator<Integer> cp = new Cptor();
    Arrays.sort(ra, cp);
    System.out.println(Arrays.toString(ra));

    Arrays.sort(ra, (Integer aa, Integer bb) -> aa - bb);
    System.out.println(Arrays.toString(ra));
  }
}