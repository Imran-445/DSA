class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }

        return PhonePad("", digits);
    }

    public ArrayList<String> PhonePad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
      
        String[] phoneKeys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};        //one extra "" is actually for digit 0 of phonepad
        ArrayList<String> list = new ArrayList<>();
        
        for (int i=0; i<phoneKeys[digit].length(); i++) {
            char ch = phoneKeys[digit].charAt(i);
            list.addAll(PhonePad(p+ch, up.substring(1)));
        }
        return list;
    }
}