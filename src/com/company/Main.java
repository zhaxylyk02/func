 package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        func();
    }

    public static void func() {
        Scanner input = new Scanner(System.in);
        String user, pass;                          // логин жане пароль айнымалысын курастырамыз
        System.out.print("Введите логин: ");
        user = input.nextLine();                   //  User-дан логин сураймыз
        System.out.println("Введите пароль: ");
        pass = input.nextLine();                   //  User-дан пароль сураймыз
        if (user.equals("zhaxylyk2002@gmail.com") && (pass.equals("123321")))  // жазылган акпаратты бар логинмен тексеремиз
        {
            System.out.println("Добро пожаловать на сайт");   // егер логин жане пароль дурыс болганда сайттка киреди
        } else {
            System.out.println("Логин или пороль введен не правильно.Повторите попытку!!!");
            // егер логин жане пароль дурыс болганда сайттка киреди
        }
    }
}