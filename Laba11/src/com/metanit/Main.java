package com.metanit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        String regulyr = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку программа найдет верный IP: ");
        String goodIP = in.nextLine();
        Pattern P = Pattern.compile(regulyr);
        Matcher M = P.matcher(goodIP);
        if (M.find()){
            System.out.println("Найдет верный IP:" + M.group());
        }
        else {
            System.out.println("Верный IP не найдет");
        }


    }


 }





