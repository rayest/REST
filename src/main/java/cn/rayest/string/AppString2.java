package cn.rayest.string;

/**
 * Created by Rayest on 2016/6/29 0029.
 */
public class AppString2 {
    public static void main(String[] args) {
        String s = " wa fon q2pf-94p om3qn9 3qngavz a/ '1/'/!@# $ %^& *()_";
        int yingyu = 0;
        int shuzi = 0;
        int kongge = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                yingyu++;
                System.out.println("Ӣ���ַ���" + c);
            }else if ((c >= '0' && c <= '9')){
                shuzi++;
                System.out.println("�����ַ���" + c);
            }else if (c == ' '){
                kongge++;
                System.out.println("�ո��ַ���" + c);
            }else {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Ӣ���ַ�������" + yingyu);
        System.out.println("�����ַ�����: " + shuzi);
        System.out.println("�ո��ַ�����: " + kongge);
    }
}
