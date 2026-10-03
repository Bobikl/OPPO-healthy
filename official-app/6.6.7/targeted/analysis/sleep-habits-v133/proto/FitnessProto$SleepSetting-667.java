package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.pi7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProto$SleepSetting extends GeneratedMessageLite<FitnessProto$SleepSetting, Builder> implements FitnessProto$SleepSettingOrBuilder {
    private static final FitnessProto$SleepSetting DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SleepSetting> PARSER = null;
    public static final int USERS_REST_FIELD_NUMBER = 2;
    public static final int USER_HABITS_SWITCH_FIELD_NUMBER = 1;
    private int userHabitsSwitch_;
    private Internal.ProtobufList<FitnessProto$UserRest> usersRest_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepSetting, Builder> implements FitnessProto$SleepSettingOrBuilder {
        public Builder addAllUsersRest(Iterable<? extends FitnessProto$UserRest> iterable) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).addAllUsersRest(iterable);
            return this;
        }

        public Builder addUsersRest(FitnessProto$UserRest fitnessProto$UserRest) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).addUsersRest(fitnessProto$UserRest);
            return this;
        }

        public Builder clearUserHabitsSwitch() {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).clearUserHabitsSwitch();
            return this;
        }

        public Builder clearUsersRest() {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).clearUsersRest();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepSettingOrBuilder
        public int getUserHabitsSwitch() {
            return ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).getUserHabitsSwitch();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepSettingOrBuilder
        public FitnessProto$UserRest getUsersRest(int i) {
            return ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).getUsersRest(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepSettingOrBuilder
        public int getUsersRestCount() {
            return ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).getUsersRestCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepSettingOrBuilder
        public List<FitnessProto$UserRest> getUsersRestList() {
            return Collections.unmodifiableList(((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).getUsersRestList());
        }

        public Builder removeUsersRest(int i) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).removeUsersRest(i);
            return this;
        }

        public Builder setUserHabitsSwitch(int i) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).setUserHabitsSwitch(i);
            return this;
        }

        public Builder setUsersRest(int i, FitnessProto$UserRest fitnessProto$UserRest) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).setUsersRest(i, fitnessProto$UserRest);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepSetting.DEFAULT_INSTANCE);
        }

        public Builder addUsersRest(int i, FitnessProto$UserRest fitnessProto$UserRest) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).addUsersRest(i, fitnessProto$UserRest);
            return this;
        }

        public Builder setUsersRest(int i, FitnessProto$UserRest.Builder builder) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).setUsersRest(i, (FitnessProto$UserRest) builder.build());
            return this;
        }

        public Builder addUsersRest(FitnessProto$UserRest.Builder builder) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).addUsersRest((FitnessProto$UserRest) builder.build());
            return this;
        }

        public Builder addUsersRest(int i, FitnessProto$UserRest.Builder builder) {
            copyOnWrite();
            ((FitnessProto$SleepSetting) ((GeneratedMessageLite.Builder) this).instance).addUsersRest(i, (FitnessProto$UserRest) builder.build());
            return this;
        }
    }

    static {
        FitnessProto$SleepSetting fitnessProto$SleepSetting = new FitnessProto$SleepSetting();
        DEFAULT_INSTANCE = fitnessProto$SleepSetting;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepSetting.class, fitnessProto$SleepSetting);
    }

    private FitnessProto$SleepSetting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUsersRest(Iterable<? extends FitnessProto$UserRest> iterable) {
        ensureUsersRestIsMutable();
        AbstractMessageLite.addAll(iterable, this.usersRest_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUsersRest(FitnessProto$UserRest fitnessProto$UserRest) {
        fitnessProto$UserRest.getClass();
        ensureUsersRestIsMutable();
        this.usersRest_.add(fitnessProto$UserRest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserHabitsSwitch() {
        this.userHabitsSwitch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsersRest() {
        this.usersRest_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUsersRestIsMutable() {
        Internal.ProtobufList<FitnessProto$UserRest> protobufList = this.usersRest_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.usersRest_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FitnessProto$SleepSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepSetting> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUsersRest(int i) {
        ensureUsersRestIsMutable();
        this.usersRest_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserHabitsSwitch(int i) {
        this.userHabitsSwitch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsersRest(int i, FitnessProto$UserRest fitnessProto$UserRest) {
        fitnessProto$UserRest.getClass();
        ensureUsersRestIsMutable();
        this.usersRest_.set(i, fitnessProto$UserRest);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepSetting();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"userHabitsSwitch_", "usersRest_", FitnessProto$UserRest.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepSetting.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepSettingOrBuilder
    public int getUserHabitsSwitch() {
        return this.userHabitsSwitch_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepSettingOrBuilder
    public FitnessProto$UserRest getUsersRest(int i) {
        return (FitnessProto$UserRest) this.usersRest_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepSettingOrBuilder
    public int getUsersRestCount() {
        return this.usersRest_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepSettingOrBuilder
    public List<FitnessProto$UserRest> getUsersRestList() {
        return this.usersRest_;
    }

    public FitnessProto$UserRestOrBuilder getUsersRestOrBuilder(int i) {
        return (FitnessProto$UserRestOrBuilder) this.usersRest_.get(i);
    }

    public List<? extends FitnessProto$UserRestOrBuilder> getUsersRestOrBuilderList() {
        return this.usersRest_;
    }

    public static Builder newBuilder(FitnessProto$SleepSetting fitnessProto$SleepSetting) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepSetting);
    }

    public static FitnessProto$SleepSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUsersRest(int i, FitnessProto$UserRest fitnessProto$UserRest) {
        fitnessProto$UserRest.getClass();
        ensureUsersRestIsMutable();
        this.usersRest_.add(i, fitnessProto$UserRest);
    }

    public static FitnessProto$SleepSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepSetting parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}