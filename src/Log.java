public class Log extends ExpressioDosValors {

  public Log(Expression expr, Expression expr2){
    super(expr, expr2);

  }

  public Log(Expression expr, String expr2){
    super(expr, expr2);

  }

  public Log(String expr, Expression expr2){
    super(expr, expr2);

  }

  public Log(String expr, String expr2){
    super(expr, expr2);

  }

  @Override
  public double evaluate(DualNumber assignment) throws Exception {
    //make sure the base is bigger then 0 and not equal to 1 and num >0
    if (getLeft().evaluate(assignment) <= 0 && getLeft().evaluate(assignment) != 1
        && getRight().evaluate(assignment) > 0) {
      throw new Exception("Log error");
    }
    double rightSide = Math.log(getRight().evaluate(assignment));
    double leftSide = Math.log(getLeft().evaluate(assignment));
    return rightSide / leftSide;
  }





  public Expression differentiate(String var){
    Expression a = new Multiply(getRight(), new Log(var,getLeft()));
    return new Div(getRight().differentiate(var), a);
  }



}
