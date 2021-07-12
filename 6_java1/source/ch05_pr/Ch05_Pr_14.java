
import java.util.Scanner;

public class Ch05_Pr_14 {
	public static void main(String[] args) {

		 int dice [] = {1,2,3,4,5,6};
	        int [] cnt = new int [6];
	        int num =0;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        for(int i=0;i<10;i++){
	            num = sc.nextInt();
	            for(int j=0;j<dice.length;j++) {
	                if(dice[j] == num) {
	                    cnt[j]++;
	                }
	            }
	        }
	        for(int k=0;k<dice.length;k++) {
	            System.out.println(k+1+" : "+cnt[k]);
	        }
	}
}
