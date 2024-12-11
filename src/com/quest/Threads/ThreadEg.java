package com.quest.Threads;

import java.util.Optional;

public class ThreadEg extends Thread
{
    static int count=1;
    public static void main(String[] args)
    {
        ThreadEg t1 = new ThreadEg()
        {
            @Override
            public void run()
            {
                while (count<=10)
                {
                    if(count%2!=0)
                    {
                        System.out.println(count);
                        count++;
                    }
                }
            }
        };

        ThreadEg t2 = new ThreadEg()
        {
            @Override
            public void run()
            {
                while (count<=10)
                {
                    if(count%2==0)
                    {
                        System.out.println(count);
                        count++;
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
