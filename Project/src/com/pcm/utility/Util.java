package com.pcm.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Util {
	private Util(){
		
	}
	
	public static BigDecimal roundOff(BigDecimal anyNum){
		anyNum = anyNum.setScale(2, RoundingMode.DOWN);
		return anyNum;
	}
}
