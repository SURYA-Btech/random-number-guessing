import java.util.*;
class random_number
{
public static void main(String[] dfs)

{ 
byte d, f=0;
int ran;
System.out.print("This is a random number guessing game");
Random r = new Random();
ran=r.nextInt(1,2);
System.out.println(" "+ran);
Scanner s = new Scanner (System.in);
while(f==0)
{
System.out.print("Enter the random number between 1 to 4:");
d=s.nextByte();
if(d==ran)
{System.out.println("You won");
f=1;}

else {f=0;}
}
}
}



