package com.heytap.health.protocol.iwatch;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.f0a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class IWatch$CallSwitch extends GeneratedMessageLite<IWatch$CallSwitch, Builder> implements IWatch$CallSwitchOrBuilder {
    public static final int CALL_SWITCH_STATUS_FIELD_NUMBER = 1;
    private static final IWatch$CallSwitch DEFAULT_INSTANCE;
    private static volatile Parser<IWatch$CallSwitch> PARSER;
    private int callSwitchStatus_;

    public static final class Builder extends GeneratedMessageLite.Builder<IWatch$CallSwitch, Builder> implements IWatch$CallSwitchOrBuilder {
        public Builder clearCallSwitchStatus() {
            copyOnWrite();
            ((IWatch$CallSwitch) this.instance).clearCallSwitchStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$CallSwitchOrBuilder
        public int getCallSwitchStatus() {
            return ((IWatch$CallSwitch) this.instance).getCallSwitchStatus();
        }

        public Builder setCallSwitchStatus(int i) {
            copyOnWrite();
            ((IWatch$CallSwitch) this.instance).setCallSwitchStatus(i);
            return this;
        }

        private Builder() {
            super(IWatch$CallSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        IWatch$CallSwitch iWatch$CallSwitch = new IWatch$CallSwitch();
        DEFAULT_INSTANCE = iWatch$CallSwitch;
        GeneratedMessageLite.registerDefaultInstance(IWatch$CallSwitch.class, iWatch$CallSwitch);
    }

    private IWatch$CallSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallSwitchStatus() {
        this.callSwitchStatus_ = 0;
    }

    public static IWatch$CallSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IWatch$CallSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$CallSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IWatch$CallSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallSwitchStatus(int i) {
        this.callSwitchStatus_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f0a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IWatch$CallSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"callSwitchStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IWatch$CallSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IWatch$CallSwitch.class) {
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

    @Override // com.heytap.health.protocol.iwatch.IWatch$CallSwitchOrBuilder
    public int getCallSwitchStatus() {
        return this.callSwitchStatus_;
    }

    public static Builder newBuilder(IWatch$CallSwitch iWatch$CallSwitch) {
        return DEFAULT_INSTANCE.createBuilder(iWatch$CallSwitch);
    }

    public static IWatch$CallSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$CallSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IWatch$CallSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IWatch$CallSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IWatch$CallSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IWatch$CallSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IWatch$CallSwitch parseFrom(InputStream inputStream) throws IOException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$CallSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$CallSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IWatch$CallSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$CallSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
