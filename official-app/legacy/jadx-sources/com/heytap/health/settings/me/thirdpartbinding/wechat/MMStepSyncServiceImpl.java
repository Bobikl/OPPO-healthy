package com.heytap.health.settings.me.thirdpartbinding.wechat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.core.router.setting.IWechatStepService;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.settings.me.thirdpartbinding.wechat.MMStepSyncServiceImpl;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.pcb;
import com.oplus.aiunit.vision.ycb;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/settings/me/thirdpartbinding/wechat")
public class MMStepSyncServiceImpl implements IWechatStepService {
    public static final String TAG = "MMStepSyncServiceImpl";

    public static /* synthetic */ void Q2(MutableLiveData mutableLiveData, BaseResponse baseResponse) throws Throwable {
        if (baseResponse == null || !baseResponse.isSuccess() || baseResponse.getBody() == null || ((List) baseResponse.getBody()).size() <= 0) {
            if (baseResponse != null) {
                baseResponse.toString();
            } else {
                a7b.f(TAG, "getDevices is null");
            }
            mutableLiveData.postValue(Boolean.FALSE);
            return;
        }
        baseResponse.toString();
        boolean zK = MMHardware.k((List) baseResponse.getBody());
        StringBuilder sb = new StringBuilder();
        sb.append("bindStatus = ");
        sb.append(zK);
        mutableLiveData.postValue(Boolean.valueOf(zK));
    }

    public static /* synthetic */ void l3(MutableLiveData mutableLiveData, Throwable th) throws Throwable {
        mutableLiveData.postValue(Boolean.FALSE);
    }

    @Override // com.heytap.health.core.router.setting.IWechatStepService
    public AsyncResult<Boolean> R9(String str) {
        return MMStepSyncServiceImplExtKt.a(this, str);
    }

    @Override // com.heytap.health.core.router.setting.IWechatStepService
    public LiveData<Integer> U8() {
        int iM = ycb.i().m();
        return iM == -1 ? pcb.c() : new MutableLiveData(Integer.valueOf(iM));
    }

    @Override // com.heytap.health.core.router.setting.IWechatStepService
    @SuppressLint({"CheckResult"})
    public LiveData<Boolean> aa() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        MMHardware.f().b(new o14() { // from class: com.oplus.aiunit.vision.adb
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                MMStepSyncServiceImpl.Q2(mutableLiveData, (BaseResponse) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.bdb
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                MMStepSyncServiceImpl.l3(mutableLiveData, (Throwable) obj);
            }
        });
        return mutableLiveData;
    }

    @Override // com.heytap.health.core.router.setting.IWechatStepService
    public Intent f6() {
        return new Intent(b78.a(), (Class<?>) MMStepSyncSetActivity.class);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ycb.i().I(true);
    }

    @Override // com.heytap.health.core.router.setting.IWechatStepService
    public void onLogout() {
        ycb.i().h();
    }
}
