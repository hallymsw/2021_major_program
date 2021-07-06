

import java.util.Scanner;
public class Ch05_Pr_10 {
	public static void main(String[] args) {
		//1. ���ڰ� ����� �迭 �����
		String[] strArr = {"J","U","N","G","O","L"};
		int i=0, j=0;
		Scanner sc = new Scanner(System.in);
		
		//2. �ݺ���
		inputEnd:while(true)
		{
			//���� �Է�
			String inputStr = sc.nextLine();
			
			for(i=0;i<strArr.length;i++)
			{
				//�Էµ� ���ڿ� �迭�� �ִ°��� ��
				//������ �ε��� ���
				if(inputStr.equals(strArr[i]))
				{
					System.out.println(i);
					break;
				}
				else //������ none����ϰ� ���׷�����
				{
					if(i==strArr.length-1)
					{
						System.out.println("none");
						break inputEnd;
					}
				}
			}
			
			
			
		}
		

	
		
		
	}
}
