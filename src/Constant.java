public class Constant extends Expression {
  private double num;
  public Constant(double num) {
    this.num = num;
  }


  @Override
  public double evaluate(DualNumber s) throws Exception {
    return num;
  }

  public Expression differentiate(String var) {
    return new Constant(0);
  }
}
