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
public final class MusicProto$PlayInfo extends GeneratedMessageLite<MusicProto$PlayInfo, Builder> implements MusicProto$PlayInfoOrBuilder {
    private static final MusicProto$PlayInfo DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 6;
    public static final int MUSIC_ALBUM_FIELD_NUMBER = 3;
    public static final int MUSIC_APP_NAME_FIELD_NUMBER = 5;
    public static final int MUSIC_ARTIST_FIELD_NUMBER = 2;
    public static final int MUSIC_PACKAGENAME_FIELD_NUMBER = 4;
    public static final int MUSIC_TITLE_FIELD_NUMBER = 1;
    private static volatile Parser<MusicProto$PlayInfo> PARSER;
    private int duration_;
    private String musicTitle_ = "";
    private String musicArtist_ = "";
    private String musicAlbum_ = "";
    private String musicPackageName_ = "";
    private String musicAppName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$PlayInfo, Builder> implements MusicProto$PlayInfoOrBuilder {
        public Builder clearDuration() {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).clearDuration();
            return this;
        }

        public Builder clearMusicAlbum() {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).clearMusicAlbum();
            return this;
        }

        public Builder clearMusicAppName() {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).clearMusicAppName();
            return this;
        }

        public Builder clearMusicArtist() {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).clearMusicArtist();
            return this;
        }

        public Builder clearMusicPackageName() {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).clearMusicPackageName();
            return this;
        }

        public Builder clearMusicTitle() {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).clearMusicTitle();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public int getDuration() {
            return ((MusicProto$PlayInfo) this.instance).getDuration();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public String getMusicAlbum() {
            return ((MusicProto$PlayInfo) this.instance).getMusicAlbum();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public ByteString getMusicAlbumBytes() {
            return ((MusicProto$PlayInfo) this.instance).getMusicAlbumBytes();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public String getMusicAppName() {
            return ((MusicProto$PlayInfo) this.instance).getMusicAppName();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public ByteString getMusicAppNameBytes() {
            return ((MusicProto$PlayInfo) this.instance).getMusicAppNameBytes();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public String getMusicArtist() {
            return ((MusicProto$PlayInfo) this.instance).getMusicArtist();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public ByteString getMusicArtistBytes() {
            return ((MusicProto$PlayInfo) this.instance).getMusicArtistBytes();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public String getMusicPackageName() {
            return ((MusicProto$PlayInfo) this.instance).getMusicPackageName();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public ByteString getMusicPackageNameBytes() {
            return ((MusicProto$PlayInfo) this.instance).getMusicPackageNameBytes();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public String getMusicTitle() {
            return ((MusicProto$PlayInfo) this.instance).getMusicTitle();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
        public ByteString getMusicTitleBytes() {
            return ((MusicProto$PlayInfo) this.instance).getMusicTitleBytes();
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setDuration(i);
            return this;
        }

        public Builder setMusicAlbum(String str) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicAlbum(str);
            return this;
        }

        public Builder setMusicAlbumBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicAlbumBytes(byteString);
            return this;
        }

        public Builder setMusicAppName(String str) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicAppName(str);
            return this;
        }

        public Builder setMusicAppNameBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicAppNameBytes(byteString);
            return this;
        }

        public Builder setMusicArtist(String str) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicArtist(str);
            return this;
        }

        public Builder setMusicArtistBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicArtistBytes(byteString);
            return this;
        }

        public Builder setMusicPackageName(String str) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicPackageName(str);
            return this;
        }

        public Builder setMusicPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicPackageNameBytes(byteString);
            return this;
        }

        public Builder setMusicTitle(String str) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicTitle(str);
            return this;
        }

        public Builder setMusicTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$PlayInfo) this.instance).setMusicTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(MusicProto$PlayInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$PlayInfo musicProto$PlayInfo = new MusicProto$PlayInfo();
        DEFAULT_INSTANCE = musicProto$PlayInfo;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$PlayInfo.class, musicProto$PlayInfo);
    }

    private MusicProto$PlayInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicAlbum() {
        this.musicAlbum_ = getDefaultInstance().getMusicAlbum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicAppName() {
        this.musicAppName_ = getDefaultInstance().getMusicAppName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicArtist() {
        this.musicArtist_ = getDefaultInstance().getMusicArtist();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicPackageName() {
        this.musicPackageName_ = getDefaultInstance().getMusicPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicTitle() {
        this.musicTitle_ = getDefaultInstance().getMusicTitle();
    }

    public static MusicProto$PlayInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$PlayInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$PlayInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$PlayInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicAlbum(String str) {
        str.getClass();
        this.musicAlbum_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicAlbumBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.musicAlbum_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicAppName(String str) {
        str.getClass();
        this.musicAppName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicAppNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.musicAppName_ = byteString.toStringUtf8();
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
    public void setMusicPackageName(String str) {
        str.getClass();
        this.musicPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.musicPackageName_ = byteString.toStringUtf8();
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
                return new MusicProto$PlayInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0004", new Object[]{"musicTitle_", "musicArtist_", "musicAlbum_", "musicPackageName_", "musicAppName_", "duration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$PlayInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$PlayInfo.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public String getMusicAlbum() {
        return this.musicAlbum_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public ByteString getMusicAlbumBytes() {
        return ByteString.copyFromUtf8(this.musicAlbum_);
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public String getMusicAppName() {
        return this.musicAppName_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public ByteString getMusicAppNameBytes() {
        return ByteString.copyFromUtf8(this.musicAppName_);
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public String getMusicArtist() {
        return this.musicArtist_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public ByteString getMusicArtistBytes() {
        return ByteString.copyFromUtf8(this.musicArtist_);
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public String getMusicPackageName() {
        return this.musicPackageName_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public ByteString getMusicPackageNameBytes() {
        return ByteString.copyFromUtf8(this.musicPackageName_);
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public String getMusicTitle() {
        return this.musicTitle_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayInfoOrBuilder
    public ByteString getMusicTitleBytes() {
        return ByteString.copyFromUtf8(this.musicTitle_);
    }

    public static Builder newBuilder(MusicProto$PlayInfo musicProto$PlayInfo) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$PlayInfo);
    }

    public static MusicProto$PlayInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$PlayInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$PlayInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$PlayInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$PlayInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$PlayInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$PlayInfo parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$PlayInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$PlayInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$PlayInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$PlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
