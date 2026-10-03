package com.oplusos.vfxmodelviewer.utils;

import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\u001a!\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0014\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0015\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"FOUR_PI", "", "FPI", "HALF_PI", "INV_FOUR_PI", "INV_PI", "INV_TWO_PI", "TWO_PI", "clamp", "x", ParserTag.TAG_MIN, ParserTag.TAG_MAX, "degrees", "v", "fract", "mix", "a", "b", "pow", "y", "radians", "saturate", "sqr", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ScalarKt {
    public static final float FOUR_PI = 12.566371f;
    public static final float FPI = 3.1415927f;
    public static final float HALF_PI = 1.5707964f;
    public static final float INV_FOUR_PI = 0.07957747f;
    public static final float INV_PI = 0.31830987f;
    public static final float INV_TWO_PI = 0.15915494f;
    public static final float TWO_PI = 6.2831855f;

    public static final float clamp(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static final float degrees(float f) {
        return f * 57.295776f;
    }

    public static final float fract(float f) {
        return f % 1;
    }

    public static final float mix(float f, float f2, float f3) {
        return (f * (1.0f - f3)) + (f2 * f3);
    }

    public static final float pow(float f, float f2) {
        return (float) StrictMath.pow(f, f2);
    }

    public static final float radians(float f) {
        return f * 0.017453292f;
    }

    public static final float saturate(float f) {
        float f2 = vr3.UNSET;
        if (f >= vr3.UNSET) {
            f2 = 1.0f;
            if (f <= 1.0f) {
                return f;
            }
        }
        return f2;
    }

    public static final float sqr(float f) {
        return f * f;
    }
}
