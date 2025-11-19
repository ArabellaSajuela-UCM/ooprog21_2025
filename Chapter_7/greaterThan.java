public class greaterThan {

public static int greaterThanAverage(int[] responseTimes) {
int counter = 0;
int sum = responseTimes[0]; 

for (int i = 1; i < responseTimes.length; i++) {
double average = (double)sum / i; 
if(responseTimes[i] > average) {
counter++;
}
sum += responseTimes[i]; 
}
return counter;
}

}
//int i = 1 to skip first element 
























//I am so sleepy I typed counter instead of sum, ran the program, then woke up after seeing the output as 653 >~<