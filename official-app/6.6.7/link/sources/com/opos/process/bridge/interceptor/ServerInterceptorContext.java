package com.opos.process.bridge.interceptor;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ServerInterceptorContext {
    private String callingPackage;
    private Context context;
    private Bundle inBundle;
    Map<String, Object> outData;
    private String targetClassName;

    public static class Builder {
        private Context context = null;
        private String callingPackage = "";
        private String targetClassName = "";
        private Bundle inBundle = null;
        private Map<String, Object> outData = null;

        public ServerInterceptorContext build() {
            return new ServerInterceptorContext(this.context, this.callingPackage, this.inBundle, this.outData);
        }

        public Builder callingPackage(String str) {
            this.callingPackage = str;
            return this;
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public Builder inBundle(Bundle bundle) {
            this.inBundle = bundle;
            return this;
        }

        public Builder outData(Map<String, Object> map) {
            this.outData = map;
            return this;
        }

        public Builder targetClassName(String str) {
            this.targetClassName = str;
            return this;
        }
    }

    public ServerInterceptorContext(Context context, String str, Bundle bundle, Map<String, Object> map) {
        this.context = context;
        this.callingPackage = str;
        this.inBundle = bundle;
        this.outData = map;
    }

    public String getCallingPackage() {
        return this.callingPackage;
    }

    public Context getContext() {
        return this.context;
    }

    public Bundle getInBundle() {
        return this.inBundle;
    }

    public Map<String, Object> getOutData() {
        return this.outData;
    }
}
