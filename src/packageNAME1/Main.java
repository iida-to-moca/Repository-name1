package packageNAME1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 現在の日付を取得
        LocalDate currentDate = LocalDate.now();
        
        // 日付を特定のフォーマットに変換する場合（例：yyyy-MM-dd）
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        
        System.out.println("今日の日付は: " + formattedDate);
    }
}