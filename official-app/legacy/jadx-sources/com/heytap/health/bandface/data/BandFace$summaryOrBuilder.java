package com.heytap.health.bandface.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface BandFace$summaryOrBuilder extends MessageLiteOrBuilder {
    int getCapacity();

    String getChoosed();

    ByteString getChoosedBytes();

    BandFace$resolution getResolution();

    String getWatchDialIds(int i);

    ByteString getWatchDialIdsBytes(int i);

    int getWatchDialIdsCount();

    List<String> getWatchDialIdsList();

    boolean hasResolution();
}
