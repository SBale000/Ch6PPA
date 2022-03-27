

/*
 * I know instructs said to only use chapters 1-5, but we did learn ch 6 in in 151, 
 * and OOP has been taught and is used extensively in data structs/algos. I don't want
 * to move backwards.
 */
public class ClassBankAccount {
  private String accntNum, custName, accntType;
  private double accntBalance, monthlyFee;
  private final double FEE_RATE=0.001;
  
  public ClassBankAccount() {
	  accntNum="";
	  custName="";
	  accntBalance=0.00;
	  monthlyFee=0.00;
  }
  
  
  //Slight twist 
  public void setAccntNum(String lclAccntNum){
	accntNum=lclAccntNum;
  }
  
  public void setCustName(String lclCustName){
	 custName=lclCustName; 
  }
  
  public void setAccntType(int lclAccntType){
	  accntType = (lclAccntType==1) ? "Savings" : "Checking";
  }
  
  public void setAccntBalance(double lclAccntBalance){
	  accntBalance=lclAccntBalance;
	  /* monthlyFee is solely a function of accntBalance, so separate mutator seems
	   * superfluous as it would have to be called every time accntBalance changes anyways
	   */
	  monthlyFee= FEE_RATE * accntBalance;
  }
  
	
  public String getAccntNum(){
	  return accntNum;
  }
  
  public String getCustName(){
	  return custName;
  }
  
  public String getAccntType(){
	  return accntType;
  }
  
  public double getAccntBalance(){
	  return accntBalance;
  }
  
  public double getMonthlyFee(){
	  return monthlyFee;
  }
  
  public void printInfo(){
	  
  }


}// end class
