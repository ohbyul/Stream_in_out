package study;

import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {

		try {

			///////////////// ���� ��Ʈ���� �̿��� ������ ������  �о���� ���� �Դϴ�.
			
			//file open..
           		FileInputStream fis = new FileInputStream("c:/temp/java/test/test.txt");

			//������ ������ byte������ �о�ɴϴ�.�׷��� 
			//�о ������ ����  byte �迭 ����
			byte[] byteBuff = new byte[9999];

			// ������ �а� ���� ũ�⸦ nRLen �� �����Ѵ�.
			int nRLen = fis.read(byteBuff);

			//����� ���ؼ� byte�迭�� ���ڿ��� ��ȯ
			String strBuff = new String(byteBuff, 0, nRLen);

			//���� ������ ��� �մϴ�.
			System.out.printf("���� ����Ʈ��[%d] : \n���� ���� %s \n", nRLen, strBuff);

			//����� ������ ���� ��Ʈ���� �ݽ��ϴ�.
			fis.close();
			
			
		} catch (Exception e) {
        	System.out.println("���� ������ �����ϴ�. \n ���� ������ ����� �ش��� ���� �ϼ���.\n" );
			System.out.println("c:/temp/java/test/test.txt\n" );
		
		}

	}
}
//����� :

//���� ����Ʈ��[70] : 
//���� ���� 1234567890
//abcdefghijklmnopqrstuvwxyz
//�����ٶ󸶹ٻ������īŸ����
