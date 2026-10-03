package com.oplus.drs.track;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/oplus/drs/track/ITrackEventCallBack;", "", "onTrackEvent", "", "eventGroup", "", "eventId", "isTrackSuccess", "", "obus-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ITrackEventCallBack {
    void onTrackEvent(@NotNull String eventGroup, @NotNull String eventId, boolean isTrackSuccess);
}
