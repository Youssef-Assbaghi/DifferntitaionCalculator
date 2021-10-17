public class Sub extends ExpressioDosValors {

  public Sub(Expression expr, Expression expr2) {
    super(expr,expr2);
  }
  public Sub(Expression expr, double expr2) {
    super(expr,expr2);
  }
  public Sub(double expr, Expression expr2) {
    super(expr,expr2);
  }
  public Sub(double expr, double expr2) {
    super(expr,expr2);
  }

  @Override
  public double evaluate(DualNumber s) throws Exception {
    return (getLeft().evaluate(s) - getRight().evaluate(s));
  }

  public Expression differentiate(String var){
    return new Sub(getLeft().differentiate(var), getRight().differentiate(var));
  }
}
