package com.oplus.aiunit.vision;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes12.dex */
public class fkf {
    public static final String TAG = "fkf";
    public final Map<Integer, Key> a;
    public int b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fkf.this.b();
        }
    }

    public static class b {
        public static final fkf a = new fkf();
    }

    public static fkf e() {
        return b.a;
    }

    public final synchronized void b() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            this.a.put(Integer.valueOf(this.b % 4), keyGenerator.generateKey());
            this.b++;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public byte[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length <= 13) {
            x6b.a(TAG, "decrypt", "input length is" + bArr.length);
            return null;
        }
        try {
            Key key = this.a.get(Integer.valueOf(bArr[0]));
            if (key == null) {
                x6b.a(TAG, "decrypt", "mk is null");
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 13);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 13, bArr.length);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, key, new GCMParameterSpec(128, bArrCopyOfRange));
            return cipher.doFinal(bArrCopyOfRange2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public byte[] d(byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            int i = (this.b - 1) % 4;
            Key key = this.a.get(Integer.valueOf(i));
            if (key == null) {
                x6b.a(TAG, f04.JSON_KEY_RKE_IS_ENCRYPT, "mk is null");
                return null;
            }
            cipher.init(1, key);
            return w9k.a(w9k.a(new byte[]{(byte) i}, cipher.getIV()), cipher.doFinal(bArr));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public fkf() {
        this.a = new HashMap();
        this.b = 0;
        b();
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new a(), 6L, 6L, TimeUnit.HOURS);
    }
}
