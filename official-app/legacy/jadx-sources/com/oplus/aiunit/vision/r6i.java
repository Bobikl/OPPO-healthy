package com.oplus.aiunit.vision;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class r6i extends ValueFormatter {
    public List<i6i> a;

    public r6i(List<i6i> list) {
        this.a = list;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public String getAxisLabel(float f, AxisBase axisBase) {
        List<i6i> list = this.a;
        if (list == null || list.isEmpty()) {
            return super.getAxisLabel(f, axisBase);
        }
        int i = (int) f;
        return (i < 0 || i >= this.a.size()) ? super.getAxisLabel(f, axisBase) : String.valueOf(this.a.get(i).b());
    }
}
