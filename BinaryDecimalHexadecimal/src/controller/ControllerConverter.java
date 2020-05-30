package controller;

public class ControllerConverter{
	public int BinaryToDecimal(String binary) {
		try {
			int bin = Integer.parseInt(binary, 2);
			//System.out.println("Binary >>> Decimal: " + bin);
			return bin;
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	public String BinaryToHexa(String binary) {
		try {
			String bin = Integer.toHexString(Integer.parseInt(binary, 2));
			//System.out.println("Binary >>> Hexa: " + bin);
			return bin;
		} catch (Exception e) {
			return "0";
		}
	}
	
	public String DecimalToBinary(int decimal) {
		try {
			String dec = Integer.toBinaryString(decimal);
			//System.out.println("Decimal >>> Binary: " + dec);
			return dec;
		} catch (Exception e) {
			return "0";
		}
	}
	
	public String DecimalToHexa(int decimal) {
		try {
			String dec = Integer.toHexString(decimal);
			//System.out.println("Decimal >>> Hexa: " + dec);
			return dec;
		} catch (Exception e) {
			return "0";
		}
	}
	
	public String HexaToBinary(String hexa) {
		try {
			String hex = Integer.toBinaryString(Integer.parseInt(hexa, 16));
			//System.out.println("Hexadecimal >>> Binary: " + hex);
			return hex;
		} catch (Exception e) {
			return "0";
		}
	}
	
	public int HexaToDecimal(String hexa) {
		try {
			int hex = Integer.parseInt(hexa, 16);
			//System.out.println("Hexadecimal >>> Decimal: " + hex);
			return hex;
		} catch (Exception e) {
			return 0;
		}
	}
	
}
