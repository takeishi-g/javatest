public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if(i % 15 == 0) {
        System.out.println(i + " " + "FizzBuzz");
        continue;
      } else if (i % 3 == 0){
        System.out.println(i + " " + "Fizz");
        continue;
      } else if (i % 5 == 0){
        System.out.println(i + " "+ "Buzz");
        continue;
      }   
        System.out.println(i);
    }
  }
}