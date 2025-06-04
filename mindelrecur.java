class Main {
    static int minDelrecur (int i, int j, String s){
        if (i>=j) return 0;
        if (s.charAt(i)==s.charAt(j)){
            return minDelrecur(i+1,j-1,s);
        }
        return 1+ Math.min(minDelrecur(i+1,j,s), minDelrecur(i,j-1,s));
    }
    static int minDeletions(String s) {
        int n=s.length();
        return minDelrecur(0,n-1,s);
    }
    public static void main(String[] args){
        String s="a e b c b d a";
        System.out.println(minDeletions(s));
    }
}
