package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$ExerciseSampleDataOrBuilder extends MessageLiteOrBuilder {
    Exercise$CellMetricsEntry getCellMetrics();

    Exercise$MultiCellMetricsEntry getMultiCellMetrics();

    String getPackageName();

    ByteString getPackageNameBytes();

    String getSign();

    ByteString getSignBytes();

    String getToPackageName();

    ByteString getToPackageNameBytes();

    String getToSign();

    ByteString getToSignBytes();

    boolean hasCellMetrics();

    boolean hasMultiCellMetrics();
}
