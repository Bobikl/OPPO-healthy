package com.oplus.channel.client.utils;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TAG", "", "sIsDebug", "", "isAppDebugChannelClient", "syncIsDebugChannelClient", "", "context", "Landroid/content/Context;", "client_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class UtilsKt {

    @NotNull
    private static final String TAG = "Utils";
    private static boolean sIsDebug;

    public static final boolean isAppDebugChannelClient() {
        return sIsDebug;
    }

    public static final void syncIsDebugChannelClient(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
        sIsDebug = z;
        LogUtil.i(TAG, Intrinsics.stringPlus("Utils sIsDebug sync ret: ", Boolean.valueOf(z)));
    }
}
