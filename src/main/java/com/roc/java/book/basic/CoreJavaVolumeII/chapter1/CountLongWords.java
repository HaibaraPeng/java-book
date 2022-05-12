package com.roc.java.book.basic.CoreJavaVolumeII.chapter1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @Description CountLongWords
 * @Author penn
 * @Date 2022/5/12 21:39
 */
public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(
                Paths.get("src/main/java/com/roc/java/book/basic/CoreJavaVolumeII/chapter1/alice30.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(content.split("\\PL+"));

        long count = 0;
        for (String word : words) {
            if (word.length() > 3) {
                count++;
            }
        }
        System.out.println(count);

        count = words.stream().filter(w -> w.length() > 3).count();
        System.out.println(count);

        count = words.parallelStream().filter(w -> w.length() > 3).count();
        System.out.println(count);
    }
}
