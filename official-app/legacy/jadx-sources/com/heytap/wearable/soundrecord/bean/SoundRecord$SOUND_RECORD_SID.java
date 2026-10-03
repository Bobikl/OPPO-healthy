package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum SoundRecord$SOUND_RECORD_SID implements Internal.EnumLite {
    SID_SOUND_RECORD_DEFAULT(0),
    SID_SOUND_RECORD_TASK(43),
    UNRECOGNIZED(-1);

    public static final int SID_SOUND_RECORD_DEFAULT_VALUE = 0;
    public static final int SID_SOUND_RECORD_TASK_VALUE = 43;
    private static final Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_SID> internalValueMap = new Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_SID>() { // from class: com.heytap.wearable.soundrecord.bean.SoundRecord$SOUND_RECORD_SID.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SoundRecord$SOUND_RECORD_SID findValueByNumber(int i) {
            return SoundRecord$SOUND_RECORD_SID.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SoundRecord$SOUND_RECORD_SID.forNumber(i) != null;
        }
    }

    SoundRecord$SOUND_RECORD_SID(int i) {
        this.value = i;
    }

    public static SoundRecord$SOUND_RECORD_SID forNumber(int i) {
        if (i == 0) {
            return SID_SOUND_RECORD_DEFAULT;
        }
        if (i != 43) {
            return null;
        }
        return SID_SOUND_RECORD_TASK;
    }

    public static Internal.EnumLiteMap<SoundRecord$SOUND_RECORD_SID> internalGetValueMap() {
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
    public static SoundRecord$SOUND_RECORD_SID valueOf(int i) {
        return forNumber(i);
    }
}
