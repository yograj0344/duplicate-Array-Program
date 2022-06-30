class duplicate
{
    public static void main(String[] args)
    {
        int a []={5,8,9,4,6,5,3,2,4};
          int temp=0;
        for(int i=0; i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j]&&(i!=j))
                {
                    System.out.println("first duplicat element is"+a[j]);
                    break;
                }
            }
            if(temp> 0)
            {
                break;
            }
        }
    }
}