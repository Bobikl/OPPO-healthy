package com.heytap.health.bandface.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes15.dex */
public interface BandFace$watchfaceOrBuilder extends MessageLiteOrBuilder {
    BandFace$city getCity();

    String getFileName();

    ByteString getFileNameBytes();

    int getType();

    int getVersion();

    BandFace$visual getVisual();

    String getWatchDialId();

    ByteString getWatchDialIdBytes();

    boolean hasCity();

    boolean hasVisual();
}
