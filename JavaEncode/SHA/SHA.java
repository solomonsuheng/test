package SHAEncode;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/** 
* @ClassName: SHA 
* @Description: TODOSHA加密算法
* @author solomonsuheng
* @date 2014-5-23 下午8:41:41 
*/
public class SHA {
	public byte[] eccrypt(String info) throws NoSuchAlgorithmException {
		MessageDigest sha = MessageDigest.getInstance("SHA");
		byte[] srcBytes = info.getBytes();
		sha.update(srcBytes);
		byte[] resultBytes = sha.digest();
		return resultBytes;
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String msg = "asd";
		SHA sha = new SHA();
		SHA sha2 = new SHA();
		String str = new String(sha.eccrypt(new String(sha.eccrypt(msg))+"gsh"));
		String str2 = new String(sha2.eccrypt(new String(sha2.eccrypt(msg))+"gsh"));
		System.out.println(str.equals(str2));
	}
}
