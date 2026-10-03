package com.google.android.play.core.splitinstall;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SplitInstallManagerFactory {
    @NonNull
    public static SplitInstallManager create(@NonNull Context context) {
        return new a(context);
    }
}
