public class Sin extends ExpressioUnValor {

  public Sin(Expression expr) {
    super(expr);
  }
  public Sin(double num) {
    super(num);
  }
  public Sin(String var) {
    super(var);
  }

  @Override
  public double evaluate(DualNumber s) throws Exception {
    return Math.sin((getExpresion().evaluate(s)));
  }





  public Expression differentiate(String var){
    return new Multiply(new Cos(this.getExpresion()), this.getExpresion().differentiate(var));
  }
}
