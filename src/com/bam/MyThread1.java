package com.bam;

import java.util.Random;

public class MyThread1 extends Thread{

    private final Buffer __buffer;

    public MyThread1(Buffer buffer)
    {
        __buffer = buffer;
    }


    /**
     * Главный метод потока. Запускается при вызове start
     */
    @Override
    public void run() {

        try {

            method();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     *Бесконечно генерирует рандомные числа и добавляет их в буфер.
     */
    private void method() throws InterruptedException {


        while (true)
        {
            int i = new Random().nextInt(100);
            
            __buffer.add(i);

        }


    }
}
