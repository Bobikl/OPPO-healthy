package com.heytap.health.device_data_sync.data_sync;

import androidx.lifecycle.LiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.OneTimeSport;
import com.oplus.aiunit.vision.xm3;
import com.oplus.aiunit.vision.xuf;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface IDataSyncService extends IProvider {
    void C1(int i, int... iArr);

    boolean N7(String str);

    LiveData<String> Q8(int i);

    void U2(int i, int i2, xm3<Integer> xm3Var);

    void V7(List<SleepCalibrationItem> list, xm3<Integer> xm3Var);

    void X5(List<SleepFixDataItem> list, xm3<Integer> xm3Var);

    String h(OneTimeSport oneTimeSport);

    int l(String str);

    LiveData<xuf<String>> l6(String str);

    OneTimeSport t(String str);

    LiveData<String> w2(int i, int i2);

    void w5(int i, int i2, xm3<Integer> xm3Var);

    int x(String str);

    void x3(int i);
}
