package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import java.util.Base64;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class hz0 {
    @SuppressLint({"NewApi"})
    public static byte[] a(String str) {
        return Base64.getDecoder().decode(str);
    }
}
