package com.aleshamray.dtes;

public class Process {
  private State state;
  private int program_counter;
  // private int process_id;
  private int arrival_time;
  private int burst_time; 
  // private int finish_time;


  public Process( int arrival_time, int burst_time ) {
    state = State.NEW; 
  }
}