/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jason
 */
public class Metrics {
    public String name;    
    public int pid;
    public int arrivalTime;
    public int burstTime;
    public int remainingTime;
    public int completionTime;
    public int turnaroundTime;
    public int responseTime;
    public int waitingTime;
    public int startTime = -1;
    public int progress = 0;
    public int queueLevel = 0;
    public int index; 
    public int numQueues ;
    public int timeUsedAtCurrentLevel = 0;

    public Metrics(int pid, int arrivalTime, int burstTime) {
       this.pid = pid;
    this.index = pid - 1;
    this.arrivalTime = arrivalTime;
    this.burstTime = burstTime;
    this.remainingTime = burstTime;
    this.startTime = -1;
    this.completionTime = 0;
    this.turnaroundTime = 0;
    this.responseTime = 0;
    this.waitingTime = 0;
    this.numQueues = 0; 
    this.queueLevel = 0;
    this.timeUsedAtCurrentLevel = 0;
}
}

