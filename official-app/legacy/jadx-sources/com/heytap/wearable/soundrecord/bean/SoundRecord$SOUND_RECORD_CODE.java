package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum SoundRecord$SOUND_RECORD_CODE implements Internal.EnumLite {
    CODE_SUCCESS(0),
    CODE_UNKNOWN(1),
    CODE_STORAGE_FULL(2),
    CODE_UNAUTHORIZED_BY_PHONE(3),
    CODE_LOW_BATTERY(4),
    CODE_UNAUTHORIZED_BY_WATCH(5),
    CODE_FILE_NOT_EXIST(6),
    UNRECOGNIZED(-1);

    public static final int CODE_FILE_NOT_EXIST_VALUE = 6;
    public static final int CODE_LOW_BATTERY_VALUE = 4;
    public static final int CODE_STORAGE_FULL_VALUE = 2;
    public static final int CODE_SUCCESS_VALUE = 0;
    public static final int CODE_UNAUTHORIZED_BY_PHONE_VALUE = 3;
    public static final int CODE_UNAUTHORIZED_BY_WATCH_VALUE = 5;
    public static final int CODE_UNKNOWN_VALUE = 1;
    private static final Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_CODE> internalValueMap = new Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_CODE>() { // from class: com.heytap.wearable.soundrecord.bean.SoundRecord$SOUND_RECORD_CODE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SoundRecord$SOUND_RECORD_CODE findValueByNumber(int i) {
            return SoundRecord$SOUND_RECORD_CODE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SoundRecord$SOUND_RECORD_CODE.forNumber(i) != null;
        }
    }

    SoundRecord$SOUND_RECORD_CODE(int i) {
        this.value = i;
    }

    public static SoundRecord$SOUND_RECORD_CODE forNumber(int i) {
        switch (i) {
            case 0:
                return CODE_SUCCESS;
            case 1:
                return CODE_UNKNOWN;
            case 2:
                return CODE_STORAGE_FULL;
            case 3:
                return CODE_UNAUTHORIZED_BY_PHONE;
            case 4:
                return CODE_LOW_BATTERY;
            case 5:
                return CODE_UNAUTHORIZED_BY_WATCH;
            case 6:
                return CODE_FILE_NOT_EXIST;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_CODE> internalGetValueMap() {
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
    public static SoundRecord$SOUND_RECORD_CODE valueOf(int i) {
        return forNumber(i);
    }
}
