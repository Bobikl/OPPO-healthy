package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface InboxStyleProtoOrBuilder extends MessageLiteOrBuilder {
    String getBigTitle();

    ByteString getBigTitleBytes();

    String getBody();

    ByteString getBodyBytes();

    String getTexts(int i);

    ByteString getTextsBytes(int i);

    int getTextsCount();

    List<String> getTextsList();
}
