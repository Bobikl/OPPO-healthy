package com.oplus.aiunit.vision;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/fh8;", "", "Landroid/view/View;", "view", "", "effectId", "type", "", "a", "LONG_VIBRATE", "I", "KEYBOARD_TOUCH_FEEDBACK", "GRANULAR_SHORT_VIBRATE", "SHORT_VIBRATE", "SHORT_TRIPLE_VIBRATE", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class fh8 {
    public static final int GRANULAR_SHORT_VIBRATE = 302;

    @NotNull
    public static final fh8 INSTANCE = new fh8();
    public static final int KEYBOARD_TOUCH_FEEDBACK = 301;
    public static final int LONG_VIBRATE = 300;
    public static final int SHORT_TRIPLE_VIBRATE = 304;
    public static final int SHORT_VIBRATE = 303;

    @JvmStatic
    public static final boolean a(@Nullable View view, int effectId, int type) {
        if (view == null) {
            return false;
        }
        return view.performHapticFeedback(effectId);
    }
}
