package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


// Boj_1541_잃어버린괄호
public class Boj_1541_잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int res = 0;

        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Character> str = new ArrayList<>();
        String q = br.readLine();
        st = new StringTokenizer(q, "+,-");
        while (st.hasMoreTokens()) {
            num.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < q.length(); i++) {
            if (q.charAt(i) == '-' || q.charAt(i) == '+') {
                str.add(q.charAt(i));
            }
        }

//        for (int i = 0; i < num.size(); i++) {
//            System.out.println(num.get(i));
//        }
//        for (int i = 0; i < str.size(); i++) {
//            System.out.println(str.get(i));
//        }

        res +=num.get(0);
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i) == '+') {
                res += num.get(i+1);
            } else if (str.get(i) == '-') {
                for (int j = i + 1; j < num.size(); j++) {
                    res -= num.get(j);
                }
                break;
            }
        }
        System.out.println(res);
    } // end main
} // end class
