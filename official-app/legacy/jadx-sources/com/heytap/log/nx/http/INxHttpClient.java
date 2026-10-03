package com.heytap.log.nx.http;

/* JADX INFO: loaded from: classes19.dex */
public interface INxHttpClient {
    NxResponse downloadRequest(NxRequest nxRequest);

    NxResponse sendRequest(NxRequest nxRequest);
}
