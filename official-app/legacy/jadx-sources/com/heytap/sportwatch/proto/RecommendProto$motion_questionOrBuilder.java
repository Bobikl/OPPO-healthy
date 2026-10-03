package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$motion_questionOrBuilder extends MessageLiteOrBuilder {
    int getAnswer(int i);

    int getAnswerCount();

    List<Integer> getAnswerList();

    int getAnswerValue();

    RecommendProto$QUESTION_ID getQuestionId();

    int getQuestionIdValue();

    boolean hasAnswerValue();
}
