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
public final class DMProto$DeviceFeatureSwitch extends GeneratedMessageLite<DMProto$DeviceFeatureSwitch, Builder> implements DMProto$DeviceFeatureSwitchOrBuilder {
    private static final DMProto$DeviceFeatureSwitch DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 1;
    private static volatile Parser<DMProto$DeviceFeatureSwitch> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int feature_;
    private int type_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$DeviceFeatureSwitch, Builder> implements DMProto$DeviceFeatureSwitchOrBuilder {
        public Builder clearFeature() {
            copyOnWrite();
            ((DMProto$DeviceFeatureSwitch) this.instance).clearFeature();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((DMProto$DeviceFeatureSwitch) this.instance).clearType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((DMProto$DeviceFeatureSwitch) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$DeviceFeatureSwitchOrBuilder
        public int getFeature() {
            return ((DMProto$DeviceFeatureSwitch) this.instance).getFeature();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$DeviceFeatureSwitchOrBuilder
        public int getType() {
            return ((DMProto$DeviceFeatureSwitch) this.instance).getType();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$DeviceFeatureSwitchOrBuilder
        public int getValue() {
            return ((DMProto$DeviceFeatureSwitch) this.instance).getValue();
        }

        public Builder setFeature(int i) {
            copyOnWrite();
            ((DMProto$DeviceFeatureSwitch) this.instance).setFeature(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((DMProto$DeviceFeatureSwitch) this.instance).setType(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((DMProto$DeviceFeatureSwitch) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(DMProto$DeviceFeatureSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$DeviceFeatureSwitch dMProto$DeviceFeatureSwitch = new DMProto$DeviceFeatureSwitch();
        DEFAULT_INSTANCE = dMProto$DeviceFeatureSwitch;
        GeneratedMessageLite.registerDefaultInstance(DMProto$DeviceFeatureSwitch.class, dMProto$DeviceFeatureSwitch);
    }

    private DMProto$DeviceFeatureSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeature() {
        this.feature_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static DMProto$DeviceFeatureSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$DeviceFeatureSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$DeviceFeatureSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeature(int i) {
        this.feature_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$DeviceFeatureSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"feature_", "type_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$DeviceFeatureSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$DeviceFeatureSwitch.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$DeviceFeatureSwitchOrBuilder
    public int getFeature() {
        return this.feature_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$DeviceFeatureSwitchOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$DeviceFeatureSwitchOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(DMProto$DeviceFeatureSwitch dMProto$DeviceFeatureSwitch) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$DeviceFeatureSwitch);
    }

    public static DMProto$DeviceFeatureSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$DeviceFeatureSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$DeviceFeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
