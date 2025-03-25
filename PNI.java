package com.interf.defandstatmethods;

/****************************************************************************
 * @author vizarce
 * @version 1.0.0
 * @category PNI - <b>Prime Number</b>  (<b>PN</b>) Interface
 * @see A <b>PN</b> is a <b>N</b> that is <i>divisible</i> 
 *          by only two <b>Ns</b>: <b>1</b> and <b>itself</b>. 
 *          So, if any <b>N</b> is <i>divisible</i> by any other <b>N</b>, 
 *         it is not a <b>PN</b>.
 * @implNote Have default method to calculate if <b>N</b> is <b>PN</b>
 ***************************************************************************/
public interface PNI {
	/**
	 * @category The <b>Absolute Maximum Value</b> of Integer values 
	 *           of the <b>CodePoins</b> in the <b>Algorithm</b>
	 */
	static final Integer ABS_INT_CDP_MAX = 5393;
	/**
	 * @category The <b>Alphabetical Flag</b> in the end 
	 *           of the String {@value "a" in lowercase}
	 */
	static final String PNs_FLAG = "a";
	/**
	 * @category The <b>Alphabetical Flag</b> in the end 
	 *           of the String {@value "b" in lowercase}
	 */
	static final String BALANCED_PNs_FLAG = "b";
	
	/***************************************************************************************************
	 * @category <b>PN</b> with equal-sized {@value <b>Prime Gaps(PNsGs)</b>} 
	 *     after and before them, so that they are equal to the {@value <b>Arithmetic Mean</b>} 
	 *     of the nearest <b>PN</b> after and before
	 * @see {@value <b>PRNGs<</b>} A <b>PNG</b> is the difference between two successive <b>PNs</b>. 
	 *     The {@value n-th} <b>PNG</b>, denoted {@code g_(<i>n</i>)}} or {@code g(p_(<i>n</i>))} 
	 *     is the difference between the {@value (n + 1)-st} and the {@value n-th} <b>PRNs</b>,
	 *      
	 *                  i.e. {@code g_(<i>n</i>)=p_(<i>n</i> + 1)-p_ (<i>n</i>)}
	 *                  
	 * @see {@value <b>Arithmetic Mean</b>} The <b>Arithmetic Mean</b> is the <b><i>SUM</i></b> 
	 *      of a <b>Collection</b> of <b>Ns</b> <i>divided</i> by the Count of <b>Ns</b> 
	 *      in the <b>Collection</b>.
	 * {@link https://en.wikipedia.org/wiki/List_of_prime_numbers#The_first_1000_prime_numbers}
	 ****************************************************************************************************/
	static final Integer[] BALANCED_PRNs = {5, 53, 157, 173, 211, 257, 263, 373, 563, 593, 607, 653, 733, 947, 977, 1103, 1123, 1187, 1223, 1367, 1511, 1747, 1753, 1907, 2287, 2417, 2677, 2903, 2963, 3307, 3313, 3637, 3733, 4013, 4409, 4457, 4597, 4657, 4691, 4993, 5107, 5113, 5303, 5387, 5393};
	
	
	/****************************************************
	 * @category PNI method
	 * @implSpec The <b>Alphabetical Flag</b> in the end 
	 *           of the String {@value "a" in lowercase}
	 * @param Integer number
	 * @return String representation of the <b>N</b> 
	 *         with special <b>Alphabetical Flag</b> 
	 *         in the end of the String
	 ***************************************************/
	String convertPN(Integer number);
	
	/**
	 * @category Default PNI method for testing purpose
	 * @param String str
	 */
	default void log(String str){
		System.out.println("PNI logging::: "+str);
	}
	/**
	 * @category Default PNI {@value boolean} method to calculate 
	 * if the <b>N</b> is the <b>PN</b>
	 * @param int {@value number}
	 * @return boolean if the <b>N</b> is the <b>PN</b>
	 */
	public default boolean isPN(int number) {
		boolean flag = false;
		/**
		 * @category Corner case
		 * @{value number = 0} and @{value number = 1} are not <b>PN</b>
		 * IF @{value number == 0} OR @{value number == 1}
		 */
		if (number == 0 || number == 1) {
			flag = false;
		} else {
			/**
			 * Check from 2 to number - 1
			 */
			for (int i = 2; i < number; i++) {
				/**
				 * Condition for the <b>PN</b>
				 */
				if (number % i == 0) {
					flag = false;
				}	
			}
			flag = true;
		}
		return flag;
		
	}
}