package br.com.dio.desafioreactor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1:");
        Question1 question1 = new Question1();
        question1.increment(List.of(0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L))
                .doOnNext(System.out::println)
                .subscribe();

        System.out.println();

        User user1 = new User(1L, "Adiel Amaral", "adiel@gmail.com", "123456", true);
        User user2 = new User(2L, "Jhennyffer Kossmann", "jheny@hotmail.com", "jheny@15", false);
        User user3 = new User(3L, "Wemila Yasmin", "wemila@gmail.com", "654321", true);
        User user4 = new User(4L, "Felipe Rodrigues", "felipe@yahoo.com.br", "felipinho123", false);
        User user5 = new User(5L, "Yago dos Anjos", "yago@gmail.com", "yaguinho000", true);

        System.out.println("Question 2:");
        Question2 question2 = new Question2();
        question2.countAdmins(List.of(user1, user2, user3, user4, user5))
                .doOnNext(users -> System.out.println(users + " admin users"))
                .subscribe();

        System.out.println();

        System.out.println("Question 3:");
        Question3 question3 = new Question3();
        question3.userIsValid(user5)
                .subscribe();
    }
}
