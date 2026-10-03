package com.heytap.health.wallet.entrance.db;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface EntranceCardProto$EntranceCardInfoOrBuilder extends MessageLiteOrBuilder {
    String getAtqa();

    ByteString getAtqaBytes();

    String getId();

    ByteString getIdBytes();

    boolean getIsCpuCard();

    boolean getIsEncrypt();

    String getSak();

    ByteString getSakBytes();

    int getSectorCount();

    EntranceCardProto$SectorInfo getSectorInfos(int i);

    int getSectorInfosCount();

    List<EntranceCardProto$SectorInfo> getSectorInfosList();

    int getType();
}
