public abstract class Expression {




  public double evaluate(DualNumber s) throws Exception {


    return this.evaluate(null);
  }

  public Expression differentiate(String var)  {
      //return newex;
    return this.differentiate(var) ;
  }
}
