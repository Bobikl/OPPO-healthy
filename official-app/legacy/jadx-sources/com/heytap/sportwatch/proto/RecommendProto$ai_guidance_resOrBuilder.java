package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$ai_guidance_resOrBuilder extends MessageLiteOrBuilder {
    String getAllRecommend();

    ByteString getAllRecommendBytes();

    int getAnsTimestamp();

    RecommendProto$base_motion_rec getBaseRecommend();

    RecommendProto$sports_rec getRecommendMotion(int i);

    int getRecommendMotionCount();

    List<RecommendProto$sports_rec> getRecommendMotionList();

    RecommendProto$REQUEST_TYPE getRequest();

    int getRequestValue();

    int getResultResTimestamp();

    RecommendProto$GUIDANCE_RES getStatus();

    int getStatusValue();

    String getTodayRecommend();

    ByteString getTodayRecommendBytes();

    boolean hasBaseRecommend();
}
