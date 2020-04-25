package synchronization;

class DataContainer 

{

private int intData;

private boolean available = false;

  public synchronized int get() 

  {

    while (available == false) 

    {

      try

      {

        wait();

      }

      catch (InterruptedException e) 

      {

      }

    }

    available = false;

    notifyAll();

    return intData;     

}

public synchronized void put(int value) 

{

  while (available == true) 

  {

    try

    {

        wait();

      }

      catch (InterruptedException e) 

      {

      }

    }

    intData = value;

    available = true;

    notifyAll();

     

}

}