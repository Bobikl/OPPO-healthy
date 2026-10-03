package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import com.platform.usercenter.basic.core.mvvm.protocol.ProtocolCommand;

/* JADX INFO: loaded from: classes9.dex */
public class BaseNetworkBound<ResultType> {
    private final ProtocolCommand<ResultType> mCommand;

    @MainThread
    public BaseNetworkBound(ProtocolCommand<ResultType> protocolCommand) {
        this.mCommand = protocolCommand;
        handle();
    }

    private void handle() {
        this.mCommand.handle();
    }

    public LiveData<Resource<ResultType>> asLiveData() {
        return this.mCommand.asLiveData();
    }
}
