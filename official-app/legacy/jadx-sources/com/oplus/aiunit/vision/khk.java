package com.oplus.aiunit.vision;

import com.heytap.health.device_wallet.NfcCardService;
import com.heytap.health.interconnection.esim.DeleteEsimService;

/* JADX INFO: loaded from: classes18.dex */
public class khk {
    public static DeleteEsimService a(String str) {
        return !((Boolean) lc5.d(str).a(new zea())).booleanValue() ? (DeleteEsimService) x0.d().b("/device_settings/DeleteEsimServiceImplEx").navigation() : (DeleteEsimService) x0.d().b("/esim/delete/DeleteEsimServiceImpl").navigation();
    }

    public static NfcCardService b(String str) {
        return !((Boolean) lc5.d(str).a(new jhk())).booleanValue() ? (NfcCardService) x0.d().b("/device_settings/NfcCardServiceImplEx").navigation() : (NfcCardService) x0.d().b("/device_wallet/NfcCardServiceImpl").navigation();
    }
}
