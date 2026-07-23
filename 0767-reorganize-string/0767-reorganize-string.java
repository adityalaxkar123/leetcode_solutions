class Pair{
    char a;
    int count;
    Pair(char a,int count){
        this.a=a;
        this.count=count;
    }
}

class Solution {

    public String reorganizeString(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            return Integer.compare(b.count,a.count);
        });
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(var ele : mp.entrySet()){
            pq.add(new Pair(ele.getKey(),ele.getValue()));
        }
        StringBuilder st = new StringBuilder();
        Pair prev = null;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            st.append(curr.a);
            curr.count--;
            if(prev!=null && prev.count>0)
                pq.add(prev);
            prev=curr;
        }
        if(st.length()<s.length())
            return "";
        return st.toString();
    }
}