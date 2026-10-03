package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.oplusos.sau.common.utils.SauAarConstants;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class m2g {
    public static void a(Context context, Intent intent, @Nullable String str) throws ActivityNotFoundException {
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(SauAarConstants.L);
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
            intent.addFlags(SauAarConstants.L);
        }
        context.startActivity(intent);
        return true;
    }
}
