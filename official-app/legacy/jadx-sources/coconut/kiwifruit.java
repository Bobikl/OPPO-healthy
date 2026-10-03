package coconut;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.gom;

/* JADX INFO: loaded from: classes12.dex */
public enum kiwifruit implements ProtocolMessageEnum {
    DISCOVERY_MODEL_ID(0),
    FAST_PAIR_MODEL_ID(1),
    FAST_PAIR_ACCOUNT(2),
    FAST_PAIR_DEVICE_ID(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: coconut, reason: collision with root package name */
    public final int f387coconut;

    static {
        values();
    }

    kiwifruit(int i) {
        this.f387coconut = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return gom.f11833c.getEnumTypes().get(3);
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f387coconut;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return gom.f11833c.getEnumTypes().get(3).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}
