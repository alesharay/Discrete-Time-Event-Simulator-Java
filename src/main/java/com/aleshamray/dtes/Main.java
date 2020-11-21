package com.aleshamray.dtes;

import com.aleshamray.dtes.Schedulers.*;

public class Main {

  public static void main( String[] args ) {
    Simulator simulator = new Simulator();
    Scheduler fcfs = new FCFS();
    Scheduler rr = new FCFS();
    Scheduler srtf = new FCFS();

    simulator.run(fcfs);
  }
}