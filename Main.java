package prog1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	static int nodenum=1;
	
	public static void main(String aaa[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the genesis node value");
		
		int no= sc.nextInt();
		
		
		Date d= new Date();
		
		Data data= new Data("12312",12.23,"Genesis");
		
		int nodeno= getNodenum(); 
		
		String nodeId = getNodeId(); 
		
		
		String refnodeid= "";
		
		String[] childs= new String[1];
		
		String genesisrefId= "";
		
		Node genesis= new Node(d, data, nodeno, nodeId, refnodeid, childs,genesisrefId,"");
		
		System.out.println(genesis);
		
		
		System.out.println("Genesis node created");
		
		
	}

	private static String getNodeId() {
		// TODO Auto-generated method stub
		int nodeid= nodenum;
		nodeid++;
		
		return String.valueOf(nodeid);
	}

	private static int getNodenum() {
		// TODO Auto-generated method stub
		
		int ans= nodenum+1;
		nodenum++;
		return ans;
	}
	
	
	
	

}
