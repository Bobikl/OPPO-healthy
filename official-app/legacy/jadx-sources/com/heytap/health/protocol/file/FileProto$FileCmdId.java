package com.heytap.health.protocol.file;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FileProto$FileCmdId implements Internal.EnumLite {
    FILE_CMD_PLACE_HOLDER(0),
    CMD_FILE(1),
    CMD_FILE_NAME_LIST(2),
    UNRECOGNIZED(-1);

    public static final int CMD_FILE_NAME_LIST_VALUE = 2;
    public static final int CMD_FILE_VALUE = 1;
    public static final int FILE_CMD_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<FileProto$FileCmdId> internalValueMap = new Internal.EnumLiteMap<FileProto$FileCmdId>() { // from class: com.heytap.health.protocol.file.FileProto$FileCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileProto$FileCmdId findValueByNumber(int i) {
            return FileProto$FileCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FileProto$FileCmdId.forNumber(i) != null;
        }
    }

    FileProto$FileCmdId(int i) {
        this.value = i;
    }

    public static FileProto$FileCmdId forNumber(int i) {
        if (i == 0) {
            return FILE_CMD_PLACE_HOLDER;
        }
        if (i == 1) {
            return CMD_FILE;
        }
        if (i != 2) {
            return null;
        }
        return CMD_FILE_NAME_LIST;
    }

    public static Internal.EnumLiteMap<FileProto$FileCmdId> internalGetValueMap() {
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
    public static FileProto$FileCmdId valueOf(int i) {
        return forNumber(i);
    }
}
