package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$Spo2AllDayMonitorSwitch extends GeneratedMessageLite<FitnessProto$Spo2AllDayMonitorSwitch, Builder> implements FitnessProto$Spo2AllDayMonitorSwitchOrBuilder {
    private static final FitnessProto$Spo2AllDayMonitorSwitch DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$Spo2AllDayMonitorSwitch> PARSER = null;
    public static final int SPO2_ALL_DAY_MONITOR_FIELD_NUMBER = 1;
    private int spo2AllDayMonitor_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$Spo2AllDayMonitorSwitch, Builder> implements FitnessProto$Spo2AllDayMonitorSwitchOrBuilder {
        public Builder clearSpo2AllDayMonitor() {
            copyOnWrite();
            ((FitnessProto$Spo2AllDayMonitorSwitch) this.instance).clearSpo2AllDayMonitor();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2AllDayMonitorSwitchOrBuilder
        public int getSpo2AllDayMonitor() {
            return ((FitnessProto$Spo2AllDayMonitorSwitch) this.instance).getSpo2AllDayMonitor();
        }

        public Builder setSpo2AllDayMonitor(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2AllDayMonitorSwitch) this.instance).setSpo2AllDayMonitor(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$Spo2AllDayMonitorSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$Spo2AllDayMonitorSwitch fitnessProto$Spo2AllDayMonitorSwitch = new FitnessProto$Spo2AllDayMonitorSwitch();
        DEFAULT_INSTANCE = fitnessProto$Spo2AllDayMonitorSwitch;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$Spo2AllDayMonitorSwitch.class, fitnessProto$Spo2AllDayMonitorSwitch);
    }

    private FitnessProto$Spo2AllDayMonitorSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2AllDayMonitor() {
        this.spo2AllDayMonitor_ = 0;
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$Spo2AllDayMonitorSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2AllDayMonitor(int i) {
        this.spo2AllDayMonitor_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$Spo2AllDayMonitorSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"spo2AllDayMonitor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$Spo2AllDayMonitorSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$Spo2AllDayMonitorSwitch.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2AllDayMonitorSwitchOrBuilder
    public int getSpo2AllDayMonitor() {
        return this.spo2AllDayMonitor_;
    }

    public static Builder newBuilder(FitnessProto$Spo2AllDayMonitorSwitch fitnessProto$Spo2AllDayMonitorSwitch) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$Spo2AllDayMonitorSwitch);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$Spo2AllDayMonitorSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2AllDayMonitorSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
