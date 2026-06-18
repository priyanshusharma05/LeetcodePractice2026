class Solution {
    public double angleClock(int hour, int minutes) {
        double re = Math.abs(30*hour - 5.5*minutes);
        if(re >180)return 360-re;
        return re;
    }
}