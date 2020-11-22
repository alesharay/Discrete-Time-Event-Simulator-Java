package com.aleshamray.dtes;

/**
 * Process events for scheduling algorithms
 */
public class Event {
  private String name;
  private long time;
  private int id;

  /**
   * Event constructor
   */
  public Event( String name, long time, int id ) {
    set_name( name );
    set_time( time );
    set_id( id );
  }

  public void set_name( String name ) { this.name = name; }

  public String get_name() { return name; }

  public void set_time ( long time ) { this.time = time; }

  public long get_time() { return time; }

  public void set_id( int id ) { this.id = id; }

  public int get_id() { return id; }
}