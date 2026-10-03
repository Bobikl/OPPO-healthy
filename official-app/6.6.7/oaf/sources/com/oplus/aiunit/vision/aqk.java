package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/aqk;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "tagetPackage", "", "a", "PACKAGE_ASSISTANTSCREEN", "Ljava/lang/String;", "PACKAGE_SYSTEMUI", "PACKAGE_LAUNCHER", "PACKAGE_TEST", "PRES_ROVIDER", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class aqk {

    @NotNull
    public static final aqk INSTANCE = new aqk();

    @NotNull
    public static final String PACKAGE_ASSISTANTSCREEN = "com.coloros.assistantscreen";

    @NotNull
    public static final String PACKAGE_LAUNCHER = "com.android.launcher";

    @NotNull
    public static final String PACKAGE_SYSTEMUI = "com.android.systemui";

    @NotNull
    public static final String PACKAGE_TEST = "com.example.umstestclient";

    @NotNull
    public static final String PRES_ROVIDER = "com.oplus.pantanal.ums.ResProvider";

    @JvmStatic
    public static final void a(@NotNull Context context, @NotNull Uri uri, @NotNull String tagetPackage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(tagetPackage, "tagetPackage");
        context.grantUriPermission(tagetPackage, uri, 193);
    }
}
