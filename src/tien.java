import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class tien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			  
			   
			    
			
//			    idol Idol = new idol();
//			    Idol.ho_Ten = "Minami Azawa";
//			    Idol.tuoi = 14;
//			    Idol.chieu_cao = 1.60;
//			    
//			    
//			    for(int i =0 ; i < 10 ;i++)
//			    {
//			    	Idol.tuoi = Idol.tuoi +1;
//			    	System.out.print(" NAM THU " + i	+	" Dien vien JAV co do tuoi la: " + Idol.tuoi);
//			    	System.out.println(" Dien vien " + Idol.ho_Ten + " : " + 	Idol.do_tuoi_lao_dong(18,30));
//			    }
			   
			    try
			    {
			    	
			    	
			    	  Scanner scanner = new Scanner(System.in);
					  Path path = Path.of("data.txt");
					    
					    List<String> idol_List = Files.readAllLines(path);
					    
					   

				    while(true)
					    {
					    	System.out.println(" nhap Idol muon tìm kiem");
						    String search = scanner.nextLine();
						    
						    System.out.format("%-15s %-5s %-10s %-10s %-15s\n",
				    				"HO TEN",
				    				"TUOI",
				    				"CHIEU CAO",
				    				"CAN NANG",
				    				"TINH TRANG LAO DONG");
				    		
						    for( String idol_data : idol_List) {
					    		
					    		String[] data = idol_data.split(";");
					    		
					    		idol Idol = new idol();
					    		Idol.ho_Ten = data[0];
					    		Idol.tuoi = Integer.valueOf(data[1]);
					    		Idol.chieu_cao = Double.valueOf(data[2]);
					    		Idol.can_nang = Double.valueOf(data[3]);
					    		
					    		
					    		if(Idol.ho_Ten.contains(search))
					    		{
					    			
					    			System.out.format("%-15s %-5s %-10s %-10s %-15s\n",
						    				Idol.ho_Ten,
						    				Idol.tuoi,
						    				Idol.chieu_cao,
						    				Idol.can_nang,
						    				Idol.do_tuoi_lao_dong());		
					    		}
					    				    		
					    		System.out.println("-----------------------------------\n");
					    	}
				    	
					    }
					    
			    }
			    
			    catch(IOException e) {
			    	
			    }
	
			    		
			

	}

}
