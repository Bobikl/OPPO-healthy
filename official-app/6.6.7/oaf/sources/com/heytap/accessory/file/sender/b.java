package com.heytap.accessory.file.sender;

import com.heytap.accessory.file.d;
import com.heytap.accessory.file.model.CancelRequest;
import com.heytap.accessory.file.model.SetupRequest;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface b {
    void a(d dVar);

    void a(CancelRequest cancelRequest);

    void a(String str, SetupRequest setupRequest);

    boolean a(long j);

    boolean a(long j, int i);

    int b(long j);

    boolean c(long j);

    String getAgentId(String str, String str2);

    String getAgentPackagename(String str);
}
