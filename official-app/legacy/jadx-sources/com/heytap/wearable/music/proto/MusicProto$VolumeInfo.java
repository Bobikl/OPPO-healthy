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
public final class MusicProto$VolumeInfo extends GeneratedMessageLite<MusicProto$VolumeInfo, Builder> implements MusicProto$VolumeInfoOrBuilder {
    public static final int CURRENT_VOLUME_FIELD_NUMBER = 1;
    private static final MusicProto$VolumeInfo DEFAULT_INSTANCE;
    public static final int MAX_VOLUME_FIELD_NUMBER = 2;
    private static volatile Parser<MusicProto$VolumeInfo> PARSER;
    private int currentVolume_;
    private int maxVolume_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$VolumeInfo, Builder> implements MusicProto$VolumeInfoOrBuilder {
        public Builder clearCurrentVolume() {
            copyOnWrite();
            ((MusicProto$VolumeInfo) this.instance).clearCurrentVolume();
            return this;
        }

        public Builder clearMaxVolume() {
            copyOnWrite();
            ((MusicProto$VolumeInfo) this.instance).clearMaxVolume();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$VolumeInfoOrBuilder
        public int getCurrentVolume() {
            return ((MusicProto$VolumeInfo) this.instance).getCurrentVolume();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$VolumeInfoOrBuilder
        public int getMaxVolume() {
            return ((MusicProto$VolumeInfo) this.instance).getMaxVolume();
        }

        public Builder setCurrentVolume(int i) {
            copyOnWrite();
            ((MusicProto$VolumeInfo) this.instance).setCurrentVolume(i);
            return this;
        }

        public Builder setMaxVolume(int i) {
            copyOnWrite();
            ((MusicProto$VolumeInfo) this.instance).setMaxVolume(i);
            return this;
        }

        private Builder() {
            super(MusicProto$VolumeInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$VolumeInfo musicProto$VolumeInfo = new MusicProto$VolumeInfo();
        DEFAULT_INSTANCE = musicProto$VolumeInfo;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$VolumeInfo.class, musicProto$VolumeInfo);
    }

    private MusicProto$VolumeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentVolume() {
        this.currentVolume_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxVolume() {
        this.maxVolume_ = 0;
    }

    public static MusicProto$VolumeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$VolumeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$VolumeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$VolumeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentVolume(int i) {
        this.currentVolume_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxVolume(int i) {
        this.maxVolume_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$VolumeInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"currentVolume_", "maxVolume_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$VolumeInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$VolumeInfo.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$VolumeInfoOrBuilder
    public int getCurrentVolume() {
        return this.currentVolume_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$VolumeInfoOrBuilder
    public int getMaxVolume() {
        return this.maxVolume_;
    }

    public static Builder newBuilder(MusicProto$VolumeInfo musicProto$VolumeInfo) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$VolumeInfo);
    }

    public static MusicProto$VolumeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$VolumeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$VolumeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$VolumeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$VolumeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$VolumeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$VolumeInfo parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$VolumeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$VolumeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$VolumeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$VolumeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
