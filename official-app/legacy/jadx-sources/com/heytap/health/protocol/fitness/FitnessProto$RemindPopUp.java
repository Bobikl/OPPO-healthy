package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$RemindPopUp extends GeneratedMessageLite<FitnessProto$RemindPopUp, Builder> implements FitnessProto$RemindPopUpOrBuilder {
    public static final int BED_TIME_FIELD_NUMBER = 2;
    private static final FitnessProto$RemindPopUp DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$RemindPopUp> PARSER = null;
    public static final int POP_UP_TYPE_FIELD_NUMBER = 1;
    public static final int WAKE_UP_TIME_FIELD_NUMBER = 3;
    private int bedTime_;
    private int popUpType_;
    private int wakeUpTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$RemindPopUp, Builder> implements FitnessProto$RemindPopUpOrBuilder {
        public Builder clearBedTime() {
            copyOnWrite();
            ((FitnessProto$RemindPopUp) this.instance).clearBedTime();
            return this;
        }

        public Builder clearPopUpType() {
            copyOnWrite();
            ((FitnessProto$RemindPopUp) this.instance).clearPopUpType();
            return this;
        }

        public Builder clearWakeUpTime() {
            copyOnWrite();
            ((FitnessProto$RemindPopUp) this.instance).clearWakeUpTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RemindPopUpOrBuilder
        public int getBedTime() {
            return ((FitnessProto$RemindPopUp) this.instance).getBedTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RemindPopUpOrBuilder
        public PopUpType getPopUpType() {
            return ((FitnessProto$RemindPopUp) this.instance).getPopUpType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RemindPopUpOrBuilder
        public int getPopUpTypeValue() {
            return ((FitnessProto$RemindPopUp) this.instance).getPopUpTypeValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RemindPopUpOrBuilder
        public int getWakeUpTime() {
            return ((FitnessProto$RemindPopUp) this.instance).getWakeUpTime();
        }

        public Builder setBedTime(int i) {
            copyOnWrite();
            ((FitnessProto$RemindPopUp) this.instance).setBedTime(i);
            return this;
        }

        public Builder setPopUpType(PopUpType popUpType) {
            copyOnWrite();
            ((FitnessProto$RemindPopUp) this.instance).setPopUpType(popUpType);
            return this;
        }

        public Builder setPopUpTypeValue(int i) {
            copyOnWrite();
            ((FitnessProto$RemindPopUp) this.instance).setPopUpTypeValue(i);
            return this;
        }

        public Builder setWakeUpTime(int i) {
            copyOnWrite();
            ((FitnessProto$RemindPopUp) this.instance).setWakeUpTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$RemindPopUp.DEFAULT_INSTANCE);
        }
    }

    public enum PopUpType implements Internal.EnumLite {
        STAY_UP_BED(0),
        BED_TIME(1),
        UNRECOGNIZED(-1);

        public static final int BED_TIME_VALUE = 1;
        public static final int STAY_UP_BED_VALUE = 0;
        private static final Internal.EnumLiteMap<PopUpType> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<PopUpType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public PopUpType findValueByNumber(int i) {
                return PopUpType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return PopUpType.forNumber(i) != null;
            }
        }

        PopUpType(int i) {
            this.value = i;
        }

        public static PopUpType forNumber(int i) {
            if (i == 0) {
                return STAY_UP_BED;
            }
            if (i != 1) {
                return null;
            }
            return BED_TIME;
        }

        public static Internal.EnumLiteMap<PopUpType> internalGetValueMap() {
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
        public static PopUpType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        FitnessProto$RemindPopUp fitnessProto$RemindPopUp = new FitnessProto$RemindPopUp();
        DEFAULT_INSTANCE = fitnessProto$RemindPopUp;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$RemindPopUp.class, fitnessProto$RemindPopUp);
    }

    private FitnessProto$RemindPopUp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBedTime() {
        this.bedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopUpType() {
        this.popUpType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWakeUpTime() {
        this.wakeUpTime_ = 0;
    }

    public static FitnessProto$RemindPopUp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$RemindPopUp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RemindPopUp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$RemindPopUp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBedTime(int i) {
        this.bedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopUpType(PopUpType popUpType) {
        this.popUpType_ = popUpType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopUpTypeValue(int i) {
        this.popUpType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWakeUpTime(int i) {
        this.wakeUpTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$RemindPopUp();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[]{"popUpType_", "bedTime_", "wakeUpTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$RemindPopUp> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$RemindPopUp.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RemindPopUpOrBuilder
    public int getBedTime() {
        return this.bedTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RemindPopUpOrBuilder
    public PopUpType getPopUpType() {
        PopUpType popUpTypeForNumber = PopUpType.forNumber(this.popUpType_);
        return popUpTypeForNumber == null ? PopUpType.UNRECOGNIZED : popUpTypeForNumber;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RemindPopUpOrBuilder
    public int getPopUpTypeValue() {
        return this.popUpType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RemindPopUpOrBuilder
    public int getWakeUpTime() {
        return this.wakeUpTime_;
    }

    public static Builder newBuilder(FitnessProto$RemindPopUp fitnessProto$RemindPopUp) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$RemindPopUp);
    }

    public static FitnessProto$RemindPopUp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RemindPopUp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$RemindPopUp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$RemindPopUp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$RemindPopUp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$RemindPopUp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$RemindPopUp parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RemindPopUp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RemindPopUp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$RemindPopUp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RemindPopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
