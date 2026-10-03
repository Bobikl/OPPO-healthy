package com.heytap.health.protocol.userinfo;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rok;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class UserInfoProto$UserInfo extends GeneratedMessageLite<UserInfoProto$UserInfo, Builder> implements UserInfoProto$UserInfoOrBuilder {
    public static final int AGE_FIELD_NUMBER = 3;
    public static final int BLOODPRESSURETYPE_FIELD_NUMBER = 7;
    private static final UserInfoProto$UserInfo DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int MODIFIERTIME_FIELD_NUMBER = 6;
    private static volatile Parser<UserInfoProto$UserInfo> PARSER = null;
    public static final int SEX_FIELD_NUMBER = 4;
    public static final int WEIGHTOFG_FIELD_NUMBER = 5;
    public static final int WEIGHT_FIELD_NUMBER = 1;
    private int age_;
    private int bloodPressureType_;
    private int height_;
    private long modifierTime_;
    private int sex_;
    private int weightOfg_;
    private int weight_;

    public static final class Builder extends GeneratedMessageLite.Builder<UserInfoProto$UserInfo, Builder> implements UserInfoProto$UserInfoOrBuilder {
        public Builder clearAge() {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).clearAge();
            return this;
        }

        public Builder clearBloodPressureType() {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).clearBloodPressureType();
            return this;
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).clearHeight();
            return this;
        }

        public Builder clearModifierTime() {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).clearModifierTime();
            return this;
        }

        public Builder clearSex() {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).clearSex();
            return this;
        }

        public Builder clearWeight() {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).clearWeight();
            return this;
        }

        public Builder clearWeightOfg() {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).clearWeightOfg();
            return this;
        }

        @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
        public int getAge() {
            return ((UserInfoProto$UserInfo) this.instance).getAge();
        }

        @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
        public int getBloodPressureType() {
            return ((UserInfoProto$UserInfo) this.instance).getBloodPressureType();
        }

        @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
        public int getHeight() {
            return ((UserInfoProto$UserInfo) this.instance).getHeight();
        }

        @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
        public long getModifierTime() {
            return ((UserInfoProto$UserInfo) this.instance).getModifierTime();
        }

        @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
        public int getSex() {
            return ((UserInfoProto$UserInfo) this.instance).getSex();
        }

        @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
        public int getWeight() {
            return ((UserInfoProto$UserInfo) this.instance).getWeight();
        }

        @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
        public int getWeightOfg() {
            return ((UserInfoProto$UserInfo) this.instance).getWeightOfg();
        }

        public Builder setAge(int i) {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).setAge(i);
            return this;
        }

        public Builder setBloodPressureType(int i) {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).setBloodPressureType(i);
            return this;
        }

        public Builder setHeight(int i) {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).setHeight(i);
            return this;
        }

        public Builder setModifierTime(long j2) {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).setModifierTime(j2);
            return this;
        }

        public Builder setSex(int i) {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).setSex(i);
            return this;
        }

        public Builder setWeight(int i) {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).setWeight(i);
            return this;
        }

        public Builder setWeightOfg(int i) {
            copyOnWrite();
            ((UserInfoProto$UserInfo) this.instance).setWeightOfg(i);
            return this;
        }

        private Builder() {
            super(UserInfoProto$UserInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        UserInfoProto$UserInfo userInfoProto$UserInfo = new UserInfoProto$UserInfo();
        DEFAULT_INSTANCE = userInfoProto$UserInfo;
        GeneratedMessageLite.registerDefaultInstance(UserInfoProto$UserInfo.class, userInfoProto$UserInfo);
    }

    private UserInfoProto$UserInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAge() {
        this.age_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBloodPressureType() {
        this.bloodPressureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifierTime() {
        this.modifierTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSex() {
        this.sex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeight() {
        this.weight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeightOfg() {
        this.weightOfg_ = 0;
    }

    public static UserInfoProto$UserInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserInfoProto$UserInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInfoProto$UserInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserInfoProto$UserInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAge(int i) {
        this.age_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBloodPressureType(int i) {
        this.bloodPressureType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i) {
        this.height_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifierTime(long j2) {
        this.modifierTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSex(int i) {
        this.sex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(int i) {
        this.weight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeightOfg(int i) {
        this.weightOfg_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rok.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new UserInfoProto$UserInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u0003\u0007\u000b", new Object[]{"weight_", "height_", "age_", "sex_", "weightOfg_", "modifierTime_", "bloodPressureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserInfoProto$UserInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (UserInfoProto$UserInfo.class) {
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

    @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
    public int getAge() {
        return this.age_;
    }

    @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
    public int getBloodPressureType() {
        return this.bloodPressureType_;
    }

    @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
    public int getHeight() {
        return this.height_;
    }

    @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
    public long getModifierTime() {
        return this.modifierTime_;
    }

    @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
    public int getSex() {
        return this.sex_;
    }

    @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
    public int getWeight() {
        return this.weight_;
    }

    @Override // com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoOrBuilder
    public int getWeightOfg() {
        return this.weightOfg_;
    }

    public static Builder newBuilder(UserInfoProto$UserInfo userInfoProto$UserInfo) {
        return DEFAULT_INSTANCE.createBuilder(userInfoProto$UserInfo);
    }

    public static UserInfoProto$UserInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserInfoProto$UserInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserInfoProto$UserInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserInfoProto$UserInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserInfoProto$UserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserInfoProto$UserInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserInfoProto$UserInfo parseFrom(InputStream inputStream) throws IOException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInfoProto$UserInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserInfoProto$UserInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserInfoProto$UserInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserInfoProto$UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
