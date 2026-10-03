package com.oplus.aiunit.vision;

import android.content.Context;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class tp9 {
    public long a = -1;
    public long b = 12;
    public long c = (-1) ^ ((-1) << ((int) 12));
    public Random d = new Random();

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final long b(Context context) {
        return context.getSharedPreferences("data", 0).getLong("sequence", -1L);
    }

    public final int c() {
        int iHashCode = UUID.randomUUID().toString().replace("-", "").hashCode();
        return iHashCode < 0 ? -iHashCode : iHashCode;
    }

    public synchronized long d(Context context) {
        long jC;
        long j;
        jC = c();
        long jB = b(context);
        this.a = jB;
        if (jB == -1) {
            this.a = this.d.nextInt((int) this.c);
        }
        long j2 = this.a + 1;
        long j3 = this.c;
        j = j2 & j3;
        this.a = j;
        if (j > j3 || j < 0) {
            throw new IllegalArgumentException(String.format("sequence Id can't be greater than %d or less than 0", Long.valueOf(this.a)));
        }
        return (jC << ((int) this.b)) | j;
    }

    public synchronized long e(Context context) {
        long jC;
        long j;
        jC = c();
        long jB = b(context);
        this.a = jB;
        if (jB == -1) {
            this.a = this.d.nextInt((int) this.c);
        }
        long j2 = this.a + 1;
        long j3 = this.c;
        j = j2 & j3;
        this.a = j;
        if (j > j3 || j < 0) {
            throw new IllegalArgumentException(String.format("sequence Id can't be greater than %d or less than 0", Long.valueOf(this.a)));
        }
        return (jC << ((int) this.b)) | j;
    }

    public synchronized String f(Context context) {
        return a(String.valueOf(e(context) + d(context)));
    }
}
