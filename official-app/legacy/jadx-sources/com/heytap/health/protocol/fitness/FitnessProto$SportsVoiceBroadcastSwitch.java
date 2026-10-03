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
public final class FitnessProto$SportsVoiceBroadcastSwitch extends GeneratedMessageLite<FitnessProto$SportsVoiceBroadcastSwitch, Builder> implements FitnessProto$SportsVoiceBroadcastSwitchOrBuilder {
    private static final FitnessProto$SportsVoiceBroadcastSwitch DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SportsVoiceBroadcastSwitch> PARSER = null;
    public static final int SPORTS_VOICE_BROADCAST_FIELD_NUMBER = 1;
    private int sportsVoiceBroadcast_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SportsVoiceBroadcastSwitch, Builder> implements FitnessProto$SportsVoiceBroadcastSwitchOrBuilder {
        public Builder clearSportsVoiceBroadcast() {
            copyOnWrite();
            ((FitnessProto$SportsVoiceBroadcastSwitch) this.instance).clearSportsVoiceBroadcast();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportsVoiceBroadcastSwitchOrBuilder
        public int getSportsVoiceBroadcast() {
            return ((FitnessProto$SportsVoiceBroadcastSwitch) this.instance).getSportsVoiceBroadcast();
        }

        public Builder setSportsVoiceBroadcast(int i) {
            copyOnWrite();
            ((FitnessProto$SportsVoiceBroadcastSwitch) this.instance).setSportsVoiceBroadcast(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SportsVoiceBroadcastSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SportsVoiceBroadcastSwitch fitnessProto$SportsVoiceBroadcastSwitch = new FitnessProto$SportsVoiceBroadcastSwitch();
        DEFAULT_INSTANCE = fitnessProto$SportsVoiceBroadcastSwitch;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SportsVoiceBroadcastSwitch.class, fitnessProto$SportsVoiceBroadcastSwitch);
    }

    private FitnessProto$SportsVoiceBroadcastSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsVoiceBroadcast() {
        this.sportsVoiceBroadcast_ = 0;
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SportsVoiceBroadcastSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsVoiceBroadcast(int i) {
        this.sportsVoiceBroadcast_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SportsVoiceBroadcastSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"sportsVoiceBroadcast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SportsVoiceBroadcastSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SportsVoiceBroadcastSwitch.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportsVoiceBroadcastSwitchOrBuilder
    public int getSportsVoiceBroadcast() {
        return this.sportsVoiceBroadcast_;
    }

    public static Builder newBuilder(FitnessProto$SportsVoiceBroadcastSwitch fitnessProto$SportsVoiceBroadcastSwitch) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SportsVoiceBroadcastSwitch);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SportsVoiceBroadcastSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportsVoiceBroadcastSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
