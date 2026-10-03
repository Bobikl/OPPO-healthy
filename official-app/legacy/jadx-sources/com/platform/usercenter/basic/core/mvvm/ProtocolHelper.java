package com.platform.usercenter.basic.core.mvvm;

import androidx.lifecycle.LiveData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ProtocolHelper {
    private final Map<String, ResourceLiveData> mCache = new HashMap();

    public void cancel(String str) {
        ResourceLiveData resourceLiveData = this.mCache.get(str);
        if (resourceLiveData != null) {
            resourceLiveData.cancel();
        }
    }

    public void remove(String str) {
        this.mCache.remove(str);
    }

    public <ReturnType> ResourceLiveData<ReturnType> runIfNotRunning(String str, LiveData<Resource<ReturnType>> liveData) {
        ResourceLiveData<ReturnType> resourceLiveData = this.mCache.get(str);
        if (resourceLiveData != null && resourceLiveData.getValue() != null && Resource.isLoading(resourceLiveData.getValue().status)) {
            return resourceLiveData;
        }
        ResourceLiveData<ReturnType> resourceLiveData2 = new ResourceLiveData<>(this, str, liveData);
        this.mCache.put(str, resourceLiveData2);
        return resourceLiveData2;
    }
}
