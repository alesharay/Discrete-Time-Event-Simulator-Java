package com.aleshamray.dtes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import com.aleshamray.dtes.Schedulers.*;

public class Simulator {
  protected final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  private int option;
  private int load;
  private float avg_arrival_rate;
  private float avg_service_time;
  private float quantum;
  private Scheduler scheduler;
  private String simulator_state;
  private Queue<Event> event_queue;
  private long clock;

  public Simulator() {
    option = 0;
    load = 0;

    avg_arrival_rate = 0f;
    avg_service_time = 0f;
    quantum = 0f;

    simulator_state = "ready";
    event_queue = new PriorityQueue<>();  
    clock = 0;
  }

  public void prompt() {
    boolean valid_option_chosen = false;


    while( !valid_option_chosen ) {
      try{
        System.out.print("Scheduling Algorithm:\n" +
                          "1. FCFS\n" +
                          "2. SRTF\n" +
                          "3. RR" +
                          "\nOption: ");
        option = Integer.parseInt( in.readLine() ) ;

        if( option == 1 || option == 2 || option == 3 ) { valid_option_chosen = true; }
        else {
          clear_console(); 
          System.out.println( "Invalid option chosen. Please Try again!\n" ); 
          continue;
        }
        System.out.print( "\nAverage arrival rate: " );
        avg_arrival_rate = Float.parseFloat( in.readLine() );

        System.out.print( "\nAverage service (burst) time: " );
        avg_service_time = Float.parseFloat( in.readLine() );

        System.out.print( "\nQuantum: " );
        quantum = Float.parseFloat( in.readLine() );
      } catch ( Exception e ) {
        clear_console();
        System.out.println( "Invalid option chosen. Please Try again!\n" );
      }
    }

    switch( option ) {
      case 1:
        scheduler = new FCFS( event_queue, avg_service_time );
        break;
      case 2:
        scheduler = new SRTF( event_queue, avg_service_time );
        break;
      case 3:
        scheduler = new RR( event_queue, avg_service_time, quantum );
        break;
      default:
        break;
    }
  }

  /**
   * Sets clock to current system time in seconds
   */
  public void set_clock( long time ) { clock = time; }

  public long get_clock() { return clock; }

  public int get_load() throws IOException {
    System.out.print( "Please enter load: ");
    load = Integer.parseInt(in.readLine());
    return load;
  }

  public void update_state( Event event ) {
    switch( event.get_name() ) {
      default:
        break;
    }
  }

  public void run() {
    for( int i = 0; i < avg_arrival_rate; ++i ) {
      Event new_event = new Event("PROCESS ARRIVAL", System.currentTimeMillis() / 1000, i);
      event_queue.add( new_event );
    }
    
    this.scheduler = scheduler;

    while( !event_queue.isEmpty() ) {
      Event next_event = event_queue.poll();
      set_clock( next_event.get_time() );
      scheduler.handle_event( next_event );
    }

    scheduler.display();
  }

  public static void clear_console() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
 }
}