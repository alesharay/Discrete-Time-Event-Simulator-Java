package com.aleshamray.dtes.Schedulers;

import java.util.Queue;

/**
 * Shortest Remaining Time First Scheduling Algorithm [preemptive by comparison
 * - see slide4]
 */
public class SRTF extends Scheduler {
  private Queue event_queue;
  /**
   * SRTF Constructor
   */
  public SRTF( Queue event_queue ) {
    scheduling_algorithm = "SRTF";
    this.event_queue = event_queue;
  }
}