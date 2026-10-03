package com.coloros.sceneservice.sceneprovider.sceneprocessor;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.coloros.sceneservice.j.c;
import com.coloros.sceneservice.m.e;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.service.BaseSceneService;
import com.coloros.sceneservice.sceneprovider.service.ServiceManager;
import com.coloros.sceneservice.utils.ControlDataUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbsSceneProcessor {
    public static final String TAG = "AbsSceneProcessor";
    public int mSceneId;
    public List mServiceList = Collections.synchronizedList(new ArrayList());

    public AbsSceneProcessor(int i) {
        this.mSceneId = i;
    }

    private void a(Bundle bundle, String str, BaseSceneService baseSceneService, boolean z) {
        if (!this.mServiceList.contains(str)) {
            f.i(TAG, "getService mServiceList not contains service: " + str);
            this.mServiceList.add(str);
            z = true;
        }
        f.d(TAG, "getService isResubscribe: " + z);
        if (z) {
            f.i(TAG, "subscribeService");
            baseSceneService.b(this.mSceneId, bundle);
        }
    }

    private BaseSceneService b(Bundle bundle) {
        String serviceId = ControlDataUtils.getServiceId(bundle);
        f.i(TAG, "getService:" + serviceId + ", sceneId:" + this.mSceneId);
        if (TextUtils.isEmpty(serviceId)) {
            return null;
        }
        BaseSceneService service = ServiceManager.getInstance().getService(serviceId);
        boolean zIsSilenceShow = ControlDataUtils.isSilenceShow(bundle);
        if (service == null) {
            f.d(TAG, "getService service is null");
            service = ServiceManager.getInstance().createService(this.mSceneId, serviceId);
            zIsSilenceShow = true;
        }
        if (service == null) {
            f.d(TAG, "createService is null, return null");
            return null;
        }
        a(bundle, serviceId, service, zIsSilenceShow);
        return service;
    }

    @Keep
    public final void finish() {
        f.d(TAG, "finish sceneId:" + this.mSceneId);
        c.getInstance().b(this.mSceneId);
    }

    @Keep
    public final int getSceneId() {
        return this.mSceneId;
    }

    public void h(String str) {
        f.d(TAG, "removeService serviceId:" + str);
        this.mServiceList.remove(str);
        if (this.mServiceList.isEmpty()) {
            finish();
        }
    }

    public final void handleBundle(Bundle bundle) {
        handleServiceBundle(bundle);
        if (bundle == null) {
            f.d(TAG, "handleBundle bundle is null");
            return;
        }
        BaseSceneService baseSceneServiceB = b(bundle);
        if (baseSceneServiceB == null) {
            f.d(TAG, "handleBundle by scene processor");
            handleBySelfInWorkThread(bundle);
        } else {
            f.d(TAG, "handleBundle by service");
            baseSceneServiceB.handleBundle(this.mSceneId, bundle);
            baseSceneServiceB.handleBundle(bundle);
        }
    }

    @Keep
    public void handleBySelfInWorkThread(Bundle bundle) {
        f.d(TAG, "handleBySelfInWorkThread: ");
    }

    @Keep
    public void handleSceneBundle(Bundle bundle) {
        f.d(TAG, "handleSceneInWorkThread: serviceList = " + e.b(this.mServiceList));
    }

    @Keep
    public void handleServiceBundle(Bundle bundle) {
        f.d(TAG, "handleServiceBundle: ");
    }

    @Keep
    public void onDestroy() {
        f.d(TAG, "onDestroy sceneId:" + this.mSceneId);
    }

    @Keep
    public final void setSceneId(int i) {
        this.mSceneId = i;
    }

    @Keep
    public String toString() {
        return "AbsSceneClientProcessor{mSceneId=" + this.mSceneId + ", mServiceList=" + this.mServiceList + '}';
    }
}
