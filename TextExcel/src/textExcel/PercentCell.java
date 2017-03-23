//APCS1 Leonard Wang 1stperiod
package textExcel;
public class PercentCell extends RealCell{
	private String input = "";
	private double percent = 0.0;
	public PercentCell(String input){
		this.input = input;
		//stores value in parent class
		setRealCell(input);
	}
	public double getDoubleValue(){
		//gets rid of percent sign and puts in decimal form
		percent = Double.parseDouble(input.substring(0, input.length()-1))/100;
		return percent;
	}
}

