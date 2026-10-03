package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface ParsedRemoteInputProtoOrBuilder extends MessageLiteOrBuilder {
    boolean getAllowFreeFormInput();

    String getChoices(int i);

    ByteString getChoicesBytes(int i);

    int getChoicesCount();

    List<String> getChoicesList();

    String getLabel();

    ByteString getLabelBytes();

    String getResultKey();

    ByteString getResultKeyBytes();
}
