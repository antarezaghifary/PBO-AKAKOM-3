class Calculation2 {
  private int a, b;
  private double c, d;

  void sum(int a, int b) {
    System.out.println(a + b);
  }

  void sum(double c, double d) {
    System.out.println(c + d);
  }

  void sum(int a, double c){
    System.out.println(a + c);
  }

  public static void main(String args[]) {
    Calculation2 obj = new Calculation2();
    obj.sum(10.5, 10.5);
    obj.sum(20, 20);
    obj.sum(10,14.5);
  }
}