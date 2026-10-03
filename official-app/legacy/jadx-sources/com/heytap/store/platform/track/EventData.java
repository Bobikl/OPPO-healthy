package com.heytap.store.platform.track;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/platform/track/EventData;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "dataString", "", "getDataString", "()Ljava/lang/String;", "setDataString", "(Ljava/lang/String;)V", "eventID", "", "getEventID", "()Ljava/lang/Long;", "setEventID", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EventData<T> {

    @Nullable
    private T data;

    @Nullable
    private String dataString;

    @Nullable
    private Long eventID;

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getDataString() {
        return this.dataString;
    }

    @Nullable
    public final Long getEventID() {
        return this.eventID;
    }

    public final void setData(@Nullable T t) {
        this.data = t;
    }

    public final void setDataString(@Nullable String str) {
        this.dataString = str;
    }

    public final void setEventID(@Nullable Long l2) {
        this.eventID = l2;
    }
}
