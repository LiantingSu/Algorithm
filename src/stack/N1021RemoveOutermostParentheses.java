package stack;

/**
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings,
 * and + represents string concatenation.
 *
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B,
 * with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are
 * primitive valid parentheses strings.
 *
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 */
public class N1021RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        int x = 0;
        int j = 1;
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                x++;
            }
            else{
                x--;
            }
            if(x == 0){
                res = res + s.substring(j,i);
                j = i+2;
            }
        }
        return res;
    }
}
