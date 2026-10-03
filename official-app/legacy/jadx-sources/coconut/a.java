package coconut;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.gom;

/* JADX INFO: loaded from: classes12.dex */
public enum a implements ProtocolMessageEnum {
    BLE(0),
    NSD(1),
    BASED_CONNECT(2),
    RTC(3),
    AUTO(4),
    LAN(5),
    NFC(6),
    USB(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: coconut, reason: collision with root package name */
    public final int f357coconut;

    static {
        values();
    }

    a(int i) {
        this.f357coconut = i;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return gom.f11833c.getEnumTypes().get(2);
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f357coconut;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return gom.f11833c.getEnumTypes().get(2).getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }
}
