package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes12.dex */
public class em6 {
    public static byte[] a(@NonNull byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return new byte[0];
        }
    }
}
