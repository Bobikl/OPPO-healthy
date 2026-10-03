package com.omron;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public class m {
    public static String a(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8"))).toString(16);
            for (int i = 0; i < 32 - string.length(); i++) {
                string = "0" + string;
            }
            return string;
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            System.out.println(e2.getMessage());
            return null;
        }
    }
}
