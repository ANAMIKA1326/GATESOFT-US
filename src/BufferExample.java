import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferExample {
	public static void main(String[] args) {
		try{
			FileOutputStream fout = new FileOutputStream("E:\\afile.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "welcome buffered!";
			byte[] b = s.getBytes();
			bout.write(b);
			bout.close();
			fout.close();
			
			FileInputStream fin = new FileInputStream("E:\\afile.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i = 0;
			while((i=fin.read())!=-1){
			System.out.print((char)i);}
			fin.close();
			bin.close();
		}catch(Exception e){System.out.println(e);}
	
}

}
