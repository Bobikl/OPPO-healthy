package com.heytap.store.homemodule.model;

import com.heytap.store.base.core.connectivity.ConnectivityManagerProxy;
import com.heytap.store.base.core.http.ErrorCode;
import com.heytap.store.base.core.http.HttpException;
import com.heytap.store.homemodule.utils.OnResultCallback;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import java.net.ConnectException;
import java.util.List;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/heytap/store/homemodule/model/HomeRootModel$showCacheTask$1", "Ljava/lang/Runnable;", "isNetWorkError", "", "()Z", "setNetWorkError", "(Z)V", "run", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeRootModel$showCacheTask$1 implements Runnable {
    private boolean isNetWorkError;

    /* JADX INFO: renamed from: isNetWorkError, reason: from getter */
    public final boolean getIsNetWorkError() {
        return this.isNetWorkError;
    }

    @Override // java.lang.Runnable
    public void run() {
        LogUtils.INSTANCE.d("HomeRootModel", "showCacheTask, cache = " + HomeRootModel.cachetTabList + ", pendingResultCallback = " + HomeRootModel.pendingResultCallback);
        List list = HomeRootModel.cachetTabList;
        if (list != null) {
            OnResultCallback onResultCallback = HomeRootModel.pendingResultCallback;
            if (onResultCallback != null) {
                onResultCallback.onSuccess(list, true);
            }
        } else if (this.isNetWorkError) {
            OnResultCallback onResultCallback2 = HomeRootModel.pendingResultCallback;
            if (onResultCallback2 != null) {
                onResultCallback2.onFail(new ConnectException("showCacheTask: no cache"));
            }
        } else if (ConnectivityManagerProxy.hasAvailableNet(ContextGetterUtils.INSTANCE.getApp())) {
            OnResultCallback onResultCallback3 = HomeRootModel.pendingResultCallback;
            if (onResultCallback3 != null) {
                onResultCallback3.onFail(new HttpException(null, ErrorCode.UNKNOWN));
            }
        } else {
            OnResultCallback onResultCallback4 = HomeRootModel.pendingResultCallback;
            if (onResultCallback4 != null) {
                onResultCallback4.onFail(new ConnectException("showCacheTask: no cache"));
            }
        }
        HomeRootModel.pendingResultCallback = null;
    }

    public final void setNetWorkError(boolean z) {
        this.isNetWorkError = z;
    }
}
