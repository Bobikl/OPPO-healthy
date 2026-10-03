package com.heytap.accessory.file.sender;

import com.heytap.accessory.file.d;
import com.heytap.accessory.file.model.CancelRequest;
import com.heytap.accessory.file.model.SetupRequest;

/* JADX INFO: loaded from: classes14.dex */
public interface b {
    void a(d dVar);

    void a(CancelRequest cancelRequest);

    void a(String str, SetupRequest setupRequest);

    boolean a(long j2);

    boolean a(long j2, int i);

    int b(long j2);

    boolean c(long j2);

    String getAgentId(String str, String str2);

    String getAgentPackagename(String str);
}
