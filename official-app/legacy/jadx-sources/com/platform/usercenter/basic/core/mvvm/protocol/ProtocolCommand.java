package com.platform.usercenter.basic.core.mvvm.protocol;

import androidx.lifecycle.LiveData;
import com.platform.usercenter.basic.core.mvvm.Resource;

/* JADX INFO: loaded from: classes9.dex */
public interface ProtocolCommand<ResultType> {
    LiveData<Resource<ResultType>> asLiveData();

    void handle();
}
