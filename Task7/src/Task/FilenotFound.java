package Task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FilenotFound {

	public static void main(String[] args) {
		try {
			String filepath = ".\\resource1\\data.xlsx";

			FileInputStream file1  = new FileInputStream(filepath);

			XSSFWorkbook book = new XSSFWorkbook(file1);
			
			XSSFSheet sheet = book.getSheetAt(0);
			
				String celldata = sheet.getRow(3).getCell(1).getStringCellValue(); // get particular cell data
				System.out.println(celldata);
			}
			catch(Exception e) {
				System.out.println("file not found");
				e.printStackTrace();
			}

	}

}
