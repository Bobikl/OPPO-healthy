package com.nearme.instant.xcard;

/* JADX INFO: loaded from: classes5.dex */
public interface ICardEngineCallback {
    public static final int ERROR_CARD_SERVICE_BINDING = 5;
    public static final int ERROR_CLASS_NOT_FOUND = 2;
    public static final int ERROR_GET_CLASS_LOADER_FAIELD = 3;
    public static final int ERROR_LOAD_PLUGIN_FAILED = 9;
    public static final int ERROR_LOCAL_SERVICE_NOT_FOUND = 7;
    public static final int ERROR_PLATFORM_NOT_INSTALLED = 6;
    public static final int ERROR_REMOTE_SERVICE_NOT_FOUND = 8;
    public static final int ERROR_SO_NOT_FOUND = 1;
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_V8_RUNTIME_CREATION = 4;

    void onInitFailure(int i, Throwable th);

    void onInitSuccess();
}
