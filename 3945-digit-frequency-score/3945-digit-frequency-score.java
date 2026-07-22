class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans = 0;

        while(n>0){
            int ele = n%10;
            mp.put(ele,mp.getOrDefault(ele,0)+1);
            n/=10;
        }

        for(var ele : mp.entrySet()){
            ans=ans+ele.getKey()*ele.getValue();
        }

        return ans;
    }
}