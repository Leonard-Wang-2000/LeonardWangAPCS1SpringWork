//APCS1 Leonard Wang 1stperiod
package textExcel;
public abstract class RealCell implements Cell {
	private String userInput = "";
	private int counter = 0;
	//abstract classto make the subclasses contain this method
	public abstract double getDoubleValue();
	public String abbreviatedCellText() {
		if(userInput.length() < 10){
			//has to be percent with this sign
			if(userInput.contains("%")){
				//makes a placeholder so it doesnt affect full cell text
				String placeholder = userInput.substring(0, userInput.indexOf(".")) + "%";
				//formats to have 10 spaces
				return addSpaces(placeholder);
			}
			//checks if its a whole number thats a value cell, no percent or formula cell
			if(!userInput.contains(".") && !userInput.contains("(")){
				String anotherPlaceholder = userInput + ".0";
				return addSpaces(anotherPlaceholder);
			}
			//the one exception to having 2 zeros next to each other, treats it differently and just adds spaces
			if(userInput.equals("0.0")){
				userInput = addSpaces(userInput);
				return userInput;
			}
			//reverse for loop to check for two or more zeros together from the end
			if(!userInput.contains("(")){
				for(int i = userInput.length()-1; i >=0; i--){
					//ends the loop if its not a zero
					if(userInput.charAt(i) != '0'){
						i = 0;
					}
					if(userInput.charAt(i) == '0'){
						counter ++;
						//checks to see if there is 2 zeros in a row
						if(counter >= 2){
							userInput = userInput.substring(0, i);
						}
					}

				}
			}
			//adds a .0 if theres nothing after the decimal
			if(userInput.charAt(userInput.length()-1) == '.'){
				userInput = userInput + "0";
			}
			userInput = addSpaces(userInput);
			//if longer than 10, shortens to 10
		} else if(userInput.length() > 10){
			return userInput.substring(0, 10);
		}
		return userInput;
	}

	public String getRealCell(){
		return userInput;
	}
	public void setRealCell(String value){
		userInput = value;
	}
	public String fullCellText() {
		RealCell whatever;
		if(userInput.equals("0")){
			return "0";
		}
		//finds the right cell form
		if(userInput.contains("%")){
			whatever = new PercentCell(userInput);
			//formulacell is overriden for fullcelltext
		}else{
			whatever = new ValueCell(userInput);
		}
		//switches double to string to get rid of extra 0s at the end
		String removeZeros = whatever.getDoubleValue() + "";
		//makes sure number is positive and longer than one place value
		if((removeZeros.substring(removeZeros.indexOf(".")).equalsIgnoreCase(".0")) && ((whatever.getDoubleValue() > 0) && (removeZeros.length() > 3))){
			return removeZeros.substring(0, removeZeros.indexOf("."));
		}
		return whatever.getDoubleValue() + "";

}
	public String addSpaces(String placeholder){
		//formats abbreviatedCellText to length 10 if its too short
		while(placeholder.length() < 10){
			placeholder += " ";
		}
		return placeholder;
	}
}
