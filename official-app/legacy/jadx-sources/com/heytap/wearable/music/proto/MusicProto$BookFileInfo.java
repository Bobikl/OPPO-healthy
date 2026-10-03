package com.heytap.wearable.music.proto;

import com.google.protobuf.AbstractMessageLite;
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
public final class MusicProto$BookFileInfo extends GeneratedMessageLite<MusicProto$BookFileInfo, Builder> implements MusicProto$BookFileInfoOrBuilder {
    private static final MusicProto$BookFileInfo DEFAULT_INSTANCE;
    public static final int MUSIC_ARTIST_FIELD_NUMBER = 3;
    public static final int MUSIC_NAME_FIELD_NUMBER = 1;
    public static final int MUSIC_TITLE_FIELD_NUMBER = 2;
    private static volatile Parser<MusicProto$BookFileInfo> PARSER;
    private String musicName_ = "";
    private String musicTitle_ = "";
    private String musicArtist_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$BookFileInfo, Builder> implements MusicProto$BookFileInfoOrBuilder {
        public Builder clearMusicArtist() {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).clearMusicArtist();
            return this;
        }

        public Builder clearMusicName() {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).clearMusicName();
            return this;
        }

        public Builder clearMusicTitle() {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).clearMusicTitle();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
        public String getMusicArtist() {
            return ((MusicProto$BookFileInfo) this.instance).getMusicArtist();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
        public ByteString getMusicArtistBytes() {
            return ((MusicProto$BookFileInfo) this.instance).getMusicArtistBytes();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
        public String getMusicName() {
            return ((MusicProto$BookFileInfo) this.instance).getMusicName();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
        public ByteString getMusicNameBytes() {
            return ((MusicProto$BookFileInfo) this.instance).getMusicNameBytes();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
        public String getMusicTitle() {
            return ((MusicProto$BookFileInfo) this.instance).getMusicTitle();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
        public ByteString getMusicTitleBytes() {
            return ((MusicProto$BookFileInfo) this.instance).getMusicTitleBytes();
        }

        public Builder setMusicArtist(String str) {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).setMusicArtist(str);
            return this;
        }

        public Builder setMusicArtistBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).setMusicArtistBytes(byteString);
            return this;
        }

        public Builder setMusicName(String str) {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).setMusicName(str);
            return this;
        }

        public Builder setMusicNameBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).setMusicNameBytes(byteString);
            return this;
        }

        public Builder setMusicTitle(String str) {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).setMusicTitle(str);
            return this;
        }

        public Builder setMusicTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$BookFileInfo) this.instance).setMusicTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(MusicProto$BookFileInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$BookFileInfo musicProto$BookFileInfo = new MusicProto$BookFileInfo();
        DEFAULT_INSTANCE = musicProto$BookFileInfo;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$BookFileInfo.class, musicProto$BookFileInfo);
    }

    private MusicProto$BookFileInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicArtist() {
        this.musicArtist_ = getDefaultInstance().getMusicArtist();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicName() {
        this.musicName_ = getDefaultInstance().getMusicName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicTitle() {
        this.musicTitle_ = getDefaultInstance().getMusicTitle();
    }

    public static MusicProto$BookFileInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$BookFileInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$BookFileInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$BookFileInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicArtist(String str) {
        str.getClass();
        this.musicArtist_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicArtistBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.musicArtist_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicName(String str) {
        str.getClass();
        this.musicName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.musicName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicTitle(String str) {
        str.getClass();
        this.musicTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.musicTitle_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$BookFileInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"musicName_", "musicTitle_", "musicArtist_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$BookFileInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$BookFileInfo.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
    public String getMusicArtist() {
        return this.musicArtist_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
    public ByteString getMusicArtistBytes() {
        return ByteString.copyFromUtf8(this.musicArtist_);
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
    public String getMusicName() {
        return this.musicName_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
    public ByteString getMusicNameBytes() {
        return ByteString.copyFromUtf8(this.musicName_);
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
    public String getMusicTitle() {
        return this.musicTitle_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$BookFileInfoOrBuilder
    public ByteString getMusicTitleBytes() {
        return ByteString.copyFromUtf8(this.musicTitle_);
    }

    public static Builder newBuilder(MusicProto$BookFileInfo musicProto$BookFileInfo) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$BookFileInfo);
    }

    public static MusicProto$BookFileInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$BookFileInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$BookFileInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$BookFileInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$BookFileInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$BookFileInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$BookFileInfo parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$BookFileInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$BookFileInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$BookFileInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$BookFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
