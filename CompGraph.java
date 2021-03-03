/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiskScheduling;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author KHUSH
 */
public class CompGraph {
    public int[] fetch(int[] e,int h){
        int[] g = new int[8];
        g[0] = FCFS(e,h);
        g[1] = SSTF(e,h);
        g[2] = SCAN(e,h,"left");
        g[3] = SCAN(e,h,"right");
        g[4] = CSCAN(e,h);
        g[5] = LOOK(e,h,"left");
        g[6] = LOOK(e,h,"right");
        g[7] = CLOOK(e,h);
        return g;
       }
    private int CLOOK(int arr[], int head) 
{ 
    int seek_count = 0; 
    int distance, cur_track; 
    int size = arr.length;
    Vector<Integer> left = new Vector<Integer>(); 
    Vector<Integer> right = new Vector<Integer>(); 
    Vector<Integer> seek_sequence = new Vector<Integer>(); 
   
    // Tracks on the left of the 
    // head will be serviced when 
    // once the head comes back 
    // to the beggining (left end) 
    for(int i = 0; i < size; i++)
    {
        if (arr[i] < head) 
            left.add(arr[i]); 
        if (arr[i] > head) 
            right.add(arr[i]); 
    } 
   
    // Sorting left and right vectors 
    Collections.sort(left);  
    Collections.sort(right);  
   
    // First service the requests 
    // on the right side of the 
    // head 
    for(int i = 0; i < right.size(); i++) 
    {
        cur_track = right.get(i); 
   
        // Appending current track 
        // to seek sequence 
        seek_sequence.add(cur_track); 
   
        // Calculate absolute distance 
        distance = Math.abs(cur_track - head); 
   
        // Increase the total count 
        seek_count += distance; 
   
        // Accessed track is now new head 
        head = cur_track; 
    } 
   
    // Once reached the right end 
    // jump to the last track that 
    // is needed to be serviced in 
    // left direction 
    seek_count += Math.abs(head - left.get(0)); 
    head = left.get(0); 
   
    // Now service the requests again 
    // which are left 
    for(int i = 0; i < left.size(); i++)
    { 
        cur_track = left.get(i); 
   
        // Appending current track to
        // seek sequence 
        seek_sequence.add(cur_track); 
   
        // Calculate absolute distance 
        distance = Math.abs(cur_track - head); 
   
        // Increase the total count 
        seek_count += distance; 
   
        // Accessed track is now the new head 
        head = cur_track; 
    } 
     
    return seek_count;
}   
     private int FCFS(int arr[], int head)
{ 
    int size = arr.length;
    int seek_count = 0; 
    int distance, cur_track; 
  
    for (int i = 0; i < size; i++)  
    { 
        cur_track = arr[i]; 
  
        // calculate absolute distance 
        distance = Math.abs(cur_track - head); 
  
        // increase the total count 
        seek_count += distance; 
  
        // accessed track is now new head 
        head = cur_track; 
    } 
    return seek_count;
}
    
