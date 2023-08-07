import java.util.Scanner;

public class ConstantTimeMultiplication
{
    public static void main(String[] args)
    {
        int num_1;
        int p;
        long ans;

        System.out.println("Enter your numbers: ");
        Scanner in = new Scanner(System.in);
        num_1 = in.nextInt();
        p = in.nextInt();

        ans = doublePointAndAdd (num_1, p);
        System.out.println(ans);

    }
  
    static long doublePointAndAdd(int num_1, int p)
    {   // base check
        if (num_1 == 0 || p == 0)
        {
            return 0;
        }

        int length = 64; //fixed 64bit integer
        long ans = p;
        //converting num_1 to bin
        String binary_num1 = Integer.toBinaryString(num_1);

        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - binary_num1.length() )
        {
            // Determining the number of zeroes to pad
            sb.append('0');
        }
        sb.append(binary_num1);

        // a check for the beginning of binary after the leading zeroes
        int firstTime = 0;
        for (int index = 0; index < length; index++)
        {
            if (sb.charAt(index) == '1' && firstTime == 0)
            {
                firstTime = 1;
                for (int i = 1; i < binary_num1.length(); i++)
                {
                    int currentBit = Integer.parseInt(binary_num1.substring(i, i + 1));

                    if (currentBit == 1)
                    {
                        ans = 2*ans;
                        ans += p;
                    }
                    else
                    {
                        ans = 2*ans;
                    }
                }
              
            }
        }
        return ans;
    }

}
