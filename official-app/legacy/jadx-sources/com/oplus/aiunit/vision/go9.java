package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface go9 {
    public static final int COMMAND_AES_CONSULT = 37;
    public static final int COMMAND_IDENTITY_CHECK = 25;
    public static final int COMMAND_IDENTITY_CONSULT = 24;
    public static final int COMMAND_KEY_CONSULT = 22;
    public static final int COMMAND_RSA_CONSULT = 36;
    public static final int COMMAND_SHAKE_HAND = 21;
    public static final int COMMAND_TRANSPORT_CONSULT = 1;
    public static final int SERVICE_CONSULT = 1;

    public interface a {
        public static final int ERROR_AES_KEY_NULL = 13;
        public static final int ERROR_CONNECTION_LOST = 2;
        public static final int ERROR_FAILED = 3;
        public static final int ERROR_IDENTITY_CHECK_ENCRYPT = 10;
        public static final int ERROR_IDENTITY_CHECK_FAILED = 11;
        public static final int ERROR_IDENTITY_GENERATOR_KEY = 9;
        public static final int ERROR_KEY_NOT_EXIST = 5;
        public static final int ERROR_KEY_NOT_MATCH = 8;
        public static final int ERROR_KEY_SAVE_FAIL = 6;
        public static final int ERROR_NONE = 1;
        public static final int ERROR_NOT_INIT_RSA = 12;
        public static final int ERROR_PARSE_FAILED = 4;
        public static final int ERROR_TIME_OUT = 7;

        void a(int i);

        void b(ModuleInfo moduleInfo, o9k o9kVar);
    }

    void a(byte[] bArr);

    void b();

    void c(boolean z);

    void d(byte[] bArr);

    boolean e();

    void f(a aVar);
}
