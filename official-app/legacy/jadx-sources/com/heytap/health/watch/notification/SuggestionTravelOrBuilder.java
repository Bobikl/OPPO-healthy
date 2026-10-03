package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface SuggestionTravelOrBuilder extends MessageLiteOrBuilder {
    String getArrivalAddress();

    ByteString getArrivalAddressBytes();

    long getArrivalTime();

    String getBgBig();

    ByteString getBgBigBytes();

    String getBgSmall();

    ByteString getBgSmallBytes();

    KV getExtInfo(int i);

    int getExtInfoCount();

    List<KV> getExtInfoList();

    String getExtraInfo();

    String getExtraInfo2();

    ByteString getExtraInfo2Bytes();

    ByteString getExtraInfoBytes();

    ByteString getIcon();

    String getId();

    ByteString getIdBytes();

    String getKeyInfo();

    ByteString getKeyInfoBytes();

    String getStartAddress();

    ByteString getStartAddressBytes();

    long getStartTime();

    String getSubDomain();

    ByteString getSubDomainBytes();
}
