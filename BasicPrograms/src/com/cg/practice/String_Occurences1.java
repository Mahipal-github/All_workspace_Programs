package com.cg.practice;

public class String_Occurences1 {
    public static void main(String args[]) {
      // Given below Input String containing duplicate words
      String input = "I am am am learning Java Java";
      // Converting given  Input String to lowerCase below:
      input = input.toLowerCase();
      /* Split the given Input String into words using 
      built-in split() method below*/
      String[] words = input.split(" ");
      int length = words.length;
      // Using for loop 
      for( int i=0; i < length; i++)
      {
          // Set count to 1 for every iteration
          int count = 1;
          for(int j=i+1; j < length; j++)
          {
              if(words[i].equals(words[j]))
              {
                  count++;
                  /* Setting words[j]="0" to avoid 
                  visited words */
                  words[j] = "0";
              }
          }
          if (words[i] != "0" && count > 1)
              System.out.print(" "+words[i]+" "+count);
      }
    }
}