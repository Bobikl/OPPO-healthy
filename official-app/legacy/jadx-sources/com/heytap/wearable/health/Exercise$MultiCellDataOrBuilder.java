package com.heytap.wearable.health;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$MultiCellDataOrBuilder extends MessageLiteOrBuilder {
    Exercise$DataType getDataType();

    int getDataTypeValue();

    int getValue(int i);

    int getValueCount();

    List<Integer> getValueList();
}
