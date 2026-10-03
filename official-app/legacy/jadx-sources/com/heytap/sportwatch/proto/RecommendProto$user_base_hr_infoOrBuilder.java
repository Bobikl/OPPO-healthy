package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$user_base_hr_infoOrBuilder extends MessageLiteOrBuilder {
    int getHrSec(int i);

    int getHrSecCount();

    List<Integer> getHrSecList();

    int getMaxHr();

    int getRestHr();
}
