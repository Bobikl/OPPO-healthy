package com.oppo.wear.wallet.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface AddCardManager$SyncCardsMessageOrBuilder extends MessageLiteOrBuilder {
    AddCardManager$CardInfoMessage getCardInfo(int i);

    int getCardInfoCount();

    List<AddCardManager$CardInfoMessage> getCardInfoList();
}
