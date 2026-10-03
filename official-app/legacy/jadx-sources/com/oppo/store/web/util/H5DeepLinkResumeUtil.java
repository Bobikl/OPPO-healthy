package com.oppo.store.web.util;

import android.app.Activity;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/oppo/store/web/util/H5DeepLinkResumeUtil;", "", "()V", "needToResumed", "", "getNeedToResumed", "()Z", "setNeedToResumed", "(Z)V", "orinUrl", "", "getOrinUrl", "()Ljava/lang/String;", "setOrinUrl", "(Ljava/lang/String;)V", "H5DeepLinkResume", "", "activity", "Landroid/app/Activity;", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class H5DeepLinkResumeUtil {
    private static boolean needToResumed;

    @NotNull
    public static final H5DeepLinkResumeUtil INSTANCE = new H5DeepLinkResumeUtil();

    @NotNull
    private static String orinUrl = "";

    private H5DeepLinkResumeUtil() {
    }

    public final void H5DeepLinkResume(@Nullable Activity activity) throws InterruptedException {
        if (!needToResumed || activity == null) {
            return;
        }
        HTAliasRouter.navigation$default(HTAliasRouter.INSTANCE.getInstance(), orinUrl, activity, null, null, null, 0, false, 124, null);
    }

    public final boolean getNeedToResumed() {
        return needToResumed;
    }

    @NotNull
    public final String getOrinUrl() {
        return orinUrl;
    }

    public final void setNeedToResumed(boolean z) {
        needToResumed = z;
    }

    public final void setOrinUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        orinUrl = str;
    }
}
