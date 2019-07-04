package com.inputint;
/*
 * 注意：使用DataInputStream不能从键盘输入基本数据类型
 * 从键盘提供的数据是字符的字节码表示（每个字符占2个字节）。
 * 
 * 要从键盘输入基本类型数据只能先读取字符串，
 * 再用Integer.parseInt(String)等方法将数字字符串转化为整数或其他类型的数据
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputInSuccess {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("输入一个整数：");
		String str = br.readLine(); //从键盘输入一个字符串
		int x = Integer.parseInt(str); //将字符串转换为整数
		System.out.println("输入的整数是：" + x);
	}

}
