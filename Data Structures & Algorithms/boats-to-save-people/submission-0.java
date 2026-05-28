class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int bt=0, lptr = 0, rptr=people.length-1, max = 0;
        while(lptr<rptr){
            int weight = people[lptr] + people[rptr];
            if(weight==limit){
                lptr++;
                rptr--;
                bt++;
            }
            else if (weight  < limit){
                lptr++;
                rptr--;
                bt++;
            }
            else{
                rptr--;
                bt++;
            }
            
        }
        if(lptr  == rptr){
                bt++;
            }
    return bt;

    }
}