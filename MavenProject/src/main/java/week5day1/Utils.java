package week5day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils
{
	public static void main(String[] args)  throws IOException
	{
		XSSFWorkbook book = new XSSFWorkbook("./data/TestData.xlsx");
		XSSFSheet sheetname = book.getSheet("Sheet1");
		int RowCount = sheetname.getLastRowNum();
		short ColCount = sheetname.getRow(0).getLastCellNum();
		for(int i =1; i<=RowCount; i++)
		{
			XSSFRow row = sheetname.getRow(i);
			System.out.println("Row" + row);
			for (int j=0;j<ColCount;j++)
			{
				XSSFCell col = row.getCell(j);
				System.out.println(col);
				String col1 = col.getStringCellValue();
				System.out.println(col1);
			}
		}
			
		
		
		
	}
}
