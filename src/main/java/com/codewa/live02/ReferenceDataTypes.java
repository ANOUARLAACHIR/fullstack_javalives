package com.codewa.live02;

import java.util.Date;

public class ReferenceDataTypes {
    public static void main(String[] args) {
        int age = 33;
        Date now = new Date();
        System.out.println(now.getTime() / (1000L * 60 * 60 * 24 * 365));
    }
}
