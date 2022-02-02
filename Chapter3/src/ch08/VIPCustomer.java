package ch08;

public class VIPCustomer extends GoldCustomer {

  private int agentID;

  public VIPCustomer(int customerID, String customerName) {
    super(customerID, customerName);

    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.1;
  }

  public int getAgentID() {
    return agentID;
  }

  public void setAgentID(int agentID) {
    this.agentID = agentID;
  }

  @Override
  public String showCustomerInfo() {
    return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
  }

}