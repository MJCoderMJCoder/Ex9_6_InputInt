package com.inputint;
/*
 * ע�⣺ʹ��DataInputStream���ܴӼ������������������
 * �Ӽ����ṩ���������ַ����ֽ����ʾ��ÿ���ַ�ռ2���ֽڣ���
 * 
 * Ҫ�Ӽ������������������ֻ���ȶ�ȡ�ַ�����
 * ����Integer.parseInt(String)�ȷ����������ַ���ת��Ϊ�������������͵�����
 */
import java.io.DataInputStream;
import java.io.IOException;

public class InputInt {

	public static void main(String[] args) throws IOException {
		DataInputStream din = new DataInputStream(System.in);
		System.out.print("����һ��������");
		int x = din.readInt();
		System.out.println("����������ǣ�" + x);
	}

}
