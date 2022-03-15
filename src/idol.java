
public class idol {
	
	
		String ho_Ten;
		int tuoi;
		double chieu_cao, can_nang;
	
		public void xin_chao (){
			
		System.out.println("xin chào tôi là: " + ho_Ten );
			
		}
		
		public String do_tuoi_lao_dong () {
			
			int min = 18;
			int max = 30; 
			String ketqua;
			
				if(tuoi < min)
				{
					ketqua = "Chua du tuoi de dung";
				}
				else if(tuoi > max)
				{
					ketqua = "Het han su dung";
				}
				else
				{
					ketqua= "Du tuoi hanh nghe";
				}
			return ketqua;
		}
}
