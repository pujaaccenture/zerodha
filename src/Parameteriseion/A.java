package Parameteriseion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
public static void main(String[] args) throws Throwable {
	//crteate object of fileinputstream
FileInputStream file=new FileInputStream("C:\\Users\\Trupi\\Desktop\\Puja\\Test case1.xlsx");
String a = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(a);


}
}
