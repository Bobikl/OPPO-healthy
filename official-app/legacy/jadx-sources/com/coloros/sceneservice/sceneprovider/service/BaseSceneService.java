package com.coloros.sceneservice.sceneprovider.service;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.coloros.sceneservice.k.a;
import com.coloros.sceneservice.k.b;
import com.coloros.sceneservice.k.c;
import com.coloros.sceneservice.k.d;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.n.e;
import com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack;
import com.coloros.sceneservice.utils.ControlDataUtils;
import com.oplus.aiunit.vision.n04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class BaseSceneService {
    public static final String TAG = "BaseSceneService";

    @Keep
    public int mSceneId;

    @Keep
    public List mSceneIds = Collections.synchronizedList(new ArrayList());

    @Keep
    public String mServiceId;

    @Deprecated
    public BaseSceneService() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        ServiceManager.getInstance().a(this.mSceneIds, this.mServiceId);
        this.mSceneIds.clear();
        onDestroy();
    }

    @Keep
    public static void finishBySelf(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.a(new b(str));
    }

    public final void b(int i, Bundle bundle) {
        f.d(TAG, "onCreate:sceneId=" + i + ",serviceId=" + this.mServiceId);
        this.mSceneId = i;
        if (!ControlDataUtils.isNoBind(bundle)) {
            com.coloros.sceneservice.i.e.getInstance().a(i, this.mServiceId, new a(this, i));
        }
        onCreate();
    }

    @Keep
    public void executeMethodByService(int i, String str, String str2, Bundle bundle, IMethodCallBack iMethodCallBack) {
        f.d(TAG, "executeMethodByService, sceneId=" + i + ",mServiceId= " + str + " methodName:" + str2);
    }

    @Keep
    public void finishByService() {
        f.d(TAG, "finishByService");
        destroy();
    }

    public String getServiceId() {
        return this.mServiceId;
    }

    @Keep
    public void handleBundle(int i, Bundle bundle) {
        f.i(TAG, "handleBundle");
    }

    @Keep
    @Deprecated
    public void invokeServiceMethod(String str, Bundle bundle, IMethodCallBack iMethodCallBack) {
        e.a(new c(this, str, bundle, iMethodCallBack));
    }

    @Keep
    public void onCreate() {
        f.d(TAG, "onCreate: ");
    }

    @Keep
    public void onDestroy() {
        f.d(TAG, "onDestroy");
    }

    public void setServiceId(String str) {
        this.mServiceId = str;
    }

    public String toString() {
        return BaseSceneService.class.getSimpleName() + n04.OPEN_BRACE_REGEX + "mSceneId=" + this.mSceneId + "mSceneIds=" + com.coloros.sceneservice.m.e.b(this.mSceneIds) + ", mServiceId=" + this.mServiceId + '}';
    }

    @Keep
    @Deprecated
    public void handleBundle(Bundle bundle) {
        f.i(TAG, "handleBundle");
    }

    @Keep
    public void invokeServiceMethod(int i, String str, Bundle bundle, IMethodCallBack iMethodCallBack) {
        e.a(new d(this, i, str, bundle, iMethodCallBack));
    }

    public BaseSceneService(String str) {
        this.mServiceId = str;
    }
}
