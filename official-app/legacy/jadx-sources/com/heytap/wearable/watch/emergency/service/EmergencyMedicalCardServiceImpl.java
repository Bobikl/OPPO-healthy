package com.heytap.wearable.watch.emergency.service;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.wearable.emergency.api.bean.MedicalCard;
import com.heytap.wearable.emergency.api.emergency.IEmergencyMedicalCardService;
import com.heytap.wearable.watch.emergency.EmergencySpHelper;
import com.oplus.aiunit.vision.sk6;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/emergency_impl/EmergencyMedicalCardService")
public class EmergencyMedicalCardServiceImpl implements IEmergencyMedicalCardService {
    @Override // com.heytap.wearable.emergency.api.emergency.IEmergencyMedicalCardService
    public void A4(String str, MedicalCard medicalCard) {
        EmergencySpHelper.saveEmergencyMedicalCardInfo(str, medicalCard);
    }

    @Override // com.heytap.wearable.emergency.api.emergency.IEmergencyMedicalCardService
    public MessageEvent F8() {
        return sk6.b();
    }

    @Override // com.heytap.wearable.emergency.api.emergency.IEmergencyMedicalCardService
    public MessageEvent Y7(MedicalCard medicalCard) {
        return sk6.f(medicalCard);
    }

    @Override // com.heytap.wearable.emergency.api.emergency.IEmergencyMedicalCardService
    public MedicalCard a7(String str) {
        return EmergencySpHelper.getEmergencyMedicalCard(str);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@NonNull Context context) {
    }
}
