package com.aleshamray.dtes.Scheduler;

import java.util.ArrayList;

abstract class Scheduler {
  public ArrayList<String> processQueue = new ArrayList<>();
  public ArrayList<String> processPriorityQueue = new ArrayList<>();
  public ArrayList<String> readyQueue = new ArrayList<>();
  public ArrayList<String> eventQueue = new ArrayList<>();
  public final double CONVERT_MS_TO_S = 1000.0;
  
  public Scheduler( ArrayList<String> eventQueue ) {
    this.eventQueue = eventQueue;
    
  }

}