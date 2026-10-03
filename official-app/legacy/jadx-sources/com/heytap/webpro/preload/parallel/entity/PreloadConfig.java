package com.heytap.webpro.preload.parallel.entity;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class PreloadConfig {
    public boolean enable;
    public List<PreloadConfigData> maps;

    @Keep
    public static class PreloadConfigData {
        public String api;
        public boolean encryption;
        public List<Limit> limit;
        public String method;
        public String page;
        public List<PreloadParam> query;
        public boolean signature;
        public String url;

        public String toString() {
            return "PreloadConfigData{page='" + this.page + "', api='" + this.api + "', method='" + this.method + "', signature=" + this.signature + ", encryption=" + this.encryption + ", query=" + this.query + ", limit=" + this.limit + '}';
        }
    }

    public String toString() {
        return "PreloadInterfaceResponse{maps=" + this.maps + ", enable=" + this.enable + '}';
    }
}
