package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$MessageBody extends GeneratedMessageLite<Proto$MessageBody, Builder> implements Proto$MessageBodyOrBuilder {
    public static final int ACTION_EVENT_FIELD_NUMBER = 2;
    public static final int ALBUM_EVENT_FIELD_NUMBER = 3;
    private static final Proto$MessageBody DEFAULT_INSTANCE;
    public static final int LOCATION_EVENT_FIELD_NUMBER = 5;
    private static volatile Parser<Proto$MessageBody> PARSER = null;
    public static final int RESERVED_EXTRA_FIELD_NUMBER = 4;
    public static final int STATUS_SYNC_FIELD_NUMBER = 1;
    public static final int WATCH_FACE_CHANGED_EVENT_FIELD_NUMBER = 7;
    private Proto$WatchFacesActionEvent actionEvent_;
    private Proto$AlbumEvent albumEvent_;
    private int bitField0_;
    private Proto$LocationEvent locationEvent_;
    private String reservedExtra_ = "";
    private Proto$WatchFacesStatusSync statusSync_;
    private Proto$WatchFaceChangedEvent watchFaceChangedEvent_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$MessageBody, Builder> implements Proto$MessageBodyOrBuilder {
        public Builder clearActionEvent() {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).clearActionEvent();
            return this;
        }

        public Builder clearAlbumEvent() {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).clearAlbumEvent();
            return this;
        }

        public Builder clearLocationEvent() {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).clearLocationEvent();
            return this;
        }

        public Builder clearReservedExtra() {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).clearReservedExtra();
            return this;
        }

        public Builder clearStatusSync() {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).clearStatusSync();
            return this;
        }

        public Builder clearWatchFaceChangedEvent() {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).clearWatchFaceChangedEvent();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public Proto$WatchFacesActionEvent getActionEvent() {
            return ((Proto$MessageBody) this.instance).getActionEvent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public Proto$AlbumEvent getAlbumEvent() {
            return ((Proto$MessageBody) this.instance).getAlbumEvent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public Proto$LocationEvent getLocationEvent() {
            return ((Proto$MessageBody) this.instance).getLocationEvent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public String getReservedExtra() {
            return ((Proto$MessageBody) this.instance).getReservedExtra();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public ByteString getReservedExtraBytes() {
            return ((Proto$MessageBody) this.instance).getReservedExtraBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public Proto$WatchFacesStatusSync getStatusSync() {
            return ((Proto$MessageBody) this.instance).getStatusSync();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public Proto$WatchFaceChangedEvent getWatchFaceChangedEvent() {
            return ((Proto$MessageBody) this.instance).getWatchFaceChangedEvent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public boolean hasActionEvent() {
            return ((Proto$MessageBody) this.instance).hasActionEvent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public boolean hasAlbumEvent() {
            return ((Proto$MessageBody) this.instance).hasAlbumEvent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public boolean hasLocationEvent() {
            return ((Proto$MessageBody) this.instance).hasLocationEvent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public boolean hasStatusSync() {
            return ((Proto$MessageBody) this.instance).hasStatusSync();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
        public boolean hasWatchFaceChangedEvent() {
            return ((Proto$MessageBody) this.instance).hasWatchFaceChangedEvent();
        }

        public Builder mergeActionEvent(Proto$WatchFacesActionEvent proto$WatchFacesActionEvent) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).mergeActionEvent(proto$WatchFacesActionEvent);
            return this;
        }

        public Builder mergeAlbumEvent(Proto$AlbumEvent proto$AlbumEvent) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).mergeAlbumEvent(proto$AlbumEvent);
            return this;
        }

        public Builder mergeLocationEvent(Proto$LocationEvent proto$LocationEvent) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).mergeLocationEvent(proto$LocationEvent);
            return this;
        }

        public Builder mergeStatusSync(Proto$WatchFacesStatusSync proto$WatchFacesStatusSync) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).mergeStatusSync(proto$WatchFacesStatusSync);
            return this;
        }

        public Builder mergeWatchFaceChangedEvent(Proto$WatchFaceChangedEvent proto$WatchFaceChangedEvent) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).mergeWatchFaceChangedEvent(proto$WatchFaceChangedEvent);
            return this;
        }

        public Builder setActionEvent(Proto$WatchFacesActionEvent proto$WatchFacesActionEvent) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setActionEvent(proto$WatchFacesActionEvent);
            return this;
        }

        public Builder setAlbumEvent(Proto$AlbumEvent proto$AlbumEvent) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setAlbumEvent(proto$AlbumEvent);
            return this;
        }

        public Builder setLocationEvent(Proto$LocationEvent proto$LocationEvent) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setLocationEvent(proto$LocationEvent);
            return this;
        }

        public Builder setReservedExtra(String str) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setReservedExtra(str);
            return this;
        }

        public Builder setReservedExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setReservedExtraBytes(byteString);
            return this;
        }

        public Builder setStatusSync(Proto$WatchFacesStatusSync proto$WatchFacesStatusSync) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setStatusSync(proto$WatchFacesStatusSync);
            return this;
        }

        public Builder setWatchFaceChangedEvent(Proto$WatchFaceChangedEvent proto$WatchFaceChangedEvent) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setWatchFaceChangedEvent(proto$WatchFaceChangedEvent);
            return this;
        }

        private Builder() {
            super(Proto$MessageBody.DEFAULT_INSTANCE);
        }

        public Builder setActionEvent(Proto$WatchFacesActionEvent.Builder builder) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setActionEvent(builder.build());
            return this;
        }

        public Builder setAlbumEvent(Proto$AlbumEvent.Builder builder) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setAlbumEvent(builder.build());
            return this;
        }

        public Builder setLocationEvent(Proto$LocationEvent.Builder builder) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setLocationEvent(builder.build());
            return this;
        }

        public Builder setStatusSync(Proto$WatchFacesStatusSync.Builder builder) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setStatusSync(builder.build());
            return this;
        }

        public Builder setWatchFaceChangedEvent(Proto$WatchFaceChangedEvent.Builder builder) {
            copyOnWrite();
            ((Proto$MessageBody) this.instance).setWatchFaceChangedEvent(builder.build());
            return this;
        }
    }

    static {
        Proto$MessageBody proto$MessageBody = new Proto$MessageBody();
        DEFAULT_INSTANCE = proto$MessageBody;
        GeneratedMessageLite.registerDefaultInstance(Proto$MessageBody.class, proto$MessageBody);
    }

    private Proto$MessageBody() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionEvent() {
        this.actionEvent_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlbumEvent() {
        this.albumEvent_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationEvent() {
        this.locationEvent_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedExtra() {
        this.reservedExtra_ = getDefaultInstance().getReservedExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusSync() {
        this.statusSync_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchFaceChangedEvent() {
        this.watchFaceChangedEvent_ = null;
        this.bitField0_ &= -17;
    }

    public static Proto$MessageBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActionEvent(Proto$WatchFacesActionEvent proto$WatchFacesActionEvent) {
        proto$WatchFacesActionEvent.getClass();
        Proto$WatchFacesActionEvent proto$WatchFacesActionEvent2 = this.actionEvent_;
        if (proto$WatchFacesActionEvent2 == null || proto$WatchFacesActionEvent2 == Proto$WatchFacesActionEvent.getDefaultInstance()) {
            this.actionEvent_ = proto$WatchFacesActionEvent;
        } else {
            this.actionEvent_ = Proto$WatchFacesActionEvent.newBuilder(this.actionEvent_).mergeFrom(proto$WatchFacesActionEvent).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlbumEvent(Proto$AlbumEvent proto$AlbumEvent) {
        proto$AlbumEvent.getClass();
        Proto$AlbumEvent proto$AlbumEvent2 = this.albumEvent_;
        if (proto$AlbumEvent2 == null || proto$AlbumEvent2 == Proto$AlbumEvent.getDefaultInstance()) {
            this.albumEvent_ = proto$AlbumEvent;
        } else {
            this.albumEvent_ = Proto$AlbumEvent.newBuilder(this.albumEvent_).mergeFrom(proto$AlbumEvent).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationEvent(Proto$LocationEvent proto$LocationEvent) {
        proto$LocationEvent.getClass();
        Proto$LocationEvent proto$LocationEvent2 = this.locationEvent_;
        if (proto$LocationEvent2 == null || proto$LocationEvent2 == Proto$LocationEvent.getDefaultInstance()) {
            this.locationEvent_ = proto$LocationEvent;
        } else {
            this.locationEvent_ = Proto$LocationEvent.newBuilder(this.locationEvent_).mergeFrom(proto$LocationEvent).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatusSync(Proto$WatchFacesStatusSync proto$WatchFacesStatusSync) {
        proto$WatchFacesStatusSync.getClass();
        Proto$WatchFacesStatusSync proto$WatchFacesStatusSync2 = this.statusSync_;
        if (proto$WatchFacesStatusSync2 == null || proto$WatchFacesStatusSync2 == Proto$WatchFacesStatusSync.getDefaultInstance()) {
            this.statusSync_ = proto$WatchFacesStatusSync;
        } else {
            this.statusSync_ = Proto$WatchFacesStatusSync.newBuilder(this.statusSync_).mergeFrom(proto$WatchFacesStatusSync).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatchFaceChangedEvent(Proto$WatchFaceChangedEvent proto$WatchFaceChangedEvent) {
        proto$WatchFaceChangedEvent.getClass();
        Proto$WatchFaceChangedEvent proto$WatchFaceChangedEvent2 = this.watchFaceChangedEvent_;
        if (proto$WatchFaceChangedEvent2 == null || proto$WatchFaceChangedEvent2 == Proto$WatchFaceChangedEvent.getDefaultInstance()) {
            this.watchFaceChangedEvent_ = proto$WatchFaceChangedEvent;
        } else {
            this.watchFaceChangedEvent_ = Proto$WatchFaceChangedEvent.newBuilder(this.watchFaceChangedEvent_).mergeFrom(proto$WatchFaceChangedEvent).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$MessageBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$MessageBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$MessageBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$MessageBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionEvent(Proto$WatchFacesActionEvent proto$WatchFacesActionEvent) {
        proto$WatchFacesActionEvent.getClass();
        this.actionEvent_ = proto$WatchFacesActionEvent;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlbumEvent(Proto$AlbumEvent proto$AlbumEvent) {
        proto$AlbumEvent.getClass();
        this.albumEvent_ = proto$AlbumEvent;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationEvent(Proto$LocationEvent proto$LocationEvent) {
        proto$LocationEvent.getClass();
        this.locationEvent_ = proto$LocationEvent;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedExtra(String str) {
        str.getClass();
        this.reservedExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reservedExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusSync(Proto$WatchFacesStatusSync proto$WatchFacesStatusSync) {
        proto$WatchFacesStatusSync.getClass();
        this.statusSync_ = proto$WatchFacesStatusSync;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFaceChangedEvent(Proto$WatchFaceChangedEvent proto$WatchFaceChangedEvent) {
        proto$WatchFaceChangedEvent.getClass();
        this.watchFaceChangedEvent_ = proto$WatchFaceChangedEvent;
        this.bitField0_ |= 16;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$MessageBody();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005ဉ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "statusSync_", "actionEvent_", "albumEvent_", "reservedExtra_", "locationEvent_", "watchFaceChangedEvent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$MessageBody> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$MessageBody.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public Proto$WatchFacesActionEvent getActionEvent() {
        Proto$WatchFacesActionEvent proto$WatchFacesActionEvent = this.actionEvent_;
        return proto$WatchFacesActionEvent == null ? Proto$WatchFacesActionEvent.getDefaultInstance() : proto$WatchFacesActionEvent;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public Proto$AlbumEvent getAlbumEvent() {
        Proto$AlbumEvent proto$AlbumEvent = this.albumEvent_;
        return proto$AlbumEvent == null ? Proto$AlbumEvent.getDefaultInstance() : proto$AlbumEvent;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public Proto$LocationEvent getLocationEvent() {
        Proto$LocationEvent proto$LocationEvent = this.locationEvent_;
        return proto$LocationEvent == null ? Proto$LocationEvent.getDefaultInstance() : proto$LocationEvent;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public String getReservedExtra() {
        return this.reservedExtra_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public ByteString getReservedExtraBytes() {
        return ByteString.copyFromUtf8(this.reservedExtra_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public Proto$WatchFacesStatusSync getStatusSync() {
        Proto$WatchFacesStatusSync proto$WatchFacesStatusSync = this.statusSync_;
        return proto$WatchFacesStatusSync == null ? Proto$WatchFacesStatusSync.getDefaultInstance() : proto$WatchFacesStatusSync;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public Proto$WatchFaceChangedEvent getWatchFaceChangedEvent() {
        Proto$WatchFaceChangedEvent proto$WatchFaceChangedEvent = this.watchFaceChangedEvent_;
        return proto$WatchFaceChangedEvent == null ? Proto$WatchFaceChangedEvent.getDefaultInstance() : proto$WatchFaceChangedEvent;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public boolean hasActionEvent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public boolean hasAlbumEvent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public boolean hasLocationEvent() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public boolean hasStatusSync() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageBodyOrBuilder
    public boolean hasWatchFaceChangedEvent() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(Proto$MessageBody proto$MessageBody) {
        return DEFAULT_INSTANCE.createBuilder(proto$MessageBody);
    }

    public static Proto$MessageBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$MessageBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$MessageBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$MessageBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$MessageBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$MessageBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$MessageBody parseFrom(InputStream inputStream) throws IOException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$MessageBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$MessageBody parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$MessageBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
