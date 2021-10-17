
public class Exponent  extends ExpressioDosValors{

  public Exponent(Expression leftExpression, Expression rightExpression) {
    super(leftExpression, rightExpression);
  }
  public Exponent(Expression leftExpression, String var) {
    super(leftExpression, var);
  }
  public Exponent(String var, Expression leftExpression) {
    super(var, leftExpression);
  }
  public Exponent(String var1, String var2) {
    super(var1, var2);
  }
  public Exponent(String var1, double num) {
    super(var1, num);
  }
  public Exponent(double num, String var1) {
    super(num, var1);
  }
  public Exponent(double num1, double num2) {
    super(num1, num2);
  }
  public Exponent(double num1, Expression leftExpression) {
    super(num1, leftExpression);
  }
  public Exponent(Expression leftExpression, double num1) {
    super(leftExpression, num1);
  }
  public double evaluate(DualNumber assignment) throws Exception {
    double evaluation = Math.pow(this.getLeft().evaluate(assignment), this.getRight().evaluate(assignment));
    if (Double.isInfinite(evaluation) || Double.isNaN(evaluation)) {
      throw new Exception("ERROR - This calculation is unavailable");
    }
    return Math.pow(this.getLeft().evaluate(assignment), this.getRight().evaluate(assignment));
  }
  public Expression differentiate(String var) {
    Expression e1 = new Multiply(this.getLeft().differentiate(var), new Div(this.getRight(), this.getLeft()));
    Expression e2 = new Multiply(this.getRight().differentiate(var), new Log(new X("e"), this.getLeft()));
    return new Multiply(new Exponent(this.getLeft(), getRight()), new Add(e1, e2));
  }
}
