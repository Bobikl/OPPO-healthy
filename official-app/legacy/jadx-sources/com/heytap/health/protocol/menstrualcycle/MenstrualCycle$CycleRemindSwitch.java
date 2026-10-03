package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rsb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class MenstrualCycle$CycleRemindSwitch extends GeneratedMessageLite<MenstrualCycle$CycleRemindSwitch, Builder> implements MenstrualCycle$CycleRemindSwitchOrBuilder {
    private static final MenstrualCycle$CycleRemindSwitch DEFAULT_INSTANCE;
    private static volatile Parser<MenstrualCycle$CycleRemindSwitch> PARSER = null;
    public static final int REMINDSWITCH_FIELD_NUMBER = 1;
    private int remindSwitch_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$CycleRemindSwitch, Builder> implements MenstrualCycle$CycleRemindSwitchOrBuilder {
        public Builder clearRemindSwitch() {
            copyOnWrite();
            ((MenstrualCycle$CycleRemindSwitch) this.instance).clearRemindSwitch();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleRemindSwitchOrBuilder
        public int getRemindSwitch() {
            return ((MenstrualCycle$CycleRemindSwitch) this.instance).getRemindSwitch();
        }

        public Builder setRemindSwitch(int i) {
            copyOnWrite();
            ((MenstrualCycle$CycleRemindSwitch) this.instance).setRemindSwitch(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$CycleRemindSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$CycleRemindSwitch menstrualCycle$CycleRemindSwitch = new MenstrualCycle$CycleRemindSwitch();
        DEFAULT_INSTANCE = menstrualCycle$CycleRemindSwitch;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$CycleRemindSwitch.class, menstrualCycle$CycleRemindSwitch);
    }

    private MenstrualCycle$CycleRemindSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemindSwitch() {
        this.remindSwitch_ = 0;
    }

    public static MenstrualCycle$CycleRemindSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$CycleRemindSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$CycleRemindSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemindSwitch(int i) {
        this.remindSwitch_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$CycleRemindSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"remindSwitch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$CycleRemindSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$CycleRemindSwitch.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleRemindSwitchOrBuilder
    public int getRemindSwitch() {
        return this.remindSwitch_;
    }

    public static Builder newBuilder(MenstrualCycle$CycleRemindSwitch menstrualCycle$CycleRemindSwitch) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$CycleRemindSwitch);
    }

    public static MenstrualCycle$CycleRemindSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$CycleRemindSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleRemindSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
