package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$DownloadNewAppOp implements Internal.EnumLite {
    OP_DEFAULT(0),
    OP_INSTALLED(1),
    OP_CANCEL(2),
    UNRECOGNIZED(-1);

    public static final int OP_CANCEL_VALUE = 2;
    public static final int OP_DEFAULT_VALUE = 0;
    public static final int OP_INSTALLED_VALUE = 1;
    private static final Internal.EnumLiteMap<WatchAppProto$DownloadNewAppOp> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$DownloadNewAppOp>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$DownloadNewAppOp.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$DownloadNewAppOp findValueByNumber(int i) {
            return WatchAppProto$DownloadNewAppOp.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$DownloadNewAppOp.forNumber(i) != null;
        }
    }

    WatchAppProto$DownloadNewAppOp(int i) {
        this.value = i;
    }

    public static WatchAppProto$DownloadNewAppOp forNumber(int i) {
        if (i == 0) {
            return OP_DEFAULT;
        }
        if (i == 1) {
            return OP_INSTALLED;
        }
        if (i != 2) {
            return null;
        }
        return OP_CANCEL;
    }

    public static Internal.EnumLiteMap<WatchAppProto$DownloadNewAppOp> internalGetValueMap() {
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
    public static WatchAppProto$DownloadNewAppOp valueOf(int i) {
        return forNumber(i);
    }
}
