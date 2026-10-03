package com.heytap.msp.ipc.client;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface TargetModifier {
    default j modify(Context context, j jVar) {
        return jVar;
    }

    default List<j> modify(Context context, List<j> list) {
        return list;
    }
}
