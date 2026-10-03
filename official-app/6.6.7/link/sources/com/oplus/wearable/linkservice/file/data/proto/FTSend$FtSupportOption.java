package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public enum FTSend$FtSupportOption implements Internal.EnumLite {
    FtSupportReTransFtchunk(0),
    FtSupportFtBuffer(1),
    UNRECOGNIZED(-1);

    public static final int FtSupportFtBuffer_VALUE = 1;
    public static final int FtSupportReTransFtchunk_VALUE = 0;
    private static final Internal.EnumLiteMap<FTSend$FtSupportOption> internalValueMap = new Internal.EnumLiteMap<FTSend$FtSupportOption>() { // from class: com.oplus.wearable.linkservice.file.data.proto.FTSend$FtSupportOption.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FTSend$FtSupportOption findValueByNumber(int i) {
            return FTSend$FtSupportOption.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        public boolean isInRange(int i) {
            return FTSend$FtSupportOption.forNumber(i) != null;
        }
    }

    FTSend$FtSupportOption(int i) {
        this.value = i;
    }

    public static FTSend$FtSupportOption forNumber(int i) {
        if (i == 0) {
            return FtSupportReTransFtchunk;
        }
        if (i != 1) {
            return null;
        }
        return FtSupportFtBuffer;
    }

    public static Internal.EnumLiteMap<FTSend$FtSupportOption> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static FTSend$FtSupportOption valueOf(int i) {
        return forNumber(i);
    }
}
