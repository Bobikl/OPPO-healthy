package com.heytap.wearable.health;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$CellMetricsEntryOrBuilder extends MessageLiteOrBuilder {
    Exercise$CellData getCell(int i);

    int getCellCount();

    List<Exercise$CellData> getCellList();
}
