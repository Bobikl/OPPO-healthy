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
public final class MusicProto$TotalInfo extends GeneratedMessageLite<MusicProto$TotalInfo, Builder> implements MusicProto$TotalInfoOrBuilder {
    private static final MusicProto$TotalInfo DEFAULT_INSTANCE;
    private static volatile Parser<MusicProto$TotalInfo> PARSER = null;
    public static final int PLAY_INFO_FIELD_NUMBER = 1;
    public static final int PLAY_STATE_FIELD_NUMBER = 2;
    public static final int VOLUME_INFO_FIELD_NUMBER = 3;
    private int bitField0_;
    private MusicProto$PlayInfo playInfo_;
    private MusicProto$PlayState playState_;
    private MusicProto$VolumeInfo volumeInfo_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$TotalInfo, Builder> implements MusicProto$TotalInfoOrBuilder {
        public Builder clearPlayInfo() {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).clearPlayInfo();
            return this;
        }

        public Builder clearPlayState() {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).clearPlayState();
            return this;
        }

        public Builder clearVolumeInfo() {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).clearVolumeInfo();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
        public MusicProto$PlayInfo getPlayInfo() {
            return ((MusicProto$TotalInfo) this.instance).getPlayInfo();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
        public MusicProto$PlayState getPlayState() {
            return ((MusicProto$TotalInfo) this.instance).getPlayState();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
        public MusicProto$VolumeInfo getVolumeInfo() {
            return ((MusicProto$TotalInfo) this.instance).getVolumeInfo();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
        public boolean hasPlayInfo() {
            return ((MusicProto$TotalInfo) this.instance).hasPlayInfo();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
        public boolean hasPlayState() {
            return ((MusicProto$TotalInfo) this.instance).hasPlayState();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
        public boolean hasVolumeInfo() {
            return ((MusicProto$TotalInfo) this.instance).hasVolumeInfo();
        }

        public Builder mergePlayInfo(MusicProto$PlayInfo musicProto$PlayInfo) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).mergePlayInfo(musicProto$PlayInfo);
            return this;
        }

        public Builder mergePlayState(MusicProto$PlayState musicProto$PlayState) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).mergePlayState(musicProto$PlayState);
            return this;
        }

        public Builder mergeVolumeInfo(MusicProto$VolumeInfo musicProto$VolumeInfo) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).mergeVolumeInfo(musicProto$VolumeInfo);
            return this;
        }

        public Builder setPlayInfo(MusicProto$PlayInfo musicProto$PlayInfo) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).setPlayInfo(musicProto$PlayInfo);
            return this;
        }

        public Builder setPlayState(MusicProto$PlayState musicProto$PlayState) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).setPlayState(musicProto$PlayState);
            return this;
        }

        public Builder setVolumeInfo(MusicProto$VolumeInfo musicProto$VolumeInfo) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).setVolumeInfo(musicProto$VolumeInfo);
            return this;
        }

        private Builder() {
            super(MusicProto$TotalInfo.DEFAULT_INSTANCE);
        }

        public Builder setPlayInfo(MusicProto$PlayInfo.Builder builder) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).setPlayInfo(builder.build());
            return this;
        }

        public Builder setPlayState(MusicProto$PlayState.Builder builder) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).setPlayState(builder.build());
            return this;
        }

        public Builder setVolumeInfo(MusicProto$VolumeInfo.Builder builder) {
            copyOnWrite();
            ((MusicProto$TotalInfo) this.instance).setVolumeInfo(builder.build());
            return this;
        }
    }

    static {
        MusicProto$TotalInfo musicProto$TotalInfo = new MusicProto$TotalInfo();
        DEFAULT_INSTANCE = musicProto$TotalInfo;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$TotalInfo.class, musicProto$TotalInfo);
    }

    private MusicProto$TotalInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayInfo() {
        this.playInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayState() {
        this.playState_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVolumeInfo() {
        this.volumeInfo_ = null;
        this.bitField0_ &= -5;
    }

    public static MusicProto$TotalInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayInfo(MusicProto$PlayInfo musicProto$PlayInfo) {
        musicProto$PlayInfo.getClass();
        MusicProto$PlayInfo musicProto$PlayInfo2 = this.playInfo_;
        if (musicProto$PlayInfo2 == null || musicProto$PlayInfo2 == MusicProto$PlayInfo.getDefaultInstance()) {
            this.playInfo_ = musicProto$PlayInfo;
        } else {
            this.playInfo_ = MusicProto$PlayInfo.newBuilder(this.playInfo_).mergeFrom(musicProto$PlayInfo).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayState(MusicProto$PlayState musicProto$PlayState) {
        musicProto$PlayState.getClass();
        MusicProto$PlayState musicProto$PlayState2 = this.playState_;
        if (musicProto$PlayState2 == null || musicProto$PlayState2 == MusicProto$PlayState.getDefaultInstance()) {
            this.playState_ = musicProto$PlayState;
        } else {
            this.playState_ = MusicProto$PlayState.newBuilder(this.playState_).mergeFrom(musicProto$PlayState).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVolumeInfo(MusicProto$VolumeInfo musicProto$VolumeInfo) {
        musicProto$VolumeInfo.getClass();
        MusicProto$VolumeInfo musicProto$VolumeInfo2 = this.volumeInfo_;
        if (musicProto$VolumeInfo2 == null || musicProto$VolumeInfo2 == MusicProto$VolumeInfo.getDefaultInstance()) {
            this.volumeInfo_ = musicProto$VolumeInfo;
        } else {
            this.volumeInfo_ = MusicProto$VolumeInfo.newBuilder(this.volumeInfo_).mergeFrom(musicProto$VolumeInfo).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$TotalInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$TotalInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$TotalInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayInfo(MusicProto$PlayInfo musicProto$PlayInfo) {
        musicProto$PlayInfo.getClass();
        this.playInfo_ = musicProto$PlayInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayState(MusicProto$PlayState musicProto$PlayState) {
        musicProto$PlayState.getClass();
        this.playState_ = musicProto$PlayState;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVolumeInfo(MusicProto$VolumeInfo musicProto$VolumeInfo) {
        musicProto$VolumeInfo.getClass();
        this.volumeInfo_ = musicProto$VolumeInfo;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$TotalInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "playInfo_", "playState_", "volumeInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$TotalInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$TotalInfo.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
    public MusicProto$PlayInfo getPlayInfo() {
        MusicProto$PlayInfo musicProto$PlayInfo = this.playInfo_;
        return musicProto$PlayInfo == null ? MusicProto$PlayInfo.getDefaultInstance() : musicProto$PlayInfo;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
    public MusicProto$PlayState getPlayState() {
        MusicProto$PlayState musicProto$PlayState = this.playState_;
        return musicProto$PlayState == null ? MusicProto$PlayState.getDefaultInstance() : musicProto$PlayState;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
    public MusicProto$VolumeInfo getVolumeInfo() {
        MusicProto$VolumeInfo musicProto$VolumeInfo = this.volumeInfo_;
        return musicProto$VolumeInfo == null ? MusicProto$VolumeInfo.getDefaultInstance() : musicProto$VolumeInfo;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
    public boolean hasPlayInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
    public boolean hasPlayState() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$TotalInfoOrBuilder
    public boolean hasVolumeInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(MusicProto$TotalInfo musicProto$TotalInfo) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$TotalInfo);
    }

    public static MusicProto$TotalInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$TotalInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$TotalInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$TotalInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$TotalInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$TotalInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$TotalInfo parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$TotalInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$TotalInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$TotalInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$TotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
