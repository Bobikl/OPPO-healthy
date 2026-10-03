package com.oplus.aiunit.vision;

import com.heytap.health.device_wallet.NfcCardService;

/* JADX INFO: loaded from: classes17.dex */
public class lhk {
    public static NfcCardService a(String str) {
        return !((Boolean) lc5.d(str).a(new jhk())).booleanValue() ? (NfcCardService) x0.d().b("/device_settings/NfcCardServiceImplEx").navigation() : (NfcCardService) x0.d().b("/device_wallet/NfcCardServiceImpl").navigation();
    }
}
