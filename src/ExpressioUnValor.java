public abstract class ExpressioUnValor extends Expression {

  private Expression exp;

  public ExpressioUnValor(Double num) {
    this.exp = new Constant(num);
  }

  public ExpressioUnValor(Expression exp) {
    this.exp = exp;
  }

  public ExpressioUnValor(String var) {
    this.exp = new X(var);
  }

  public Expression getExpresion() {
    return exp;
  }

}
