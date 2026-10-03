package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$FileNameDataOrBuilder extends MessageLiteOrBuilder {
    int getEndTime();

    String getFileName(int i);

    ByteString getFileNameBytes(int i);

    int getFileNameCount();

    List<String> getFileNameList();

    ByteString getFileType();

    int getMoreData();

    int getStartTime();
}
