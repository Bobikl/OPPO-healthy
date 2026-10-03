package com.oppo.wear.wallet.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface GetDigitalKeyInfo$GetDigitalKeyInfoResponseOrBuilder extends MessageLiteOrBuilder {
    IccoaDkfConstant$IccoaDkDatabean getKey(int i);

    int getKeyCount();

    List<IccoaDkfConstant$IccoaDkDatabean> getKeyList();

    IccoaDkfConstant$State getState();

    boolean hasState();
}
