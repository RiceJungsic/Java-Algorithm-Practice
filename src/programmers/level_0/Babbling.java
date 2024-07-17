package programmers.level_0;

import java.util.Arrays;

/*
   머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
   조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
   문자열 배열 babbling이 매개변수로 주어질 때,
   머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
*/
public class Babbling {

    public void babbling() {

        String[] examBabbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int count = solution(examBabbling);
        System.out.println("exam babbling Count: " + count);
    }


    public int solution(String[] babbling) {
        int answer = 0;
        String[] ableWord = {"aya", "ye", "woo", "ma"};

        answer = (int) Arrays.stream(babbling)
                .map(strA -> {
                    String temp = strA;
                    for (String strB : ableWord) {
                        temp = temp.replace(strB, " ");
                    }
                    return temp;
                })
                .filter(str -> str.trim().isEmpty())
                .count();

        return answer;
    }
}
