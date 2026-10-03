package com.heytap.health.bandface.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface BandFace$visualOrBuilder extends MessageLiteOrBuilder {
    String getBackgrounds(int i);

    ByteString getBackgroundsBytes(int i);

    int getBackgroundsCount();

    List<String> getBackgroundsList();

    int getStyleId();
}
