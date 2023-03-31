import java.util.Scanner;

public class Task1 {
    static int total_process;
    static int start_time = 0, counter = 0;
    static int arrival_time[];
    static int burst_time[];
    static int temp_brust_time[];
    static int complete_time[];
    static int turnaround_time[];
    static int waiting_time[];
    static int flag[];


    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);
        System.out.println("Enter total number of processes");
        total_process = sin.nextInt();
        arrival_time = new int[total_process];
        burst_time = new int[total_process];
        temp_brust_time=new int[total_process];
        complete_time = new int[total_process];
        turnaround_time = new int[total_process];
        waiting_time = new int[total_process];
        flag = new int[total_process];

        for (int i = 0; i < total_process; i++) {
            System.out.println("Enter Process " + (i + 1) + " Arrival Time  ");
            arrival_time[i] = sin.nextInt();
            System.out.println("Enter Process " + (i + 1) +" Burst Time ");
            burst_time[i] = sin.nextInt();
            temp_brust_time[i]=burst_time[i];
        }
        SJF_Scheduling();

    }


    public static void SJF_Scheduling() {
        while (true) {
            int current_process = total_process;
            int min = 10000;
            if (counter == total_process) {
                break;
            }

            for (int i = 0; i < total_process; i++) {
                if (arrival_time[i] <= start_time && temp_brust_time[i] < min && flag[i] == 0) {
                    min = burst_time[i];
                    current_process = i;
                }
            }
                if (current_process == total_process) {
                    start_time++;
                }
                else {
                    temp_brust_time[current_process]--;
                    start_time++;

                    if (temp_brust_time[current_process]==0){
                        complete_time[current_process]=start_time;
                        flag[current_process]=1;
                        turnaround_time[current_process] = complete_time[current_process] - arrival_time[current_process];
                        waiting_time[current_process] = turnaround_time[current_process] - burst_time[current_process];
                        counter++;

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
