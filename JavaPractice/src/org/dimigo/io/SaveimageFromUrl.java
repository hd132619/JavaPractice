/**
 * 
 */
package org.dimigo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *   |_SaveimageFromUrl
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 23.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class SaveimageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://pds17.egloos.com/pds/201002/16/43/a0113243_4b7a922ac00de.jpg";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.jpg")){
				
					int result;
					byte[] buf = new byte[100];
				
					while((result = is.read(buf)) != -1){
						os.write(buf, 0, result);
					}
					
					System.out.println("파일 생성 완료!!");
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
