package com.heytap.wearable.health;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$MultiCellMetricsEntryOrBuilder extends MessageLiteOrBuilder {
    Exercise$MultiCellData getMultiCell(int i);

    int getMultiCellCount();

    List<Exercise$MultiCellData> getMultiCellList();
}
