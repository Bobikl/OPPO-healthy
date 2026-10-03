package com.heytap.health.settings.watch.schoolmode.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ohg;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes18.dex */
public final class SchoolModeProto$SchoolModeSet extends GeneratedMessageLite<SchoolModeProto$SchoolModeSet, Builder> implements SchoolModeProto$SchoolModeSetOrBuilder {
    public static final int AMENDTIME_FIELD_NUMBER = 5;
    public static final int AMSTARTTIME_FIELD_NUMBER = 4;
    private static final SchoolModeProto$SchoolModeSet DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 2;
    private static volatile Parser<SchoolModeProto$SchoolModeSet> PARSER = null;
    public static final int PMENDTIME_FIELD_NUMBER = 7;
    public static final int PMSTARTTIME_FIELD_NUMBER = 6;
    public static final int REPEATTIME_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int amEndTime_;
    private int amStartTime_;
    private int enable_;
    private int pmEndTime_;
    private int pmStartTime_;
    private int repeatTime_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<SchoolModeProto$SchoolModeSet, Builder> implements SchoolModeProto$SchoolModeSetOrBuilder {
        public Builder clearAmEndTime() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).clearAmEndTime();
            return this;
        }

        public Builder clearAmStartTime() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).clearAmStartTime();
            return this;
        }

        public Builder clearEnable() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).clearEnable();
            return this;
        }

        public Builder clearPmEndTime() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).clearPmEndTime();
            return this;
        }

        public Builder clearPmStartTime() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).clearPmStartTime();
            return this;
        }

        public Builder clearRepeatTime() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).clearRepeatTime();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
        public int getAmEndTime() {
            return ((SchoolModeProto$SchoolModeSet) this.instance).getAmEndTime();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
        public int getAmStartTime() {
            return ((SchoolModeProto$SchoolModeSet) this.instance).getAmStartTime();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
        public int getEnable() {
            return ((SchoolModeProto$SchoolModeSet) this.instance).getEnable();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
        public int getPmEndTime() {
            return ((SchoolModeProto$SchoolModeSet) this.instance).getPmEndTime();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
        public int getPmStartTime() {
            return ((SchoolModeProto$SchoolModeSet) this.instance).getPmStartTime();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
        public int getRepeatTime() {
            return ((SchoolModeProto$SchoolModeSet) this.instance).getRepeatTime();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
        public int getType() {
            return ((SchoolModeProto$SchoolModeSet) this.instance).getType();
        }

        public Builder setAmEndTime(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).setAmEndTime(i);
            return this;
        }

        public Builder setAmStartTime(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).setAmStartTime(i);
            return this;
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).setEnable(i);
            return this;
        }

        public Builder setPmEndTime(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).setPmEndTime(i);
            return this;
        }

        public Builder setPmStartTime(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).setPmStartTime(i);
            return this;
        }

        public Builder setRepeatTime(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).setRepeatTime(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeSet) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(SchoolModeProto$SchoolModeSet.DEFAULT_INSTANCE);
        }
    }

    static {
        SchoolModeProto$SchoolModeSet schoolModeProto$SchoolModeSet = new SchoolModeProto$SchoolModeSet();
        DEFAULT_INSTANCE = schoolModeProto$SchoolModeSet;
        GeneratedMessageLite.registerDefaultInstance(SchoolModeProto$SchoolModeSet.class, schoolModeProto$SchoolModeSet);
    }

    private SchoolModeProto$SchoolModeSet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmEndTime() {
        this.amEndTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmStartTime() {
        this.amStartTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPmEndTime() {
        this.pmEndTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPmStartTime() {
        this.pmStartTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepeatTime() {
        this.repeatTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static SchoolModeProto$SchoolModeSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SchoolModeProto$SchoolModeSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SchoolModeProto$SchoolModeSet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmEndTime(int i) {
        this.amEndTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmStartTime(int i) {
        this.amStartTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnable(int i) {
        this.enable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPmEndTime(int i) {
        this.pmEndTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPmStartTime(int i) {
        this.pmStartTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepeatTime(int i) {
        this.repeatTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ohg.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SchoolModeProto$SchoolModeSet();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b", new Object[]{"type_", "enable_", "repeatTime_", "amStartTime_", "amEndTime_", "pmStartTime_", "pmEndTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SchoolModeProto$SchoolModeSet> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SchoolModeProto$SchoolModeSet.class) {
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

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
    public int getAmEndTime() {
        return this.amEndTime_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
    public int getAmStartTime() {
        return this.amStartTime_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
    public int getPmEndTime() {
        return this.pmEndTime_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
    public int getPmStartTime() {
        return this.pmStartTime_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
    public int getRepeatTime() {
        return this.repeatTime_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSetOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(SchoolModeProto$SchoolModeSet schoolModeProto$SchoolModeSet) {
        return DEFAULT_INSTANCE.createBuilder(schoolModeProto$SchoolModeSet);
    }

    public static SchoolModeProto$SchoolModeSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SchoolModeProto$SchoolModeSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
