package synchronization;

class Producer extends Thread

{

  DataContainer d ;

  int cnt = 0;

  int no;

  Producer(DataContainer c,int no) 

  {

  this.d = c;

  this.no = no;

  }

   

  public void run() 

  {

    for(int i = 0; i < 5; i++)

    {

       

      d.put(i);

      System.out.println("Producer :\t" + this.no + " - " + i +"\n");

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


