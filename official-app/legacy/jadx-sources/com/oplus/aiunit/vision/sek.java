package com.oplus.aiunit.vision;

import android.content.res.ColorStateList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/sek;", "", "", "defaultColor", "disabledColor", "Landroid/content/res/ColorStateList;", "a", "", "[I", "EMPTY_STATE_SET", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class sek {

    @NotNull
    public static final sek INSTANCE = new sek();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final int[] EMPTY_STATE_SET = new int[0];

    @NotNull
    public final ColorStateList a(int defaultColor, int disabledColor) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, EMPTY_STATE_SET}, new int[]{disabledColor, defaultColor});
    }
}