    private int CSCAN(int arr[], int head) 
{ 
    int seek_count = 0; 
    int distance, cur_track; 
    int disk_size=200;
    int size = arr.length;
    Vector<Integer> left = new Vector<Integer>(); 
    Vector<Integer> right = new Vector<Integer>(); 
    Vector<Integer> seek_sequence = new Vector<Integer>(); 
   
    // Appending end values which has 
    // to be visited before reversing
    // the direction 
    left.add(0); 
    right.add(disk_size - 1); 
   
    // Tracks on the left of the 
    // head will be serviced when 
    // once the head comes back 
    // to the beggining (left end). 
    for(int i = 0; i < size; i++) 
    { 
        if (arr[i] < head) 
            left.add(arr[i]); 
        if (arr[i] > head) 
            right.add(arr[i]); 
    } 
   
    // Sorting left and right vectors 
    Collections.sort(left);  
    Collections.sort(right);  
   
    // First service the requests 
    // on the right side of the 
    // head. 
    for(int i = 0; i < right.size(); i++)
    {
        cur_track = right.get(i); 
         
        // Appending current track to seek sequence 
        seek_sequence.add(cur_track); 
         
        // Calculate absolute distance 
        distance = Math.abs(cur_track - head); 
         
        // Increase the total count 
        seek_count += distance; 
         
        // Accessed track is now new head 
        head = cur_track; 
    } 
     
    // Once reached the right end 
    // jump to the beggining. 
    head = 0; 
   
    // Now service the requests again 
    // which are left. 
    for(int i = 0; i < left.size(); i++) 
    { 
        cur_track = left.get(i); 
         
        // Appending current track to
        // seek sequence 
        seek_sequence.add(cur_track); 
   
        // Calculate absolute distance 
        distance = Math.abs(cur_track - head); 
   
        // Increase the total count 
        seek_count += distance; 
         
        // Accessed track is now the new head 
        head = cur_track; 
    } 
    return seek_count;
}
    private int LOOK(int arr[], int head,String direction) 
{ 
    int seek_count = 0; 
    int distance, cur_track; 
    int size = arr.length;
    Vector<Integer> left = new Vector<Integer>(); 
    Vector<Integer> right = new Vector<Integer>(); 
    Vector<Integer> seek_sequence = new Vector<Integer>(); 
   
    // Appending values which are 
    // currently at left and right 
    // direction from the head. 
    for(int i = 0; i < size; i++) 
    { 
        if (arr[i] < head) 
            left.add(arr[i]); 
        if (arr[i] > head) 
            right.add(arr[i]); 
    }  
   
    // Sorting left and right vectors 
    // for servicing tracks in the 
    // correct sequence. 
    Collections.sort(left);  
    Collections.sort(right);  
     
    // Run the while loop two times. 
    // one by one scanning right 
    // and left side of the head 
    int run = 2; 
    while (run-- > 0)
    { 
        if (direction == "left") 
        { 
            for(int i = left.size() - 1; 
                    i >= 0; i--)
            { 
                cur_track = left.get(i); 
   
                // Appending current track to
                // seek sequence 
                seek_sequence.add(cur_track); 
   
                // Calculate absolute distance 
                distance = Math.abs(cur_track - head); 
   
                // Increase the total count 
                seek_count += distance; 
   
                // Accessed track is now the new head 
                head = cur_track; 
            } 
             
            // Reversing the direction 
            direction = "right"; 
        } 
        else if (direction == "right")
        { 
            for(int i = 0; i < right.size(); i++)
            {
                cur_track = right.get(i); 
                 
                // Appending current track to 
                // seek sequence 
                seek_sequence.add(cur_track); 
   
                // Calculate absolute distance 
                distance = Math.abs(cur_track - head); 
   
                // Increase the total count 
                seek_count += distance; 
   
                // Accessed track is now new head 
                head = cur_track; 
            } 
             
            // Reversing the direction 
            direction = "left"; 
        } 
    } 
    return seek_count;
}
    private int SCAN(final int arr[], int head, String direction) {
    int seek_count = 0;
    int disk_size=0;
    int size=arr.length;
    int distance, cur_track;
    Vector<Integer> left = new Vector<Integer>(),
                    right = new Vector<Integer>();
    Vector<Integer> seek_sequence = new Vector<Integer>();
 
    // appending end values
    // which has to be visited
    // before reversing the direction
    if (direction == "left")
        left.add(0);
    else if (direction == "right")
        right.add(disk_size - 1);
 
    for (int i = 0; i < size; i++) 
    {
        if (arr[i] < head)
            left.add(arr[i]);
        if (arr[i] > head)
            right.add(arr[i]);
    }
 
    // sorting left and right vectors
    Collections.sort(left);
    Collections.sort(right);
 
    // run the while loop two times.
    // one by one scanning right
    // and left of the head
    int run = 2;
    while (run-- >0)
    {
        if (direction == "left") 
        {
            for (int i = left.size() - 1; i >= 0; i--) 
            {
                cur_track = left.get(i);
 
                // appending current track to seek sequence
                seek_sequence.add(cur_track);
 
                // calculate absolute distance
                distance = Math.abs(cur_track - head);
 
                // increase the total count
                seek_count += distance;
 
                // accessed track is now the new head
                head = cur_track;
            }
            direction = "right";
        }
        else if (direction == "right") 
        {
            for (int i = 0; i < right.size(); i++) 
            {
                cur_track = right.get(i);
                 
                // appending current track to seek sequence
                seek_sequence.add(cur_track);
 
                // calculate absolute distance
                distance = Math.abs(cur_track - head);
 
                // increase the total count
                seek_count += distance;
 
                // accessed track is now new head
                head = cur_track;
            }
            direction = "left";
        }
    }
    return seek_count;
    }
    private  int SSTF(final int request[], int head)

    {
        if (request.length == 0)
            return 0;

        // create array of objects of class node
        final node diff[] = new node[request.length];

        // initialize array
        for (int i = 0; i < diff.length; i++)

            diff[i] = new node();

        // count total number of seek operation
        int seek_count = 0;

        // stores sequence in which disk access is done
        final int[] seek_sequence = new int[request.length + 1];
        

        for (int i = 0; i < request.length; i++) {

            seek_sequence[i] = head;
            calculateDifference(request, head, diff);

            final int index = findMin(diff);

            diff[index].accessed = true;

            // increase the total count
            seek_count += diff[index].distance;

            // accessed track is now new head
            head = request[index];
        }

        // for last accessed track
        seek_sequence[seek_sequence.length - 1] = head;
        return seek_count;
    }
    public  void calculateDifference(final int queue[], final int head, final node diff[])

    {
        for (int i = 0; i < diff.length; i++)
            diff[i].distance = Math.abs(queue[i] - head);
    }

    // find unaccessed track
    // which is at minimum distance from head
    public  int findMin(final node diff[]) {
        int index = -1, minimum = Integer.MAX_VALUE;

        for (int i = 0; i < diff.length; i++) {
            if (!diff[i].accessed && minimum > diff[i].distance) {

                minimum = diff[i].distance;
                index = i;
            }
        }
        return index;
    }
}
