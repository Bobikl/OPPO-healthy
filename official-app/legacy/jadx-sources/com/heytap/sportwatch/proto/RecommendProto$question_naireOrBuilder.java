package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$question_naireOrBuilder extends MessageLiteOrBuilder {
    RecommendProto$motion_question getAns(int i);

    int getAnsCount();

    List<RecommendProto$motion_question> getAnsList();

    int getAnswerTimestamp();

    RecommendProto$MODIFY_SOURCE getSource();

    int getSourceValue();
}
