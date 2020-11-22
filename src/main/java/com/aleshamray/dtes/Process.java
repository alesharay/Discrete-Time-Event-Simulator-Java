package com.aleshamray.dtes;

public class Process {
  private Process_State state;
  private int process_id;
  private int program_counter;
  private long arrival_time;
  private float burst; 
  // private int finish_time;


  public Process( int process_id, long arrival_time, float burst ) {
    state = Process_State.NEW; 
    set_process_id( process_id );
    set_arrival_time( arrival_time );
    set_burst( burst );
  }

  public void set_process_id( int process_id ) { this.process_id = process_id; }

  public int get_process_id() { return process_id; }

  public void set_state( Process_State state ) { this.state = state; }

  public Process_State get_state() { return state; }

  public void set_arrival_time( long arrival_time ) { this.arrival_time = arrival_time; }

  public long get_arrival_time() { return arrival_time; }

  public void set_burst( float burst ) { this.burst = burst; }

  public float get_burst() { return burst; }
}