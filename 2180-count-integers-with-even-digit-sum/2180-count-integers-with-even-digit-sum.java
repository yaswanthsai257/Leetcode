class Solution {
     public int rev(int n) {
        int s = 0;
        for (int i = n; i > 0; i = i / 10) {
            int c = i % 10;
            s = s + c;
        }
        if (s % 2 == 0)
            return s;
        else
            return 0;
    }
    public int countEven(int num) {
        int s = 0;
        for (int i = 1; i <= num; i++) {
            if (i <= 9 && i % 2 == 0)
                s++;
            else if (i > 9) {
                int p = rev(i);
                if (p != 0)
                    s++;
            }
        }
        return s;
    }
}