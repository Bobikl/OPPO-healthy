package com.oplus.aiunit.vision;

import com.heytap.nearx.protobuff.wire.ProtoAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class nea {
    public static <T> void a(List<T> list, ProtoAdapter<T> protoAdapter) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, protoAdapter.redact(list.get(i)));
        }
    }
}
