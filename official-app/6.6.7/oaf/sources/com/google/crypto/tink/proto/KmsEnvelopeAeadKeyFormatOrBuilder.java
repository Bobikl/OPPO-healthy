package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface KmsEnvelopeAeadKeyFormatOrBuilder extends MessageLiteOrBuilder {
    KeyTemplate getDekTemplate();

    String getKekUri();

    ByteString getKekUriBytes();

    boolean hasDekTemplate();
}
