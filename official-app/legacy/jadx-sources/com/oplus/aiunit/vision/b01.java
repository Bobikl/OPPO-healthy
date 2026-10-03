package com.oplus.aiunit.vision;

import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/b01;", "Lcom/github/mikephil/charting/buffer/BarBuffer;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;", "data", "", "feed", "", "a", UserInfo.SEX_FEMALE, "chartMin", "", "size", "dataSetCount", "", "containsStacks", "<init>", "(FIIZ)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class b01 extends BarBuffer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float chartMin;

    public b01(float f, int i, int i2, boolean z) {
        super(i, i2, z);
        this.chartMin = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.BarBuffer, com.github.mikephil.charting.buffer.AbstractBuffer
    public void feed(@NotNull IBarDataSet data) {
        float f;
        float f2;
        float fAbs;
        float fAbs2;
        float f3;
        Intrinsics.checkNotNullParameter(data, "data");
        float entryCount = data.getEntryCount() * this.phaseX;
        float f4 = this.mBarWidth / 2.0f;
        for (int i = 0; i < entryCount; i++) {
            BarEntry barEntry = (BarEntry) data.getEntryForIndex(i);
            if (barEntry != null) {
                float x = barEntry.getX();
                float y = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                float f5 = 0.0f;
                if (!this.mContainsStacks || yVals == null) {
                    float f6 = x - f4;
                    float f7 = x + f4;
                    if (this.mInverted) {
                        float f8 = this.chartMin;
                        f2 = y >= f8 ? y : f8;
                        if (y > f8) {
                            y = f8;
                        }
                        f = 0.0f;
                    } else {
                        float f9 = this.chartMin;
                        float f10 = y >= f9 ? y : f9;
                        if (y > f9) {
                            y = f9;
                        }
                        f = 0.0f;
                        float f11 = f10;
                        f2 = y;
                        y = f11;
                    }
                    if (y > f) {
                        y *= this.phaseY;
                    } else {
                        f2 *= this.phaseY;
                    }
                    addBar(f6, y, f7, f2);
                } else {
                    float f12 = -barEntry.getNegativeSum();
                    int length = yVals.length;
                    float f13 = 0.0f;
                    int i2 = 0;
                    while (i2 < length) {
                        float f14 = yVals[i2];
                        if (f14 == f5) {
                            if (!(f13 == f5)) {
                                if (!(f12 == f5)) {
                                    if (f14 >= f5) {
                                        fAbs = f14 + f13;
                                        fAbs2 = f12;
                                        f12 = f13;
                                        f13 = fAbs;
                                    } else {
                                        fAbs = Math.abs(f14) + f12;
                                        fAbs2 = Math.abs(f14) + f12;
                                    }
                                }
                            }
                            fAbs = f14;
                            fAbs2 = f12;
                            f12 = fAbs;
                        } else if (f14 >= f5) {
                            fAbs = f14 + f13;
                            fAbs2 = f12;
                            f12 = f13;
                            f13 = fAbs;
                        } else {
                            fAbs = Math.abs(f14) + f12;
                            fAbs2 = Math.abs(f14) + f12;
                        }
                        float f15 = x - f4;
                        float f16 = x + f4;
                        if (this.mInverted) {
                            f3 = f12 >= fAbs ? f12 : fAbs;
                            if (f12 > fAbs) {
                                f12 = fAbs;
                            }
                        } else {
                            float f17 = f12 >= fAbs ? f12 : fAbs;
                            if (f12 > fAbs) {
                                f12 = fAbs;
                            }
                            float f18 = f17;
                            f3 = f12;
                            f12 = f18;
                        }
                        float f19 = this.phaseY;
                        addBar(f15, f12 * f19, f16, f3 * f19);
                        i2++;
                        f12 = fAbs2;
                        f5 = 0.0f;
                    }
                }
            }
        }
        reset();
    }
}
