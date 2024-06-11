class Solution {
    public List<String> printVertically(String s) {
        String[] temp = s.split(" ");
        List<String> out = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i=temp.length-1; i>=0; i--){
            if(temp[i].length() > max){
                max = temp[i].length();
            }else{
                int diff = max - temp[i].length();
                for(int j=0; j<diff; j++){
                    temp[i] += " ";
                }
            }
        }

        for(int i=0; i<temp[0].length(); i++){
            String str = "";
            for(int j=0; j<temp.length; j++){
                if(i < temp[j].length()){
                    char ch = temp[j].charAt(i);
                    str += ch;
                }
            }
            out.add(str);
        }
        return out;
    }
}
