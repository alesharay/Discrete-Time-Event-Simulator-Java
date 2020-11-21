package com.aleshamray.dtes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.aleshamray.dtes.Schedulers.*;


public class Simulator {
  protected final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  private Scheduler scheduler;
  private int load;

  public Simulator() {
    int load = 0;
    // TODO: Implement this
  }

  public int get_load() throws IOException {
    System.out.print( "Please enter load: ");
    load = Integer.parseInt(in.readLine());
    return load;
  }

  public void run(Scheduler scheduler) {
    for( int i = 0; i < 10000; ++i ) {
      Process new_process = new Process(0, 0);
      this.scheduler = scheduler;

      switch( scheduler.get_algorithm() ) {
        case "RR":
          break;
        case "SRTF":
          break;
        case "FCFS":
          break;
        default:
          break;
      }
    }

    scheduler.display();
  }
}