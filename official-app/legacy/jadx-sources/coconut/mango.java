package coconut;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.gom;

/* JADX INFO: loaded from: classes12.dex */
public enum mango implements ProtocolMessageEnum {
    NO_ACCOUNT(0),
    DIFFERENT_ACCOUNT(1),
    SAME_ACCOUNT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: coconut, reason: collision with root package name */
    public final int f389coconut;

    static {
        values();
    }

    mango(int i) {
        this.f389coconut = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return gom.f11833c.getEnumTypes().get(6);
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f389coconut;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return gom.f11833c.getEnumTypes().get(6).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}
