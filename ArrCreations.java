package com.interf.defandstatmethods;

import java.text.CharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import de.vandermeer.skb.interfaces.translators.CharacterTranslator;

public class ArrCreations {

	private static int[] intArray;
	private ArrayList<Integer> integerObjArray;
	private int startValue;
	private int endValue; 
	private int deleteIndex;
	private int addValue;
	private ArrayList<Integer> addValues;

	/**
	 * default constructor
	 */
	public ArrCreations() {}

	
	/**
	 * @param intArray
	 * @param integerObjArray
	 * @param startValue
	 * @param endValue
	 * @param deleteIndex
	 * @param addValue
	 * @param addValues
	 */
	public ArrCreations(int startValue, int endValue, int deleteIndex, int addValue, ArrayList<Integer> addValues) {
		this.intArray = intArray;
		this.integerObjArray = integerObjArray;
		this.startValue = startValue;
		this.endValue = endValue;
		this.deleteIndex = deleteIndex;
		this.addValue = addValue;
		this.addValues = addValues;
	}

	/**
	 * @return the intArray
	 */
	public int[] getIntArray() {
		return intArray;
	}
	
	/**
	 * @return the integerObjArray
	 */
	public ArrayList<Integer> getIntegerObjArray() {
		return integerObjArray;
	}

	/**
	 * @return the startValue
	 */
	public int getStartValue() {
		return startValue;
	}

	/**
	 * @return the endValue
	 */
	public int getEndValue() {
		return endValue;
	}

	/**
	 * @return the deleteIndex
	 */
	public int getDeleteIndex() {
		return deleteIndex;
	}

	/**
	 * @return the addValue
	 */
	public int getAddValue() {
		return addValue;
	}

	/**
	 * @return the addValues
	 */
	public ArrayList<Integer> getAddValues() {
		return addValues;
	}

	public static ArrayList<Integer> createIntegerArrayList(int startValue, int endValue) {
		IntStream intStream = IntStream.rangeClosed(startValue, endValue);
		Stream<Integer> objIntegerStream = intStream.mapToObj(Integer::valueOf);
		ArrayList<Integer> integerArrayList = objIntegerStream.collect(Collectors.toCollection(ArrayList<Integer>::new));
		return integerArrayList;
	}
	
	public static int[] createIntArray(int startValue, int endValue) {
		ArrayList<Integer> integerArrayList = createIntegerArrayList(startValue, endValue);
		int[] intArray = integerArrayList.stream().mapToInt(Integer::valueOf).toArray();
		return intArray;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		char[] chars = {65, 11, 15, 36, 35, 171, 178, 204, 2011, 219, 248, 254, 184, 182, 3, 109, 145, 142, 153, 32, 124, 126, 253, 232};
		for (int i = 0; i < chars.length; i++) {
			System.out.println(".............................................................................................");
			System.out.println("char" + String.valueOf(i) + ": " + Character.toString((char) chars[i]));
			 //Character.TYPE.cast(Character.getName( chars[i]))
             // (char) chars[i])
			//Character.highSurrogate(chars[i]);//.charCount(i)
			Character c = Character.valueOf(chars[i]);
			//c.toChars(i).getClass()
			System.out.println("char" + String.valueOf(i + 10) 
									+ "-class: " + c.getClass());
			System.out.println("char" + String.valueOf(i + 10) 
									+ "-getName()::::: " + Character.getName(chars[i]));
			System.out.println("char" + String.valueOf(i + 10) 
										+ "-highSurrogate(): --- " + Character.highSurrogate(chars[i]));
			System.out.println("char" + String.valueOf(i + 10) 
											+ "-lowSurrogate((): --- " + Character.lowSurrogate(chars[i]));
			System.out.println("char" + String.valueOf(i + 10) 
											+ "-getDirectionality(): --- " + Character.getDirectionality(chars[i]));
			System.out.println("char" + String.valueOf(i + 10) 
											+ "-getNumericValue(): --- " + Character.getNumericValue(chars[i]));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-isAlphabetic(): --- " + Character.isAlphabetic(chars[i]));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes(): --- " + Character.reverseBytes((char) chars[i]));	
			System.out.println("char" + String.valueOf(i + 10) 
												+ "!!!!!-reverseBytes(): --- " + Character.reverseBytes((char) chars[i]));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isIdentifierIgnorable(): --- " 
												+ Character.isIdentifierIgnorable(Character.reverseBytes((char) chars[i])));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isHighSurrogate(): --- " 
												+ Character.isHighSurrogate(Character.reverseBytes((char) chars[i])));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isLowSurrogate(): --- " 
												+ Character.isLowSurrogate(Character.reverseBytes((char) chars[i])));	
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isBmpCodePoint(): --- " 
												+ Character.isBmpCodePoint((Character.reverseBytes((char) chars[i]))));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isDefined(): --- " 
												+ Character.isDefined(Character.reverseBytes((char) chars[i])));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isIdeographic(): --- " 
												+ Character.isIdeographic(Character.reverseBytes((char) chars[i])));	
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isISOControl(): --- " 
												+ Character.isISOControl((Character.reverseBytes((char) chars[i]))));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isJavaIdentifierPart(): --- " 
												+ Character.isJavaIdentifierPart(Character.reverseBytes((char) chars[i])));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isLetterOrDigit(): --- " 
												+ Character.isLetterOrDigit(Character.reverseBytes((char) chars[i])));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isMirrored(): --- " 
												+ Character.isMirrored((Character.reverseBytes((char) chars[i]))));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isValidCodePoint(): --- " 
												+ Character.isValidCodePoint(Character.reverseBytes((char) chars[i])));
			System.out.println("char" + String.valueOf(i + 10) 
												+ "-reverseBytes().isUnicodeIdentifierPart(): --- " 
												+ Character.isUnicodeIdentifierPart(Character.reverseBytes((char) chars[i])));		
			System.out.println("char" + String.valueOf(i + 10) 
												+ "!!!!!-reverseBytes().reverseBytes(): --- " 
												+ Character.reverseBytes(Character.reverseBytes((char) chars[i])));
			System.out.println("char" + String.valueOf(i + 10) + "-charCount(): --- " + Character.charCount(chars[i]));
			System.out.println("char" + String.valueOf(i + 10) + "-toChars(): --- " + Arrays.toString(Character.toChars(chars[i])));
			System.out.println("char" + String.valueOf(i + 10) + "-isBmpCodePoint(): --- " + Character.isBmpCodePoint(chars[i]));
			System.out.println(".............................................................................................");
		}
		System.out.println(Arrays.toString(createIntArray(1, 10)));

	}

}
