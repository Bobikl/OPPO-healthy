package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$InstallStatusRespCode implements Internal.EnumLite {
    CHECK_FAILED(0),
    CHECK_SUCCESS(1),
    START_INSTALL(2),
    INSTALL_SUCCESS(3),
    INSTALL_FAILED(4),
    UNRECOGNIZED(-1);

    public static final int CHECK_FAILED_VALUE = 0;
    public static final int CHECK_SUCCESS_VALUE = 1;
    public static final int INSTALL_FAILED_VALUE = 4;
    public static final int INSTALL_SUCCESS_VALUE = 3;
    public static final int START_INSTALL_VALUE = 2;
    private static final Internal.EnumLiteMap<Proto$InstallStatusRespCode> internalValueMap = new Internal.EnumLiteMap<Proto$InstallStatusRespCode>() { // from class: com.heytap.health.watch.watchface.proto.Proto$InstallStatusRespCode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$InstallStatusRespCode findValueByNumber(int i) {
            return Proto$InstallStatusRespCode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$InstallStatusRespCode.forNumber(i) != null;
        }
    }

    Proto$InstallStatusRespCode(int i) {
        this.value = i;
    }

    public static Proto$InstallStatusRespCode forNumber(int i) {
        if (i == 0) {
            return CHECK_FAILED;
        }
        if (i == 1) {
            return CHECK_SUCCESS;
        }
        if (i == 2) {
            return START_INSTALL;
        }
        if (i == 3) {
            return INSTALL_SUCCESS;
        }
        if (i != 4) {
            return null;
        }
        return INSTALL_FAILED;
    }

    public static Internal.EnumLiteMap<Proto$InstallStatusRespCode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Proto$InstallStatusRespCode valueOf(int i) {
        return forNumber(i);
    }
}
