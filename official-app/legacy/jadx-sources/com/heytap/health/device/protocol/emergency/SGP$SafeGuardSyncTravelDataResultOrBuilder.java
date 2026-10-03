package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface SGP$SafeGuardSyncTravelDataResultOrBuilder extends MessageLiteOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    SGP$GuardStatus getInfo(int i);

    int getInfoCount();

    List<SGP$GuardStatus> getInfoList();

    String getName();

    ByteString getNameBytes();

    int getResult();

    int getTimestamp();

    String getTravelId();

    ByteString getTravelIdBytes();
}
