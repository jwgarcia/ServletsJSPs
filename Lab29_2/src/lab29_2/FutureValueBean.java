package lab29_2;
import java.io.Serializable;

public class FutureValueBean implements Serializable {
	
	private int investment;
	private int years;
	private double fv; 
	 
	
	public FutureValueBean(){
		investment = 0;
		years = 0;
		 }
		
	
	public FutureValueBean(int investment, int years){
		this.investment = investment; 
		this.years = years; 
		 
	}

	public int getInvestment(){
		return investment; 
	}
	
	public void setInvestment(int investment){
		this.investment = investment; 
	}
	
	public int getYears(){
		return years; 
	}
	
	public void setYears(int years){
		this.years = years; 
	}
	
	public double calculateFutureValue(){
		double fv = 0; 
		for(int i = 1; i <=years * 12; i++)
			fv = (fv + investment) * (1 + 0.1); 
		return fv; 
	}
	
	public double returnFutureValue(){
		fv = this.calculateFutureValue();
		return fv; 
	}
}



