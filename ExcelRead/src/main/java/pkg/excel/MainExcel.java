package pkg.excel;

import java.io.IOException;

public class MainExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name =Excel.readStringData(1,0);



		System.out.println("Name :"+ "\t"+name);



		String id= Excel.readIntegerData(1, 1);



		System.out.println("id :"+"\t"+ id);


		// TODO Auto-generated method stub


	}

}
