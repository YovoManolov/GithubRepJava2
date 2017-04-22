import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class Secretary extends Thread{
	private Socket socket;
	public Secretary(Socket socket) {
		this.socket = socket;
	}
	//����� �� �������� ����� �� �� �� �������������
	public synchronized Document getDocument(){
		return Server.documents.removeFirst(); // ������ � �������� ������ ������� �� �����
	}
	//����� �� �������� ����� �� �� �� �������������
	public synchronized void addDocument(Document doc,LinkedList<Document> list){
		list.add(doc); // ������� ��������� � ��������
	}
	@Override
	public void run() {
		Document doc = this.getDocument(); // ������ ������ ������� � �� �������� � doc

		if((doc.getType() == DocumentType.Normal &&  // ���������� ���� � �������� ���������
			 doc.getProgress() >= 5.50 && //���� � ��� 5.50 �����
			 doc.getIncome() >= 500)  // � ���� ��� ������ ��� 500 �������� �� ������ � �
				|| // ��� 
			(doc.getType() == DocumentType.Special && // ���� � ��������� ���������
			 doc.getProgress() >= 5.30 && //���� � ��� 5.30 �����
			 doc.getIncome() >= 300) // ���� ��� ��� 300 �����
		  ){
			addDocument(doc,Server.acceptedDocuments); //  ��� � true �� ������ � �������
		}else{
			addDocument(doc,Server.deniedDocuments); //  ��� � false �� ������ � ���������
		}
	}

}