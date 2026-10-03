package com.heytap.nearx.uikit.widget.calendar;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public final class NearPickerMathUtils {
    public static final int VIEW_STATE_ACCELERATED = 64;
    public static final int VIEW_STATE_ACTIVATED = 32;
    public static final int VIEW_STATE_DRAG_CAN_ACCEPT = 256;
    public static final int VIEW_STATE_DRAG_HOVERED = 512;
    public static final int VIEW_STATE_ENABLED = 8;
    public static final int VIEW_STATE_FOCUSED = 4;
    public static final int VIEW_STATE_HOVERED = 128;
    static final int[] VIEW_STATE_IDS;
    public static final int VIEW_STATE_PRESSED = 16;
    public static final int VIEW_STATE_SELECTED = 2;
    private static final int[][] VIEW_STATE_SETS;
    public static final int VIEW_STATE_WINDOW_FOCUSED = 1;

    static {
        int[] iArr = {R.attr.state_window_focused, 1, 16842913, 2, 16842908, 4, 16842910, 8, 16842919, 16, R.attr.state_activated, 32, R.attr.state_accelerated, 64, 16843623, 128, R.attr.state_drag_can_accept, 256, R.attr.state_drag_hovered, 512};
        VIEW_STATE_IDS = iArr;
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
                int[] iArr4 = VIEW_STATE_IDS;
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
        VIEW_STATE_SETS = new int[1 << (VIEW_STATE_IDS.length / 2)][];
        for (int i5 = 0; i5 < VIEW_STATE_SETS.length; i5++) {
            int[] iArr5 = new int[Integer.bitCount(i5)];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7 += 2) {
                if ((iArr2[i7 + 1] & i5) != 0) {
                    iArr5[i6] = iArr2[i7];
                    i6++;
                }
            }
            VIEW_STATE_SETS[i5] = iArr5;
        }
    }

    private NearPickerMathUtils() {
    }

    public static float constrain(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static float dist(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float distanceToFurthestCorner(float f, float f2, float f3, float f4, float f5, float f6) {
        return max(dist(f, f2, f3, f4), dist(f, f2, f5, f4), dist(f, f2, f5, f6), dist(f, f2, f3, f6));
    }

    public static float dpToPx(@NonNull Context context, @Dimension(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float floorMod(float f, int i) {
        float f2 = i;
        int i2 = (int) (f / f2);
        if (Math.signum(f) * f2 < 0.0f && i2 * i != f) {
            i2--;
        }
        return f - (i2 * i);
    }

    public static boolean geq(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    public static int[] getViewState(int i) {
        int[][] iArr = VIEW_STATE_SETS;
        if (i < iArr.length) {
            return iArr[i];
        }
        throw new IllegalArgumentException("Invalid state set mask");
    }

    public static boolean isLayoutRtl(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static float lerp(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static float lerpDeg(float f, float f2, float f3) {
        return (((((f2 - f) + 180.0f) % 360.0f) - 180.0f) * f3) + f;
    }

    private static float max(float f, float f2, float f3, float f4) {
        if (f > f2 && f > f3 && f > f4) {
            return f;
        }
        if (f2 <= f3 || f2 <= f4) {
            return f3 > f4 ? f3 : f4;
        }
        return f2;
    }

    public static int constrain(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static int floorMod(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    public static long constrain(long j2, long j3, long j4) {
        if (j2 < j3) {
            return j3;
        }
        return j2 > j4 ? j4 : j2;
    }
}
