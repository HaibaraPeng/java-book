// package com.roc.java.book.basic.CoreJavaVolumeII.chapter1;
//
// import java.io.IOException;
// import java.math.BigInteger;
// import java.nio.charset.StandardCharsets;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;
//
// /**
//  * @Description CreatingStreams
//  * @Author penn
//  * @Date 2022/5/12 21:39
//  */
// public class CreatingStreams {
//     public static <T> void show(String title, Stream<T> stream) {
//         final int SIZE = 10;
//         List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
//         System.out.println(title + ": ");
//         for (int i = 0; i < firstElements.size(); i++) {
//             if (i > 0) {
//                 System.out.println(", ");
//             }
//             if (i < SIZE) {
//                 System.out.println(firstElements.get(i));
//             } else {
//                 System.out.println("...");
//             }
//         }
//         System.out.println();
//     }
//
//     public static void main(String[] args) throws IOException {
//         String content = new String(Files.readAllBytes(
//                 Paths.get("src/main/java/com/roc/java/book/basic/CoreJavaVolumeII/chapter1/alice30.txt")), StandardCharsets.UTF_8);
//
//         Stream<String> words = Stream.of(content.split("\\PL+"));
//         show("words", words);
//         Stream<String> song = Stream.of("gently", "down", "the", "stream");
//         show("song", song);
//         Stream<String> silence = Stream.empty();
//         show("silence", silence);
//
//         Stream<String> echos = Stream.generate(() -> "Echo");
//         show("echos", echos);
//
//         Stream<Double> randoms = Stream.generate(Math::random);
//         show("randoms", randoms);
//
//         Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE,n->n.add());
//         show("integers", integers);
//
//         Stream<String> echos = Stream.generate(() -> "Echo");
//         show("echos", echos);
//         long count = 0;
//         for (String word : words) {
//             if (word.length() > 3) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//
//         count = words.stream().filter(w -> w.length() > 3).count();
//         System.out.println(count);
//
//         count = words.parallelStream().filter(w -> w.length() > 3).count();
//         System.out.println(count);
//     }
// }
