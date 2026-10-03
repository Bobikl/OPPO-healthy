package com.heytap.store.business.component.utils;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"parseColorSafely", "", "color", "", "defaultColor", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ColorParseUtilKt {
    public static final int parseColorSafely(@Nullable String str, @ColorInt int i) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
