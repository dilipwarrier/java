class Factorial{
  public static void main(String args[]){
      int i;
      double fact=1;
      int number=5;//It is the number to calculate factorial
    for(i=1;i<=number;i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of 5 is:");
    System.out.println(fact);


    number=7;//It is the number to calculate factorial
    for(i=1;i<=number;i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of 7 is:");
    System.out.println(fact);


    number=10;//It is the number to calculate factorial
    for(i=1;i<=number;i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of 10 is:");
    System.out.println(fact);

  }
}
