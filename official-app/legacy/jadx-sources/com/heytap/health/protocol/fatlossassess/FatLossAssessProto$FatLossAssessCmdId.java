package com.heytap.health.protocol.fatlossassess;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FatLossAssessProto$FatLossAssessCmdId implements Internal.EnumLite {
    FAT_LOSS_ASSESS_COMMAND_PLACE_HOLDER(0),
    CID_FAT_LOSS_ASSESS(33),
    UNRECOGNIZED(-1);

    public static final int CID_FAT_LOSS_ASSESS_VALUE = 33;
    public static final int FAT_LOSS_ASSESS_COMMAND_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<FatLossAssessProto$FatLossAssessCmdId> internalValueMap = new Internal.EnumLiteMap<FatLossAssessProto$FatLossAssessCmdId>() { // from class: com.heytap.health.protocol.fatlossassess.FatLossAssessProto$FatLossAssessCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FatLossAssessProto$FatLossAssessCmdId findValueByNumber(int i) {
            return FatLossAssessProto$FatLossAssessCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FatLossAssessProto$FatLossAssessCmdId.forNumber(i) != null;
        }
    }

    FatLossAssessProto$FatLossAssessCmdId(int i) {
        this.value = i;
    }

    public static FatLossAssessProto$FatLossAssessCmdId forNumber(int i) {
        if (i == 0) {
            return FAT_LOSS_ASSESS_COMMAND_PLACE_HOLDER;
        }
        if (i != 33) {
            return null;
        }
        return CID_FAT_LOSS_ASSESS;
    }

    public static Internal.EnumLiteMap<FatLossAssessProto$FatLossAssessCmdId> internalGetValueMap() {
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
    public static FatLossAssessProto$FatLossAssessCmdId valueOf(int i) {
        return forNumber(i);
    }
}
