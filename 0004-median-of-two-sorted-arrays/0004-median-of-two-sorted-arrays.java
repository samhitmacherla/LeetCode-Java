class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int [] a= new int[m+n];
 
       int i=0;
            for(int j=0;j<m;j++){
            a[i++]=nums1[j];
            
            
            }

            for(int k=0;k<n;k++){
            a[i++]=nums2[k];
        

            }
           
 
        
        
        Arrays.sort(a);


         int g=a.length;
         
         
       
         if(g%2==0)
         return   (a[(g/2)-1]+a[g/2])/2.0;
         
          
 

         else
         return a[g/2];



    }
}