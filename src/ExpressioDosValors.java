public abstract class ExpressioDosValors extends Expression {

  private Expression leftExp;
  private  Expression rightExp;



  public ExpressioDosValors(Expression leftExp, Expression rightExp) {
    this.leftExp = leftExp;
    this.rightExp = rightExp;
  }

  public ExpressioDosValors(Expression leftExp, String var) {
    this.leftExp = leftExp;
    this.rightExp = new X(var);
  }
  public ExpressioDosValors(String var1, String var2) {
    this.leftExp = new X(var1);
    this.rightExp = new X(var2);
  }
  public ExpressioDosValors(String var1, double num) {
    this.leftExp = new X(var1);
    this.rightExp = new Constant(num);
  }


  public ExpressioDosValors(double num, String var1) {
    this.leftExp = new Constant(num);
    this.rightExp = new X(var1);
  }


  public ExpressioDosValors(double num1, double num2) {
    this.leftExp = new Constant(num1);
    this.rightExp = new Constant(num2);
  }
  public ExpressioDosValors(double num1, Expression leftExpression) {
    this.leftExp = new Constant(num1);
    this.rightExp = leftExpression;
  }

  public ExpressioDosValors(Expression leftExpression, double num1) {
    this.leftExp = leftExpression;
    this.rightExp = new Constant(num1);
  }
  public ExpressioDosValors(String var, Expression leftExpression) {
    this.leftExp = new X(var);
    this.rightExp = leftExpression;
  }

  public Expression getLeft() {
    return leftExp;
  }

  public Expression getRight() {
    return rightExp;
  }



}
