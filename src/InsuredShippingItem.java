public class InsuredShippingItem extends ShippingItem {
  private double insuredAmount;
  
  public InsuredShippingItem(double w, double insAmt) {
    super(w);
    insAmt = insuredAmount;

  }

  @Override
  public double getCost() {
    return super.getCost() * insuredAmount;
  }
  
  public void addMoreInsurance(double amt) {
    insuredAmount += amt;
  }
}