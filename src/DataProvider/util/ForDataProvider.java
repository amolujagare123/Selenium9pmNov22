package DataProvider.util;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ForDataProvider {

    public static Object[][] getMyData(String filePath,String sheetName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for (int i=0;i<rowCount-1 ; i++) {
            XSSFRow row = sheet.getRow(i + 1);

            for (int j = 0; j < colCount; j++) {

                XSSFCell cell = row.getCell(j);

                if (cell == null) { // if the cell is blank
                    data[i][j] = "";
                } else {
                    cell.setCellType(CellType.STRING); // convert the cell type to String
                    data[i][j] = cell.toString();
                }

            }

        }
        return data;
    }
}
