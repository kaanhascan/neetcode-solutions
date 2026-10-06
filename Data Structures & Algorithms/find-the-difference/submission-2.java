class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){ list.add(c);}
        for(char c : t.toCharArray()){
            if(list.contains(c)){
                list.remove(Character.valueOf(c));
            }
            else list.add(c);
        }
        return list.get(0);

    }
}