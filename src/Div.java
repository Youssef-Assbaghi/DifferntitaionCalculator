public class Div  extends ExpressioDosValors{

  public Div(Expression expr, Expression expr2) {
    super(expr, expr2);
  }

  public Div(Expression expr, String var) {
    super(expr, var);
  }
  public Div(String var, Expression expr2) {
    super(var, expr2);
  }
  public Div(String var1, String var2) {
    super(var1, var2);
  }
  public Div(String var1, double num) {
    super(var1, num);
  }
  public Div(double num, String var1) {
    super(num, var1);
  }
  public Div(double num1, double num2) {
    super(num1, num2);
  }
  public Div(double num1, Expression expr2) {
    super(num1, expr2);
  }
  public Div(Expression expr, double num1) {
    super(expr, num1);
  }



  @Override
  public double evaluate(DualNumber assignment) throws Exception {

    if (this.getRight().evaluate(assignment) == 0) {
      throw new Exception("ERROR - Division by 0 is not allowed");
    }

 return this.getLeft().evaluate(assignment)/ this.getRight().evaluate(assignment);

  }


  @Override
  public Expression differentiate(String var) {
    return new Div(new Sub(new Multiply(this.getLeft().differentiate(var), (this.getRight())),
        new Multiply(this.getLeft(), this.getRight().differentiate(var))),
        new Exponent(this.getRight(), new Constant(2)));
  }
}
