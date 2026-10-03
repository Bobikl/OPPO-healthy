package com.heytap.store.base.core.util;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"BUTTON", "", "FULLY_GESTURAL", "KEY_NAV_STATE", "", "NAVIGATION_MODE", "NAV_STATE_SWIPE_SIDE_GESTURE", "NAV_STATE_SWIPE_UP_GESTURE", "NAV_STATE_VIRTUAL_KEY", "isGestureNavMode", "", "context", "Landroid/content/Context;", "isKeyNavMode", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class NavigationUtilKt {
    private static final int BUTTON = 0;
    private static final int FULLY_GESTURAL = 2;

    @NotNull
    private static final String KEY_NAV_STATE = "hide_navigationbar_enable";

    @NotNull
    private static final String NAVIGATION_MODE = "navigation_mode";
    private static final int NAV_STATE_SWIPE_SIDE_GESTURE = 3;
    private static final int NAV_STATE_SWIPE_UP_GESTURE = 2;
    private static final int NAV_STATE_VIRTUAL_KEY = 0;

    public static final boolean isGestureNavMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT >= 31) {
            if (Settings.Secure.getInt(contentResolver, NAVIGATION_MODE, 0) == 2) {
                return true;
            }
        } else if (Settings.Secure.getInt(contentResolver, KEY_NAV_STATE, 0) == 2 || Settings.Secure.getInt(contentResolver, KEY_NAV_STATE, 0) == 3) {
            return true;
        }
        return false;
    }

    private static final boolean isKeyNavMode(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT >= 31) {
            if (Settings.Secure.getInt(contentResolver, NAVIGATION_MODE, 0) == 0) {
                return true;
            }
        } else if (Settings.Secure.getInt(contentResolver, KEY_NAV_STATE, 0) == 0) {
            return true;
        }
        return false;
    }
}
