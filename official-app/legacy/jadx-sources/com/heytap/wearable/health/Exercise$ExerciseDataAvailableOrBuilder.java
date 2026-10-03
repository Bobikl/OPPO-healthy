package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$ExerciseDataAvailableOrBuilder extends MessageLiteOrBuilder {
    Exercise$CellMetricsEntry getCellMetrics();

    String getPackageName();

    ByteString getPackageNameBytes();

    boolean hasCellMetrics();
}
