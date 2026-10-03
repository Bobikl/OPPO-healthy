package com.heytap.nearx.uikit.widget.keyboard.util;

import android.content.Context;
import com.heytap.nearx.uikit.R$bool;

/* JADX INFO: loaded from: classes18.dex */
public class ScreenConfigUtil {
    public static boolean isFoldScreen(Context context) {
        return context.getResources().getBoolean(R$bool.is_fold_screen);
    }

    public static boolean isPad(Context context) {
        return context.getResources().getBoolean(R$bool.is_pad);
    }
}
