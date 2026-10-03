package com.heytap.health.devicemanager.api;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.devicemanager.processor.bean.UpdateVaidBean;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.network.core.BaseResponse;
import com.oplus.aiunit.vision.b93;
import com.oplus.aiunit.vision.cc5;
import com.oplus.aiunit.vision.hk5;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n58;
import com.oplus.aiunit.vision.v83;
import com.oplus.aiunit.vision.ypf;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface ICloudDeviceProcessorService extends IProvider {
    public static final String SERVICE_PATH = "/devicemanager/ICloudDeviceProcessorService";

    void A9(String str, int i, cc5 cc5Var);

    void F4(String str, String str2, cc5 cc5Var);

    void G6(ypf ypfVar, String str, String str2, String str3, boolean z, cc5 cc5Var);

    void H2(String str, cc5 cc5Var);

    void K(Context context, String str, b93 b93Var);

    void L6(String str, String str2, cc5 cc5Var);

    void T7(String str, cc5 cc5Var);

    void Z2(BaseActivity baseActivity, String str, cc5 cc5Var);

    lbd<BaseResponse<hk5>> a8(String str, int i);

    void b4(Context context, String str, v83 v83Var);

    lbd<BaseResponse<Object>> g(UpdateVaidBean updateVaidBean);

    lbd<List<UserDeviceInfo>> j();

    void o9(ypf ypfVar, cc5 cc5Var);

    lbd<List<UserDeviceInfo>> p0();

    void pa(cc5 cc5Var);

    void t8(String str, String str2, String str3, cc5 cc5Var);

    lbd<n58> x6(String str);
}
