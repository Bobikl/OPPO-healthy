package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface ListValueOrBuilder extends MessageOrBuilder {
    Value getValues(int i);

    int getValuesCount();

    List<Value> getValuesList();

    ValueOrBuilder getValuesOrBuilder(int i);

    List<? extends ValueOrBuilder> getValuesOrBuilderList();
}
