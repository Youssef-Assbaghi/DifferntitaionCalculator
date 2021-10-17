import java.util.Map;

public class X extends Expression {
  private String str;

  public X(){
  str="x";
  }
  public X(String str) {
    this.str = str;
  }



  @Override
  public double evaluate(DualNumber assignment) throws Exception {
    return assignment.getValor();
  }



  public Expression differentiate(String var) {
    //check if this is the var the differentiating relate to
    if (var.equals(this.str)) {
      return new Constant(1);
    }
    return new Constant(0);
  }

}
