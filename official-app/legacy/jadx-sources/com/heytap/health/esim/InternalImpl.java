package com.heytap.health.esim;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.interconnection.esim.IInternal;
import com.oplus.aiunit.vision.fq6;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.zea;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = IInternal.ROUTER_PATH)
public class InternalImpl implements IInternal {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.health.interconnection.esim.IInternal
    public boolean t1(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((!str.startsWith(fq6.LPA_START_WITH_1) && !str.startsWith(fq6.LPA_START_WITH_2)) || fq6.a(str) < 2) {
            return false;
        }
        String currActiveMac = gl4.managerApi.getCurrActiveMac();
        if (TextUtils.isEmpty(currActiveMac)) {
            return false;
        }
        UserDeviceInfo userDeviceInfo = (UserDeviceInfo) lc5.c(currActiveMac).a(new Function1() { // from class: com.oplus.aiunit.vision.xea
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((DeviceInfo) obj).getDeviceInfo();
            }
        });
        if (!((Boolean) lc5.d(userDeviceInfo.getModel()).a(new zea())).booleanValue()) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) SelectOperatorActivity.class);
        intent.putExtra("settingsDeviceMac", userDeviceInfo.getMac());
        intent.putExtra(fq6.EXTRA_CODE_RESULT, str);
        intent.putExtra(fq6.EXTRA_FROM, fq6.EXTRA_FROM_DEVICE_CAPTURE);
        context.startActivity(intent);
        return true;
    }
}
