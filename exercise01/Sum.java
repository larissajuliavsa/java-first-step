package exercise01;
public class Sum {
  public static void main(String[] args) {
    int total = 0;
    int counter = 0;
    while(counter <= 10) {
      total += counter;
      counter++;
    }
    System.out.println(total);
  }
}
