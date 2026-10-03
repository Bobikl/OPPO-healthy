package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$health_statusOrBuilder extends MessageLiteOrBuilder {
    int getAbnormalNum();

    RecommendProto$MOTION_POST_SPORTS_STATUS getAfterMotion();

    int getAfterMotionValue();

    int getBackIsInvalid();

    RecommendProto$health_cell getDataCell(int i);

    int getDataCellCount();

    List<RecommendProto$health_cell> getDataCellList();

    RecommendProto$MOTION_HEALT_STATUS getHealth();

    int getHealthValue();

    RecommendProto$user_base_hr_info getHrInfo();

    RecommendProto$sport_working_info getInfo();

    RecommendProto$status_entry getMainEntry();

    RecommendProto$REQUEST_TYPE getRequest();

    int getRequestValue();

    RecommendProto$status_entry getSecondEntry();

    int getUpdateTimestamp();

    int getVersion();

    boolean hasAfterMotion();

    boolean hasHrInfo();

    boolean hasInfo();

    boolean hasMainEntry();

    boolean hasRequest();

    boolean hasSecondEntry();
}
