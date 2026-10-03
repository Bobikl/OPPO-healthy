package com.heytap.health.protocol.relax;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum RelaxProto$RelaxCmdId implements Internal.EnumLite {
    RELAX_CMD_PLACE_HOLDER(0),
    CMD_RELAX(1),
    CMD_RELAX_DETAIL(2),
    UNRECOGNIZED(-1);

    public static final int CMD_RELAX_DETAIL_VALUE = 2;
    public static final int CMD_RELAX_VALUE = 1;
    public static final int RELAX_CMD_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<RelaxProto$RelaxCmdId> internalValueMap = new Internal.EnumLiteMap<RelaxProto$RelaxCmdId>() { // from class: com.heytap.health.protocol.relax.RelaxProto$RelaxCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RelaxProto$RelaxCmdId findValueByNumber(int i) {
            return RelaxProto$RelaxCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RelaxProto$RelaxCmdId.forNumber(i) != null;
        }
    }

    RelaxProto$RelaxCmdId(int i) {
        this.value = i;
    }

    public static RelaxProto$RelaxCmdId forNumber(int i) {
        if (i == 0) {
            return RELAX_CMD_PLACE_HOLDER;
        }
        if (i == 1) {
            return CMD_RELAX;
        }
        if (i != 2) {
            return null;
        }
        return CMD_RELAX_DETAIL;
    }

    public static Internal.EnumLiteMap<RelaxProto$RelaxCmdId> internalGetValueMap() {
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
    public static RelaxProto$RelaxCmdId valueOf(int i) {
        return forNumber(i);
    }
}
