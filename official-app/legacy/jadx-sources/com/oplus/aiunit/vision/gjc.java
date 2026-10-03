package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR*\u0010+\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u00101\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010.R\u001a\u00107\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010.R\u001a\u0010:\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010.¨\u0006<"}, d2 = {"Lcom/oplus/aiunit/vision/gjc;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "themeType", "", "a", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "THEME_TYPE_UNKNOWN", "I", "THEME_TYPE_THEME1", "THEME_TYPE_THEME2", "THEME_TYPE_THEME3", "THEME_TYPE_THEME4", "THEME_TYPE_THEME5", "THEME_FIVE_LEVEL_UP", "i", "getThemeType", "()I", "setThemeType", "(I)V", "j", "getThemeResId", "setThemeResId", "themeResId", "", "", MapSchema.FIELD_NAME_KEY, "[Ljava/lang/String;", "getPackageNames", "()[Ljava/lang/String;", "setPackageNames", "([Ljava/lang/String;)V", "packageNames", "", "b", "()Z", "isTheme1$annotations", "()V", "isTheme1", "c", "isTheme2$annotations", "isTheme2", "d", "isTheme3$annotations", "isTheme3", MapSchema.FIELD_NAME_ENTRY, "isTheme4$annotations", "isTheme4", "<init>", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class gjc implements Application.ActivityLifecycleCallbacks {
    public static final int THEME_FIVE_LEVEL_UP = 1;
    public static final int THEME_TYPE_THEME1 = 1;
    public static final int THEME_TYPE_THEME2 = 2;
    public static final int THEME_TYPE_THEME3 = 3;
    public static final int THEME_TYPE_THEME4 = 4;
    public static final int THEME_TYPE_THEME5 = 5;
    public static final int THEME_TYPE_UNKNOWN = -1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public static String[] packageNames;

    @NotNull
    public static final gjc INSTANCE = new gjc();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static int themeType = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static int themeResId = -1;

    public static final boolean b() {
        return themeType == 1;
    }

    public static final boolean c() {
        return themeType == 2;
    }

    public static final boolean d() {
        return themeType == 3;
    }

    public static final boolean e() {
        return themeType == 4;
    }

    public final void a(Activity activity, int themeType2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        int themeResource;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = 0;
        try {
            themeResource = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).getThemeResource();
        } catch (PackageManager.NameNotFoundException e2) {
            fjc.c(e2);
            themeResource = -1;
        }
        int i2 = themeResId;
        if (themeResource != i2) {
            String[] strArr = packageNames;
            if (strArr != null) {
                Intrinsics.checkNotNull(strArr);
                int length = strArr.length;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    if (Intrinsics.areEqual(activity.getPackageName(), str)) {
                        activity.setTheme(themeResId);
                    }
                }
            } else {
                activity.setTheme(i2);
            }
        }
        a(activity, themeType);
        if (themeResource != -1) {
            activity.getTheme().applyStyle(themeResource, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
