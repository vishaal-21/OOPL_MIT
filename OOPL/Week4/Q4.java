class Counter
{
	static int count = 0;

       Counter()
       {
              count++;
       }

       static void showCount()
       {
	      System.out.println("Number of objects : "+count);
       }
}

class Q4
{
	public static void main(String []args)
       {
           Counter counter1 = new Counter();
           Counter counter2 = new Counter();
           Counter counter3 = new Counter();
           Counter counter4 = new Counter();
           Counter counter5 = new Counter();
           Counter counter6 = new Counter();
           Counter counter7 = new Counter();
           Counter counter8 = new Counter();
           Counter counter9 = new Counter();
           Counter counter10 = new Counter();
           Counter counter11 = new Counter();
           Counter counter12 = new Counter();

           Counter.showCount();
   }
}
