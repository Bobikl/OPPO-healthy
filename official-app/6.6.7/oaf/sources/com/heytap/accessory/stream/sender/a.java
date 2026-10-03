package com.heytap.accessory.stream.sender;

import android.os.ParcelFileDescriptor;
import com.heytap.accessory.stream.c;
import com.heytap.accessory.stream.model.CancelRequest;
import com.heytap.accessory.stream.model.SetupRequest;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface a {
    void a(ParcelFileDescriptor parcelFileDescriptor, SetupRequest setupRequest);

    void a(c cVar);

    void a(CancelRequest cancelRequest);

    boolean a(long j);

    boolean a(long j, int i);

    int b(long j);

    String getAgentId(String str, String str2);

    String getAgentPackagename(String str);
}
