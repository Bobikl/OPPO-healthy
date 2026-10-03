package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.TypedArray;
import com.heytap.health.watchface.R$array;

/* JADX INFO: loaded from: classes19.dex */
public class mg8 {
    public static final int COLOR_SELECT_INDEX = 1;
    public static final int LINE_SELECT_INDEX = 0;
    public static final int SHAPE_SELECT_INDEX = 0;
    public String[] a;
    public String[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f14059c;
    public int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f14060e;
    public int[] f;

    public static final class a {
        public static final mg8 a = new mg8();
    }

    public static mg8 j() {
        return a.a;
    }

    public String[] a() {
        return new String[]{this.a[1], this.b[1]};
    }

    public og8 b() {
        og8 og8Var = new og8();
        og8Var.d(this.d[0] == 1);
        og8Var.f(this.f14060e[0]);
        og8Var.e(this.f[0]);
        return og8Var;
    }

    public String[] c() {
        return this.b;
    }

    public String[] d() {
        return this.a;
    }

    public int[] e() {
        return this.d;
    }

    public int[] f() {
        return this.f;
    }

    public int[] g() {
        return this.f14060e;
    }

    public int[] h() {
        return this.f14059c;
    }

    public int[] i(Context context, int i) {
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    public void k(Context context) {
        this.a = context.getResources().getStringArray(R$array.watch_face_text_editor_colors_start);
        this.b = context.getResources().getStringArray(R$array.watch_face_text_editor_colors_end);
        this.f14059c = i(context, R$array.watch_face_hand_paint_shape_style);
        this.d = context.getResources().getIntArray(R$array.watch_face_hand_paint_shape_mirror);
        this.f14060e = context.getResources().getIntArray(R$array.watch_face_hand_paint_shape_spiral);
        this.f = context.getResources().getIntArray(R$array.watch_face_hand_paint_shape_rotations);
    }

    public mg8() {
        k(b78.a());
    }
}
