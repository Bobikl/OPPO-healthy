package com.heytap.store.platform.applike.template;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/platform/applike/template/IAppLike;", "", "getPriority", "", "onCreate", "", "onTerminate", "applike-api_release"}, k = 1, mv = {1, 1, 15})
public interface IAppLike {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class DefaultImpls {
        public static int getPriority(IAppLike iAppLike) {
            return 1;
        }

        public static void onCreate(IAppLike iAppLike) {
        }

        public static void onTerminate(IAppLike iAppLike) {
        }
    }

    int getPriority();

    void onCreate();

    void onTerminate();
}
