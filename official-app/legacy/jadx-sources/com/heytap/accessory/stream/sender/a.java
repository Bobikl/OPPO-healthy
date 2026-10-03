package com.heytap.accessory.stream.sender;

import android.os.ParcelFileDescriptor;
import com.heytap.accessory.stream.c;
import com.heytap.accessory.stream.model.CancelRequest;
import com.heytap.accessory.stream.model.SetupRequest;

/* JADX INFO: loaded from: classes14.dex */
public interface a {
    void a(ParcelFileDescriptor parcelFileDescriptor, SetupRequest setupRequest);

    void a(c cVar);

    void a(CancelRequest cancelRequest);

    boolean a(long j2);

    boolean a(long j2, int i);

    int b(long j2);

    String getAgentId(String str, String str2);

    String getAgentPackagename(String str);
}
