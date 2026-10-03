package com.heytap.health.watch.watchface.proto;

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
public final class Proto$WatchFaceChangedEvent extends GeneratedMessageLite<Proto$WatchFaceChangedEvent, Builder> implements Proto$WatchFaceChangedEventOrBuilder {
    private static final Proto$WatchFaceChangedEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<Proto$WatchFaceChangedEvent> PARSER = null;
    public static final int WATCH_FACE_VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private int eventType_;
    private Proto$WatchFaceVersion watchFaceVersion_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WatchFaceChangedEvent, Builder> implements Proto$WatchFaceChangedEventOrBuilder {
        public Builder clearEventType() {
            copyOnWrite();
            ((Proto$WatchFaceChangedEvent) this.instance).clearEventType();
            return this;
        }

        public Builder clearWatchFaceVersion() {
            copyOnWrite();
            ((Proto$WatchFaceChangedEvent) this.instance).clearWatchFaceVersion();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceChangedEventOrBuilder
        public int getEventType() {
            return ((Proto$WatchFaceChangedEvent) this.instance).getEventType();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceChangedEventOrBuilder
        public Proto$WatchFaceVersion getWatchFaceVersion() {
            return ((Proto$WatchFaceChangedEvent) this.instance).getWatchFaceVersion();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceChangedEventOrBuilder
        public boolean hasWatchFaceVersion() {
            return ((Proto$WatchFaceChangedEvent) this.instance).hasWatchFaceVersion();
        }

        public Builder mergeWatchFaceVersion(Proto$WatchFaceVersion proto$WatchFaceVersion) {
            copyOnWrite();
            ((Proto$WatchFaceChangedEvent) this.instance).mergeWatchFaceVersion(proto$WatchFaceVersion);
            return this;
        }

        public Builder setEventType(int i) {
            copyOnWrite();
            ((Proto$WatchFaceChangedEvent) this.instance).setEventType(i);
            return this;
        }

        public Builder setWatchFaceVersion(Proto$WatchFaceVersion proto$WatchFaceVersion) {
            copyOnWrite();
            ((Proto$WatchFaceChangedEvent) this.instance).setWatchFaceVersion(proto$WatchFaceVersion);
            return this;
        }

        private Builder() {
            super(Proto$WatchFaceChangedEvent.DEFAULT_INSTANCE);
        }

        public Builder setWatchFaceVersion(Proto$WatchFaceVersion.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFaceChangedEvent) this.instance).setWatchFaceVersion(builder.build());
            return this;
        }
    }

    static {
        Proto$WatchFaceChangedEvent proto$WatchFaceChangedEvent = new Proto$WatchFaceChangedEvent();
        DEFAULT_INSTANCE = proto$WatchFaceChangedEvent;
        GeneratedMessageLite.registerDefaultInstance(Proto$WatchFaceChangedEvent.class, proto$WatchFaceChangedEvent);
    }

    private Proto$WatchFaceChangedEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventType() {
        this.eventType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchFaceVersion() {
        this.watchFaceVersion_ = null;
        this.bitField0_ &= -2;
    }

    public static Proto$WatchFaceChangedEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatchFaceVersion(Proto$WatchFaceVersion proto$WatchFaceVersion) {
        proto$WatchFaceVersion.getClass();
        Proto$WatchFaceVersion proto$WatchFaceVersion2 = this.watchFaceVersion_;
        if (proto$WatchFaceVersion2 == null || proto$WatchFaceVersion2 == Proto$WatchFaceVersion.getDefaultInstance()) {
            this.watchFaceVersion_ = proto$WatchFaceVersion;
        } else {
            this.watchFaceVersion_ = Proto$WatchFaceVersion.newBuilder(this.watchFaceVersion_).mergeFrom(proto$WatchFaceVersion).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WatchFaceChangedEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WatchFaceChangedEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventType(int i) {
        this.eventType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFaceVersion(Proto$WatchFaceVersion proto$WatchFaceVersion) {
        proto$WatchFaceVersion.getClass();
        this.watchFaceVersion_ = proto$WatchFaceVersion;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WatchFaceChangedEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000", new Object[]{"bitField0_", "eventType_", "watchFaceVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WatchFaceChangedEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WatchFaceChangedEvent.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceChangedEventOrBuilder
    public int getEventType() {
        return this.eventType_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceChangedEventOrBuilder
    public Proto$WatchFaceVersion getWatchFaceVersion() {
        Proto$WatchFaceVersion proto$WatchFaceVersion = this.watchFaceVersion_;
        return proto$WatchFaceVersion == null ? Proto$WatchFaceVersion.getDefaultInstance() : proto$WatchFaceVersion;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceChangedEventOrBuilder
    public boolean hasWatchFaceVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Proto$WatchFaceChangedEvent proto$WatchFaceChangedEvent) {
        return DEFAULT_INSTANCE.createBuilder(proto$WatchFaceChangedEvent);
    }

    public static Proto$WatchFaceChangedEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WatchFaceChangedEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceChangedEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
