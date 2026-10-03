package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum SoundRecord$SOUND_RECORD_CID implements Internal.EnumLite {
    CID_SOUND_RECORD_DEFAULT(0),
    CID_RECORD_LIST(1),
    CID_RECORD_TRANSFER(2),
    CID_RECORD_DELETE(3),
    CID_RECORD_WATCH_SYNC(4),
    CID_RECORD_WATCH_SYNC_ALL(5),
    CID_RECORD_WATCH_SYNC_AUTO_SWITCH(6),
    CID_RECORD_CHECK_LOCAL_EXIST(7),
    UNRECOGNIZED(-1);

    public static final int CID_RECORD_CHECK_LOCAL_EXIST_VALUE = 7;
    public static final int CID_RECORD_DELETE_VALUE = 3;
    public static final int CID_RECORD_LIST_VALUE = 1;
    public static final int CID_RECORD_TRANSFER_VALUE = 2;
    public static final int CID_RECORD_WATCH_SYNC_ALL_VALUE = 5;
    public static final int CID_RECORD_WATCH_SYNC_AUTO_SWITCH_VALUE = 6;
    public static final int CID_RECORD_WATCH_SYNC_VALUE = 4;
    public static final int CID_SOUND_RECORD_DEFAULT_VALUE = 0;
    private static final Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_CID> internalValueMap = new Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_CID>() { // from class: com.heytap.wearable.soundrecord.bean.SoundRecord$SOUND_RECORD_CID.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SoundRecord$SOUND_RECORD_CID findValueByNumber(int i) {
            return SoundRecord$SOUND_RECORD_CID.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SoundRecord$SOUND_RECORD_CID.forNumber(i) != null;
        }
    }

    SoundRecord$SOUND_RECORD_CID(int i) {
        this.value = i;
    }

    public static SoundRecord$SOUND_RECORD_CID forNumber(int i) {
        switch (i) {
            case 0:
                return CID_SOUND_RECORD_DEFAULT;
            case 1:
                return CID_RECORD_LIST;
            case 2:
                return CID_RECORD_TRANSFER;
            case 3:
                return CID_RECORD_DELETE;
            case 4:
                return CID_RECORD_WATCH_SYNC;
            case 5:
                return CID_RECORD_WATCH_SYNC_ALL;
            case 6:
                return CID_RECORD_WATCH_SYNC_AUTO_SWITCH;
            case 7:
                return CID_RECORD_CHECK_LOCAL_EXIST;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_CID> internalGetValueMap() {
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
    public static SoundRecord$SOUND_RECORD_CID valueOf(int i) {
        return forNumber(i);
    }
}
