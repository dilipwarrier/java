class SumOf20{
    public static void main(String args[]){
      int num = 0;
      int count = 1;

      for(count=1;count<=20;count++)
      {
        num = num+count; // adding count into num - so that we get the total of all the numbers
      } //end for
      System.out.println("Sum of 1..20 is:");
      System.out.println(num);

   }
}
