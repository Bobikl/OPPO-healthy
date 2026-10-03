package com.heytap.health.telecom.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nqj;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes18.dex */
public final class TelecomProto$AudioSwitch extends GeneratedMessageLite<TelecomProto$AudioSwitch, Builder> implements TelecomProto$AudioSwitchOrBuilder {
    private static final TelecomProto$AudioSwitch DEFAULT_INSTANCE;
    private static volatile Parser<TelecomProto$AudioSwitch> PARSER = null;
    public static final int PRIMARY_FIELD_NUMBER = 2;
    public static final int SUPPORTAUDIOSWITCH_FIELD_NUMBER = 1;
    private boolean primary_;
    private boolean supportAudioSwitch_;

    public static final class Builder extends GeneratedMessageLite.Builder<TelecomProto$AudioSwitch, Builder> implements TelecomProto$AudioSwitchOrBuilder {
        public Builder clearPrimary() {
            copyOnWrite();
            ((TelecomProto$AudioSwitch) this.instance).clearPrimary();
            return this;
        }

        public Builder clearSupportAudioSwitch() {
            copyOnWrite();
            ((TelecomProto$AudioSwitch) this.instance).clearSupportAudioSwitch();
            return this;
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$AudioSwitchOrBuilder
        public boolean getPrimary() {
            return ((TelecomProto$AudioSwitch) this.instance).getPrimary();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$AudioSwitchOrBuilder
        public boolean getSupportAudioSwitch() {
            return ((TelecomProto$AudioSwitch) this.instance).getSupportAudioSwitch();
        }

        public Builder setPrimary(boolean z) {
            copyOnWrite();
            ((TelecomProto$AudioSwitch) this.instance).setPrimary(z);
            return this;
        }

        public Builder setSupportAudioSwitch(boolean z) {
            copyOnWrite();
            ((TelecomProto$AudioSwitch) this.instance).setSupportAudioSwitch(z);
            return this;
        }

        private Builder() {
            super(TelecomProto$AudioSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        TelecomProto$AudioSwitch telecomProto$AudioSwitch = new TelecomProto$AudioSwitch();
        DEFAULT_INSTANCE = telecomProto$AudioSwitch;
        GeneratedMessageLite.registerDefaultInstance(TelecomProto$AudioSwitch.class, telecomProto$AudioSwitch);
    }

    private TelecomProto$AudioSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimary() {
        this.primary_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportAudioSwitch() {
        this.supportAudioSwitch_ = false;
    }

    public static TelecomProto$AudioSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TelecomProto$AudioSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TelecomProto$AudioSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TelecomProto$AudioSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimary(boolean z) {
        this.primary_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportAudioSwitch(boolean z) {
        this.supportAudioSwitch_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nqj.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new TelecomProto$AudioSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"supportAudioSwitch_", "primary_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TelecomProto$AudioSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TelecomProto$AudioSwitch.class) {
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

    @Override // com.heytap.health.telecom.proto.TelecomProto$AudioSwitchOrBuilder
    public boolean getPrimary() {
        return this.primary_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$AudioSwitchOrBuilder
    public boolean getSupportAudioSwitch() {
        return this.supportAudioSwitch_;
    }

    public static Builder newBuilder(TelecomProto$AudioSwitch telecomProto$AudioSwitch) {
        return DEFAULT_INSTANCE.createBuilder(telecomProto$AudioSwitch);
    }

    public static TelecomProto$AudioSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TelecomProto$AudioSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TelecomProto$AudioSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TelecomProto$AudioSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TelecomProto$AudioSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TelecomProto$AudioSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TelecomProto$AudioSwitch parseFrom(InputStream inputStream) throws IOException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TelecomProto$AudioSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TelecomProto$AudioSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TelecomProto$AudioSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$AudioSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
