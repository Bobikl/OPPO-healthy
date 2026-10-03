package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\f\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0004\"\u0004\b\u000b\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0004\"\u0004\b\u000e\u0010\u0006R\u001c\u0010\u0015\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/hm9;", "", "", "get_id", "()J", "set_id", "(J)V", "_id", "getEventTime", sbe.PAY_SDK_EVENT_TIME, "getCreateNum", "setCreateNum", "createNum", "getUploadNum", "setUploadNum", "uploadNum", "", "getSequenceId", "()Ljava/lang/String;", "setSequenceId", "(Ljava/lang/String;)V", "sequenceId", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface hm9 {
    long getCreateNum();

    long getEventTime();

    @NotNull
    String getSequenceId();

    long getUploadNum();

    long get_id();
}
