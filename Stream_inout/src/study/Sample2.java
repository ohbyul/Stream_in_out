package study;

import java.io.File;
import java.io.IOException;

public class Sample2 {
	public static void main(String[] args) { 

///////////////// ���� Ŭ���� ���� �� ���� �Դϴ�. 
		//���丮�� �°� ���� �� ���� 
		try { 
			// ���丮 �� ������ ����� �����Դϴ�. 
			// ���� ���丮�� ����ϴ�. 
			// c:/temp�� java/test��� ���丮�� �����. 
			File dir = new File("c:/temp/java/test"); 
			dir.mkdirs(); 	// ������ ���丮�� ����� �޼ҵ� 
			
			
			// �׸��� ������ ���� �����ڸ� ����� �ݴϴ�. ��ü ��θ� ����ؾ� �˴ϴ�. 
			File file = new File("c:/temp/java/test/test.txt"); 
			
			// file.createNewFile()�� ������ ����ϴ�. 
			// ������ ����� ���� true ���������� �����ϸ� false �� else ���� 
			if (file.createNewFile()) { // ���� ����� �޼ҵ� 
				
				// ���� ������ �̸��� ����� 
				String strfileName = file.getName(); 
				System.out.println("���� ����: " + strfileName); 
			} else { 
				System.out.println("������ ������ ������ �ʾҽ��ϴ�."); 
			} 
			
///////////////////////////////////////File Ŭ������ �޼ҵ� ���� �Դϴ�. 
			
			// 1.���� �����̸� true, �ƴϸ� false �� ������ 
			boolean booTorF = file.canExecute(); 
			System.out.println("������������ ���� : " + booTorF); 
			
			// 2. ���Ͼ��� ������ �б�,���� ���� �ϸ� true, �ƴϸ� false 
			boolean booTorF1 = file.canRead(); // �бⰡ���� Ȯ�� 
			boolean booTorF2 = file.canWrite(); // ���Ⱑ���� Ȯ�� 
			System.out.println("booTorF1 �бⰡ������ : " + booTorF1); 
			System.out.println("booTorF2 ���Ⱑ������ : " + booTorF2); 
			
			// 3. ���� ���丮�� ����մϴ�. 
			String strPDir = file.getParent(); 
			System.out.println("���� ���丮 : " + strPDir); 
			
			// 4. ���(path) �� ����մϴ�. 
			String strPath = file.getPath(); 
			System.out.println("path( ��� ) : " + strPath); 
			
			// 5. ������ ũ�⸦ ���մϴ�. ũ�Ⱑ ������ 0 �񱳴���� �޼ҵ���� ���ڰ� ũ�� -1 ������ 1 
			//�տ��� ���� �������� ��ü�� ũ�� 1 ���ֿ� ���� ��ü�� ũ�� -1 ������ 0 �Դϴ�. 
			File file2 = new File("c:/temp/java/test/test.txt2"); 
			int nResult = file2.compareTo(file); 
			System.out.println("file.compareTo ��� : " + nResult); 
			
			// 6. ���� �ؽ��ڵ带 �����ִ� �޼ҵ�. 
			int nHashcode = file.hashCode(); 
			System.out.println("file.hashCode() ��� : " + nHashcode); 
			

			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
