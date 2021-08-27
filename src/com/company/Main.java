package com.company;

public class Main {

    public static void main(String[] args) {
	    String str = "В ногах нет правды. На вкус и цвет товарища нет. На нет и суда нет. Нет дыму без огня. Нет худа без добра. Там хорошо, где нас нет.";
        System.out.println(str.length());
        // разбиваем на подстроки и записываем в массив
        String[] sentence = str.split("\\.");
        for(String val:sentence){
            System.out.println(val);
        }
        // разбиваем на слова и записываем в массив
        String[] words = str.split(" ");
        for (String word:words) {
            System.out.println(word);
        }
        System.out.println("____________");
        for (String fiveWordInWords: words) {
            if (fiveWordInWords.length() !=6 && fiveWordInWords.length()>4){
                System.out.println(fiveWordInWords);
                if(fiveWordInWords.equals("ногах")){
                  String nowWord =  fiveWordInWords.replace("ногах","руках");
                    System.out.println(nowWord);
                }
            }
        }
        System.out.println("____________");
    }
}
