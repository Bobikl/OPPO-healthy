package com.heytap.health.settings.band;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_settings.band.IBandReConnectService;
import com.oplus.aiunit.vision.xw0;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/device_settings/band/BandReConnectServiceImpl")
public class BandReConnectServiceImpl implements IBandReConnectService {
    @Override // com.heytap.health.device_settings.band.IBandReConnectService
    public AlertDialog La(Context context, String str, IBandReConnectService.a aVar) {
        return xw0.c(context, str, aVar);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }
}
