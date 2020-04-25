package synchronization;

class Consumer extends Thread

{

  DataContainer d ;

  int no;

  Consumer(DataContainer c,int no) 

  {

  this.d = c;

  this.no = no;

  }

  public void run()

  {

    for(int i = 0; i < 5; i++)

    {

      int k = d.get();

      System.out.println("consumer:\t\t" + this.no + " - " + k +"\n");

      try 

      {

       sleep(100);

      } 

      catch(InterruptedException e)

      {

      }

    }

  }

}


