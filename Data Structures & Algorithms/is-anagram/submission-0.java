class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        boolean isAnagram = true;
        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        for(int i=0;i<arrs.length;i++){
            mapS.put(arrs[i],mapS.getOrDefault(arrs[i],0) + 1);
            mapT.put(arrt[i],mapT.getOrDefault(arrt[i],0) + 1);
        }

        for(Map.Entry<Character,Integer> entry : mapS.entrySet()){
            if (!mapT.containsKey(entry.getKey()) ||
                !mapT.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }

        return isAnagram;
    }
}
