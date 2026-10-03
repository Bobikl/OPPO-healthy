package com.lifesense.android.bluetooth.core.business;

import com.lifesense.android.bluetooth.core.bean.constant.DeviceUpgradeStatus;
import com.lifesense.android.bluetooth.core.bean.constant.ErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public interface i extends a {
    void a(com.lifesense.android.bluetooth.core.protocol.worker.a aVar, String str, DeviceUpgradeStatus deviceUpgradeStatus, ErrorCode errorCode);

    void a(String str, int i);

    void c(String str);
}
