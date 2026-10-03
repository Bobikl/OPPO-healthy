package com.oplus.aiunit.vision;

import android.R;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.support.calendar.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public final class vj2 {
    public static final int UNSET_INT = Integer.MIN_VALUE;
    public static final int VIEW_STATE_ACCELERATED = 64;
    public static final int VIEW_STATE_ACTIVATED = 32;
    public static final int VIEW_STATE_DRAG_CAN_ACCEPT = 256;
    public static final int VIEW_STATE_DRAG_HOVERED = 512;
    public static final int VIEW_STATE_ENABLED = 8;
    public static final int VIEW_STATE_FOCUSED = 4;
    public static final int VIEW_STATE_HOVERED = 128;
    public static final int VIEW_STATE_PRESSED = 16;
    public static final int VIEW_STATE_SELECTED = 2;
    public static final int VIEW_STATE_WINDOW_FOCUSED = 1;
    public static final int[][] a;
    public static final int[] b;

    static {
        int[] iArr = {R.attr.state_window_focused, 1, 16842913, 2, 16842908, 4, 16842910, 8, 16842919, 16, R.attr.state_activated, 32, R.attr.state_accelerated, 64, 16843623, 128, R.attr.state_drag_can_accept, 256, R.attr.state_drag_hovered, 512};
        b = iArr;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            int[] iArr3 = R$styleable.ViewDrawableStatesCompat;
            if (i >= iArr3.length) {
                break;
            }
            int i2 = iArr3[i];
            int i3 = 0;
            while (true) {
                int[] iArr4 = b;
                if (i3 < iArr4.length) {
                    if (iArr4[i3] == i2) {
                        int i4 = i * 2;
                        iArr2[i4] = i2;
                        iArr2[i4 + 1] = iArr4[i3 + 1];
                    }
                    i3 += 2;
                }
            }
            i++;
        }
        a = new int[1 << (b.length / 2)][];
        for (int i5 = 0; i5 < a.length; i5++) {
            int[] iArr5 = new int[Integer.bitCount(i5)];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7 += 2) {
                if ((iArr2[i7 + 1] & i5) != 0) {
                    iArr5[i6] = iArr2[i7];
                    i6++;
                }
            }
            a[i5] = iArr5;
        }
    }

    public static int a(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static long b(long j2, long j3, long j4) {
        if (j2 < j3) {
            return j3;
        }
        return j2 > j4 ? j4 : j2;
    }

    public static int[] c(int i) {
        int[][] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        throw new IllegalArgumentException("Invalid state set mask");
    }

    public static boolean d(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }
}
