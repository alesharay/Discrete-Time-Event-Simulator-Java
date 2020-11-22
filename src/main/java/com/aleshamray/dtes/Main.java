package com.aleshamray.dtes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  public static void main( String[] args )  {
    Simulator simulator = new Simulator();
    simulator.prompt();
    simulator.run( );
  }
}