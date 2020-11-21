package com.aleshamray.dtes.Schedulers;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Scheduler {
  protected float average_turnaround_time; //<-------------amount of time to execute a particular process 
                                           //             (The sum of the periods spent waiting in the ready queue, executing on the CPU, and doing I/O)
  protected float total_throughput; //<--------------------# of processes that complete their execution per time unit
  protected float CPU_utilization; //<---------------------keep the CPU as busy as possible
  protected float average_processes_in_ready_queue; //<----average number of processes in the ready queue

  protected String scheduling_algorithm;

  protected Queue process_ready_queue;        // set of all processes residing in main memory, ready and waiting to execute


  public Scheduler() {
    average_turnaround_time = 0f;
    total_throughput = 0f;
    CPU_utilization = 0f;
    average_processes_in_ready_queue = 0f;

    scheduling_algorithm = "";

    process_ready_queue = new LinkedList<>();
  }

  public String get_algorithm() { return scheduling_algorithm; }

  public void display() {
    System.out.println();
    System.out.printf( "Scheduling Algorithm: %s", scheduling_algorithm );
    System.out.println();
    System.out.printf( "Average turnaround time: %f", average_turnaround_time );
    System.out.println();
    System.out.printf( "Total throughput: %f", total_throughput );
    System.out.println();
    System.out.printf( "CPU Utilization: %f", CPU_utilization );
    System.out.println();
    System.out.printf( "Average processes in ready queue: %f", average_processes_in_ready_queue );
    System.out.println();
  }

  public static void clear_console() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
 }
}