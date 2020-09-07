/*	Write a Java program to create five threads with different priorities. Send two threads of the highest priority to sleep state. Check the aliveness of the threads and mark which thread is long lasting
*/

import java.util.*;
class ThreadDemo extends Thread
{
    Thread t;
    String tname;
    int priority;

    ThreadDemo(int priority,String tname)
    {
        this.tname=tname;
        this.priority=priority;
        t=new Thread(this,tname);
        System.out.println("New Thread "+t);
        t.start();
    }
    public void run()
    {
            int p=t.getPriority();
            try
            {
                if(p==9 || p==8)
                {
                    t.sleep(2000);
                }
                else
                {
                    System.out.println(t.currentThread()+"is alive?"+t.isAlive());
                }
                while(t.isAlive())
                {
                    System.out.println("Long lasting thread:"+t.getName());
                }

            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted...!");
            }

    }
}
class MainThread
{
    public static void main(String args[])
    {
        //ThreadDemo a,b,c,d,e;
        new ThreadDemo(5,"One");
        new ThreadDemo(6,"Two");
        new ThreadDemo(7,"Three");
        new ThreadDemo(8,"Four");
        new ThreadDemo(9,"Five");

    }
}
