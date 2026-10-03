package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface EciesAeadHkdfParamsOrBuilder extends MessageLiteOrBuilder {
    EciesAeadDemParams getDemParams();

    EcPointFormat getEcPointFormat();

    int getEcPointFormatValue();

    EciesHkdfKemParams getKemParams();

    boolean hasDemParams();

    boolean hasKemParams();
}
