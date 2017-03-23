//APCS1 Leonard Wang 1stperiod
package textExcel;
public class SpreadsheetLocation implements Location
{
    private String location;
	public int getRow()
    {
		//changes String to int
		int row = Integer.parseInt(location.substring(1));
		//since arrays are zero based indexing
        return row - 1;
    }

    public int getCol()
    {
    	//return the index of where the letter is-ASCII table
    	int col = location.charAt(0);
    	return col - 65;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        location = cellName;
    }

}
