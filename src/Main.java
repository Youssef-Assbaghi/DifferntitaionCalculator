public class Main {
  private static double f(double x) {
    return Math.sin(Math.PI/2.0 + x*x);
  }
  private static double df(double x) {
    return Math.cos(Math.PI/2.0 + x*x)*2*x;
  }

  public static void main(String[] args) throws Exception {
    double value=0;
    Expression x = new X(); //Que es esto??  cos(e/4 - x^3)
    Expression expr2=new Add(new Constant(Math.PI/2.0), new Multiply(x,x));
    double x0 = 4.0;
  //  value= expr2.evaluate(new DualNumber(x0, 1.0));
    //System.out.println("La funcion suma "+value);
    //DualNumber res = expr.evaluate(new DualNumber(x0, 1.0));  /// var1==-.957  var2==??
    Expression expr = new Sin(new Add(new Constant(Math.PI/2.0), new Multiply(x,x))); /// sin(pi/2 + x^2)

    try {
      value= expr.evaluate(new DualNumber(x0, 1.0));
      System.out.println("Valor real funció calculada amb disseny "+value);
    } catch (Exception e) {
      e.printStackTrace();
    }

    double derivada= 0;
    Expression derivate=expr.differentiate("x");
    try {
      derivada = derivate.evaluate(new DualNumber(x0, 1.0));
      System.out.println("Valor derivada calculada amb disseny " + derivada);
    } catch (Exception e) {
      e.printStackTrace();
    }
    DualNumber res = new DualNumber(value,derivada);

    //expr2== new Cos(Mathp1/2
    double valorReal = f(x0);

    double derivadaReal = df(x0);
    System.out.println("valor real càlcul fixe exemple");
    System.out.println(valorReal);
    System.out.println("valor derivada càlcul fixe exemple");
    System.out.println(derivadaReal);
    final double[] epsilons = {1e-6, 1e-8, 1e-10, 1e-12};
    for (int i=0; i<epsilons.length; i++) {
      double derivadaDifFinites = (f(x0+epsilons[i])-f(x0)) / epsilons[i];
    }
  }
}