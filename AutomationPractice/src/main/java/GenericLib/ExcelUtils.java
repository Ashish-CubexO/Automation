package GenericLib;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static void getRowCount() throws IOException {
	XSSFWorkbook workbook =new XSSFWorkbook("/AutomationPractice/excle/data.xls");
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	}

}
