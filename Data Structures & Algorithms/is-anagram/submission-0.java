class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        
        char[] tChar = t.toCharArray();
        
        Arrays.sort(sChar);
        String n = new String(sChar);
        Arrays.sort(tChar);
        String m = new String(tChar);
        if(n.equals(m)){
            return true;
        }
        return false;
    }
}
