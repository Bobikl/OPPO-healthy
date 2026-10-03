package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface SuggestionCommonOrBuilder extends MessageLiteOrBuilder {
    String getBgBig();

    ByteString getBgBigBytes();

    String getBgSmall();

    ByteString getBgSmallBytes();

    Extra getExtra();

    String getExtraInfo();

    String getExtraInfo2();

    ByteString getExtraInfo2Bytes();

    ByteString getExtraInfoBytes();

    ByteString getIcon();

    String getId();

    ByteString getIdBytes();

    String getKeyInfo();

    ByteString getKeyInfoBytes();

    String getSubDomain();

    ByteString getSubDomainBytes();

    boolean hasExtra();
}
