package com.aleshamray.dtes.Schedulers;

import java.util.Queue;

/**
 * Round Robin Scheduling Algorithm [preemptive by quantum - see slide4]
 */
public class RR extends Scheduler {
  private float quantum;
  private Queue event_queue;
  
  /**
   * RR Constructor
   */
  public RR( Queue event_queue, float quantum ) {
    scheduling_algorithm = "RR";
    this.quantum = quantum;
    this.event_queue = event_queue;
  }
}