package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface SwipeSetting$CardTimeOrBuilder extends MessageLiteOrBuilder {
    String getAid();

    ByteString getAidBytes();

    SwipeSetting$SwipeTime getSwipeTime(int i);

    int getSwipeTimeCount();

    List<SwipeSetting$SwipeTime> getSwipeTimeList();
}
