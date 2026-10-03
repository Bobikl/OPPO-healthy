package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.oplus.aiunit.core.FrameUnit;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/gf1;", "Lcom/oplus/aiunit/vision/qy7;", "Landroid/graphics/Bitmap;", "bitmap", "", "useShMem", "", "setValue", "shareBitmap", "Lcom/oplus/aiunit/vision/d0;", "aiContext", "<init>", "(Lcom/oplus/aiunit/vision/d0;)V", "Companion", "a", "aiunit.sdk.core_release"}, k = 1, mv = {1, 9, 0})
public class gf1 extends qy7 {

    @NotNull
    private static final String TAG = "BitmapInputSlot";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf1(@NotNull d0 aiContext) {
        super(aiContext);
        Intrinsics.checkNotNullParameter(aiContext, "aiContext");
    }

    public final int setValue(@NotNull Bitmap bitmap, boolean useShMem) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return setValue(bitmap, useShMem, false);
    }

    public final int setValue(@NotNull Bitmap bitmap, boolean useShMem, boolean shareBitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        cleanExistFrameUnit();
        if (useShMem) {
            setTargetBitmap(bitmap, Boolean.valueOf(shareBitmap));
        } else {
            addFrameUnit(new FrameUnit(bitmap, "input_0"));
        }
        return getErrorCode().value();
    }
}
