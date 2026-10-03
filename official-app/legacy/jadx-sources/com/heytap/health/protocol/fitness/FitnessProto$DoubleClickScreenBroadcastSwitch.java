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
public final class FitnessProto$DoubleClickScreenBroadcastSwitch extends GeneratedMessageLite<FitnessProto$DoubleClickScreenBroadcastSwitch, Builder> implements FitnessProto$DoubleClickScreenBroadcastSwitchOrBuilder {
    private static final FitnessProto$DoubleClickScreenBroadcastSwitch DEFAULT_INSTANCE;
    public static final int DOUBLE_CLICK_SCREEN_VOICE_BROADCAST_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$DoubleClickScreenBroadcastSwitch> PARSER;
    private int doubleClickScreenVoiceBroadcast_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$DoubleClickScreenBroadcastSwitch, Builder> implements FitnessProto$DoubleClickScreenBroadcastSwitchOrBuilder {
        public Builder clearDoubleClickScreenVoiceBroadcast() {
            copyOnWrite();
            ((FitnessProto$DoubleClickScreenBroadcastSwitch) this.instance).clearDoubleClickScreenVoiceBroadcast();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DoubleClickScreenBroadcastSwitchOrBuilder
        public int getDoubleClickScreenVoiceBroadcast() {
            return ((FitnessProto$DoubleClickScreenBroadcastSwitch) this.instance).getDoubleClickScreenVoiceBroadcast();
        }

        public Builder setDoubleClickScreenVoiceBroadcast(int i) {
            copyOnWrite();
            ((FitnessProto$DoubleClickScreenBroadcastSwitch) this.instance).setDoubleClickScreenVoiceBroadcast(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$DoubleClickScreenBroadcastSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$DoubleClickScreenBroadcastSwitch fitnessProto$DoubleClickScreenBroadcastSwitch = new FitnessProto$DoubleClickScreenBroadcastSwitch();
        DEFAULT_INSTANCE = fitnessProto$DoubleClickScreenBroadcastSwitch;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$DoubleClickScreenBroadcastSwitch.class, fitnessProto$DoubleClickScreenBroadcastSwitch);
    }

    private FitnessProto$DoubleClickScreenBroadcastSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleClickScreenVoiceBroadcast() {
        this.doubleClickScreenVoiceBroadcast_ = 0;
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$DoubleClickScreenBroadcastSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleClickScreenVoiceBroadcast(int i) {
        this.doubleClickScreenVoiceBroadcast_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$DoubleClickScreenBroadcastSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"doubleClickScreenVoiceBroadcast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$DoubleClickScreenBroadcastSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$DoubleClickScreenBroadcastSwitch.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DoubleClickScreenBroadcastSwitchOrBuilder
    public int getDoubleClickScreenVoiceBroadcast() {
        return this.doubleClickScreenVoiceBroadcast_;
    }

    public static Builder newBuilder(FitnessProto$DoubleClickScreenBroadcastSwitch fitnessProto$DoubleClickScreenBroadcastSwitch) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$DoubleClickScreenBroadcastSwitch);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$DoubleClickScreenBroadcastSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DoubleClickScreenBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
