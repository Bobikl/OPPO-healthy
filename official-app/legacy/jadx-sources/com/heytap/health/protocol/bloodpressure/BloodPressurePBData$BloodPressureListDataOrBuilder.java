package com.heytap.health.protocol.bloodpressure;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface BloodPressurePBData$BloodPressureListDataOrBuilder extends MessageLiteOrBuilder {
    BloodPressurePBData$BloodPressureItemData getBpdata(int i);

    int getBpdataCount();

    List<BloodPressurePBData$BloodPressureItemData> getBpdataList();
}
