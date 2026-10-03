package com.heytap.health.device_settings.band;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes16.dex */
public interface IBandReConnectService extends IProvider {

    public interface a {
        void a();

        void b();
    }

    AlertDialog La(Context context, String str, a aVar);
}
