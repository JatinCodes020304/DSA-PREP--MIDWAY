class Solution {
    public int minimumPushes(String word) {
        char a[] = word.toCharArray();
        int c = 0;

      for (int i = 0; i < word.length(); i++) {
    if (i < 8)
        c += 1;
    else if (i < 16)
        c += 2;
    else if (i < 24)
        c += 3;
    else
        c += 4;
}
return c;
    }
}