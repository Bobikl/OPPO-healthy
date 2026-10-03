package coconut;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.gom;

/* JADX INFO: loaded from: classes12.dex */
public enum c implements ProtocolMessageEnum {
    SCAN_MODE_LOW_POWER(0),
    SCAN_MODE_BALANCED(1),
    SCAN_MODE_LOW_LATENCY(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: coconut, reason: collision with root package name */
    public final int f365coconut;

    static {
        values();
    }

    c(int i) {
        this.f365coconut = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return gom.f11833c.getEnumTypes().get(0);
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f365coconut;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return gom.f11833c.getEnumTypes().get(0).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}
