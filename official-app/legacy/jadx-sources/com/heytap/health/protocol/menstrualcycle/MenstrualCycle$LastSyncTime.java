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
public final class MenstrualCycle$LastSyncTime extends GeneratedMessageLite<MenstrualCycle$LastSyncTime, Builder> implements MenstrualCycle$LastSyncTimeOrBuilder {
    private static final MenstrualCycle$LastSyncTime DEFAULT_INSTANCE;
    public static final int LASTSYNCTIME_FIELD_NUMBER = 1;
    private static volatile Parser<MenstrualCycle$LastSyncTime> PARSER;
    private int lastSyncTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$LastSyncTime, Builder> implements MenstrualCycle$LastSyncTimeOrBuilder {
        public Builder clearLastSyncTime() {
            copyOnWrite();
            ((MenstrualCycle$LastSyncTime) this.instance).clearLastSyncTime();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$LastSyncTimeOrBuilder
        public int getLastSyncTime() {
            return ((MenstrualCycle$LastSyncTime) this.instance).getLastSyncTime();
        }

        public Builder setLastSyncTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$LastSyncTime) this.instance).setLastSyncTime(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$LastSyncTime.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$LastSyncTime menstrualCycle$LastSyncTime = new MenstrualCycle$LastSyncTime();
        DEFAULT_INSTANCE = menstrualCycle$LastSyncTime;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$LastSyncTime.class, menstrualCycle$LastSyncTime);
    }

    private MenstrualCycle$LastSyncTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastSyncTime() {
        this.lastSyncTime_ = 0;
    }

    public static MenstrualCycle$LastSyncTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$LastSyncTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$LastSyncTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSyncTime(int i) {
        this.lastSyncTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$LastSyncTime();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"lastSyncTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$LastSyncTime> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$LastSyncTime.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$LastSyncTimeOrBuilder
    public int getLastSyncTime() {
        return this.lastSyncTime_;
    }

    public static Builder newBuilder(MenstrualCycle$LastSyncTime menstrualCycle$LastSyncTime) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$LastSyncTime);
    }

    public static MenstrualCycle$LastSyncTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$LastSyncTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$LastSyncTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
