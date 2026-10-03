package com.heytap.health.protocol.file;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FileProto$FileServiceId implements Internal.EnumLite {
    FILE_SERVICE_PLACE_HOLDER(0),
    SID_FILE(26),
    UNRECOGNIZED(-1);

    public static final int FILE_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_FILE_VALUE = 26;
    private static final Internal.EnumLiteMap<FileProto$FileServiceId> internalValueMap = new Internal.EnumLiteMap<FileProto$FileServiceId>() { // from class: com.heytap.health.protocol.file.FileProto$FileServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileProto$FileServiceId findValueByNumber(int i) {
            return FileProto$FileServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FileProto$FileServiceId.forNumber(i) != null;
        }
    }

    FileProto$FileServiceId(int i) {
        this.value = i;
    }

    public static FileProto$FileServiceId forNumber(int i) {
        if (i == 0) {
            return FILE_SERVICE_PLACE_HOLDER;
        }
        if (i != 26) {
            return null;
        }
        return SID_FILE;
    }

    public static Internal.EnumLiteMap<FileProto$FileServiceId> internalGetValueMap() {
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
    public static FileProto$FileServiceId valueOf(int i) {
        return forNumber(i);
    }
}
