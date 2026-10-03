package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$sports_recOrBuilder extends MessageLiteOrBuilder {
    ByteString getCourseJsonData();

    int getDuration();

    RecommendProto$sport_strength getHr();

    int getSportType();

    boolean hasCourseJsonData();

    boolean hasHr();
}
