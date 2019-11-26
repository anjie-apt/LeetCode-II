package BackTrack;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        if (s.length() == 0) return res;
        int n = s.length();
        backtrack(0, "", 4, s, n, res);
        return res;
    }

    private void backtrack(int index, String temp, int flag, String string, int n, List<String> res) {
        //递归终止条件：
        if (index == n && flag == 0) {
            res.add(temp.substring(0, temp.length() - 1));
            return;
        }
        //循环体：
        if (flag < 0) return;
        for (int j = index; j < index + 3; j++) {
            if (j < n) {
                //如果以0开头，需要特殊处理，单独作为一个分组
                if (index == j && string.charAt(j) == '0') {
                    backtrack(j + 1, temp + string.charAt(j) + '.', flag - 1, string, n, res);
                    break;
                }
                //如果当前索引与下一个索引的值小于255，继续递归
                if (Integer.parseInt(string.substring(index, j + 1)) <= 255) {
                    backtrack(j + 1, temp + string.substring(index, j + 1) + '.', flag - 1, string, n, res);
                }
            }
        }
    }
}
