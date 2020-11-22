package com.aleshamray.dtes.Schedulers;

import java.util.LinkedList;
import java.util.Queue;

import com.aleshamray.dtes.Event;
import com.aleshamray.dtes.Process;


public abstract class Scheduler {
  protected float average_turnaround_time; //<-------------amount of time to execute a particular process 
                                           //             (The sum of the periods spent waiting in the ready queue, executing on the CPU, and doing I/O)
  protected float total_throughput; //<--------------------# of processes that complete their execution per time unit
  protected float CPU_utilization; //<---------------------keep the CPU as busy as possible
  protected float average_processes_in_ready_queue; //<----average number of processes in the ready queue
  
  // protected int waiting_time;
  // protected int arrival_time;
  protected float burst;
  
  protected String scheduling_algorithm;
  protected Process running_process;
  protected Queue<Process> process_ready_queue;        // set of all processes residing in main memory, ready and waiting to execute
  protected Queue<Event> event_queue;

  public Scheduler( Queue event_queue, float burst ) {
    this.event_queue = event_queue;
    this.burst = burst;
    process_ready_queue = new LinkedList<>();
    
    average_turnaround_time = 0f;
    total_throughput = 0f;
    CPU_utilization = 0f;
    average_processes_in_ready_queue = 0f;
    scheduling_algorithm = "";
  }

  public String get_algorithm() { return scheduling_algorithm; }

  public void handle_event( Event event ) {
    switch( event.get_name() ) {
      case "PROCESS ARRIVAL":
        process_arrival( event );
        break;
      case " CPU COMPLETION":
        process_completion( event );
        break;
      case "TIMESLICE OCCURRENCE":
        process_timeslice_occurance( event );
        break;
      default:
        break;
    }
  }

  public void process_arrival( Event event ) {
    Process new_process = new Process( event.get_id(), event.get_time(), burst);
  }

  public void process_completion( Event event ) {
    // TODO: Implement this
  }

  public void process_timeslice_occurance( Event event ) {
    // TODO: Implement this
  }

  private float calc_avg_TAT() { return 0f; }

  private float calc_tot_throughput() { return 0f; }

  private float calc_CPU_utilization() { return 0f; }

  private float calc_avg_proc_ready_queue() { return 0f; }

  public void display() {
    System.out.println();
    System.out.printf( "Scheduling Algorithm: %s", scheduling_algorithm );
    System.out.println();
    System.out.printf( "Average turnaround time: %f", calc_avg_TAT() );
    System.out.println();
    System.out.printf( "Total throughput: %f", calc_tot_throughput() );
    System.out.println();
    System.out.printf( "CPU Utilization: %f", calc_CPU_utilization() );
    System.out.println();
    System.out.printf( "Average processes in ready queue: %f", calc_avg_proc_ready_queue() );
    System.out.println();
  }

  public static void clear_console() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
 }

  // <<<<<<<< ABSTRACT METHODS >>>>>>>>
  public abstract boolean schedule(int arrival_time, int burst);
}