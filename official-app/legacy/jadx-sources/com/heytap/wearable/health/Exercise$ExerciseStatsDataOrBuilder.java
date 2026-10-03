package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$ExerciseStatsDataOrBuilder extends MessageLiteOrBuilder {
    Exercise$CellMetricsEntry getCellMetrics();

    Exercise$DataSyncStatus getDataSyncStatus();

    int getDataSyncStatusValue();

    int getIndex();

    Exercise$MultiCellMetricsEntry getMultiCellMetrics();

    String getPackageName();

    ByteString getPackageNameBytes();

    Exercise$ExerciseStatus getStatus();

    int getStatusValue();

    boolean hasCellMetrics();

    boolean hasMultiCellMetrics();
}
