package com.aleshamray.dtes.Schedulers;

import java.util.Queue;

/**
 * First-Come First-Serve Scheduling Algorithm [non-preemptive - see slide4]
 */
public class FCFS extends Scheduler {
  private Queue event_queue;
  /** 
   * FCFS Constructor
   */
  public FCFS( Queue event_queue ) {
    scheduling_algorithm = "FCFS";
    this.event_queue = event_queue;
  }

}