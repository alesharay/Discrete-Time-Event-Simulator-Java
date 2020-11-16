package com.aleshamray.dtes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.PrintException;

/**
 * CS_4328 Operating Systems Discrete-Time Event Simulator
 * 
 * @author: Alesha Ray
 * @date: 11/8/2020
 * @version: 1.3
 */

class Main {
  public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  public static void main( String[] args ) throws IOException {

    Main.loadPrompt();
  }

  static int loadPrompt() throws IOException {
    System.out.print( "Enter load: " );
      
    int load = Integer.parseInt(in.readLine());

    if( load == 0 ) {
      System.out.println( "Aborting due to invalid load! Please try again." );
      System.exit(0);
    }

    return load;
  }
}