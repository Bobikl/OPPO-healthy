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
public final class FitnessProto$FamilyMember extends GeneratedMessageLite<FitnessProto$FamilyMember, Builder> implements FitnessProto$FamilyMemberOrBuilder {
    private static final FitnessProto$FamilyMember DEFAULT_INSTANCE;
    public static final int NICKNAME_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$FamilyMember> PARSER = null;
    public static final int PHONE_NUM_FIELD_NUMBER = 3;
    public static final int USERID_FIELD_NUMBER = 1;
    private String userId_ = "";
    private String nickname_ = "";
    private String phoneNum_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$FamilyMember, Builder> implements FitnessProto$FamilyMemberOrBuilder {
        public Builder clearNickname() {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).clearNickname();
            return this;
        }

        public Builder clearPhoneNum() {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).clearPhoneNum();
            return this;
        }

        public Builder clearUserId() {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).clearUserId();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
        public String getNickname() {
            return ((FitnessProto$FamilyMember) this.instance).getNickname();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
        public ByteString getNicknameBytes() {
            return ((FitnessProto$FamilyMember) this.instance).getNicknameBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
        public String getPhoneNum() {
            return ((FitnessProto$FamilyMember) this.instance).getPhoneNum();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
        public ByteString getPhoneNumBytes() {
            return ((FitnessProto$FamilyMember) this.instance).getPhoneNumBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
        public String getUserId() {
            return ((FitnessProto$FamilyMember) this.instance).getUserId();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
        public ByteString getUserIdBytes() {
            return ((FitnessProto$FamilyMember) this.instance).getUserIdBytes();
        }

        public Builder setNickname(String str) {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).setNickname(str);
            return this;
        }

        public Builder setNicknameBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).setNicknameBytes(byteString);
            return this;
        }

        public Builder setPhoneNum(String str) {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).setPhoneNum(str);
            return this;
        }

        public Builder setPhoneNumBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).setPhoneNumBytes(byteString);
            return this;
        }

        public Builder setUserId(String str) {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).setUserId(str);
            return this;
        }

        public Builder setUserIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$FamilyMember) this.instance).setUserIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(FitnessProto$FamilyMember.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$FamilyMember fitnessProto$FamilyMember = new FitnessProto$FamilyMember();
        DEFAULT_INSTANCE = fitnessProto$FamilyMember;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$FamilyMember.class, fitnessProto$FamilyMember);
    }

    private FitnessProto$FamilyMember() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.nickname_ = getDefaultInstance().getNickname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhoneNum() {
        this.phoneNum_ = getDefaultInstance().getPhoneNum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.userId_ = getDefaultInstance().getUserId();
    }

    public static FitnessProto$FamilyMember getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$FamilyMember parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FamilyMember parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$FamilyMember> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        str.getClass();
        this.nickname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nickname_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneNum(String str) {
        str.getClass();
        this.phoneNum_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneNumBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.phoneNum_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String str) {
        str.getClass();
        this.userId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$FamilyMember();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"userId_", "nickname_", "phoneNum_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$FamilyMember> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$FamilyMember.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
    public String getNickname() {
        return this.nickname_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.nickname_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
    public String getPhoneNum() {
        return this.phoneNum_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
    public ByteString getPhoneNumBytes() {
        return ByteString.copyFromUtf8(this.phoneNum_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
    public String getUserId() {
        return this.userId_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyMemberOrBuilder
    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.userId_);
    }

    public static Builder newBuilder(FitnessProto$FamilyMember fitnessProto$FamilyMember) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$FamilyMember);
    }

    public static FitnessProto$FamilyMember parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FamilyMember parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$FamilyMember parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$FamilyMember parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$FamilyMember parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$FamilyMember parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$FamilyMember parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FamilyMember parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FamilyMember parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$FamilyMember parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyMember) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
