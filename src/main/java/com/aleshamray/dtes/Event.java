package com.aleshamray.dtes;

/**
 * Process events for scheduling algorithms
 */
public class Event {
  private String name;
  private float time;

  /**
   * Event constructor
   */
  public Event( float time ) {
    name = "";
    this.time = time;
    // TODO: Implement This
  }

  public void set_name( String name ) { this.name = name; }

  public String get_name() { return name; }

  public void process_arrival() {
    // TODO: Implement this
  }

  public void process_completion() {
    // TODO: Implement this
  }

  public void timeslice_occurance() {
    // TODO: Implement this
  }
}