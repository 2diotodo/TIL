package newstudy;

import java.math.BigDecimal;

public class Money {
	//private으로 접근 못하게 함
	private BigDecimal amount;
	
	public Money(String amount) {
		this.amount = new BigDecimal(amount);
	}
	
	public Money() {
	}

	public void add(Money toAdd) {
		amount = amount.add(toAdd.amount);
	}
	
	//client
	Money balance1 = new Money("10.0");
	Money balance2 = new Money("6.0");
//	balance1.add(balance2);
	
}
