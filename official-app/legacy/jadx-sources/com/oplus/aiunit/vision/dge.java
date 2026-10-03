package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes15.dex */
public class dge {
    public static boolean a(@NonNull Context context, @NonNull @Size(min = 1) String... strArr) {
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
