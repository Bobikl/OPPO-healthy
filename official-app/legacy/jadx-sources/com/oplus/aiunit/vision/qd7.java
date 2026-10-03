package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class qd7 {
    public static String a(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(File.separator)) == -1) ? str : str.substring(iLastIndexOf + 1);
    }
}
