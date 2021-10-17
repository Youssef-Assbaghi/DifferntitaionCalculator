public class Add extends ExpressioDosValors{
  public Add(Expression expr, Expression expr2) {
    super(expr,expr2);
  }
  public Add(Expression expr, double expr2) {
    super(expr,expr2);
  }
  public Add(double expr, Expression expr2) {
    super(expr,expr2);
  }

  public Add(double expr, double expr2) {
    super(expr,expr2);
  }

  @Override
  public double evaluate(DualNumber s) throws Exception {
    return (getLeft().evaluate(s) + getRight().evaluate(s));
  }


  public Expression differentiate(String var) {
    return new Add(getLeft().differentiate(var), getRight().differentiate(var));
  }



}
