package com.oplus.aiunit.vision;

import com.oplus.nearx.protobuff.wire.ProtoAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class mea {
    public static <T> void a(List<T> list, ProtoAdapter<T> protoAdapter) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, protoAdapter.r(list.get(i)));
        }
    }
}
