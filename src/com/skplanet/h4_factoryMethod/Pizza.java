package com.skplanet.h4_factoryMethod;

/**
 * Created by 1000773 on 2017. 10. 11..
 */
abstract class Pizza {

    protected String name = "pizza";

     abstract void prepare();


     void bake(){
         System.out.println("bake " + name );

     }
     void cut(){
         System.out.println("cut " + name );

     }
     void box(){
         System.out.println("box " + name );
         System.out.println( );

     }

}
