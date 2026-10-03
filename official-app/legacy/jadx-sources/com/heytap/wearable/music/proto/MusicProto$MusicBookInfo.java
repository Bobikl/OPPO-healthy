package com.heytap.wearable.music.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ibc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicProto$MusicBookInfo extends GeneratedMessageLite<MusicProto$MusicBookInfo, Builder> implements MusicProto$MusicBookInfoOrBuilder {
    public static final int BOOK_FILE_FIELD_NUMBER = 1;
    private static final MusicProto$MusicBookInfo DEFAULT_INSTANCE;
    public static final int MUSIC_BOOK_NAME_FIELD_NUMBER = 2;
    private static volatile Parser<MusicProto$MusicBookInfo> PARSER;
    private Internal.ProtobufList<MusicProto$BookFileInfo> bookFile_ = GeneratedMessageLite.emptyProtobufList();
    private String musicBookName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$MusicBookInfo, Builder> implements MusicProto$MusicBookInfoOrBuilder {
        public Builder addAllBookFile(Iterable<? extends MusicProto$BookFileInfo> iterable) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).addAllBookFile(iterable);
            return this;
        }

        public Builder addBookFile(MusicProto$BookFileInfo musicProto$BookFileInfo) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).addBookFile(musicProto$BookFileInfo);
            return this;
        }

        public Builder clearBookFile() {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).clearBookFile();
            return this;
        }

        public Builder clearMusicBookName() {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).clearMusicBookName();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
        public MusicProto$BookFileInfo getBookFile(int i) {
            return ((MusicProto$MusicBookInfo) this.instance).getBookFile(i);
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
        public int getBookFileCount() {
            return ((MusicProto$MusicBookInfo) this.instance).getBookFileCount();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
        public List<MusicProto$BookFileInfo> getBookFileList() {
            return Collections.unmodifiableList(((MusicProto$MusicBookInfo) this.instance).getBookFileList());
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
        public String getMusicBookName() {
            return ((MusicProto$MusicBookInfo) this.instance).getMusicBookName();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
        public ByteString getMusicBookNameBytes() {
            return ((MusicProto$MusicBookInfo) this.instance).getMusicBookNameBytes();
        }

        public Builder removeBookFile(int i) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).removeBookFile(i);
            return this;
        }

        public Builder setBookFile(int i, MusicProto$BookFileInfo musicProto$BookFileInfo) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).setBookFile(i, musicProto$BookFileInfo);
            return this;
        }

        public Builder setMusicBookName(String str) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).setMusicBookName(str);
            return this;
        }

        public Builder setMusicBookNameBytes(ByteString byteString) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).setMusicBookNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(MusicProto$MusicBookInfo.DEFAULT_INSTANCE);
        }

        public Builder addBookFile(int i, MusicProto$BookFileInfo musicProto$BookFileInfo) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).addBookFile(i, musicProto$BookFileInfo);
            return this;
        }

        public Builder setBookFile(int i, MusicProto$BookFileInfo.Builder builder) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).setBookFile(i, builder.build());
            return this;
        }

        public Builder addBookFile(MusicProto$BookFileInfo.Builder builder) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).addBookFile(builder.build());
            return this;
        }

        public Builder addBookFile(int i, MusicProto$BookFileInfo.Builder builder) {
            copyOnWrite();
            ((MusicProto$MusicBookInfo) this.instance).addBookFile(i, builder.build());
            return this;
        }
    }

    static {
        MusicProto$MusicBookInfo musicProto$MusicBookInfo = new MusicProto$MusicBookInfo();
        DEFAULT_INSTANCE = musicProto$MusicBookInfo;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$MusicBookInfo.class, musicProto$MusicBookInfo);
    }

    private MusicProto$MusicBookInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBookFile(Iterable<? extends MusicProto$BookFileInfo> iterable) {
        ensureBookFileIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.bookFile_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBookFile(MusicProto$BookFileInfo musicProto$BookFileInfo) {
        musicProto$BookFileInfo.getClass();
        ensureBookFileIsMutable();
        this.bookFile_.add(musicProto$BookFileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBookFile() {
        this.bookFile_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicBookName() {
        this.musicBookName_ = getDefaultInstance().getMusicBookName();
    }

    private void ensureBookFileIsMutable() {
        Internal.ProtobufList<MusicProto$BookFileInfo> protobufList = this.bookFile_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.bookFile_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MusicProto$MusicBookInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$MusicBookInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicBookInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$MusicBookInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBookFile(int i) {
        ensureBookFileIsMutable();
        this.bookFile_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBookFile(int i, MusicProto$BookFileInfo musicProto$BookFileInfo) {
        musicProto$BookFileInfo.getClass();
        ensureBookFileIsMutable();
        this.bookFile_.set(i, musicProto$BookFileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicBookName(String str) {
        str.getClass();
        this.musicBookName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicBookNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.musicBookName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$MusicBookInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"bookFile_", MusicProto$BookFileInfo.class, "musicBookName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$MusicBookInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$MusicBookInfo.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
    public MusicProto$BookFileInfo getBookFile(int i) {
        return this.bookFile_.get(i);
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
    public int getBookFileCount() {
        return this.bookFile_.size();
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
    public List<MusicProto$BookFileInfo> getBookFileList() {
        return this.bookFile_;
    }

    public MusicProto$BookFileInfoOrBuilder getBookFileOrBuilder(int i) {
        return this.bookFile_.get(i);
    }

    public List<? extends MusicProto$BookFileInfoOrBuilder> getBookFileOrBuilderList() {
        return this.bookFile_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
    public String getMusicBookName() {
        return this.musicBookName_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicBookInfoOrBuilder
    public ByteString getMusicBookNameBytes() {
        return ByteString.copyFromUtf8(this.musicBookName_);
    }

    public static Builder newBuilder(MusicProto$MusicBookInfo musicProto$MusicBookInfo) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$MusicBookInfo);
    }

    public static MusicProto$MusicBookInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicBookInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$MusicBookInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBookFile(int i, MusicProto$BookFileInfo musicProto$BookFileInfo) {
        musicProto$BookFileInfo.getClass();
        ensureBookFileIsMutable();
        this.bookFile_.add(i, musicProto$BookFileInfo);
    }

    public static MusicProto$MusicBookInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$MusicBookInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$MusicBookInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$MusicBookInfo parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicBookInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicBookInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$MusicBookInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicBookInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
