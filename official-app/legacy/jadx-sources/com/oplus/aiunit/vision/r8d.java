package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.heytap.health.device.ota.bean.OTAVersion;

/* JADX INFO: loaded from: classes16.dex */
public interface r8d {
    @WorkerThread
    void a(@Nullable OTAVersion oTAVersion);

    void b(Throwable th);
}
