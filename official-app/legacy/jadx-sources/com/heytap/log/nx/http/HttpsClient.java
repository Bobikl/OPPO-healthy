package com.heytap.log.nx.http;

/* JADX INFO: loaded from: classes19.dex */
public class HttpsClient implements INxHttpClient {
    @Override // com.heytap.log.nx.http.INxHttpClient
    public NxResponse downloadRequest(NxRequest nxRequest) {
        return HttpsUtils.downloadRequest(nxRequest);
    }

    @Override // com.heytap.log.nx.http.INxHttpClient
    public NxResponse sendRequest(NxRequest nxRequest) {
        return HttpsUtils.sendRequest(nxRequest);
    }
}
