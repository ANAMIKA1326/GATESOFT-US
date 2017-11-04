import java.io.*;
public class SequanceStream {
	public static void main(String args[])throws Exception{
		FileInputStream fin1 = new FileInputStream("E:\\file.txt");
		FileInputStream fin2 = new FileInputStream("E:\\afile.txt");
		SequenceInputStream s = new SequenceInputStream(fin1, fin2);
		int i;
		
		while((i=s.read())!=-1){
			System.out.print((char)i);
		}
		
		fin1.close();
		fin2.close();
		s.close();
		
		  FileOutputStream fout1=new FileOutputStream("E:\\file.txt");    
	      FileOutputStream fout2=new FileOutputStream("E:\\afile.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);  
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2); 
	      int j;
	      while((j=s.read())!=-1){
				System.out.print((char)j);
			}
	        
	      bout.flush();    
	      bout.close();
	}

}
