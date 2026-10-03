package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$PhoneDisplay extends GeneratedMessageLite<DMProto$PhoneDisplay, Builder> implements DMProto$PhoneDisplayOrBuilder {
    private static final DMProto$PhoneDisplay DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<DMProto$PhoneDisplay> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int height_;
    private int width_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$PhoneDisplay, Builder> implements DMProto$PhoneDisplayOrBuilder {
        public Builder clearHeight() {
            copyOnWrite();
            ((DMProto$PhoneDisplay) this.instance).clearHeight();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((DMProto$PhoneDisplay) this.instance).clearWidth();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$PhoneDisplayOrBuilder
        public int getHeight() {
            return ((DMProto$PhoneDisplay) this.instance).getHeight();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$PhoneDisplayOrBuilder
        public int getWidth() {
            return ((DMProto$PhoneDisplay) this.instance).getWidth();
        }

        public Builder setHeight(int i) {
            copyOnWrite();
            ((DMProto$PhoneDisplay) this.instance).setHeight(i);
            return this;
        }

        public Builder setWidth(int i) {
            copyOnWrite();
            ((DMProto$PhoneDisplay) this.instance).setWidth(i);
            return this;
        }

        private Builder() {
            super(DMProto$PhoneDisplay.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$PhoneDisplay dMProto$PhoneDisplay = new DMProto$PhoneDisplay();
        DEFAULT_INSTANCE = dMProto$PhoneDisplay;
        GeneratedMessageLite.registerDefaultInstance(DMProto$PhoneDisplay.class, dMProto$PhoneDisplay);
    }

    private DMProto$PhoneDisplay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static DMProto$PhoneDisplay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$PhoneDisplay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$PhoneDisplay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$PhoneDisplay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i) {
        this.height_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i) {
        this.width_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$PhoneDisplay();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"width_", "height_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$PhoneDisplay> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$PhoneDisplay.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$PhoneDisplayOrBuilder
    public int getHeight() {
        return this.height_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$PhoneDisplayOrBuilder
    public int getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(DMProto$PhoneDisplay dMProto$PhoneDisplay) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$PhoneDisplay);
    }

    public static DMProto$PhoneDisplay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$PhoneDisplay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$PhoneDisplay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$PhoneDisplay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$PhoneDisplay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$PhoneDisplay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$PhoneDisplay parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$PhoneDisplay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$PhoneDisplay parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$PhoneDisplay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$PhoneDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
