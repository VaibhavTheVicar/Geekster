import java.util.*;
class Solution { 
        int celebrity(int M[][], int n){
            
            int pot_celeb = 0;   
            for(int i = 1; i<n;i++)
            {
               if(M[pot_celeb][i] == 1)
                    pot_celeb = i;
               else if(M[i][pot_celeb] == 1)
                    continue;
                    
            }
            for(int i = 0;i<n;i++){
                if(i!=pot_celeb){
                    if(M[pot_celeb][i] == 1)
                        return -1;
                    if(M[i][pot_celeb] == 0)
                        return -1;
                
            }
            
        
        }
            return pot_celeb;
    }
    }

