class Solution {

    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char current = chars[read];
            int start = read;

            while (read < chars.length && chars[read] == current) {
                read++;
            }

            int count = read - start;

            chars[write++] = current;

            if (count > 1) {

                String num = String.valueOf(count);

                for (char ch : num.toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }

        return write;
    }
}