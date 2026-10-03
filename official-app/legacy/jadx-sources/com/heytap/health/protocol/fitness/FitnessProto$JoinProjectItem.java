package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
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
public final class FitnessProto$JoinProjectItem extends GeneratedMessageLite<FitnessProto$JoinProjectItem, Builder> implements FitnessProto$JoinProjectItemOrBuilder {
    private static final FitnessProto$JoinProjectItem DEFAULT_INSTANCE;
    public static final int EXTRA_FIELD_NUMBER = 4;
    public static final int MODIFIER_TIME_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$JoinProjectItem> PARSER = null;
    public static final int PROJECT_CODE_FIELD_NUMBER = 1;
    public static final int STATE_FIELD_NUMBER = 3;
    private long modifierTime_;
    private int state_;
    private String projectCode_ = "";
    private String extra_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$JoinProjectItem, Builder> implements FitnessProto$JoinProjectItemOrBuilder {
        private Builder() {
            super(FitnessProto$JoinProjectItem.DEFAULT_INSTANCE);
        }

        public Builder clearExtra() {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).clearExtra();
            return this;
        }

        public Builder clearModifierTime() {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).clearModifierTime();
            return this;
        }

        public Builder clearProjectCode() {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).clearProjectCode();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
        public String getExtra() {
            return ((FitnessProto$JoinProjectItem) this.instance).getExtra();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
        public ByteString getExtraBytes() {
            return ((FitnessProto$JoinProjectItem) this.instance).getExtraBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
        public long getModifierTime() {
            return ((FitnessProto$JoinProjectItem) this.instance).getModifierTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
        public String getProjectCode() {
            return ((FitnessProto$JoinProjectItem) this.instance).getProjectCode();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
        public ByteString getProjectCodeBytes() {
            return ((FitnessProto$JoinProjectItem) this.instance).getProjectCodeBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
        public int getState() {
            return ((FitnessProto$JoinProjectItem) this.instance).getState();
        }

        public Builder setExtra(String str) {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).setExtra(str);
            return this;
        }

        public Builder setExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).setExtraBytes(byteString);
            return this;
        }

        public Builder setModifierTime(long j2) {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).setModifierTime(j2);
            return this;
        }

        public Builder setProjectCode(String str) {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).setProjectCode(str);
            return this;
        }

        public Builder setProjectCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).setProjectCodeBytes(byteString);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$JoinProjectItem) this.instance).setState(i);
            return this;
        }
    }

    static {
        FitnessProto$JoinProjectItem fitnessProto$JoinProjectItem = new FitnessProto$JoinProjectItem();
        DEFAULT_INSTANCE = fitnessProto$JoinProjectItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$JoinProjectItem.class, fitnessProto$JoinProjectItem);
    }

    private FitnessProto$JoinProjectItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifierTime() {
        this.modifierTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProjectCode() {
        this.projectCode_ = getDefaultInstance().getProjectCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static FitnessProto$JoinProjectItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$JoinProjectItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$JoinProjectItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$JoinProjectItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(String str) {
        str.getClass();
        this.extra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifierTime(long j2) {
        this.modifierTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectCode(String str) {
        str.getClass();
        this.projectCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.projectCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$JoinProjectItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003\u000b\u0004Ȉ", new Object[]{"projectCode_", "modifierTime_", "state_", "extra_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$JoinProjectItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$JoinProjectItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
    public String getExtra() {
        return this.extra_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
    public ByteString getExtraBytes() {
        return ByteString.copyFromUtf8(this.extra_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
    public long getModifierTime() {
        return this.modifierTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
    public String getProjectCode() {
        return this.projectCode_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
    public ByteString getProjectCodeBytes() {
        return ByteString.copyFromUtf8(this.projectCode_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$JoinProjectItemOrBuilder
    public int getState() {
        return this.state_;
    }

    public static Builder newBuilder(FitnessProto$JoinProjectItem fitnessProto$JoinProjectItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$JoinProjectItem);
    }

    public static FitnessProto$JoinProjectItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$JoinProjectItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$JoinProjectItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$JoinProjectItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$JoinProjectItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$JoinProjectItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$JoinProjectItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$JoinProjectItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$JoinProjectItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$JoinProjectItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$JoinProjectItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
