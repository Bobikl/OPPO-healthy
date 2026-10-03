package com.oplus.aiunit.vision;

import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/bx9;", "", "", "layoutWidth", "layoutHeight", "videoWidth", "videoHeight", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "b", "Lkotlin/Pair;", "a", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public interface bx9 {
    @NotNull
    Pair<Integer, Integer> a();

    @NotNull
    FrameLayout.LayoutParams b(int layoutWidth, int layoutHeight, int videoWidth, int videoHeight, @NotNull FrameLayout.LayoutParams layoutParams);
}
