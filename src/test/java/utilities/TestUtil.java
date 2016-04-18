package utilities;

public class TestUtil {
	
	public static ExcelReader excel;
	public static Object[][] getData(String sheetName){
		
		
		
		
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		System.out.println("total rows are : "+rows);
		System.out.println("total cols are : "+cols);
		
		Object[][] data = new Object[rows-1][cols];
		
		
		for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
			
			for(int colNum=0 ; colNum< cols; colNum++){
				
				
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
			}
		}
		
		
		return data;
		
		
		
		
	}


}
