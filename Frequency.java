import java.util.*;
class Frequency
{
public static void countFreq(int arr[], int n)
{
boolean visited[] = new boolean[n];
Scanner.fill(visited, false);

for (int i = 0; i < n; i++) 
{
if (visited[i] == true)
continue;

int count = 1;
for (int j = i + 1; j < n; j++) 
{
if (arr[i] == arr[j]) 
{
visited[j] = true;
count++;
}
}
System.out.println(arr[i] + " occurs " + count +" times ");
}
}
public static void main(String []args)
{
int arr[] = new int[]{1,3,1,2,1,2,3,1};
int n = arr.length;
countFreq(arr, n);
}
}