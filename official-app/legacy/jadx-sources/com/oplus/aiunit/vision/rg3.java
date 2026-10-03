package com.oplus.aiunit.vision;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class rg3 {
    public static void a(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, str));
    }
}
