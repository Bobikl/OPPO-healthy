package com.heytap.health.protocol.location;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface LocationProto$AGPSFileInfoOrBuilder extends MessageLiteOrBuilder {
    int getCombo();

    int getEndTime();

    int getError();

    LocationProto$AGPSFile getFile(int i);

    int getFileCount();

    List<LocationProto$AGPSFile> getFileList();

    int getStartTime();

    int getTotalSize();
}
