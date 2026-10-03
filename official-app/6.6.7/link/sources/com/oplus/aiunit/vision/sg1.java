package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/sg1;", "", "Companion", "a", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class sg1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.sg1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/sg1$a;", "", "Landroid/graphics/Bitmap;", "oldBm", "", "recycleOldBm", "a", "<init>", "()V", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bitmap a(@NotNull Bitmap oldBm, boolean recycleOldBm) {
            Intrinsics.checkNotNullParameter(oldBm, "oldBm");
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, -1.0f);
            matrix.postTranslate(vr3.UNSET, -oldBm.getHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(oldBm, 0, 0, oldBm.getWidth(), oldBm.getHeight(), matrix, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            if (recycleOldBm) {
                oldBm.recycle();
            }
            return bitmapCreateBitmap;
        }
    }
}
