package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class jzf {
    public static void a(Context context, Intent intent, @Nullable String str) throws ActivityNotFoundException {
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static boolean b(Context context, Intent intent, @Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        if (intent.resolveActivity(context.getApplicationContext().getPackageManager()) == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        return true;
    }
}
