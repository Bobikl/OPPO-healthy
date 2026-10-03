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
public final class Proto$WatchFacesActionEvent extends GeneratedMessageLite<Proto$WatchFacesActionEvent, Builder> implements Proto$WatchFacesActionEventOrBuilder {
    private static final Proto$WatchFacesActionEvent DEFAULT_INSTANCE;
    private static volatile Parser<Proto$WatchFacesActionEvent> PARSER = null;
    public static final int PRESENT_FIELD_NUMBER = 1;
    public static final int WATCH_FACE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String present_ = "";
    private Proto$WatchFace watchFace_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WatchFacesActionEvent, Builder> implements Proto$WatchFacesActionEventOrBuilder {
        public Builder clearPresent() {
            copyOnWrite();
            ((Proto$WatchFacesActionEvent) this.instance).clearPresent();
            return this;
        }

        public Builder clearWatchFace() {
            copyOnWrite();
            ((Proto$WatchFacesActionEvent) this.instance).clearWatchFace();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesActionEventOrBuilder
        public String getPresent() {
            return ((Proto$WatchFacesActionEvent) this.instance).getPresent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesActionEventOrBuilder
        public ByteString getPresentBytes() {
            return ((Proto$WatchFacesActionEvent) this.instance).getPresentBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesActionEventOrBuilder
        public Proto$WatchFace getWatchFace() {
            return ((Proto$WatchFacesActionEvent) this.instance).getWatchFace();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesActionEventOrBuilder
        public boolean hasWatchFace() {
            return ((Proto$WatchFacesActionEvent) this.instance).hasWatchFace();
        }

        public Builder mergeWatchFace(Proto$WatchFace proto$WatchFace) {
            copyOnWrite();
            ((Proto$WatchFacesActionEvent) this.instance).mergeWatchFace(proto$WatchFace);
            return this;
        }

        public Builder setPresent(String str) {
            copyOnWrite();
            ((Proto$WatchFacesActionEvent) this.instance).setPresent(str);
            return this;
        }

        public Builder setPresentBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesActionEvent) this.instance).setPresentBytes(byteString);
            return this;
        }

        public Builder setWatchFace(Proto$WatchFace proto$WatchFace) {
            copyOnWrite();
            ((Proto$WatchFacesActionEvent) this.instance).setWatchFace(proto$WatchFace);
            return this;
        }

        private Builder() {
            super(Proto$WatchFacesActionEvent.DEFAULT_INSTANCE);
        }

        public Builder setWatchFace(Proto$WatchFace.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFacesActionEvent) this.instance).setWatchFace(builder.build());
            return this;
        }
    }

    static {
        Proto$WatchFacesActionEvent proto$WatchFacesActionEvent = new Proto$WatchFacesActionEvent();
        DEFAULT_INSTANCE = proto$WatchFacesActionEvent;
        GeneratedMessageLite.registerDefaultInstance(Proto$WatchFacesActionEvent.class, proto$WatchFacesActionEvent);
    }

    private Proto$WatchFacesActionEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPresent() {
        this.present_ = getDefaultInstance().getPresent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchFace() {
        this.watchFace_ = null;
        this.bitField0_ &= -2;
    }

    public static Proto$WatchFacesActionEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatchFace(Proto$WatchFace proto$WatchFace) {
        proto$WatchFace.getClass();
        Proto$WatchFace proto$WatchFace2 = this.watchFace_;
        if (proto$WatchFace2 == null || proto$WatchFace2 == Proto$WatchFace.getDefaultInstance()) {
            this.watchFace_ = proto$WatchFace;
        } else {
            this.watchFace_ = Proto$WatchFace.newBuilder(this.watchFace_).mergeFrom(proto$WatchFace).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WatchFacesActionEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFacesActionEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WatchFacesActionEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresent(String str) {
        str.getClass();
        this.present_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.present_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFace(Proto$WatchFace proto$WatchFace) {
        proto$WatchFace.getClass();
        this.watchFace_ = proto$WatchFace;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WatchFacesActionEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "present_", "watchFace_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WatchFacesActionEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WatchFacesActionEvent.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesActionEventOrBuilder
    public String getPresent() {
        return this.present_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesActionEventOrBuilder
    public ByteString getPresentBytes() {
        return ByteString.copyFromUtf8(this.present_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesActionEventOrBuilder
    public Proto$WatchFace getWatchFace() {
        Proto$WatchFace proto$WatchFace = this.watchFace_;
        return proto$WatchFace == null ? Proto$WatchFace.getDefaultInstance() : proto$WatchFace;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesActionEventOrBuilder
    public boolean hasWatchFace() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Proto$WatchFacesActionEvent proto$WatchFacesActionEvent) {
        return DEFAULT_INSTANCE.createBuilder(proto$WatchFacesActionEvent);
    }

    public static Proto$WatchFacesActionEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFacesActionEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WatchFacesActionEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WatchFacesActionEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WatchFacesActionEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WatchFacesActionEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WatchFacesActionEvent parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFacesActionEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFacesActionEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WatchFacesActionEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFacesActionEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
