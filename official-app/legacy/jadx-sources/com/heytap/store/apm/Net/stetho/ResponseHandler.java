package com.heytap.store.apm.Net.stetho;

import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public interface ResponseHandler {
    void onEOF();

    void onError(IOException iOException);

    void onRead(int i);

    void onReadDecoded(int i);
}
