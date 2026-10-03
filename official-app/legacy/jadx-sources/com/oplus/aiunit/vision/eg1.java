package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/eg1;", "", "Landroid/graphics/Bitmap;", "a", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class eg1 {
    public static final eg1 INSTANCE = new eg1();

    @NotNull
    public final Bitmap a() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Intrinsics.checkExpressionValueIsNotNull(bitmapCreateBitmap, "Bitmap.createBitmap(16, …or.TRANSPARENT)\n        }");
        return bitmapCreateBitmap;
    }
}
