package com.inputint;
/*
 * 注意：使用DataInputStream不能从键盘输入基本数据类型
 * 从键盘提供的数据是字符的字节码表示（每个字符占2个字节）。
 * 
 * 要从键盘输入基本类型数据只能先读取字符串，
 * 再用Integer.parseInt(String)等方法将数字字符串转化为整数或其他类型的数据
 */
import java.io.DataInputStream;
import java.io.IOException;

public class InputInt {

	public static void main(String[] args) throws IOException {
		DataInputStream din = new DataInputStream(System.in);
		System.out.print("输入一个整数：");
		int x = din.readInt();
		System.out.println("输入的整数是：" + x);
	}

}
