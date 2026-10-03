package com.heytap.wearable.emergency.api.emergency;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.wearable.emergency.api.bean.MedicalCard;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface IEmergencyMedicalCardService extends IProvider {
    void A4(String str, MedicalCard medicalCard);

    MessageEvent F8();

    MessageEvent Y7(MedicalCard medicalCard);

    MedicalCard a7(String str);
}
