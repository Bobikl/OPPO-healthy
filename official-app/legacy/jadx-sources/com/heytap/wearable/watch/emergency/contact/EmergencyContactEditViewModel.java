package com.heytap.wearable.watch.emergency.contact;

import androidx.lifecycle.LiveData;
import com.heytap.wearable.emergency.api.bean.EmergencyContact;
import com.heytap.wearable.watch.emergency.BaseEmergencyViewModel;
import com.oplus.aiunit.vision.yk6;

/* JADX INFO: loaded from: classes3.dex */
public class EmergencyContactEditViewModel extends BaseEmergencyViewModel {
    public LiveData<EmergencyContact> x() {
        return yk6.r().p();
    }

    public void y(EmergencyContact emergencyContact) {
        yk6.r().G(emergencyContact);
        yk6.r().D(emergencyContact);
    }
}
