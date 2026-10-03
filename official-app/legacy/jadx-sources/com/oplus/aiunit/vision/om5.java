package com.oplus.aiunit.vision;

import java.util.Random;

/* JADX INFO: loaded from: classes16.dex */
public class om5 {
    public static String a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(new Random().nextInt(62)));
        }
        return sb.toString();
    }
}
