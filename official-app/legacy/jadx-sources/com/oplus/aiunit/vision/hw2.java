package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.OrientationEventListener;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/hw2;", "Landroid/view/OrientationEventListener;", "", "orientation", "", "onOrientationChanged", "a", "lastOrientation", "b", "I", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "coui-support-scanview_release"}, k = 1, mv = {1, 8, 0})
public abstract class hw2 extends OrientationEventListener {
    public static final int ANGLE_0 = 0;
    public static final int ANGLE_180 = 180;
    public static final int ANGLE_270 = 270;
    public static final int ANGLE_30 = 30;
    public static final int ANGLE_360 = 360;
    public static final int ANGLE_45 = 45;
    public static final int ANGLE_60 = 60;
    public static final int ANGLE_90 = 90;
    public static final int ANGLE_OFFSET = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int lastOrientation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.lastOrientation = -1;
    }

    public abstract void a(int orientation);

    public final int b(int orientation, int lastOrientation) {
        boolean z = true;
        if (lastOrientation != -1) {
            int iAbs = Math.abs(orientation - lastOrientation);
            if (RangesKt___RangesKt.coerceAtMost(iAbs, 360 - iAbs) < 65) {
                z = false;
            }
        }
        return z ? (((orientation + 30) / 90) * 90) % 360 : lastOrientation;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int orientation) {
        int iB;
        if (orientation == -1 || this.lastOrientation == (iB = b(orientation, this.lastOrientation))) {
            return;
        }
        this.lastOrientation = iB;
        a(iB);
    }
}
