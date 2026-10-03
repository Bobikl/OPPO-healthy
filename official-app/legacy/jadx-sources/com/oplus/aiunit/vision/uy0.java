package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import java.util.Base64;

/* JADX INFO: loaded from: classes19.dex */
public class uy0 {
    @SuppressLint({"NewApi"})
    public static byte[] a(String str) {
        return Base64.getDecoder().decode(str);
    }
}
