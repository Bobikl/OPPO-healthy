package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$ActivityNotifyState extends GeneratedMessageLite<FitnessProto$ActivityNotifyState, Builder> implements FitnessProto$ActivityNotifyStateOrBuilder {
    private static final FitnessProto$ActivityNotifyState DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$ActivityNotifyState> PARSER = null;
    public static final int SWITCHSTATE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int switchState_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ActivityNotifyState, Builder> implements FitnessProto$ActivityNotifyStateOrBuilder {
        public Builder clearSwitchState() {
            copyOnWrite();
            ((FitnessProto$ActivityNotifyState) this.instance).clearSwitchState();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$ActivityNotifyState) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityNotifyStateOrBuilder
        public int getSwitchState() {
            return ((FitnessProto$ActivityNotifyState) this.instance).getSwitchState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityNotifyStateOrBuilder
        public int getType() {
            return ((FitnessProto$ActivityNotifyState) this.instance).getType();
        }

        public Builder setSwitchState(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityNotifyState) this.instance).setSwitchState(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityNotifyState) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$ActivityNotifyState.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$ActivityNotifyState fitnessProto$ActivityNotifyState = new FitnessProto$ActivityNotifyState();
        DEFAULT_INSTANCE = fitnessProto$ActivityNotifyState;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ActivityNotifyState.class, fitnessProto$ActivityNotifyState);
    }

    private FitnessProto$ActivityNotifyState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchState() {
        this.switchState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FitnessProto$ActivityNotifyState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ActivityNotifyState parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$ActivityNotifyState> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchState(int i) {
        this.switchState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ActivityNotifyState();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"switchState_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ActivityNotifyState> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ActivityNotifyState.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityNotifyStateOrBuilder
    public int getSwitchState() {
        return this.switchState_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityNotifyStateOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FitnessProto$ActivityNotifyState fitnessProto$ActivityNotifyState) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ActivityNotifyState);
    }

    public static FitnessProto$ActivityNotifyState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ActivityNotifyState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityNotifyState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
