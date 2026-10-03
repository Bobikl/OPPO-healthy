package com.oppo.wear.wallet.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface SwipeSetting$SwitchCardConfigOrBuilder extends MessageLiteOrBuilder {
    SwipeSetting$SwitchCardItem getItems(int i);

    int getItemsCount();

    List<SwipeSetting$SwitchCardItem> getItemsList();

    SwipeSetting$SwipeMannerId getMannerId();

    int getMannerIdValue();

    int getState();

    int getSupportSwitch();
}
