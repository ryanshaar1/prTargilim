import java.util.*;
public class MainTargil {

	public static Scanner reader=new Scanner(System.in);
	public static Targil buildTargil() 
	{
		System.out.println("Enter num1: ");
		int num1 = reader.nextInt();
		System.out.println("Enter num2: ");
		int num2 = reader.nextInt();
		System.out.println("Enter operator: ");
		char ope = reader.next().charAt(0);
		
		Targil targil = new Targil(num1, num2, ope);
		return targil;
	}
	public static void printTargilim(Targil[] targilim) {
		for(int i = 0; i < targilim.length; i++) {
			System.out.println(targilim[i].toString());
			
		}

		}
	public static void printHighest(Targil[] targilim) {
		int highest=0;
		for(int i=0; i<targilim.length; i++) {
			if(targilim[i].result()>highest)
				highest=i;
		}
		System.out.println("the targil with the highest value is: "+ targilim[highest].toString());
		}
	public static int[] getHowManyFromEachOpe(Targil[] targilim) {
		char[] peulot = {'+', '-', '*', '/', '%'};
		int[] countpeulot= new int[5];
		for(int i=0;i<countpeulot.length;i++) {
			countpeulot[i]=0;
		}
		for(int i=0;i<targilim.length;i++) {
			char tav= targilim[i].getTav();
			for(int j=0; j<peulot.length;i++) {
				if(tav==peulot[j]) {
					countpeulot[j]++;
				}
			}
		}
		return countpeulot;
	}
	public static boolean isRight(Targil targil) {
		System.out.println(targil.getNum1()+targil.getTav()+targil.getNum2());
		System.out.println("enter your answer for the targil");
		double answer=reader.nextDouble();
		if(answer==targil.result())
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
