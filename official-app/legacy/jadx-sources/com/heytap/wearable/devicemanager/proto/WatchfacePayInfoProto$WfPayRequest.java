package com.heytap.wearable.devicemanager.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ghl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class WatchfacePayInfoProto$WfPayRequest extends GeneratedMessageLite<WatchfacePayInfoProto$WfPayRequest, Builder> implements WatchfacePayInfoProto$WfPayRequestOrBuilder {
    public static final int BODY_FIELD_NUMBER = 2;
    private static final WatchfacePayInfoProto$WfPayRequest DEFAULT_INSTANCE;
    public static final int DEVICEAPPVERSION_FIELD_NUMBER = 4;
    public static final int DEVICETYPE_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<WatchfacePayInfoProto$WfPayRequest> PARSER = null;
    public static final int SCREEN_FIELD_NUMBER = 6;
    public static final int SHAPE_FIELD_NUMBER = 5;
    private String key_ = "";
    private ByteString body_ = ByteString.EMPTY;
    private String deviceType_ = "";
    private String deviceAppVersion_ = "";
    private String shape_ = "";
    private String screen_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<WatchfacePayInfoProto$WfPayRequest, Builder> implements WatchfacePayInfoProto$WfPayRequestOrBuilder {
        public Builder clearBody() {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).clearBody();
            return this;
        }

        public Builder clearDeviceAppVersion() {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).clearDeviceAppVersion();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).clearKey();
            return this;
        }

        public Builder clearScreen() {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).clearScreen();
            return this;
        }

        public Builder clearShape() {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).clearShape();
            return this;
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public ByteString getBody() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getBody();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public String getDeviceAppVersion() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getDeviceAppVersion();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public ByteString getDeviceAppVersionBytes() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getDeviceAppVersionBytes();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public String getDeviceType() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getDeviceType();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public ByteString getDeviceTypeBytes() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getDeviceTypeBytes();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public String getKey() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getKey();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public ByteString getKeyBytes() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getKeyBytes();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public String getScreen() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getScreen();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public ByteString getScreenBytes() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getScreenBytes();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public String getShape() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getShape();
        }

        @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
        public ByteString getShapeBytes() {
            return ((WatchfacePayInfoProto$WfPayRequest) this.instance).getShapeBytes();
        }

        public Builder setBody(ByteString byteString) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setBody(byteString);
            return this;
        }

        public Builder setDeviceAppVersion(String str) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setDeviceAppVersion(str);
            return this;
        }

        public Builder setDeviceAppVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setDeviceAppVersionBytes(byteString);
            return this;
        }

        public Builder setDeviceType(String str) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setDeviceType(str);
            return this;
        }

        public Builder setDeviceTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setDeviceTypeBytes(byteString);
            return this;
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setKeyBytes(byteString);
            return this;
        }

        public Builder setScreen(String str) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setScreen(str);
            return this;
        }

        public Builder setScreenBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setScreenBytes(byteString);
            return this;
        }

        public Builder setShape(String str) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setShape(str);
            return this;
        }

        public Builder setShapeBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchfacePayInfoProto$WfPayRequest) this.instance).setShapeBytes(byteString);
            return this;
        }

        private Builder() {
            super(WatchfacePayInfoProto$WfPayRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchfacePayInfoProto$WfPayRequest watchfacePayInfoProto$WfPayRequest = new WatchfacePayInfoProto$WfPayRequest();
        DEFAULT_INSTANCE = watchfacePayInfoProto$WfPayRequest;
        GeneratedMessageLite.registerDefaultInstance(WatchfacePayInfoProto$WfPayRequest.class, watchfacePayInfoProto$WfPayRequest);
    }

    private WatchfacePayInfoProto$WfPayRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceAppVersion() {
        this.deviceAppVersion_ = getDefaultInstance().getDeviceAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.deviceType_ = getDefaultInstance().getDeviceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreen() {
        this.screen_ = getDefaultInstance().getScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShape() {
        this.shape_ = getDefaultInstance().getShape();
    }

    public static WatchfacePayInfoProto$WfPayRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchfacePayInfoProto$WfPayRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchfacePayInfoProto$WfPayRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(ByteString byteString) {
        byteString.getClass();
        this.body_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceAppVersion(String str) {
        str.getClass();
        this.deviceAppVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceAppVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceAppVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(String str) {
        str.getClass();
        this.deviceType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreen(String str) {
        str.getClass();
        this.screen_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.screen_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShape(String str) {
        str.getClass();
        this.shape_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShapeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shape_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ghl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchfacePayInfoProto$WfPayRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"key_", "body_", "deviceType_", "deviceAppVersion_", "shape_", "screen_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchfacePayInfoProto$WfPayRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchfacePayInfoProto$WfPayRequest.class) {
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

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public ByteString getBody() {
        return this.body_;
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public String getDeviceAppVersion() {
        return this.deviceAppVersion_;
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public ByteString getDeviceAppVersionBytes() {
        return ByteString.copyFromUtf8(this.deviceAppVersion_);
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public String getDeviceType() {
        return this.deviceType_;
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public ByteString getDeviceTypeBytes() {
        return ByteString.copyFromUtf8(this.deviceType_);
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public String getScreen() {
        return this.screen_;
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public ByteString getScreenBytes() {
        return ByteString.copyFromUtf8(this.screen_);
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public String getShape() {
        return this.shape_;
    }

    @Override // com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequestOrBuilder
    public ByteString getShapeBytes() {
        return ByteString.copyFromUtf8(this.shape_);
    }

    public static Builder newBuilder(WatchfacePayInfoProto$WfPayRequest watchfacePayInfoProto$WfPayRequest) {
        return DEFAULT_INSTANCE.createBuilder(watchfacePayInfoProto$WfPayRequest);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(InputStream inputStream) throws IOException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchfacePayInfoProto$WfPayRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchfacePayInfoProto$WfPayRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
