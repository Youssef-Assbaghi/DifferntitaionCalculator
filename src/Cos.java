public class Cos extends ExpressioUnValor {

  public Cos(Expression expr) {
    super(expr);
  }
  public Cos(double num) {
    super(num);
  }
  public Cos(String var) {
    super(var);
  }

  @Override
  public double evaluate(DualNumber s) throws Exception {
    return Math.cos((getExpresion().evaluate(s)));
  }

  public Expression differentiate(String var) {
    return new Multiply(new Multiply(new Sin(this.getExpresion()), this.getExpresion().differentiate(var)), -1);
  }
}
