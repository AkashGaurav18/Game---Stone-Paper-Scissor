import java.util.Random;

import java.util.Scanner;

public class Game {


	public static void main(String[] args) {

		// TODO Auto-generated method stub

Random random = new Random();

int x = random.nextInt(3);

int choice;

//System.out.println(x);

Scanner sc = new Scanner(System.in);

System.out.println("Enter your choice");

choice = sc.nextInt();

switch (choice) {

case 0:  System.out.println("Your choice is Stone");

	break;

case 1: System.out.println("Your choice is Paper");

	break;

case 2: System.out.println("Your choice is Scissor");

	break;

	default: System.out.println("Wrong choice! Please enter correct choice:");

		break;

}
System.out.println("Opponents choice is:"+x);
if(x==0&&choice==0||x==1&&choice==1||x==2&&choice==2)

{

	System.out.println("Match Tie");

}

else if(x==0&&choice==1||x==1&&choice==2||x==2&&choice==0)

{

	System.out.println("You loose");

}

else 

{

	System.out.println("You win");

}

	}

}