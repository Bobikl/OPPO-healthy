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
public final class FitnessProto$ResumeActivityReminderSwitch extends GeneratedMessageLite<FitnessProto$ResumeActivityReminderSwitch, Builder> implements FitnessProto$ResumeActivityReminderSwitchOrBuilder {
    private static final FitnessProto$ResumeActivityReminderSwitch DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$ResumeActivityReminderSwitch> PARSER = null;
    public static final int RESUME_ACTIVITY_REMINDER_FIELD_NUMBER = 1;
    private int resumeActivityReminder_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ResumeActivityReminderSwitch, Builder> implements FitnessProto$ResumeActivityReminderSwitchOrBuilder {
        public Builder clearResumeActivityReminder() {
            copyOnWrite();
            ((FitnessProto$ResumeActivityReminderSwitch) this.instance).clearResumeActivityReminder();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ResumeActivityReminderSwitchOrBuilder
        public int getResumeActivityReminder() {
            return ((FitnessProto$ResumeActivityReminderSwitch) this.instance).getResumeActivityReminder();
        }

        public Builder setResumeActivityReminder(int i) {
            copyOnWrite();
            ((FitnessProto$ResumeActivityReminderSwitch) this.instance).setResumeActivityReminder(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$ResumeActivityReminderSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$ResumeActivityReminderSwitch fitnessProto$ResumeActivityReminderSwitch = new FitnessProto$ResumeActivityReminderSwitch();
        DEFAULT_INSTANCE = fitnessProto$ResumeActivityReminderSwitch;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ResumeActivityReminderSwitch.class, fitnessProto$ResumeActivityReminderSwitch);
    }

    private FitnessProto$ResumeActivityReminderSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeActivityReminder() {
        this.resumeActivityReminder_ = 0;
    }

    public static FitnessProto$ResumeActivityReminderSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$ResumeActivityReminderSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeActivityReminder(int i) {
        this.resumeActivityReminder_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ResumeActivityReminderSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"resumeActivityReminder_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ResumeActivityReminderSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ResumeActivityReminderSwitch.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ResumeActivityReminderSwitchOrBuilder
    public int getResumeActivityReminder() {
        return this.resumeActivityReminder_;
    }

    public static Builder newBuilder(FitnessProto$ResumeActivityReminderSwitch fitnessProto$ResumeActivityReminderSwitch) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ResumeActivityReminderSwitch);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ResumeActivityReminderSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ResumeActivityReminderSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
