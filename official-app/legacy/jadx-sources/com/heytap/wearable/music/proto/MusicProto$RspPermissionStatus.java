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
public final class MusicProto$RspPermissionStatus extends GeneratedMessageLite<MusicProto$RspPermissionStatus, Builder> implements MusicProto$RspPermissionStatusOrBuilder {
    private static final MusicProto$RspPermissionStatus DEFAULT_INSTANCE;
    public static final int HASSTORAGEPER_FIELD_NUMBER = 1;
    private static volatile Parser<MusicProto$RspPermissionStatus> PARSER;
    private boolean hasStoragePer_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$RspPermissionStatus, Builder> implements MusicProto$RspPermissionStatusOrBuilder {
        public Builder clearHasStoragePer() {
            copyOnWrite();
            ((MusicProto$RspPermissionStatus) this.instance).clearHasStoragePer();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$RspPermissionStatusOrBuilder
        public boolean getHasStoragePer() {
            return ((MusicProto$RspPermissionStatus) this.instance).getHasStoragePer();
        }

        public Builder setHasStoragePer(boolean z) {
            copyOnWrite();
            ((MusicProto$RspPermissionStatus) this.instance).setHasStoragePer(z);
            return this;
        }

        private Builder() {
            super(MusicProto$RspPermissionStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$RspPermissionStatus musicProto$RspPermissionStatus = new MusicProto$RspPermissionStatus();
        DEFAULT_INSTANCE = musicProto$RspPermissionStatus;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$RspPermissionStatus.class, musicProto$RspPermissionStatus);
    }

    private MusicProto$RspPermissionStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasStoragePer() {
        this.hasStoragePer_ = false;
    }

    public static MusicProto$RspPermissionStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$RspPermissionStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$RspPermissionStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$RspPermissionStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasStoragePer(boolean z) {
        this.hasStoragePer_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$RspPermissionStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"hasStoragePer_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$RspPermissionStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$RspPermissionStatus.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$RspPermissionStatusOrBuilder
    public boolean getHasStoragePer() {
        return this.hasStoragePer_;
    }

    public static Builder newBuilder(MusicProto$RspPermissionStatus musicProto$RspPermissionStatus) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$RspPermissionStatus);
    }

    public static MusicProto$RspPermissionStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$RspPermissionStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$RspPermissionStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$RspPermissionStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$RspPermissionStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$RspPermissionStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$RspPermissionStatus parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$RspPermissionStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$RspPermissionStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$RspPermissionStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$RspPermissionStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
