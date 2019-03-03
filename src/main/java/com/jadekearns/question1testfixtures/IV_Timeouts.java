package com.jadekearns.question1testfixtures;

/**
 * Hello world!
 *
 */
public class IV_Timeouts
{
    static int milliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;

    static boolean state = true;

    public static void stopwatch(){
        Thread t = new Thread(){
            public void run(){

                for(;;){

                    if(state == true){

                        try{

                            sleep(1);

                            if(milliseconds>1000){
                                milliseconds = 0;
                                seconds++;
                            }

                            if(seconds>60){
                                milliseconds = 0;
                                seconds = 0;
                                minutes ++;
                            }

                            if(minutes>60){
                                milliseconds = 0;
                                seconds = 0;
                                minutes = 0;
                                hours++;
                            }

                            milliseconds++;



                            System.out.println(hours + " : " + minutes + " : " + seconds + " : " + milliseconds);

                        }catch(Exception e){

                        }

                    }else{
                        break;
                    }
                }
            }
        };

        t.start();
    }





    public static void main( String[] args )
    {
        stopwatch();
    }
}
