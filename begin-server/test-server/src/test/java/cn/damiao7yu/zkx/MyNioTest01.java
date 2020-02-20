package cn.damiao7yu.zkx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MyNioTest01 {
	public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream("D:\\zkxPersonal/zzz.txt");
			FileChannel fisc = fis.getChannel();
			//分配空间
			ByteBuffer buf = ByteBuffer.allocate(1024);
			//读到buffer
			int bytesRead = fisc.read(buf);
			   while(bytesRead != -1)
	            {
	                buf.flip();
	                while(buf.hasRemaining())
	                {
	                    System.out.print((char)buf.get());
	                }
	                buf.compact();
	                bytesRead = fisc.read(buf);
	            }
	        
			   fis.close();
		
		
	}

}
