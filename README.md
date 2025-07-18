# CpuAlgorithmnProject
The program that i worked on is the cpualgorithm project is a program where u simulate on how cpu algorithms(FCFS,SJF,SRTF,RR,MLFQ) work.
This is the declarations for the inputs(which in this case, the process ID, burst time, arrival and time quantums(time slice,allotment, priority).

    JTextField[] arrivalContainer;
    JTextField[] burstContainer;
    int processCount;
    
    
    List<Metrics> cpuItems = new ArrayList<>();
    int currentProcess = 1;
    
    //arrival count
    JTextField arrivalTime1;
    JTextField arrivalTime2;
    JTextField arrivalTime3;
    JTextField arrivalTime4;
    JTextField arrivalTime5;
    JTextField arrivalTime6;
    JTextField arrivalTime7;
    JTextField arrivalTime8;
    JTextField arrivalTime9;
    JTextField arrivalTime10;
    
    
    //burst count
    JTextField burstTime1;
    JTextField burstTime2;
    JTextField burstTime3;
    JTextField burstTime4;
    JTextField burstTime5;
    JTextField burstTime6;
    JTextField burstTime7;
    JTextField burstTime8;
    JTextField burstTime9;
    JTextField burstTime10;
    
    
    public cpuInputs() {
      initComponents();  // must come first
       cpuItems = new ArrayList<>();
        currentProcess = 1;
      
    policySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
        "FCFS", "SJF", "SRTF", "RR", "MLFQ"
    }));
        
    arrivalContainer = new JTextField[]{
        arrivalTime1, arrivalTime2, arrivalTime3, arrivalTime4, arrivalTime5,
        arrivalTime6, arrivalTime7, arrivalTime8, arrivalTime9, arrivalTime10
    };

    burstContainer = new JTextField[]{
        burstTime1, burstTime2, burstTime3, burstTime4, burstTime5,
        burstTime6, burstTime7, burstTime8, burstTime9, burstTime10
    };

  
    initSetcomponents();
    timeSlice1.setEnabled(false);
    allotmentTime.setEnabled(false);
    priorityQueue.setEnabled(false);
}

The maximum numbers for the process is 10
The container for arrival and burst time are stored for each processes
The time quantums text fields will only unfadeds if the user picks a specific algorithm in the comboBox which is RR(Round robin) for time slice and allotment and MLFQ for priority

        private void policySelectActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        String selection = policySelect.getSelectedItem().toString();
               

        if(selection.equals("RR")){
            timeSlice1.setEnabled(true);
            allotmentTime.setEnabled(true);
        }
        else if(selection.equals("MLFQ")){
            timeSlice1.setEnabled(true);
            allotmentTime.setEnabled(true);
            priorityQueue.setEnabled(true);
        }else{
     timeSlice1.setEnabled(false);
    allotmentTime.setEnabled(false);
    priorityQueue.setEnabled(false);
        }
      
    }             

For this program, you need to input the processes, burst and arrival times individually. For example when you type on the process ID 1 and then burst: 14, arrival: 20, so you have to click input button to store the input variables in the metrics

    private void inputButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (cpuItems.size() > 10) {
        JOptionPane.showMessageDialog(this, "Maximum of 10 processes allowed.");
        return;
    }

    try {
        int arrival = Integer.parseInt(arrivalTime.getText().trim());
        int burst = Integer.parseInt(burstTime.getText().trim());

        cpuItems.add(new Metrics(currentProcess, arrival));
        currentProcess++;

       

        // Clear inputs for next entry
        arrivalTime.setText("");
        burstTime.setText("");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Enter you arrival and burst inputs.");
    }
    }              

