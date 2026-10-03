package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface IccoaDkfConstant$RkeFunctionOrBuilder extends MessageLiteOrBuilder {
    String getDescription();

    ByteString getDescriptionBytes();

    String getFunctionId();

    ByteString getFunctionIdBytes();

    String getName();

    ByteString getNameBytes();

    IccoaDkfConstant$RkeAction getRkeActions(int i);

    int getRkeActionsCount();

    List<IccoaDkfConstant$RkeAction> getRkeActionsList();
}
