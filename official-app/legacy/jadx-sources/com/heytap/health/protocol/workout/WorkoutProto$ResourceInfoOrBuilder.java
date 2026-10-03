package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$ResourceInfoOrBuilder extends MessageLiteOrBuilder {
    String getUrl(int i);

    ByteString getUrlBytes(int i);

    int getUrlCount();

    List<String> getUrlList();
}
