
import java.util.Scanner;

public class numtowords
{
    String dig[];
    String place[];
    
    String value[];

    public numtowords() {
        this.dig = new String[20];
    dig[0]="";
    dig[1]="ONE";
    dig[2]="TWO";
    dig[3]="THREE";
    dig[4]="FOUR";
    dig[5]="FIVE";
    dig[6]="SIX";
    dig[7]="SEVEN";
    dig[8]="EIGHT";
    dig[9]="NINE";
    dig[10]="TEN";
    dig[11]="ELEVEN";
    dig[12]="TWELVE";
    dig[13]="THIRTEEN";
    dig[14]="FOURTEEN";
    dig[15]="FIFTEEN";
    dig[16]="SIXTEEN";
    dig[17]="SEVENTEEN";
    dig[18]="EIGHTEEN";
    dig[19]="NINETEEN";
    this.place=new String[10];
    place[1]="";
    place[2]="TWENTY";
    place[3]="THIRTY";
    place[4]="FOURTY";
    place[5]="FIFTY";
    place[6]="SIXTY";
    place[7]="SEVENTY";
    place[8]="EIGHTY";
    place[9]="NINETY";
    this.value=new String[10];
    value[1]="";
    value[2]="";
    value[3]="HUNDRED";
    value[4]="THOUSAND";
    value[5]="THOUSAND";
    value[6]="LAKH";
    value[7]="LAKH";
    value[8]="CRORE";
    value[9]="CRORE";
    }
    String twodig(int m)
    {
        String s;
        if(m<20)
            return dig[m];
        else
            return place[m/10]+" "+dig[m%10];
    }
    public static void main(String args[])
    {
        numtowords obj=new numtowords();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The number (9 digits only): ");
        long n=sc.nextLong();
	    System.out.println("\n\n\n-------------------------------------------------------------------------------");
		System.out.print("\t");
        int d=0;
        long temp;
		if(n==0)
			System.out.print("\t\t\tZERO");
		else
		{
		if(n<0)
		{
		System.out.print("MINUS ");
		n=n*(-1);
		}
		
        for(long i=n;i>0;i=i/10)
            d++;
		if(d>9)
			System.out.print("\tPLEASE ENTER ONLY 9 DIGITS NUMBER");
		else
		{
        while(d>2)
        {
        if(d<10)
        {
            if(d==9||d==7||d==5)
            {
                temp=n/(int)(Math.pow(10,d-2));
				if(temp!=0)
                System.out.print(obj.twodig((int)temp)+" "+obj.value[d]+" ");
                d=d-2;
                n=n%(int)(Math.pow(10,d));
            }
            else
            {
                temp=n/(int)(Math.pow(10,d-1));
				if(temp!=0)
                System.out.print(obj.dig[(int)temp]+" "+obj.value[d]+" ");
                d=d-1;
                n=n%(int)(Math.pow(10,d));   
            }
        }
        }
        System.out.print(obj.twodig((int)n));
		}
		}
		System.out.println();
		 System.out.println("-------------------------------------------------------------------------------\n\n\n");
    }
	

}