package midterm_project.client;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ClientMain {
	public static void main(String[] args) {
		MyClient myClient = new MyClient(8888, "localhost", 8080);
		
		System.out.println("������Ҫ�ϴ������ص��ļ�");
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		
		String[] inputArray = inputStr.split("\\s+");
		String fileName = inputArray[2];
		
		
		if (inputArray[1].equals("lget")) {			//	����
			myClient.Download(inputArray[2]);
		}
		else if (inputArray[1].equals("lsend")) {	//	�ϴ�
			myClient.Upload(inputArray[2]);
		}
	}
}
