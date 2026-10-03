package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes13.dex */
public class tm2 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final int[] DISABLED_STATE_SET = {-16842910};
    public static final int[] FOCUSED_STATE_SET = {16842908};
    public static final int[] ACTIVATED_STATE_SET = {R.attr.state_activated};
    public static final int[] PRESSED_STATE_SET = {16842919};
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int[] SELECTED_STATE_SET = {16842913};
    public static final int[] NOT_PRESSED_OR_FOCUSED_STATE_SET = {-16842919, -16842908};
    public static final int[] b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17056c = new int[1];

    public static int a(Context context, int i) {
        int[] iArr = f17056c;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
