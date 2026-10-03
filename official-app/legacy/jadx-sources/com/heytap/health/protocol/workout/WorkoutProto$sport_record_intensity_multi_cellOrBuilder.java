package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$sport_record_intensity_multi_cellOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$sport_record_intensity_cell getData(int i);

    int getDataCount();

    List<WorkoutProto$sport_record_intensity_cell> getDataList();

    int getOperationType();
}
