import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoStreamExample {

	public static void main(String[] args) {
			try{
				FileOutputStream fout = new FileOutputStream("E:\\file.txt");
				String s = "io tasks ";
				byte[] b = s.getBytes();
				fout.write(b);
				fout.write(68);
				//fout.close();
				System.out.println("completed..!");
				System.out.println("success..!");
				
				FileInputStream fin = new FileInputStream("E:\\file.txt");
				int i = 0;
				while((i=fin.read())!=-1){
				System.out.print((char)i);}
				fin.close();
			}catch(Exception e){System.out.println(e);}
		
	}

}
