package com.inputint;
/*
 * ע�⣺ʹ��DataInputStream���ܴӼ������������������
 * �Ӽ����ṩ���������ַ����ֽ����ʾ��ÿ���ַ�ռ2���ֽڣ���
 * 
 * Ҫ�Ӽ������������������ֻ���ȶ�ȡ�ַ�����
 * ����Integer.parseInt(String)�ȷ����������ַ���ת��Ϊ�������������͵�����
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputInSuccess {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("����һ��������");
		String str = br.readLine(); //�Ӽ�������һ���ַ���
		int x = Integer.parseInt(str); //���ַ���ת��Ϊ����
		System.out.println("����������ǣ�" + x);
	}

}
