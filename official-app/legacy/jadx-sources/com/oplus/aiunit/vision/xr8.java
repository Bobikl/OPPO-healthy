package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.LineDataSet;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/xr8;", "Lcom/github/mikephil/charting/data/CombinedData;", "Lcom/github/mikephil/charting/data/LineDataSet;", "a", "Lcom/github/mikephil/charting/data/LineDataSet;", "getLineDataSet", "()Lcom/github/mikephil/charting/data/LineDataSet;", "setLineDataSet", "(Lcom/github/mikephil/charting/data/LineDataSet;)V", "lineDataSet", "Lcom/github/mikephil/charting/data/CandleDataSet;", "b", "Lcom/github/mikephil/charting/data/CandleDataSet;", "getCandleDataSet", "()Lcom/github/mikephil/charting/data/CandleDataSet;", "setCandleDataSet", "(Lcom/github/mikephil/charting/data/CandleDataSet;)V", "candleDataSet", "<init>", "(Lcom/github/mikephil/charting/data/LineDataSet;Lcom/github/mikephil/charting/data/CandleDataSet;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class xr8 extends CombinedData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public LineDataSet lineDataSet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public CandleDataSet candleDataSet;

    public /* synthetic */ xr8(LineDataSet lineDataSet, CandleDataSet candleDataSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lineDataSet, (i & 2) != 0 ? null : candleDataSet);
    }

    public xr8(@Nullable LineDataSet lineDataSet, @Nullable CandleDataSet candleDataSet) {
        this.lineDataSet = lineDataSet;
        this.candleDataSet = candleDataSet;
    }
}
