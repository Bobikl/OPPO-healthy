package com.heytap.health.protocol.fatlossassess;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FatLossAssessProto$FatLossAssessServiceId implements Internal.EnumLite {
    FAT_LOSS_ASSESS_SERVICE_PLACE_HOLDER(0),
    SID_FAT_LOSS_ASSESS(4),
    UNRECOGNIZED(-1);

    public static final int FAT_LOSS_ASSESS_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_FAT_LOSS_ASSESS_VALUE = 4;
    private static final Internal.EnumLiteMap<FatLossAssessProto$FatLossAssessServiceId> internalValueMap = new Internal.EnumLiteMap<FatLossAssessProto$FatLossAssessServiceId>() { // from class: com.heytap.health.protocol.fatlossassess.FatLossAssessProto$FatLossAssessServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FatLossAssessProto$FatLossAssessServiceId findValueByNumber(int i) {
            return FatLossAssessProto$FatLossAssessServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FatLossAssessProto$FatLossAssessServiceId.forNumber(i) != null;
        }
    }

    FatLossAssessProto$FatLossAssessServiceId(int i) {
        this.value = i;
    }

    public static FatLossAssessProto$FatLossAssessServiceId forNumber(int i) {
        if (i == 0) {
            return FAT_LOSS_ASSESS_SERVICE_PLACE_HOLDER;
        }
        if (i != 4) {
            return null;
        }
        return SID_FAT_LOSS_ASSESS;
    }

    public static Internal.EnumLiteMap<FatLossAssessProto$FatLossAssessServiceId> internalGetValueMap() {
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
    public static FatLossAssessProto$FatLossAssessServiceId valueOf(int i) {
        return forNumber(i);
    }
}
