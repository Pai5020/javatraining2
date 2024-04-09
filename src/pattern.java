public class pattern {
    public static void main(String[] args) {
    int m=1;
        for(int i=0;i<3;i++)
    {
        if(i==0)
            System.out.println("*");
        for(int j=0;j<(i+1);j++)
        {
            if(i==0)
            {
                System.out.println("*");
            }
            if(i==1)
                System.out.println("**");
            if(i==2)
                System.out.println("***");

        }

        int l=(m*3);
        for(int k=0;k<l;k++)
        {
            System.out.print("*");
        }
        m++;
        System.out.println();
    }
}
}

