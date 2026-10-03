package com.heytap.wearable.health;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$DataTypeArrayOrBuilder extends MessageLiteOrBuilder {
    Exercise$DataType getDataType(int i);

    int getDataTypeCount();

    List<Exercise$DataType> getDataTypeList();

    int getDataTypeValue(int i);

    List<Integer> getDataTypeValueList();
}
