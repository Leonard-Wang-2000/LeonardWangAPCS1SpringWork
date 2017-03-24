//APCS1 Leonard Wang 1stperiod
package textExcel;
import java.util.Arrays;

public class TextCell implements Cell  {

	private String strcontents = "";
	private String abbreviatedText = "";
	//sets a value
	public TextCell(String strcontents){
		this.strcontents = strcontents;
	}
	public String abbreviatedCellText() {
		//makes new String so this method won't affect FullCellText when you take out the quotes
				String abbreviatedString = "";
				
				//gets rid of quotes
				if(strcontents.contains("\"") == true){
					abbreviatedString = strcontents.substring(1, strcontents.length() - 1);
				}
				//Reduces string to first 10
				if(abbreviatedString.length() > 10){
					abbreviatedString = abbreviatedString.substring(0, 10);
					return abbreviatedString;
				}else{
					//fills in the spaces so total length will be 10
					while(abbreviatedString.length() != 10){
						abbreviatedString += " ";

					}
					return abbreviatedString;
				}
	}
	//returns full string
	public String fullCellText() {
		return strcontents;
	}
	public void setText(String strcontents){
		this.strcontents = strcontents;
	}

}
