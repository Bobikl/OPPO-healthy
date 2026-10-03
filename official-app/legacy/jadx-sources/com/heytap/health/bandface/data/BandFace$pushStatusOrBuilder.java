package com.heytap.health.bandface.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes15.dex */
public interface BandFace$pushStatusOrBuilder extends MessageLiteOrBuilder {
    int getErrorCode();

    int getStatus();

    String getWatchDialId();

    ByteString getWatchDialIdBytes();
}
