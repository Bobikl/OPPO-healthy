package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/je3;", "Lcom/oplus/aiunit/vision/qy7;", "", "text", "", "b", "Landroid/graphics/Bitmap;", "bitmap", "a", "Lcom/oplus/aiunit/vision/d0;", "context", "<init>", "(Lcom/oplus/aiunit/vision/d0;)V", "Companion", "aiunit.sdk.healthClassify_release"}, k = 1, mv = {1, 9, 0})
public final class je3 extends qy7 {
    public static final String PARAM_KEY_HEALTH_FILE_CLASSIFY_TEXT = "health_file_classify_text";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je3(d0 context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            setTargetBitmap(bitmap, Boolean.FALSE);
        }
    }

    public final void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        setCustomParam(PARAM_KEY_HEALTH_FILE_CLASSIFY_TEXT, text);
    }
}
