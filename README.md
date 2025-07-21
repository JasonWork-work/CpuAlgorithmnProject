# CpuAlgorithmnProject
Update: Added generate button and number of processes text field where the user inputs the number of processes and the program will automatically generate random inputs on arrival and burst times()

The program that i worked on is the cpualgorithm project is a program where u simulate on how cpu algorithms(FCFS,SJF,SRTF,RR,MLFQ) work.

The maximum numbers for the process is 10
The container for arrival and burst time are stored for each processes

<img width="1206" height="710" alt="Image" src="https://github.com/user-attachments/assets/3a3fe4ce-881d-4d42-96d2-9d86e8d0bab3" />
       
In this picture,the text areas are those inputs you want place(process ID, arrival, burst). You must input this individually and click input to be added on the table at a top-right. The time quantums text fields(time slice and allotment) are disabled by default and will only be enabled if the user select the specific algorithm, which in this case, RR(Round Robin) and MLFQ(Multi-level feedback queue).
       
<img width="1153" height="644" alt="Image" src="https://github.com/user-attachments/assets/cc237e95-1e7d-4ece-9965-e72d2d06498b" />

This the example of FCFS.
(The IDLE are the cpu is not working right now)

<img width="1141" height="644" alt="Image" src="https://github.com/user-attachments/assets/a58b5db8-4a1d-447f-96a7-5f6749937f61" />

heres another example for SJF

<img width="1142" height="642" alt="Image" src="https://github.com/user-attachments/assets/420b50de-74e5-4871-a1a6-8899f1b5dcbe" />

Another example for SRTF

<img width="1143" height="613" alt="Image" src="https://github.com/user-attachments/assets/d4474de9-1481-4f57-849d-f9e836cc7017" />

This one is for round robin. When you pick round robin, you only need to input the time slice and the allotment

For MLFQ, You need to input 4 time slice and allotment. (4 is the max,0-3 are priority level)

example for MLFQ
<img width="1143" height="654" alt="Image" src="https://github.com/user-attachments/assets/777dfe53-6dce-42ea-92ec-a48421227aac" />

The cons for this programn is that you need manully inputs individually, which takes a bit of time. 
