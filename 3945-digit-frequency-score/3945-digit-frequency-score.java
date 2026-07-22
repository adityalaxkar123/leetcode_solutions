class Solution {
    public int digitFrequencyScore(int n) {
        // HashMap<Integer,Integer> mp = new HashMap<>();
        int ans = 0;
        int []freq = new int[10];
        while(n>0){
            int ele = n%10;
            // mp.put(ele,mp.getOrDefault(ele,0)+1);
            freq[ele]++;
            n/=10;
        }

        // for(var ele : mp.entrySet()){
        //     ans=ans+ele.getKey()*ele.getValue();
        // }
        for(int i=0;i<10;i++){
            ans+=freq[i]*i;
        }

        return ans;
    }
}