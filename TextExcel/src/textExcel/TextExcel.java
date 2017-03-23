//APCS1 Leonard Wang 1stperiod
package textExcel;
import java.io.FileNotFoundException;
import java.util.Scanner;

import textExcel.TestsALL.TestLocation;

public class TextExcel
{

	public static void main(String[] args){
		//makes new spreadsheet object
		Spreadsheet test = new Spreadsheet();
		Scanner getUserInput = new Scanner(System.in);
		String userInput = getUserInput.nextLine();
		//loop runs until user types quit
		while(!userInput.equals("quit")){
			System.out.println(test.processCommand(userInput));
			userInput = getUserInput.nextLine();
		}
		
	}
}
