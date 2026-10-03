package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.coui.appcompat.util.COUIContextUtil;
import com.coui.appcompat.util.COUIThemeOverlay;
import com.heytap.udeviceui.R$attr;
import com.heytap.udeviceui.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/vek;", "", "Landroid/content/Context;", "context", "", "c", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "attr", "a", "", "attrName", "defColor", "b", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class vek {

    @NotNull
    public static final vek INSTANCE = new vek();

    public final int a(@Nullable Context context, @NotNull Resources.Theme theme, int attr) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (context == null) {
            return -1;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
        COUIThemeOverlay.getInstance().applyThemeOverlays(contextThemeWrapper);
        return COUIContextUtil.getAttrColor(contextThemeWrapper, attr);
    }

    public final int b(Context context, String attrName, int defColor) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{context.getResources().getIdentifier(attrName, "attr", context.getPackageName())});
        int color = typedArrayObtainStyledAttributes.getColor(0, defColor);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public final int c(@NotNull Context context) {
        int iB;
        Intrinsics.checkNotNullParameter(context, "context");
        int color = context.getColor(R$color.udevice_default_theme_color);
        try {
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
            iB = a(context, theme, R$attr.couiTintControlNormal);
            Log.d("UDeviceThemeUtil", "get coui color: " + iB);
        } catch (Throwable th) {
            Log.e("UDeviceThemeUtil", "get attr color error!, " + th.getMessage());
            iB = 0;
        }
        if (iB == 0) {
            iB = b(context, "colorTintControlNormal", 0);
        }
        if (iB == 0) {
            iB = b(context, "nxTintControlNormal", 0);
        }
        if (iB != 0) {
            return iB;
        }
        Log.i("UDeviceThemeUtil", "set default color.");
        return color;
    }
}
