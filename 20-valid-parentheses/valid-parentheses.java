class Solution {
    public boolean isValid(String s) {
        char[] arr = new char[s.length()];
    int top = -1;

    for (char c : s.toCharArray()) {

        if (c == '(') {
            arr[++top] = ')';
        } 
        else if (c == '{') {
            arr[++top] = '}';
        } 
        else if (c == '[') {
            arr[++top] = ']';
        } 
        else {
            if (top == -1) {
                return false;
            }

            if (arr[top] != c) {
                return false;
            }

            top--;
        }
    }

    return top == -1;
    }
}