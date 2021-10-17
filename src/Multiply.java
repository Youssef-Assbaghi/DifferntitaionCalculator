

public class Multiply extends ExpressioDosValors{
    public Multiply(Expression leftExpression, Expression rightExpression) {
      super(leftExpression, rightExpression);
    }
    public Multiply(Expression leftExpression, String var) {
    super(leftExpression, var);
  }
  public Multiply(String var, Expression leftExpression) {
    super(var, leftExpression);
  }
  public Multiply(String var1, String var2) {
    super(var1, var2);
  }
  public Multiply(String var1, double num) {
    super(var1, num);
  }
  public Multiply(double num, String var1) {
    super(num, var1);
  }
  public Multiply(double num1, double num2) {
    super(num1, num2);
  }
  public Multiply(double num1, Expression leftExpression) {
    super(num1, leftExpression);
  }
  public Multiply(Expression leftExpression, double num1) {
    super(leftExpression, num1);
  }


  @Override
  public double evaluate(DualNumber assignment) throws Exception {
    return (this.getLeft().evaluate(assignment) * this.getRight().evaluate(assignment));
  }


  public Expression differentiate(String var) {
    return new Add(new Multiply(this.getLeft().differentiate(var), (this.getRight())), new Multiply(this.getLeft(),
        this.getRight().differentiate(var)));
  }
}
