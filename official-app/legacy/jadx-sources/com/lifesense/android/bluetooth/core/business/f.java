package com.lifesense.android.bluetooth.core.business;

import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.OperationCommand;

/* JADX INFO: loaded from: classes4.dex */
public interface f extends a {
    void a(LsDeviceInfo lsDeviceInfo, int i);

    void a(String str);

    void a(String str, OperationCommand operationCommand);

    void b(LsDeviceInfo lsDeviceInfo, int i);

    void b(String str);
}
