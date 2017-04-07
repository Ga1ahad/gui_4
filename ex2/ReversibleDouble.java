package ex2;

public class ReversibleDouble implements Reversible {
	private double d;
	ReversibleDouble(double d) {
		this.d=d;
	}


	public ReversibleDouble reverse() {
		if(d==0){
			double reversedDouble = 0;
			d=reversedDouble;
			return this;
		}
		else{
		double reversedDouble = 1.0/d;	
		d = reversedDouble;
		return this;
		}
	}
				
	public String toString() {
		return Double.toString(d);
}

}
