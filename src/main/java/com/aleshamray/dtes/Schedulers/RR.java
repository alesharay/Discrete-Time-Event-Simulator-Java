package com.aleshamray.dtes.Schedulers;

/**
 * Round Robin Scheduling Algorithm
 * [preemptive by quantum - see slide4]
 */
public class RR extends Scheduler {
  private int quantum;
  /**
   * RR Constructor
   */
  public RR( int quantum ) {
    this.quantum = quantum;
    scheduling_algorithm = "RR";

    // TODO: Implement this
  }
}