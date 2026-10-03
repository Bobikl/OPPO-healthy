package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/hxk;", "Lcom/oplus/aiunit/vision/km9;", "", "z4", "Landroid/graphics/Bitmap;", "bitmap", "e3", "", "enable", "H", "j", "A3", "isSuccess", "changed", "c", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface hxk extends km9 {
    void A3(boolean enable);

    void H(boolean enable);

    void c(boolean isSuccess, boolean changed);

    void e3(@Nullable Bitmap bitmap);

    void j(@Nullable Bitmap bitmap);

    void z4();
}
