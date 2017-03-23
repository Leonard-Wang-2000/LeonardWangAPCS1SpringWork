//APCS1 Leonard Wang 1stperiod
package textExcel;
public class ValueCell extends RealCell{
	private String value = "";
	public ValueCell(String a){
		value = a;
		//stores string in parent class
		setRealCell(a);
	}
	public double getDoubleValue(){
		//changes string to double
		double placeHolder = Double.parseDouble(value);
		return placeHolder;
	}

}