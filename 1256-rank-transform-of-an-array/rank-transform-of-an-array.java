class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ar=arr.clone();
        Arrays.sort(ar);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<ar.length;i++){
            if(!map.containsKey(ar[i])){
                map.put(ar[i],rank);
                rank++;
            }
        }
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }return ans;
    }
}