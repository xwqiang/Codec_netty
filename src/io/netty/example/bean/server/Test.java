package io.netty.example.bean.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		{
//			byte[] a = SerializeUtil.serialize(new io.netty.example.bean.server.UserInfo("aa"));
//			FileOutputStream fos = new FileOutputStream("d:/tt.dat");
//			fos.write(a);
//			fos.flush();
		//保证包名相同，修改userinfo对象（userinfo中增加int i变量 ） 执行下面的 
		//如果去掉name属性 则打印null
//		}
		FileInputStream fis = new FileInputStream("d:/tt.dat");
		byte[] b = new byte[(int) new File("d:/tt.dat").length()];
		fis.read(b);
		io.netty.example.bean.server.UserInfo u = (UserInfo) SerializeUtil.unserialize(b);
		System.out.println(u.getName());
	}

}
