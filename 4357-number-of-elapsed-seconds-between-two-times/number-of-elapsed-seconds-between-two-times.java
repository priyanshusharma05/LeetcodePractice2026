class Solution {
    public int secondsBetweenTimes(String st, String et) {
        int shr=Integer.parseInt(st.substring(0,2));
        int smi=Integer.parseInt(st.substring(3,5));
        int sse=Integer.parseInt(st.substring(6,8));
        int ehr=Integer.parseInt(et.substring(0,2));
        int emi=Integer.parseInt(et.substring(3,5));
        int ese=Integer.parseInt(et.substring(6,8));

        int stsec=shr*3600 + smi*60 +sse;
        int endsec=ehr*3600 + emi*60 +ese;
        return endsec-stsec;
    }
}