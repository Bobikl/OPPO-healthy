package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface RsaSsaPssParamsOrBuilder extends MessageLiteOrBuilder {
    HashType getMgf1Hash();

    int getMgf1HashValue();

    int getSaltLength();

    HashType getSigHash();

    int getSigHashValue();
}
