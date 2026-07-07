class Solution {
public long sumAndMultiply(int n) {
    String s = Integer.toString(n);
    s = s.replace("0", "");
    if (s.isEmpty()) {
        return 0;
    }
    int nn = Integer.parseInt(s);
    int i = 0;
    int t = nn;
    while (nn > 0) {
int j = nn % 10;
i += j;
nn/=10;
}
return (long) i * t;
    }
}