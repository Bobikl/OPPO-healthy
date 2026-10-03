package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static BackendResponse fatalError() {
        return new AutoValue_BackendResponse(Status.FATAL_ERROR, -1L);
    }

    public static BackendResponse ok(long j2) {
        return new AutoValue_BackendResponse(Status.OK, j2);
    }

    public static BackendResponse transientError() {
        return new AutoValue_BackendResponse(Status.TRANSIENT_ERROR, -1L);
    }

    public abstract long getNextRequestWaitMillis();

    public abstract Status getStatus();
}
