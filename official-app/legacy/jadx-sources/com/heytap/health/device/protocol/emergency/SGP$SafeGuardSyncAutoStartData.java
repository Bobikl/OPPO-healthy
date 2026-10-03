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
public final class SGP$SafeGuardSyncAutoStartData extends GeneratedMessageLite<SGP$SafeGuardSyncAutoStartData, Builder> implements SGP$SafeGuardSyncAutoStartDataOrBuilder {
    private static final SGP$SafeGuardSyncAutoStartData DEFAULT_INSTANCE;
    public static final int ENDHOUR_FIELD_NUMBER = 4;
    public static final int ENDMINUTE_FIELD_NUMBER = 5;
    public static final int ISOPEN_FIELD_NUMBER = 1;
    private static volatile Parser<SGP$SafeGuardSyncAutoStartData> PARSER = null;
    public static final int STARTHOUR_FIELD_NUMBER = 2;
    public static final int STARTMINUTE_FIELD_NUMBER = 3;
    private int endHour_;
    private int endMinute_;
    private boolean isOpen_;
    private int startHour_;
    private int startMinute_;

    public static final class Builder extends GeneratedMessageLite.Builder<SGP$SafeGuardSyncAutoStartData, Builder> implements SGP$SafeGuardSyncAutoStartDataOrBuilder {
        public Builder clearEndHour() {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).clearEndHour();
            return this;
        }

        public Builder clearEndMinute() {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).clearEndMinute();
            return this;
        }

        public Builder clearIsOpen() {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).clearIsOpen();
            return this;
        }

        public Builder clearStartHour() {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).clearStartHour();
            return this;
        }

        public Builder clearStartMinute() {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).clearStartMinute();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
        public int getEndHour() {
            return ((SGP$SafeGuardSyncAutoStartData) this.instance).getEndHour();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
        public int getEndMinute() {
            return ((SGP$SafeGuardSyncAutoStartData) this.instance).getEndMinute();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
        public boolean getIsOpen() {
            return ((SGP$SafeGuardSyncAutoStartData) this.instance).getIsOpen();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
        public int getStartHour() {
            return ((SGP$SafeGuardSyncAutoStartData) this.instance).getStartHour();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
        public int getStartMinute() {
            return ((SGP$SafeGuardSyncAutoStartData) this.instance).getStartMinute();
        }

        public Builder setEndHour(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).setEndHour(i);
            return this;
        }

        public Builder setEndMinute(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).setEndMinute(i);
            return this;
        }

        public Builder setIsOpen(boolean z) {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).setIsOpen(z);
            return this;
        }

        public Builder setStartHour(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).setStartHour(i);
            return this;
        }

        public Builder setStartMinute(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartData) this.instance).setStartMinute(i);
            return this;
        }

        private Builder() {
            super(SGP$SafeGuardSyncAutoStartData.DEFAULT_INSTANCE);
        }
    }

    static {
        SGP$SafeGuardSyncAutoStartData sGP$SafeGuardSyncAutoStartData = new SGP$SafeGuardSyncAutoStartData();
        DEFAULT_INSTANCE = sGP$SafeGuardSyncAutoStartData;
        GeneratedMessageLite.registerDefaultInstance(SGP$SafeGuardSyncAutoStartData.class, sGP$SafeGuardSyncAutoStartData);
    }

    private SGP$SafeGuardSyncAutoStartData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndHour() {
        this.endHour_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndMinute() {
        this.endMinute_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOpen() {
        this.isOpen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartHour() {
        this.startHour_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartMinute() {
        this.startMinute_ = 0;
    }

    public static SGP$SafeGuardSyncAutoStartData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SGP$SafeGuardSyncAutoStartData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SGP$SafeGuardSyncAutoStartData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndHour(int i) {
        this.endHour_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndMinute(int i) {
        this.endMinute_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOpen(boolean z) {
        this.isOpen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartHour(int i) {
        this.startHour_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartMinute(int i) {
        this.startMinute_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l5g.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SGP$SafeGuardSyncAutoStartData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"isOpen_", "startHour_", "startMinute_", "endHour_", "endMinute_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SGP$SafeGuardSyncAutoStartData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SGP$SafeGuardSyncAutoStartData.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
    public int getEndHour() {
        return this.endHour_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
    public int getEndMinute() {
        return this.endMinute_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
    public boolean getIsOpen() {
        return this.isOpen_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
    public int getStartHour() {
        return this.startHour_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartDataOrBuilder
    public int getStartMinute() {
        return this.startMinute_;
    }

    public static Builder newBuilder(SGP$SafeGuardSyncAutoStartData sGP$SafeGuardSyncAutoStartData) {
        return DEFAULT_INSTANCE.createBuilder(sGP$SafeGuardSyncAutoStartData);
    }

    public static SGP$SafeGuardSyncAutoStartData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SGP$SafeGuardSyncAutoStartData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncAutoStartData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
