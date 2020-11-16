package com.aleshamray.dtes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class Process {
  private int process_id;
  private int arrival_time;
  private int finish_time;

  private int total_CPU_Duration;
  private int average_CPU_Burst_Length;

  private int total_duration;
  private int remaining_duration;

  public Random rand;

  public Process( int process_id, int arrival_time ) {
    this.process_id = process_id;
    this.arrival_time = arrival_time;
    finish_time = 0;

    rand = new Random();
    rand.setSeed( java.lang.System.currentTimeMillis() );
    
    total_CPU_Duration = rand.nextInt() % 59000 + 1000;
    average_CPU_Burst_Length = rand.nextInt() % 96 + 5;
    
    total_duration = 0;
    
    remaining_duration = total_CPU_Duration;
  }

  int get_arrival_time() { return arrival_time; }

  int get_finish_time() { return finish_time; }

  int get_service_time() { return total_CPU_Duration - remaining_duration; }

  int get_io_time() { return total_duration; }

  int get_turnaround_time() { return finish_time - arrival_time; }

  int get_waiting_time() { return get_turnaround_time() - get_service_time(); }
}