package com.heytap.health.watchface.business.store.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.oplus.aiunit.vision.ltl;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J&\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/watchface/business/store/util/RegionCalcUtil;", "", "Landroid/graphics/Rect;", "rectA", "rectB", "d", "Landroid/graphics/Region;", "fgOpaqueRegion", "timeRect", "Lcom/heytap/health/watchface/business/store/util/RegionCalcUtil$OverlapCoverState;", "a", "", "maxOverlapDimensionRatio", "maxOverlapAreaRatio", "b", "Landroid/graphics/Bitmap;", "bmp", "", "alphaThreshold", "c", "", "TAG", "Ljava/lang/String;", "ALPHA_OPAQUE_THRESHOLD", "I", "<init>", "()V", "OverlapCoverState", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RegionCalcUtil {
    public static final int ALPHA_OPAQUE_THRESHOLD = 128;

    @NotNull
    public static final RegionCalcUtil INSTANCE = new RegionCalcUtil();

    @NotNull
    public static final String TAG = "RegionCalcUtil";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watchface/business/store/util/RegionCalcUtil$OverlapCoverState;", "", "(Ljava/lang/String;I)V", "NO_INTERSECT", "VALID", "EXCEEDS_LIMIT", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum OverlapCoverState {
        NO_INTERSECT,
        VALID,
        EXCEEDS_LIMIT
    }

    @NotNull
    public final OverlapCoverState a(@NotNull Region fgOpaqueRegion, @NotNull Rect timeRect) {
        Intrinsics.checkNotNullParameter(fgOpaqueRegion, "fgOpaqueRegion");
        Intrinsics.checkNotNullParameter(timeRect, "timeRect");
        return b(fgOpaqueRegion, timeRect, 0.5f, 0.3f);
    }

    @NotNull
    public final OverlapCoverState b(@NotNull Region fgOpaqueRegion, @NotNull Rect timeRect, float maxOverlapDimensionRatio, float maxOverlapAreaRatio) {
        long j2;
        Intrinsics.checkNotNullParameter(fgOpaqueRegion, "fgOpaqueRegion");
        Intrinsics.checkNotNullParameter(timeRect, "timeRect");
        Region region = new Region(timeRect);
        Region region2 = new Region(fgOpaqueRegion);
        if (!region2.op(region, Region.Op.INTERSECT) || region2.isEmpty()) {
            ltl.d(TAG, "no intersect between fg and timeRect=" + timeRect);
            return OverlapCoverState.NO_INTERSECT;
        }
        Rect bounds = region2.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "inter.bounds");
        ltl.d(TAG, "analyzeOverlap interBounds=" + bounds + " timeRect=" + timeRect + " maxOverlapDimensionRatio=" + maxOverlapDimensionRatio + " maxOverlapAreaRatio=" + maxOverlapAreaRatio);
        int iWidth = timeRect.width();
        int iHeight = timeRect.height();
        long j3 = ((long) iWidth) * 1 * ((long) iHeight);
        boolean z = iHeight > iWidth;
        int i = bounds.top;
        int iHeight2 = bounds.height();
        int[] iArr = new int[iHeight2];
        for (int i2 = 0; i2 < iHeight2; i2++) {
            iArr[i2] = Integer.MAX_VALUE;
        }
        int[] iArr2 = new int[iHeight2];
        for (int i3 = 0; i3 < iHeight2; i3++) {
            iArr2[i3] = Integer.MIN_VALUE;
        }
        RegionIterator regionIterator = new RegionIterator(region2);
        Rect rect = new Rect();
        while (regionIterator.next(rect)) {
            int i4 = rect.top - i;
            int i5 = rect.bottom - i;
            int i6 = i;
            int i7 = i4;
            while (i7 < i5) {
                int i8 = i5;
                int i9 = rect.left;
                RegionIterator regionIterator2 = regionIterator;
                if (i9 < iArr[i7]) {
                    iArr[i7] = i9;
                }
                int i10 = rect.right;
                if (i10 > iArr2[i7]) {
                    iArr2[i7] = i10;
                }
                i7++;
                i5 = i8;
                regionIterator = regionIterator2;
            }
            i = i6;
        }
        long j4 = 0;
        int i11 = 0;
        while (i11 < iHeight2) {
            int i12 = iArr2[i11];
            int i13 = iArr[i11];
            if (i12 > i13) {
                j4 += (long) (i12 - i13);
            }
            i11++;
            iHeight2 = iHeight2;
        }
        ltl.a(TAG, "overlapA=" + j4 + ", baseA=" + j3 + ", isVertical=" + z + ", bounds=" + bounds);
        if (z) {
            int iWidth2 = bounds.width();
            if (iWidth > 0) {
                float f = iWidth;
                j2 = j4;
                if (iWidth2 < f * maxOverlapDimensionRatio) {
                    ltl.d(TAG, "width less than " + maxOverlapDimensionRatio + " (vertical layout)");
                    return OverlapCoverState.VALID;
                }
            } else {
                j2 = j4;
            }
        } else {
            j2 = j4;
            int iHeight3 = bounds.height();
            if (iHeight > 0 && iHeight3 < iHeight * maxOverlapDimensionRatio) {
                ltl.d(TAG, "height less than " + maxOverlapDimensionRatio + " (horizontal layout)");
                return OverlapCoverState.VALID;
            }
        }
        if (j3 <= 0 || j2 >= j3 * maxOverlapAreaRatio) {
            ltl.i(TAG, "overlap exceeds threshold, overlapA=" + j2);
            return OverlapCoverState.EXCEEDS_LIMIT;
        }
        ltl.d(TAG, "area less than " + maxOverlapAreaRatio);
        return OverlapCoverState.VALID;
    }

    @NotNull
    public final Region c(@NotNull Bitmap bmp, int alphaThreshold) {
        Intrinsics.checkNotNullParameter(bmp, "bmp");
        int width = bmp.getWidth();
        int height = bmp.getHeight();
        int[] iArr = new int[width];
        Region region = new Region();
        region.setEmpty();
        for (int i = 0; i < height; i++) {
            bmp.getPixels(iArr, 0, width, 0, i, width, 1);
            int i2 = -1;
            for (int i3 = 0; i3 < width; i3++) {
                if (((iArr[i3] >>> 24) & 255) > alphaThreshold) {
                    if (i2 < 0) {
                        i2 = i3;
                    }
                } else if (i2 >= 0) {
                    region.op(new Rect(i2, i, i3, i + 1), Region.Op.UNION);
                    i2 = -1;
                }
            }
            if (i2 >= 0) {
                region.op(new Rect(i2, i, width, i + 1), Region.Op.UNION);
            }
        }
        return region;
    }

    @NotNull
    public final Rect d(@NotNull Rect rectA, @NotNull Rect rectB) {
        Intrinsics.checkNotNullParameter(rectA, "rectA");
        Intrinsics.checkNotNullParameter(rectB, "rectB");
        float fWidth = rectB.width() / 466.0f;
        float f = (rectA.left + rectA.right) / 2.0f;
        float f2 = (rectA.top + rectA.bottom) / 2.0f;
        float fWidth2 = (rectA.width() * fWidth) / 2.0f;
        float f3 = f - fWidth2;
        float fHeight = (rectA.height() * fWidth) / 2.0f;
        float f4 = f2 - fHeight;
        float f5 = f + fWidth2;
        float f6 = f2 + fHeight;
        float f7 = 2;
        float fCenterX = (rectB.centerX() - ((f3 + f5) / 2.0f)) - (((233.0f - rectA.left) - (rectA.width() / f7)) * fWidth);
        float fCenterY = (rectB.centerY() - ((f4 + f6) / 2.0f)) - (((233.0f - rectA.top) - (rectA.height() / f7)) * fWidth);
        return new Rect((int) (f3 + fCenterX), (int) (f4 + fCenterY), (int) (f5 + fCenterX), (int) (f6 + fCenterY));
    }
}
