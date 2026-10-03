package com.oplus.aiunit.vision;

import com.heytap.databaseengine.apiv3.data.DataPoint;
import com.heytap.databaseengine.apiv3.data.DataSet;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class abk {
    public final IDataReadResultListener a;
    public final List<DataSet> b;

    public abk(IDataReadResultListener iDataReadResultListener, List<DataSet> list) {
        this.a = iDataReadResultListener;
        this.b = list;
    }

    public void a(int i) {
        if (hz.b(this.b)) {
            g0b.c(this.a, this.b, 0, 2);
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            DataSet dataSet = this.b.get(i2);
            g0b.c(this.a, Collections.singletonList(DataSet.builder(dataSet.getDataType()).c()), 0, 4);
            b(dataSet, i);
        }
        g0b.c(this.a, new ArrayList(), 0, 2);
    }

    public final void b(DataSet dataSet, int i) {
        List<DataPoint> dataPoints = dataSet.getDataPoints();
        if (hz.b(dataPoints)) {
            return;
        }
        int i2 = 0;
        while (i2 < dataPoints.size()) {
            int i3 = i2 + i;
            g0b.c(this.a, Collections.singletonList(DataSet.builder(dataSet.getDataType()).b(dataPoints.subList(i2, Math.min(i3, dataPoints.size()))).c()), 0, 3);
            i2 = i3;
        }
    }
}
