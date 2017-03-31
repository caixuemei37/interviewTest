import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class file2 {
	private static BufferedReader bufferReader;

	public static void main(String[] args) {
		String path = "C:/Users/Administrator/Desktop/eclipse";
		String targetName = ".txt";
		List<File> resultList = new ArrayList<File>();
		findFile(path, targetName, resultList);
		for (int i = 0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
			readFile(resultList.get(i));
		}
		
	}

	public static void findFile(String path, String targetName, List<File> resultList) {
		File baseDir = new File(path);
		File[] files = baseDir.listFiles();
		File tempFile;
		String tempName;

		for (int i = 0; i < files.length; i++) {
			tempFile = files[i];
			if (tempFile.isDirectory()) {
				//String newPath = path + "/" +tempFile.getName();
				//findFile(newPath, targetName, resultList);
			} else if (tempFile.isFile()) {
				tempName = tempFile.getName();
				if (!(tempName.indexOf(targetName) == -1)) {
					resultList.add(tempFile.getAbsoluteFile());
				}
			}
		}
	}
	
	public static void readFile(File file){
		String encoding="GBK";
		try{
		InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
		bufferReader = new BufferedReader(read);
		while(bufferReader.readLine() != null){
			System.out.println(bufferReader.readLine());
		}
		}catch(Exception e){
			
		}
	}
}

