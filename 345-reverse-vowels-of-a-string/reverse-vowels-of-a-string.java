class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(isvowel(arr[i]) && isvowel(arr[j])){
                char tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
                i++;
                j--;
            }else if(isvowel(arr[i])){
                j--;
            }else{
                i++;
            }
        }
        return new String(arr);
    }
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')return true;
        return false;
    }
}