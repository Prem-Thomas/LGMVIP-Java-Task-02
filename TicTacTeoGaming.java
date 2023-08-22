package TicTacToe.com;

import java.util.Scanner;

public class TicTacTeoGaming 
{ 
	public static void main(String[] args)
	{
		char[][] bx=new char[3][3];
		for(int i=0;i<bx.length;i++)
		{
			for(int j=0;j<bx[i].length;j++)
			{
				bx[i][j]=' ';
			}
		}
		char player ='X';
		boolean gameEnd=false;
		Scanner sc=new Scanner(System.in);
		while(!gameEnd)
		{
			printBox(bx);
			System.out.print("Player "+player+" Enter : ");
			int i=sc.nextInt();
			int j=sc.nextInt();
			System.out.println();
			
			if(bx[i][j]==' ')
			{
				bx[i][j]=player;
				gameEnd=haveWon(bx,player);
				if(gameEnd) {
					System.out.println("Player "+player +" has won :");
				}else {
					player =(player=='X')?'0':'X';
				}
			}else {
				System.err.println("Invlid Move. try again!!");
			}
		}
		printBox(bx);
	}
	public static boolean haveWon(char[][] bx,char player)
	{
		for(int i=0;i<bx.length;i++)
		{
			if(bx[i][0]==player&&bx[i][1]==player&&bx[i][2]==player)
			{
				return true;
			}
		}
		for(int j=0;j<bx[0].length;j++)
		{
			if(bx[0][j]==player && bx[1][j]==player && bx[2][j]==player){
				return true;
			}
		}
		if(bx[0][0]==player && bx[1][1]==player && bx[2][2]==player) {
			return true;
		}
		if(bx[0][2]==player && bx[1][1]==player && bx[2][0]==player) {
			return true;
		}
		return false;
	}

	private static void printBox(char[][] bx) {
		for(int i=0;i<bx.length;i++) {
			for(int j=0;j<bx[i].length;j++) {
				System.out.print(bx[i][j]+" | ");
			}
			System.out.println();
		}
	}
}
