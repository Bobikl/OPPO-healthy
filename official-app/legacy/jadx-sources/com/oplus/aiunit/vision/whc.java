package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.nearx.uikit.R$string;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/whc;", "", "Landroid/content/Context;", "context", "Landroid/util/DisplayMetrics;", MapSchema.FIELD_NAME_ENTRY, "", "d", "", "dpValue", "c", "dp", "b", b2n.g, b2n.f, "", "f", "i", "a", UserInfo.SEX_FEMALE, "getDENSITY", "()F", "DENSITY", "SMALL_WINDOW_TYPE", "I", "NORMAL_WINDOW_TYPE", "MIDDLE_WINDOW_TYPE", "LARGE_WINDOW_TYPE", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class whc {
    public static final int LARGE_WINDOW_TYPE = 3;
    public static final int MIDDLE_WINDOW_TYPE = 2;
    public static final int NORMAL_WINDOW_TYPE = 1;
    public static final int SMALL_WINDOW_TYPE = 0;

    @NotNull
    public static final whc INSTANCE = new whc();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final float DENSITY = Resources.getSystem().getDisplayMetrics().density;

    @JvmStatic
    public static final int b(@NotNull Context context, int dp) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (((double) (d(context) * dp)) + 0.5d);
    }

    @JvmStatic
    public static final int c(int dpValue) {
        return (int) ((dpValue * DENSITY) + 0.5f);
    }

    @JvmStatic
    public static final float d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }

    @JvmStatic
    @NotNull
    public static final DisplayMetrics e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "context.resources.displayMetrics");
        return displayMetrics;
    }

    @JvmStatic
    @NotNull
    public static final int[] f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.a(context);
    }

    @JvmStatic
    public static final int g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return e(context).heightPixels;
    }

    @JvmStatic
    public static final int h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return e(context).widthPixels;
    }

    @JvmStatic
    public static final int i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getResources().getString(R$string.nx_responsive_ui_window_type);
        if (Intrinsics.areEqual(string, context.getResources().getString(R$string.nx_small_window_name))) {
            return 0;
        }
        if (Intrinsics.areEqual(string, context.getResources().getString(R$string.nx_middle_window_name))) {
            return 2;
        }
        if (Intrinsics.areEqual(string, context.getResources().getString(R$string.nx_large_window_name))) {
            return 3;
        }
        Intrinsics.areEqual(string, context.getResources().getString(R$string.nx_normal_window_name));
        return 1;
    }

    public final int[] a(Context context) {
        int[] iArr = new int[2];
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int iIntValue = displayMetrics.widthPixels;
        int iIntValue2 = displayMetrics.heightPixels;
        try {
            Object objInvoke = Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0]);
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            iIntValue = ((Integer) objInvoke).intValue();
            Object objInvoke2 = Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0]);
            if (objInvoke2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            iIntValue2 = ((Integer) objInvoke2).intValue();
            try {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                iIntValue = point.x;
                iIntValue2 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = iIntValue;
            iArr[1] = iIntValue2;
            return iArr;
        } catch (Exception unused2) {
        }
    }
}
