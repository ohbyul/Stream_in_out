package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample {
	
	public static void main(String[] args) { 
		
		try {
			
			//������� ��ο� ���� (Sample2) �� ���� ���� ������ ���� �о���� ���μ��� 
			
////////////////// ���� ��Ʈ���� �̿��� ���Ͽ� ������ ����ϴ� ���� �Դϴ�. 
			// ������ ������ ������ ��������� ������ ����� �Ǿ� ���� ���ϳ����� ��������. 
			FileOutputStream fos = new FileOutputStream("c:/temp/java/test/test.txt"); 
			//���� ���Ͽ� ������ �߰� �ҷ��� �ι�° ���ڷ� true�� ���� �ش�. true�� �߰��ص� ������ �����. 
			//FileOutputStream fos1 = new FileOutputStream("c:/temp/java/test/test.txt",true); 
			
			// ���Ͽ� ������ ���� 
			String strText = " ���Ͽ� ����� ���ڿ� �Դϴ�.\n Hellow world !!"; 
			// ���ڿ��� ����Ʈ�迭�� ��ȯ�ؼ� ���Ͽ� �����Ѵ�. 
			fos.write(strText.getBytes()); 
			// ����� ������ ���� ��Ʈ���� �ݽ��ϴ�. 
			fos.close(); 

////////////////////����� ������ FileInputStream �� �̿��� ����ϴ� ���� �Դϴ�. 
			// file open.. 
			FileInputStream fis = new FileInputStream("c:/temp/java/test/test.txt"); 
			// ������ ������ byte������ �о�ɴϴ�.�׷��� 
			// �о ������ ���� byte �迭 ���� 
			byte[] byteBuff = new byte[9999]; 
			// ������ �а� ���� ũ�⸦ nRLen �� �����Ѵ�. 
			int nRLen = fis.read(byteBuff); 
			// ����� ���ؼ� byte�迭�� ���ڿ��� ��ȯ 
			String strBuff = new String(byteBuff, 0, nRLen); 
			// ���� ������ ��� �մϴ�. 
			System.out.printf("���� ����Ʈ��[%d] : \n���� ���� : \n%s \n", nRLen, strBuff); 
			// ����� ������ ���� ��Ʈ���� �ݽ��ϴ�. 
			fis.close(); 
			} catch (Exception e) {
				
			} 
		} 
	}

//����� : 

//���� ����Ʈ��[46] : 
//���� ���� : 
// ���Ͽ� ����� ���ڿ� �Դϴ�. 
// Hellow world !!

