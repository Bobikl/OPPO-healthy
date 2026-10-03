package com.heytap.msp.okipc;

/* JADX INFO: loaded from: classes19.dex */
public interface IPCRawCall {

    public interface Factory<T extends IPCRawCall> {
        T newCall(d dVar);
    }

    d request();

    e response();
}
