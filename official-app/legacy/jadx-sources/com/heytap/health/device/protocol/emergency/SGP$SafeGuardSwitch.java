package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l5g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class SGP$SafeGuardSwitch extends GeneratedMessageLite<SGP$SafeGuardSwitch, Builder> implements SGP$SafeGuardSwitchOrBuilder {
    private static final SGP$SafeGuardSwitch DEFAULT_INSTANCE;
    private static volatile Parser<SGP$SafeGuardSwitch> PARSER = null;
    public static final int SWITCH_FIELD_NUMBER = 1;
    private int switch_;

    public static final class Builder extends GeneratedMessageLite.Builder<SGP$SafeGuardSwitch, Builder> implements SGP$SafeGuardSwitchOrBuilder {
        public Builder clearSwitch() {
            copyOnWrite();
            ((SGP$SafeGuardSwitch) this.instance).clearSwitch();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSwitchOrBuilder
        public int getSwitch() {
            return ((SGP$SafeGuardSwitch) this.instance).getSwitch();
        }

        public Builder setSwitch(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSwitch) this.instance).setSwitch(i);
            return this;
        }

        private Builder() {
            super(SGP$SafeGuardSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        SGP$SafeGuardSwitch sGP$SafeGuardSwitch = new SGP$SafeGuardSwitch();
        DEFAULT_INSTANCE = sGP$SafeGuardSwitch;
        GeneratedMessageLite.registerDefaultInstance(SGP$SafeGuardSwitch.class, sGP$SafeGuardSwitch);
    }

    private SGP$SafeGuardSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitch() {
        this.switch_ = 0;
    }

    public static SGP$SafeGuardSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SGP$SafeGuardSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SGP$SafeGuardSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitch(int i) {
        this.switch_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l5g.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SGP$SafeGuardSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"switch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SGP$SafeGuardSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SGP$SafeGuardSwitch.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSwitchOrBuilder
    public int getSwitch() {
        return this.switch_;
    }

    public static Builder newBuilder(SGP$SafeGuardSwitch sGP$SafeGuardSwitch) {
        return DEFAULT_INSTANCE.createBuilder(sGP$SafeGuardSwitch);
    }

    public static SGP$SafeGuardSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SGP$SafeGuardSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SGP$SafeGuardSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SGP$SafeGuardSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SGP$SafeGuardSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SGP$SafeGuardSwitch parseFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SGP$SafeGuardSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
