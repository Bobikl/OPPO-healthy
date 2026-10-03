package com.heytap.wearable.music.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ibc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicProto$ControlConfig extends GeneratedMessageLite<MusicProto$ControlConfig, Builder> implements MusicProto$ControlConfigOrBuilder {
    public static final int CAN_CONTROL_FIELD_NUMBER = 1;
    private static final MusicProto$ControlConfig DEFAULT_INSTANCE;
    private static volatile Parser<MusicProto$ControlConfig> PARSER;
    private boolean canControl_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$ControlConfig, Builder> implements MusicProto$ControlConfigOrBuilder {
        public Builder clearCanControl() {
            copyOnWrite();
            ((MusicProto$ControlConfig) this.instance).clearCanControl();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$ControlConfigOrBuilder
        public boolean getCanControl() {
            return ((MusicProto$ControlConfig) this.instance).getCanControl();
        }

        public Builder setCanControl(boolean z) {
            copyOnWrite();
            ((MusicProto$ControlConfig) this.instance).setCanControl(z);
            return this;
        }

        private Builder() {
            super(MusicProto$ControlConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$ControlConfig musicProto$ControlConfig = new MusicProto$ControlConfig();
        DEFAULT_INSTANCE = musicProto$ControlConfig;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$ControlConfig.class, musicProto$ControlConfig);
    }

    private MusicProto$ControlConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanControl() {
        this.canControl_ = false;
    }

    public static MusicProto$ControlConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$ControlConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$ControlConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$ControlConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanControl(boolean z) {
        this.canControl_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$ControlConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"canControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$ControlConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$ControlConfig.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$ControlConfigOrBuilder
    public boolean getCanControl() {
        return this.canControl_;
    }

    public static Builder newBuilder(MusicProto$ControlConfig musicProto$ControlConfig) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$ControlConfig);
    }

    public static MusicProto$ControlConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$ControlConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$ControlConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$ControlConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$ControlConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$ControlConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$ControlConfig parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$ControlConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$ControlConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$ControlConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
