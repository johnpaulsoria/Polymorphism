public class PartialScholar extends Student {
	
	//initializing private variables
	private float discountRate;
	private float payableAmount;
	
	public PartialScholar(String name, String course, float tuitionFee, float discountRate) {
		super(name, course, tuitionFee);
		this.discountRate = discountRate;
		this.payableAmount = (int)tuitionFee * (1 - discountRate);
	}
	
	//getters
	public float getDiscountRate() {
		return discountRate;
	}
	
	public float getPayableAmount() {
		return payableAmount;
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nDiscount Rate of: " + discountRate * 100 + "%" + "\nNet Payable Tuition Fee is: " + payableAmount;
	}
}
