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
public final class MusicProto$MusicControllerStatus extends GeneratedMessageLite<MusicProto$MusicControllerStatus, Builder> implements MusicProto$MusicControllerStatusOrBuilder {
    private static final MusicProto$MusicControllerStatus DEFAULT_INSTANCE;
    public static final int IS_FOREGROUND_FIELD_NUMBER = 1;
    private static volatile Parser<MusicProto$MusicControllerStatus> PARSER;
    private boolean isForeground_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$MusicControllerStatus, Builder> implements MusicProto$MusicControllerStatusOrBuilder {
        public Builder clearIsForeground() {
            copyOnWrite();
            ((MusicProto$MusicControllerStatus) this.instance).clearIsForeground();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicControllerStatusOrBuilder
        public boolean getIsForeground() {
            return ((MusicProto$MusicControllerStatus) this.instance).getIsForeground();
        }

        public Builder setIsForeground(boolean z) {
            copyOnWrite();
            ((MusicProto$MusicControllerStatus) this.instance).setIsForeground(z);
            return this;
        }

        private Builder() {
            super(MusicProto$MusicControllerStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$MusicControllerStatus musicProto$MusicControllerStatus = new MusicProto$MusicControllerStatus();
        DEFAULT_INSTANCE = musicProto$MusicControllerStatus;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$MusicControllerStatus.class, musicProto$MusicControllerStatus);
    }

    private MusicProto$MusicControllerStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsForeground() {
        this.isForeground_ = false;
    }

    public static MusicProto$MusicControllerStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$MusicControllerStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicControllerStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$MusicControllerStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsForeground(boolean z) {
        this.isForeground_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$MusicControllerStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isForeground_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$MusicControllerStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$MusicControllerStatus.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicControllerStatusOrBuilder
    public boolean getIsForeground() {
        return this.isForeground_;
    }

    public static Builder newBuilder(MusicProto$MusicControllerStatus musicProto$MusicControllerStatus) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$MusicControllerStatus);
    }

    public static MusicProto$MusicControllerStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicControllerStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$MusicControllerStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$MusicControllerStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$MusicControllerStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$MusicControllerStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$MusicControllerStatus parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicControllerStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicControllerStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$MusicControllerStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicControllerStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
