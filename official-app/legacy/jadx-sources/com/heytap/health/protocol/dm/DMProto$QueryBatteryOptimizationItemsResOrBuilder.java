package com.heytap.health.protocol.dm;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$QueryBatteryOptimizationItemsResOrBuilder extends MessageLiteOrBuilder {
    DMProto$BatteryOptimizationItem getBatteryOptimizations(int i);

    int getBatteryOptimizationsCount();

    List<DMProto$BatteryOptimizationItem> getBatteryOptimizationsList();
}
