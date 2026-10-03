package com.google.firebase.encoders.json;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final /* synthetic */ class JsonDataEncoderBuilder$$Lambda$1 implements ObjectEncoder {
    private static final JsonDataEncoderBuilder$$Lambda$1 instance = new JsonDataEncoderBuilder$$Lambda$1();

    private JsonDataEncoderBuilder$$Lambda$1() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
    public void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        JsonDataEncoderBuilder.lambda$static$0(obj, objectEncoderContext);
    }
}
