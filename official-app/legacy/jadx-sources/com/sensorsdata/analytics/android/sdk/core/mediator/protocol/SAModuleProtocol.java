package com.sensorsdata.analytics.android.sdk.core.mediator.protocol;

import com.sensorsdata.analytics.android.sdk.core.SAContextManager;

/* JADX INFO: loaded from: classes10.dex */
public interface SAModuleProtocol {
    String getModuleName();

    int getPriority();

    void install(SAContextManager sAContextManager);

    <T> T invokeModuleFunction(String str, Object... objArr);

    boolean isEnable();

    void setModuleState(boolean z);
}
