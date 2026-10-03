package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface KeysetInfoOrBuilder extends MessageLiteOrBuilder {
    KeysetInfo.KeyInfo getKeyInfo(int i);

    int getKeyInfoCount();

    List<KeysetInfo.KeyInfo> getKeyInfoList();

    int getPrimaryKeyId();
}
