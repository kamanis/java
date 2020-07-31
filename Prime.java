 class Prime
{
    void displayResult(int number)
    {
        int prime=0;
        for (int i=2;i<=number/2;i++)
        {
            if(number%i == 0)
            {
                prime++;
                break;
            }
        }
        if(prime == 0)
        {
            System.out.println("\n The number "+number+" is a prime number");
        }
           if(prime>0){
             System.out.println("\n The number "+number+" is not a prime number");
            }
}
}