import java.util.Scanner;
public class Task3 {
    static int total_process;
    static int start_time = 0, counter = 0, current_time = 0;
    static int arrival_time[];
    static int burst_time[];
    static int temp_brust_time[];
    static int complete_time[];
    static int turnaround_time[];
    static int waiting_time[];
    static int flag[];
    static int time_quantum=0;

    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);
        System.out.println("Enter total number of processes");
        total_process = sin.nextInt();
        arrival_time = new int[total_process];
        burst_time = new int[total_process];
        temp_brust_time = new int[total_process];
        complete_time = new int[total_process];
        turnaround_time = new int[total_process];
        waiting_time = new int[total_process];
        flag = new int[total_process];
        System.out.println("Enter total time quantum");
        time_quantum=sin.nextInt();

        for (int i = 0; i < total_process; i++) {
            System.out.println("Enter Process " + (i + 1) + " Burst Time ");
            burst_time[i] = sin.nextInt();
            temp_brust_time[i] = burst_time[i];
        }
        Round_Robin();


    }
    //Assuming arival time=0 for all processes
    public static void  Round_Robin() {
        while (true){
            if (counter == total_process) {
                break;
            }
          for (int i=0;i<total_process;i++){
              if (temp_brust_time[i]<time_quantum && flag[i]==0){
                  current_time+=temp_brust_time[i];
                  complete_time[i]=current_time;
                  flag[i]=1;
                  counter++;
                  turnaround_time[i] = complete_time[i] - arrival_time[i];
                  waiting_time[i] = turnaround_time[i] - burst_time[i];
              }


              if (temp_brust_time[i]>=time_quantum){
                  current_time+=time_quantum;
                  temp_brust_time[i]-=time_quantum;

//may be redundend
                  if (temp_brust_time[i]==0){
                      complete_time[i]=current_time;
                      flag[i]=1;
                      counter++;
                      turnaround_time[i] = complete_time[i] - arrival_time[i];
                      waiting_time[i] = turnaround_time[i] - burst_time[i];

                  }
              }

          }

        }

        System.out.println("Outputs:");

        for (int i=0;i<total_process;i++){
            System.out.println("Process " + (i + 1)+"\ncompletion Time(CT): "+complete_time[i] +"\nTurnaround Time(TAT) "+turnaround_time[i]+ "\nWaiting Time(WT): "+waiting_time[i]);
            System.out.println("***************************************");

        }

    }
}
