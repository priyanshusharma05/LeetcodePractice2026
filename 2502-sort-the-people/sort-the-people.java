class Solution {
    public String[] sortPeople(String[] names, int[] he) {
        for(int i=0;i<names.length-1;i++){
            for(int j=i+1;j<names.length;j++){
                if(he[i]<he[j]){
                    int tempH = he[i];
                    he[i] = he[j];
                    he[j] = tempH;
                    String temN=names[i];
                    names[i]=names[j];
                    names[j]=temN;
                }
            }
        }
        return names;
    }
}