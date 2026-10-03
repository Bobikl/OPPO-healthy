package com.heytap.wearable.watch.finddevice.third;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.device.protocol.findwatch.FindWatchProto$FindWatchInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.wearable.watch.InterConnSyncMainInitializer;
import com.heytap.wearable.watch.finddevice.third.bean.FindWatchStatus;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.at2;
import com.oplus.aiunit.vision.bld;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.qe7;
import com.oplus.aiunit.vision.re7;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.zda;
import com.oplus.aiunit.vision.ztf;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = InterConnSyncMainInitializer.SERVICE_FIND_WATCH_OOBE_HELPER)
public class ThirdFindDeviceOobeHelper implements IProvider {

    public class a implements at2<BaseResponse<FindWatchStatus>> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onFailure(@NonNull xr2<BaseResponse<FindWatchStatus>> xr2Var, @NonNull Throwable th) {
            a7b.f("ThirdFindDeviceOobeHelper", "queryFindWatchStatus onFailure " + th.getMessage());
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onResponse(@NonNull xr2<BaseResponse<FindWatchStatus>> xr2Var, @NonNull ztf<BaseResponse<FindWatchStatus>> ztfVar) {
            if (!ztfVar.g()) {
                a7b.f("ThirdFindDeviceOobeHelper", "queryFindWatchStatus error code = " + ztfVar.b() + " message = " + ztfVar.h());
                return;
            }
            BaseResponse<FindWatchStatus> baseResponseA = ztfVar.a();
            if (baseResponseA == null) {
                a7b.f("ThirdFindDeviceOobeHelper", "queryFindWatchStatus baseResponse is null");
                return;
            }
            FindWatchStatus body = baseResponseA.getBody();
            if (body == null) {
                a7b.f("ThirdFindDeviceOobeHelper", "queryFindWatchStatus findWatchStatus is null");
                return;
            }
            a7b.f("ThirdFindDeviceOobeHelper", "queryFindWatchStatus findWatchStatus : " + body.toString());
            if (body.getSwitchStatus() == 1) {
                MessageEvent messageEvent = new MessageEvent(268, 1, FindWatchProto$FindWatchInfo.newBuilder().setAction(1).build().toByteArray());
                a7b.f("ThirdFindDeviceOobeHelper", "notifyWatchIfFindWatchOpen " + messageEvent.toString());
                gl4.devicePrimary.messageApi.b(messageEvent);
                ThirdFindDeviceManager.r().E(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q2(String str, boolean z) {
        a7b.f("ThirdFindDeviceOobeHelper", "oobe finish:" + z);
        if (z) {
            q6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l3() {
        gl4.devicePrimary.nodeApi.h(new bld() { // from class: com.oplus.aiunit.vision.dvj
            @Override // com.oplus.aiunit.vision.bld
            public final void d(String str, boolean z) {
                this.a.Q2(str, z);
            }
        });
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.cvj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.l3();
            }
        });
    }

    public final void q6() {
        ol4 ol4Var = gl4.managerApi;
        if (!zda.a(ol4Var.getCurrActiveMac()).W6()) {
            a7b.f("ThirdFindDeviceOobeHelper", "notifyWatchIfFindWatchOpen not support");
            return;
        }
        UserDeviceInfo userDeviceInfoJ = ol4Var.j();
        if (userDeviceInfoJ == null) {
            return;
        }
        String deviceImei = qe7.a(userDeviceInfoJ.getMac()).getDeviceImei();
        if (TextUtils.isEmpty(deviceImei)) {
            a7b.b("ThirdFindDeviceOobeHelper", "notifyWatchIfFindWatchOpen imei is empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("notifyWatchIfFindWatchOpen imei = ");
        sb.append(deviceImei);
        re7.a(deviceImei, new a());
    }
}
