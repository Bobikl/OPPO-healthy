package com.opos.process.bridge.interceptor;

import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class MethodInterceptorContext {
    private String callingPackage;
    private Context context;
    private Bundle inBundle;
    private int methodId;
    private String targetClassName;
    private IBridgeTargetIdentify targetIdentify;

    public static class Builder {
        private String callingPackage;
        private Context context;
        private Bundle inBundle;
        private int methodId;
        private String targetClassName;
        private IBridgeTargetIdentify targetIdentify;

        public MethodInterceptorContext build() {
            return new MethodInterceptorContext(this.context, this.callingPackage, this.inBundle, this.targetClassName, this.targetIdentify, this.methodId);
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

        public Builder methodId(int i) {
            this.methodId = i;
            return this;
        }

        public Builder targetClassName(String str) {
            this.targetClassName = str;
            return this;
        }

        public Builder targetIdentify(IBridgeTargetIdentify iBridgeTargetIdentify) {
            this.targetIdentify = iBridgeTargetIdentify;
            return this;
        }
    }

    public MethodInterceptorContext(Context context, String str, Bundle bundle, String str2, IBridgeTargetIdentify iBridgeTargetIdentify, int i) {
        this.context = context;
        this.callingPackage = str;
        this.inBundle = bundle;
        this.targetClassName = str2;
        this.targetIdentify = iBridgeTargetIdentify;
        this.methodId = i;
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

    public int getMethodId() {
        return this.methodId;
    }

    public String getTargetClassName() {
        return this.targetClassName;
    }

    public IBridgeTargetIdentify getTargetIdentify() {
        return this.targetIdentify;
    }
}
