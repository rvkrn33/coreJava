package com.trhead.example;

public class Waiter implements Runnable{
    
    private Message msg;
    
    public Waiter(Message m){
        this.msg=m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName(); //name of thread
        System.out.println("Waiting for letter");
        synchronized (msg) { //only ine thread allowed at a time
            try{
                System.out.println(name+" waiting time:"+System.currentTimeMillis());
                msg.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed completed and got the letter from Postman : "+msg.getMsg());
        }
    }

}
