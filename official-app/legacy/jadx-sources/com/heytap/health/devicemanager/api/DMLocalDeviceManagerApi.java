package com.heytap.health.devicemanager.api;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.devicemanager.processor.bean.AboutDeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.aiunit.vision.juk;
import com.oplus.aiunit.vision.rh0;

/* JADX INFO: loaded from: classes16.dex */
public interface DMLocalDeviceManagerApi extends IProvider {
    public static final String SERVICE_DB_DEVICE = "/devicemanager/DMLocalDeviceManagerApi";

    juk<rh0> Q();

    AsyncResult<AboutDeviceInfo> V0(String str);

    AsyncResult<Boolean> a1(String str);

    void d0(UserDeviceInfo userDeviceInfo);

    void e9(Context context, String str);

    void u3(AboutDeviceInfo aboutDeviceInfo);
}
