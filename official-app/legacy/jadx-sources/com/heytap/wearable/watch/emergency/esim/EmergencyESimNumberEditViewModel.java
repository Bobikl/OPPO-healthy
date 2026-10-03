package com.heytap.wearable.watch.emergency.esim;

import androidx.lifecycle.LiveData;
import com.heytap.wearable.watch.emergency.BaseEmergencyViewModel;
import com.oplus.aiunit.vision.yk6;

/* JADX INFO: loaded from: classes3.dex */
public class EmergencyESimNumberEditViewModel extends BaseEmergencyViewModel {
    public LiveData<String> x() {
        return yk6.r().q();
    }

    public void y(String str) {
        yk6.r().E(str);
    }
}
