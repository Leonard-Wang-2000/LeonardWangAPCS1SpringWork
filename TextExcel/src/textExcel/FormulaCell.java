//APCS1 Leonard Wang 1stperiod
package textExcel;
public class FormulaCell extends RealCell{
	private String value = "";
	public FormulaCell(String input){
		value = input;
		//stores string in parent class
		getDoubleValue();
	}
	public double getDoubleValue(){
		String[] changeValue = value.split(" ");
		double finalValue = Double.parseDouble(changeValue[1]);
		//( 5.4 * 3.5 / -1.4 + 27.4 - 11.182 ) 
		//increments by 2 and tests for signs to correctly 
		for(int i = 4; i < changeValue.length; i+=2){
			if(changeValue[i-2].equals("+")){
				finalValue += Double.parseDouble(changeValue[i-1]);
			} else if(changeValue[i-2].equals("*")){
				finalValue *= Double.parseDouble(changeValue[i-1]);
			} else if(changeValue[i-2].equals("/")){
				finalValue /= Double.parseDouble(changeValue[i-1]);
			} else{
				finalValue -= Double.parseDouble(changeValue[i-1]);
			}
		}
		setRealCell(finalValue + "");
		return finalValue;
	}
	public String fullCellText(){
		return value;
	}
}
