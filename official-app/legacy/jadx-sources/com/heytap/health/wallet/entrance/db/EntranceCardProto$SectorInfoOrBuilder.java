package com.heytap.health.wallet.entrance.db;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface EntranceCardProto$SectorInfoOrBuilder extends MessageLiteOrBuilder {
    String getBlockInfos(int i);

    ByteString getBlockInfosBytes(int i);

    int getBlockInfosCount();

    List<String> getBlockInfosList();

    int getIndex();

    boolean getIsEncrypt();
}
