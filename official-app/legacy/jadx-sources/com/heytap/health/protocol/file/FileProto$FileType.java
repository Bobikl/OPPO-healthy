package com.heytap.health.protocol.file;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FileProto$FileType implements Internal.EnumLite {
    FILE_TYPE_LOG(0),
    FILE_TYPE_TRACK(2),
    FILE_TYPE_BEHAVIOR(3),
    UNRECOGNIZED(-1);

    public static final int FILE_TYPE_BEHAVIOR_VALUE = 3;
    public static final int FILE_TYPE_LOG_VALUE = 0;
    public static final int FILE_TYPE_TRACK_VALUE = 2;
    private static final Internal.EnumLiteMap<FileProto$FileType> internalValueMap = new Internal.EnumLiteMap<FileProto$FileType>() { // from class: com.heytap.health.protocol.file.FileProto$FileType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileProto$FileType findValueByNumber(int i) {
            return FileProto$FileType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FileProto$FileType.forNumber(i) != null;
        }
    }

    FileProto$FileType(int i) {
        this.value = i;
    }

    public static FileProto$FileType forNumber(int i) {
        if (i == 0) {
            return FILE_TYPE_LOG;
        }
        if (i == 2) {
            return FILE_TYPE_TRACK;
        }
        if (i != 3) {
            return null;
        }
        return FILE_TYPE_BEHAVIOR;
    }

    public static Internal.EnumLiteMap<FileProto$FileType> internalGetValueMap() {
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
    public static FileProto$FileType valueOf(int i) {
        return forNumber(i);
    }
}
