package study;

import java.io.File;
import java.io.IOException;

public class Sample2 {
	public static void main(String[] args) { 

///////////////// 파일 클래스 예제 와 설명 입니다. 
		//디렉토리에 맞게 파일 을 생성 
		try { 
			// 디렉토리 와 파일을 만드는 과정입니다. 
			// 먼저 디렉토리를 만듭니다. 
			// c:/temp에 java/test라는 디렉토리를 만든다. 
			File dir = new File("c:/temp/java/test"); 
			dir.mkdirs(); 	// 실제로 디렉토리를 만드는 메소드 
			
			
			// 그리고 파일을 만들 생성자를 만들어 줍니다. 전체 경로를 사용해야 됩니다. 
			File file = new File("c:/temp/java/test/test.txt"); 
			
			// file.createNewFile()로 파일을 만듭니다. 
			// 파일이 만들어 져야 true 기존파일이 존재하면 false 로 else 실행 
			if (file.createNewFile()) { // 파일 만들기 메소드 
				
				// 만든 파일의 이름을 출력함 
				String strfileName = file.getName(); 
				System.out.println("만든 파일: " + strfileName); 
			} else { 
				System.out.println("파일이 존재해 만들지 않았습니다."); 
			} 
			
///////////////////////////////////////File 클래스의 메소드 설명 입니다. 
			
			// 1.실행 파일이면 true, 아니면 false 를 돌려줌 
			boolean booTorF = file.canExecute(); 
			System.out.println("실행파일인지 여부 : " + booTorF); 
			
			// 2. 파일안의 내용을 읽기,쓰기 가능 하면 true, 아니면 false 
			boolean booTorF1 = file.canRead(); // 읽기가능을 확인 
			boolean booTorF2 = file.canWrite(); // 쓰기가능을 확인 
			System.out.println("booTorF1 읽기가능파일 : " + booTorF1); 
			System.out.println("booTorF2 쓰기가능파일 : " + booTorF2); 
			
			// 3. 상위 디렉토리를 출력합니다. 
			String strPDir = file.getParent(); 
			System.out.println("상위 디렉토리 : " + strPDir); 
			
			// 4. 경로(path) 를 출력합니다. 
			String strPath = file.getPath(); 
			System.out.println("path( 경로 ) : " + strPath); 
			
			// 5. 파일의 크기를 비교합니다. 크기가 같으면 0 비교대상즉 메소드안의 인자가 크면 -1 작으면 1 
			//앞에서 부터 먼저나온 객체가 크면 1 나주에 나온 객체가 크면 -1 같으면 0 입니다. 
			File file2 = new File("c:/temp/java/test/test.txt2"); 
			int nResult = file2.compareTo(file); 
			System.out.println("file.compareTo 결과 : " + nResult); 
			
			// 6. 파의 해쉬코드를 돌려주는 메소드. 
			int nHashcode = file.hashCode(); 
			System.out.println("file.hashCode() 결과 : " + nHashcode); 
			

			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
