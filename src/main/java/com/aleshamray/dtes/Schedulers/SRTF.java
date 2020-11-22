package com.aleshamray.dtes.Schedulers;

import java.util.Queue;

import com.aleshamray.dtes.Process;
import com.aleshamray.dtes.Process_State;
import com.aleshamray.dtes.Event;


/**
 * Shortest Remaining Time First Scheduling Algorithm [preemptive by comparison
 * - see slide4]
 */
public class SRTF extends Scheduler {
  /**
   * SRTF Constructor
   */
  public SRTF( Queue event_queue, float burst ) {
    super( event_queue, burst );
    scheduling_algorithm = "SRTF";
  }

  @Override
  public boolean schedule( int arrival_time, int burst ) {
    if( !process_ready_queue.isEmpty() ) {
      Process top_proc = process_ready_queue.poll();
      top_proc.set_state( Process_State.RUNNING );
      top_proc.set_arrival_time( arrival_time );
      top_proc.set_burst( burst );
      
      running_process = top_proc;
      
      Event new_event = new Event("CPU COMPLETION", arrival_time+burst, running_process.get_process_id() );
      event_queue.add( new_event );
      return true;
    }
    return false;
  }  
}