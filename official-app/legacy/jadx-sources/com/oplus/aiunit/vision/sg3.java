package com.oplus.aiunit.vision;

import android.content.ClipData;
import android.content.ClipboardManager;

/* JADX INFO: loaded from: classes15.dex */
public class sg3 {
    public static void a(String str) {
        ((ClipboardManager) b78.b().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("health", str));
    }
}
