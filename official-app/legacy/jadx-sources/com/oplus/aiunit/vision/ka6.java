package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.github.mikephil.charting.data.Entry;
import com.heytap.health.EcgProcessHelper;
import com.heytap.health.EcgResult;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ka6 {
    public static final String TAG = "ECGRecordProcessor";

    public static class a {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13212c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.f13212c = i3;
        }

        @NonNull
        public String toString() {
            return "modeFlag:" + this.a + ", filterFlag:" + this.b + ", processFlag:" + this.f13212c;
        }
    }

    public static a a() {
        int i = 0;
        boolean zR = v9g.x(v9g.ECG_SETTING_TABLE).r(v9g.LOW_FREQ_SWITCH_KEY, false);
        boolean zR2 = v9g.x(v9g.ECG_SETTING_TABLE).r(v9g.POWER_FREQ_FILTER_50_KEY, false);
        boolean zR3 = v9g.x(v9g.ECG_SETTING_TABLE).r(v9g.POWER_FREQ_FILTER_60_KEY, false);
        int iZ = v9g.w().z(v9g.ECG_MEASURE_TYPE, 0);
        int i2 = zR ? 2 : 1;
        if (iZ == 0) {
            i2 = 1;
        }
        if (!zR2 || !zR3) {
            if (zR2 || !zR3) {
                i = (!zR2 || zR3) ? 3 : 2;
            } else {
                i = 1;
            }
        }
        return new a(iZ, i2, i);
    }

    public static synchronized void b(List<Entry> list, int i, int i2, float f, int i3) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = (int) list.get(i4).getY();
        }
        int[] iArr2 = new int[size];
        a aVarA = a();
        StringBuilder sb = new StringBuilder();
        sb.append("process status:");
        sb.append(aVarA);
        EcgProcessHelper.offline_QRSDet_process(iArr, iArr2, new int[]{i3 + 1}, size, i, aVarA.a, aVarA.b, aVarA.f13212c, new EcgResult(i2, 0, 0));
        for (int i5 = 0; i5 < size; i5++) {
            list.get(i5).setY(iArr2[i5] / f);
        }
    }
}
