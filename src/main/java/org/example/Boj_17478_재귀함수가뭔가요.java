package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj17478_재귀함수가 뭔가요?
public class Boj_17478_재귀함수가뭔가요 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String start = "\"재귀함수가 뭔가요?\"\n";
        String second = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
        String third = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
        String fourth = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
        String answer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
        String end = "라고 답변하였지.";
        String dash = "____";

        // 출력
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n")
                .append(start).append(second).append(third).append(fourth);

        for(int i=1; i<=N; i++){
            if(i==N){
                sb.append(dash.repeat(i)).append(start);
                sb.append(dash.repeat(i)).append(answer);
            }else{
                sb.append(dash.repeat(i)).append(start);
                sb.append(dash.repeat(i)).append(second);
                sb.append(dash.repeat(i)).append(third);
                sb.append(dash.repeat(i)).append(fourth);
            }
        } // end for

        for(int i=N; i>=1; i--){
            sb.append(dash.repeat(i)).append(end).append("\n");
        }
        sb.append(end);

        System.out.print(sb);
    } // end main
} // end class