package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface SGP$SafeGuardSyncTravelDataListOrBuilder extends MessageLiteOrBuilder {
    SGP$SafeGuardSyncTravelData getTravels(int i);

    int getTravelsCount();

    List<SGP$SafeGuardSyncTravelData> getTravelsList();
}
