package SwordRefers2Offer;

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        //±ß½çÌõ¼þ
        if (str.length() == 0) return "";
        StringBuffer res = new StringBuffer();
        String newStr = str.toString();
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(newStr.charAt(i));
            }
        }
        return res.toString();
    }
}
