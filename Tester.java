//DON'T MESS WITH THIS CLASS JUST RUN IT TO TEST YOUR PROGRAM
public class Tester{
  public static void main(String[] args) {
    Calculator t = new Calculator();
    for(int i = 0; i < 10; i++){
      int a = randomGenerator();
      int b = randomGenerator();
      if(t.multiply(a,b) != a * b){
        System.out.println("multiply method doesn't work: " + t.multiply(a,b) + " doesn't equal " + (a*b));
      }
      if(t.add(a,b) != a + b){
        System.out.println("add method doesn't work: " + t.add(a,b) + " doesn't equal " + (a+b));
      }
      if(t.divide(a,b) != a / b){
        System.out.println("divide method doesn't work: " + t.divide(a,b) + " doesn't equal " + (a/b));
      }
      if(t.subtract(a,b) != a - b){
        System.out.println("subtract method doesn't work: " + t.subtract(a,b) + " doesn't equal " + (a/b));
      }
      if(t.mod(a,b) != a % b){
        System.out.println("multiply method doesn't work: " + t.mod(a,b) + " doesn't equal " + (a%b));
      }


    }
    System.out.println("Test successful!");
  }
  public static int randomGenerator(){
    return (int) (Math.random() * 50) + 100;
    }

}
