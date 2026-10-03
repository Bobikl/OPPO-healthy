package com.heytap.health.protocol.dm;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$CustomIPSettingOrBuilder extends MessageLiteOrBuilder {
    DMProto$SettingItem getItems(int i);

    int getItemsCount();

    List<DMProto$SettingItem> getItemsList();
}
