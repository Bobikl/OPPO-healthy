package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$AlbumEvent extends GeneratedMessageLite<Proto$AlbumEvent, Builder> implements Proto$AlbumEventOrBuilder {
    public static final int CURRENT_ALBUM_FIELD_NUMBER = 4;
    private static final Proto$AlbumEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 3;
    public static final int IMAGE_NAMES_FIELD_NUMBER = 1;
    public static final int IS_SELECT_ALL_FIELD_NUMBER = 2;
    public static final int MEMORY_COUNT_FIELD_NUMBER = 6;
    private static volatile Parser<Proto$AlbumEvent> PARSER = null;
    public static final int WATCHFACE_KEY_FIELD_NUMBER = 5;
    private int eventType_;
    private boolean isSelectAll_;
    private int memoryCount_;
    private Internal.ProtobufList<String> imageNames_ = GeneratedMessageLite.emptyProtobufList();
    private String currentAlbum_ = "";
    private String watchfaceKey_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$AlbumEvent, Builder> implements Proto$AlbumEventOrBuilder {
        public Builder addAllImageNames(Iterable<String> iterable) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).addAllImageNames(iterable);
            return this;
        }

        public Builder addImageNames(String str) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).addImageNames(str);
            return this;
        }

        public Builder addImageNamesBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).addImageNamesBytes(byteString);
            return this;
        }

        public Builder clearCurrentAlbum() {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).clearCurrentAlbum();
            return this;
        }

        public Builder clearEventType() {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).clearEventType();
            return this;
        }

        public Builder clearImageNames() {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).clearImageNames();
            return this;
        }

        public Builder clearIsSelectAll() {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).clearIsSelectAll();
            return this;
        }

        public Builder clearMemoryCount() {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).clearMemoryCount();
            return this;
        }

        public Builder clearWatchfaceKey() {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).clearWatchfaceKey();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public String getCurrentAlbum() {
            return ((Proto$AlbumEvent) this.instance).getCurrentAlbum();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public ByteString getCurrentAlbumBytes() {
            return ((Proto$AlbumEvent) this.instance).getCurrentAlbumBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public int getEventType() {
            return ((Proto$AlbumEvent) this.instance).getEventType();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public String getImageNames(int i) {
            return ((Proto$AlbumEvent) this.instance).getImageNames(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public ByteString getImageNamesBytes(int i) {
            return ((Proto$AlbumEvent) this.instance).getImageNamesBytes(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public int getImageNamesCount() {
            return ((Proto$AlbumEvent) this.instance).getImageNamesCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public List<String> getImageNamesList() {
            return Collections.unmodifiableList(((Proto$AlbumEvent) this.instance).getImageNamesList());
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public boolean getIsSelectAll() {
            return ((Proto$AlbumEvent) this.instance).getIsSelectAll();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public int getMemoryCount() {
            return ((Proto$AlbumEvent) this.instance).getMemoryCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public String getWatchfaceKey() {
            return ((Proto$AlbumEvent) this.instance).getWatchfaceKey();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
        public ByteString getWatchfaceKeyBytes() {
            return ((Proto$AlbumEvent) this.instance).getWatchfaceKeyBytes();
        }

        public Builder setCurrentAlbum(String str) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).setCurrentAlbum(str);
            return this;
        }

        public Builder setCurrentAlbumBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).setCurrentAlbumBytes(byteString);
            return this;
        }

        public Builder setEventType(int i) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).setEventType(i);
            return this;
        }

        public Builder setImageNames(int i, String str) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).setImageNames(i, str);
            return this;
        }

        public Builder setIsSelectAll(boolean z) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).setIsSelectAll(z);
            return this;
        }

        public Builder setMemoryCount(int i) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).setMemoryCount(i);
            return this;
        }

        public Builder setWatchfaceKey(String str) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).setWatchfaceKey(str);
            return this;
        }

        public Builder setWatchfaceKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$AlbumEvent) this.instance).setWatchfaceKeyBytes(byteString);
            return this;
        }

        private Builder() {
            super(Proto$AlbumEvent.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$AlbumEvent proto$AlbumEvent = new Proto$AlbumEvent();
        DEFAULT_INSTANCE = proto$AlbumEvent;
        GeneratedMessageLite.registerDefaultInstance(Proto$AlbumEvent.class, proto$AlbumEvent);
    }

    private Proto$AlbumEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImageNames(Iterable<String> iterable) {
        ensureImageNamesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.imageNames_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageNames(String str) {
        str.getClass();
        ensureImageNamesIsMutable();
        this.imageNames_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageNamesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureImageNamesIsMutable();
        this.imageNames_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentAlbum() {
        this.currentAlbum_ = getDefaultInstance().getCurrentAlbum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventType() {
        this.eventType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageNames() {
        this.imageNames_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSelectAll() {
        this.isSelectAll_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryCount() {
        this.memoryCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchfaceKey() {
        this.watchfaceKey_ = getDefaultInstance().getWatchfaceKey();
    }

    private void ensureImageNamesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.imageNames_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.imageNames_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Proto$AlbumEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$AlbumEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$AlbumEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$AlbumEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentAlbum(String str) {
        str.getClass();
        this.currentAlbum_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentAlbumBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.currentAlbum_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventType(int i) {
        this.eventType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageNames(int i, String str) {
        str.getClass();
        ensureImageNamesIsMutable();
        this.imageNames_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSelectAll(boolean z) {
        this.isSelectAll_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryCount(int i) {
        this.memoryCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchfaceKey(String str) {
        str.getClass();
        this.watchfaceKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchfaceKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.watchfaceKey_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$AlbumEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ț\u0002\u0007\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006\u0004", new Object[]{"imageNames_", "isSelectAll_", "eventType_", "currentAlbum_", "watchfaceKey_", "memoryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$AlbumEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$AlbumEvent.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public String getCurrentAlbum() {
        return this.currentAlbum_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public ByteString getCurrentAlbumBytes() {
        return ByteString.copyFromUtf8(this.currentAlbum_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public int getEventType() {
        return this.eventType_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public String getImageNames(int i) {
        return this.imageNames_.get(i);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public ByteString getImageNamesBytes(int i) {
        return ByteString.copyFromUtf8(this.imageNames_.get(i));
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public int getImageNamesCount() {
        return this.imageNames_.size();
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public List<String> getImageNamesList() {
        return this.imageNames_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public boolean getIsSelectAll() {
        return this.isSelectAll_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public int getMemoryCount() {
        return this.memoryCount_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public String getWatchfaceKey() {
        return this.watchfaceKey_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$AlbumEventOrBuilder
    public ByteString getWatchfaceKeyBytes() {
        return ByteString.copyFromUtf8(this.watchfaceKey_);
    }

    public static Builder newBuilder(Proto$AlbumEvent proto$AlbumEvent) {
        return DEFAULT_INSTANCE.createBuilder(proto$AlbumEvent);
    }

    public static Proto$AlbumEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$AlbumEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$AlbumEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$AlbumEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$AlbumEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$AlbumEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$AlbumEvent parseFrom(InputStream inputStream) throws IOException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$AlbumEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$AlbumEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$AlbumEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$AlbumEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
