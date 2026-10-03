package com.heytap.wearable.lpa.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LPASyncProto {

    /* JADX INFO: renamed from: com.heytap.wearable.lpa.proto.LPASyncProto$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class ADDProfile extends GeneratedMessageLite<ADDProfile, Builder> implements ADDProfileOrBuilder {
        public static final int ACTIVATE_CODE_FIELD_NUMBER = 1;
        public static final int ACTIVATE_CODE_SIGN_FIELD_NUMBER = 5;
        public static final int CONFIRMATION_CODE_FIELD_NUMBER = 2;
        private static final ADDProfile DEFAULT_INSTANCE;
        private static volatile Parser<ADDProfile> PARSER = null;
        public static final int PROFILE_TYPE_FIELD_NUMBER = 3;
        public static final int SUPPORT_ENCRYPT_FIELD_NUMBER = 4;
        private int profileType_;
        private int supportEncrypt_;
        private String activateCode_ = "";
        private String confirmationCode_ = "";
        private String activateCodeSign_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<ADDProfile, Builder> implements ADDProfileOrBuilder {
            public Builder clearActivateCode() {
                copyOnWrite();
                ((ADDProfile) this.instance).clearActivateCode();
                return this;
            }

            public Builder clearActivateCodeSign() {
                copyOnWrite();
                ((ADDProfile) this.instance).clearActivateCodeSign();
                return this;
            }

            public Builder clearConfirmationCode() {
                copyOnWrite();
                ((ADDProfile) this.instance).clearConfirmationCode();
                return this;
            }

            public Builder clearProfileType() {
                copyOnWrite();
                ((ADDProfile) this.instance).clearProfileType();
                return this;
            }

            public Builder clearSupportEncrypt() {
                copyOnWrite();
                ((ADDProfile) this.instance).clearSupportEncrypt();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
            public String getActivateCode() {
                return ((ADDProfile) this.instance).getActivateCode();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
            public ByteString getActivateCodeBytes() {
                return ((ADDProfile) this.instance).getActivateCodeBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
            public String getActivateCodeSign() {
                return ((ADDProfile) this.instance).getActivateCodeSign();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
            public ByteString getActivateCodeSignBytes() {
                return ((ADDProfile) this.instance).getActivateCodeSignBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
            public String getConfirmationCode() {
                return ((ADDProfile) this.instance).getConfirmationCode();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
            public ByteString getConfirmationCodeBytes() {
                return ((ADDProfile) this.instance).getConfirmationCodeBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
            public int getProfileType() {
                return ((ADDProfile) this.instance).getProfileType();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
            public int getSupportEncrypt() {
                return ((ADDProfile) this.instance).getSupportEncrypt();
            }

            public Builder setActivateCode(String str) {
                copyOnWrite();
                ((ADDProfile) this.instance).setActivateCode(str);
                return this;
            }

            public Builder setActivateCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((ADDProfile) this.instance).setActivateCodeBytes(byteString);
                return this;
            }

            public Builder setActivateCodeSign(String str) {
                copyOnWrite();
                ((ADDProfile) this.instance).setActivateCodeSign(str);
                return this;
            }

            public Builder setActivateCodeSignBytes(ByteString byteString) {
                copyOnWrite();
                ((ADDProfile) this.instance).setActivateCodeSignBytes(byteString);
                return this;
            }

            public Builder setConfirmationCode(String str) {
                copyOnWrite();
                ((ADDProfile) this.instance).setConfirmationCode(str);
                return this;
            }

            public Builder setConfirmationCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((ADDProfile) this.instance).setConfirmationCodeBytes(byteString);
                return this;
            }

            public Builder setProfileType(int i) {
                copyOnWrite();
                ((ADDProfile) this.instance).setProfileType(i);
                return this;
            }

            public Builder setSupportEncrypt(int i) {
                copyOnWrite();
                ((ADDProfile) this.instance).setSupportEncrypt(i);
                return this;
            }

            private Builder() {
                super(ADDProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            ADDProfile aDDProfile = new ADDProfile();
            DEFAULT_INSTANCE = aDDProfile;
            GeneratedMessageLite.registerDefaultInstance(ADDProfile.class, aDDProfile);
        }

        private ADDProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivateCode() {
            this.activateCode_ = getDefaultInstance().getActivateCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivateCodeSign() {
            this.activateCodeSign_ = getDefaultInstance().getActivateCodeSign();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfirmationCode() {
            this.confirmationCode_ = getDefaultInstance().getConfirmationCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileType() {
            this.profileType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportEncrypt() {
            this.supportEncrypt_ = 0;
        }

        public static ADDProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ADDProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ADDProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ADDProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ADDProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivateCode(String str) {
            str.getClass();
            this.activateCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivateCodeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.activateCode_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivateCodeSign(String str) {
            str.getClass();
            this.activateCodeSign_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivateCodeSignBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.activateCodeSign_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfirmationCode(String str) {
            str.getClass();
            this.confirmationCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfirmationCodeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.confirmationCode_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileType(int i) {
            this.profileType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportEncrypt(int i) {
            this.supportEncrypt_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ADDProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005Ȉ", new Object[]{"activateCode_", "confirmationCode_", "profileType_", "supportEncrypt_", "activateCodeSign_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ADDProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ADDProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
        public String getActivateCode() {
            return this.activateCode_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
        public ByteString getActivateCodeBytes() {
            return ByteString.copyFromUtf8(this.activateCode_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
        public String getActivateCodeSign() {
            return this.activateCodeSign_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
        public ByteString getActivateCodeSignBytes() {
            return ByteString.copyFromUtf8(this.activateCodeSign_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
        public String getConfirmationCode() {
            return this.confirmationCode_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
        public ByteString getConfirmationCodeBytes() {
            return ByteString.copyFromUtf8(this.confirmationCode_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
        public int getProfileType() {
            return this.profileType_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ADDProfileOrBuilder
        public int getSupportEncrypt() {
            return this.supportEncrypt_;
        }

        public static Builder newBuilder(ADDProfile aDDProfile) {
            return DEFAULT_INSTANCE.createBuilder(aDDProfile);
        }

        public static ADDProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ADDProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ADDProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ADDProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ADDProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ADDProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ADDProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ADDProfile parseFrom(InputStream inputStream) throws IOException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ADDProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ADDProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ADDProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ADDProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ADDProfileOrBuilder extends MessageLiteOrBuilder {
        String getActivateCode();

        ByteString getActivateCodeBytes();

        String getActivateCodeSign();

        ByteString getActivateCodeSignBytes();

        String getConfirmationCode();

        ByteString getConfirmationCodeBytes();

        int getProfileType();

        int getSupportEncrypt();
    }

    public static final class CommandData extends GeneratedMessageLite<CommandData, Builder> implements CommandDataOrBuilder {
        private static final CommandData DEFAULT_INSTANCE;
        private static volatile Parser<CommandData> PARSER = null;
        public static final int RESULTCODE_FIELD_NUMBER = 1;
        private int resultCode_;

        public static final class Builder extends GeneratedMessageLite.Builder<CommandData, Builder> implements CommandDataOrBuilder {
            public Builder clearResultCode() {
                copyOnWrite();
                ((CommandData) this.instance).clearResultCode();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.CommandDataOrBuilder
            public int getResultCode() {
                return ((CommandData) this.instance).getResultCode();
            }

            public Builder setResultCode(int i) {
                copyOnWrite();
                ((CommandData) this.instance).setResultCode(i);
                return this;
            }

            private Builder() {
                super(CommandData.DEFAULT_INSTANCE);
            }
        }

        static {
            CommandData commandData = new CommandData();
            DEFAULT_INSTANCE = commandData;
            GeneratedMessageLite.registerDefaultInstance(CommandData.class, commandData);
        }

        private CommandData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCode() {
            this.resultCode_ = 0;
        }

        public static CommandData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CommandData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CommandData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommandData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CommandData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCode(int i) {
            this.resultCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new CommandData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resultCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CommandData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CommandData.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.CommandDataOrBuilder
        public int getResultCode() {
            return this.resultCode_;
        }

        public static Builder newBuilder(CommandData commandData) {
            return DEFAULT_INSTANCE.createBuilder(commandData);
        }

        public static CommandData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommandData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CommandData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CommandData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CommandData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CommandData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommandData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CommandData parseFrom(InputStream inputStream) throws IOException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommandData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CommandData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CommandData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommandData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CommandDataOrBuilder extends MessageLiteOrBuilder {
        int getResultCode();
    }

    public static final class DeleteProfile extends GeneratedMessageLite<DeleteProfile, Builder> implements DeleteProfileOrBuilder {
        private static final DeleteProfile DEFAULT_INSTANCE;
        private static volatile Parser<DeleteProfile> PARSER = null;
        public static final int PROFILE_ICCID_FIELD_NUMBER = 1;
        private String profileIccid_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<DeleteProfile, Builder> implements DeleteProfileOrBuilder {
            public Builder clearProfileIccid() {
                copyOnWrite();
                ((DeleteProfile) this.instance).clearProfileIccid();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.DeleteProfileOrBuilder
            public String getProfileIccid() {
                return ((DeleteProfile) this.instance).getProfileIccid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.DeleteProfileOrBuilder
            public ByteString getProfileIccidBytes() {
                return ((DeleteProfile) this.instance).getProfileIccidBytes();
            }

            public Builder setProfileIccid(String str) {
                copyOnWrite();
                ((DeleteProfile) this.instance).setProfileIccid(str);
                return this;
            }

            public Builder setProfileIccidBytes(ByteString byteString) {
                copyOnWrite();
                ((DeleteProfile) this.instance).setProfileIccidBytes(byteString);
                return this;
            }

            private Builder() {
                super(DeleteProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            DeleteProfile deleteProfile = new DeleteProfile();
            DEFAULT_INSTANCE = deleteProfile;
            GeneratedMessageLite.registerDefaultInstance(DeleteProfile.class, deleteProfile);
        }

        private DeleteProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileIccid() {
            this.profileIccid_ = getDefaultInstance().getProfileIccid();
        }

        public static DeleteProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DeleteProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeleteProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DeleteProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccid(String str) {
            str.getClass();
            this.profileIccid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileIccid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new DeleteProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"profileIccid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DeleteProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DeleteProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.DeleteProfileOrBuilder
        public String getProfileIccid() {
            return this.profileIccid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.DeleteProfileOrBuilder
        public ByteString getProfileIccidBytes() {
            return ByteString.copyFromUtf8(this.profileIccid_);
        }

        public static Builder newBuilder(DeleteProfile deleteProfile) {
            return DEFAULT_INSTANCE.createBuilder(deleteProfile);
        }

        public static DeleteProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeleteProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeleteProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeleteProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeleteProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeleteProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeleteProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeleteProfile parseFrom(InputStream inputStream) throws IOException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeleteProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeleteProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DeleteProfileOrBuilder extends MessageLiteOrBuilder {
        String getProfileIccid();

        ByteString getProfileIccidBytes();
    }

    public static final class EnableProfile extends GeneratedMessageLite<EnableProfile, Builder> implements EnableProfileOrBuilder {
        private static final EnableProfile DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 2;
        private static volatile Parser<EnableProfile> PARSER = null;
        public static final int PROFILE_ICCID_FIELD_NUMBER = 1;
        private int enable_;
        private String profileIccid_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<EnableProfile, Builder> implements EnableProfileOrBuilder {
            public Builder clearEnable() {
                copyOnWrite();
                ((EnableProfile) this.instance).clearEnable();
                return this;
            }

            public Builder clearProfileIccid() {
                copyOnWrite();
                ((EnableProfile) this.instance).clearProfileIccid();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EnableProfileOrBuilder
            public int getEnable() {
                return ((EnableProfile) this.instance).getEnable();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EnableProfileOrBuilder
            public String getProfileIccid() {
                return ((EnableProfile) this.instance).getProfileIccid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EnableProfileOrBuilder
            public ByteString getProfileIccidBytes() {
                return ((EnableProfile) this.instance).getProfileIccidBytes();
            }

            public Builder setEnable(int i) {
                copyOnWrite();
                ((EnableProfile) this.instance).setEnable(i);
                return this;
            }

            public Builder setProfileIccid(String str) {
                copyOnWrite();
                ((EnableProfile) this.instance).setProfileIccid(str);
                return this;
            }

            public Builder setProfileIccidBytes(ByteString byteString) {
                copyOnWrite();
                ((EnableProfile) this.instance).setProfileIccidBytes(byteString);
                return this;
            }

            private Builder() {
                super(EnableProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            EnableProfile enableProfile = new EnableProfile();
            DEFAULT_INSTANCE = enableProfile;
            GeneratedMessageLite.registerDefaultInstance(EnableProfile.class, enableProfile);
        }

        private EnableProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnable() {
            this.enable_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileIccid() {
            this.profileIccid_ = getDefaultInstance().getProfileIccid();
        }

        public static EnableProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EnableProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnableProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnableProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnableProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnable(int i) {
            this.enable_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccid(String str) {
            str.getClass();
            this.profileIccid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileIccid_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new EnableProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"profileIccid_", "enable_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnableProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (EnableProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EnableProfileOrBuilder
        public int getEnable() {
            return this.enable_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EnableProfileOrBuilder
        public String getProfileIccid() {
            return this.profileIccid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EnableProfileOrBuilder
        public ByteString getProfileIccidBytes() {
            return ByteString.copyFromUtf8(this.profileIccid_);
        }

        public static Builder newBuilder(EnableProfile enableProfile) {
            return DEFAULT_INSTANCE.createBuilder(enableProfile);
        }

        public static EnableProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnableProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnableProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnableProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnableProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnableProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnableProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnableProfile parseFrom(InputStream inputStream) throws IOException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnableProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnableProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnableProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EnableProfileOrBuilder extends MessageLiteOrBuilder {
        int getEnable();

        String getProfileIccid();

        ByteString getProfileIccidBytes();
    }

    public static final class EncryptProfile extends GeneratedMessageLite<EncryptProfile, Builder> implements EncryptProfileOrBuilder {
        private static final EncryptProfile DEFAULT_INSTANCE;
        public static final int DEVICE_IMEI_FIELD_NUMBER = 3;
        public static final int ESIM_EID_FIELD_NUMBER = 2;
        public static final int LOCAL_KEY_FIELD_NUMBER = 5;
        private static volatile Parser<EncryptProfile> PARSER = null;
        public static final int RESULTCODE_FIELD_NUMBER = 1;
        public static final int SIGN_FIELD_NUMBER = 4;
        private int resultCode_;
        private String esimEid_ = "";
        private String deviceImei_ = "";
        private String sign_ = "";
        private String localKey_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<EncryptProfile, Builder> implements EncryptProfileOrBuilder {
            public Builder clearDeviceImei() {
                copyOnWrite();
                ((EncryptProfile) this.instance).clearDeviceImei();
                return this;
            }

            public Builder clearEsimEid() {
                copyOnWrite();
                ((EncryptProfile) this.instance).clearEsimEid();
                return this;
            }

            public Builder clearLocalKey() {
                copyOnWrite();
                ((EncryptProfile) this.instance).clearLocalKey();
                return this;
            }

            public Builder clearResultCode() {
                copyOnWrite();
                ((EncryptProfile) this.instance).clearResultCode();
                return this;
            }

            public Builder clearSign() {
                copyOnWrite();
                ((EncryptProfile) this.instance).clearSign();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public String getDeviceImei() {
                return ((EncryptProfile) this.instance).getDeviceImei();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public ByteString getDeviceImeiBytes() {
                return ((EncryptProfile) this.instance).getDeviceImeiBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public String getEsimEid() {
                return ((EncryptProfile) this.instance).getEsimEid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public ByteString getEsimEidBytes() {
                return ((EncryptProfile) this.instance).getEsimEidBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public String getLocalKey() {
                return ((EncryptProfile) this.instance).getLocalKey();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public ByteString getLocalKeyBytes() {
                return ((EncryptProfile) this.instance).getLocalKeyBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public int getResultCode() {
                return ((EncryptProfile) this.instance).getResultCode();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public String getSign() {
                return ((EncryptProfile) this.instance).getSign();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
            public ByteString getSignBytes() {
                return ((EncryptProfile) this.instance).getSignBytes();
            }

            public Builder setDeviceImei(String str) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setDeviceImei(str);
                return this;
            }

            public Builder setDeviceImeiBytes(ByteString byteString) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setDeviceImeiBytes(byteString);
                return this;
            }

            public Builder setEsimEid(String str) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setEsimEid(str);
                return this;
            }

            public Builder setEsimEidBytes(ByteString byteString) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setEsimEidBytes(byteString);
                return this;
            }

            public Builder setLocalKey(String str) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setLocalKey(str);
                return this;
            }

            public Builder setLocalKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setLocalKeyBytes(byteString);
                return this;
            }

            public Builder setResultCode(int i) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setResultCode(i);
                return this;
            }

            public Builder setSign(String str) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setSign(str);
                return this;
            }

            public Builder setSignBytes(ByteString byteString) {
                copyOnWrite();
                ((EncryptProfile) this.instance).setSignBytes(byteString);
                return this;
            }

            private Builder() {
                super(EncryptProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            EncryptProfile encryptProfile = new EncryptProfile();
            DEFAULT_INSTANCE = encryptProfile;
            GeneratedMessageLite.registerDefaultInstance(EncryptProfile.class, encryptProfile);
        }

        private EncryptProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceImei() {
            this.deviceImei_ = getDefaultInstance().getDeviceImei();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEsimEid() {
            this.esimEid_ = getDefaultInstance().getEsimEid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalKey() {
            this.localKey_ = getDefaultInstance().getLocalKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCode() {
            this.resultCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSign() {
            this.sign_ = getDefaultInstance().getSign();
        }

        public static EncryptProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EncryptProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EncryptProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EncryptProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceImei(String str) {
            str.getClass();
            this.deviceImei_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceImeiBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceImei_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEsimEid(String str) {
            str.getClass();
            this.esimEid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEsimEidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.esimEid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalKey(String str) {
            str.getClass();
            this.localKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalKeyBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.localKey_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCode(int i) {
            this.resultCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSign(String str) {
            str.getClass();
            this.sign_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sign_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new EncryptProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"resultCode_", "esimEid_", "deviceImei_", "sign_", "localKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EncryptProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (EncryptProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public String getDeviceImei() {
            return this.deviceImei_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public ByteString getDeviceImeiBytes() {
            return ByteString.copyFromUtf8(this.deviceImei_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public String getEsimEid() {
            return this.esimEid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public ByteString getEsimEidBytes() {
            return ByteString.copyFromUtf8(this.esimEid_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public String getLocalKey() {
            return this.localKey_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public ByteString getLocalKeyBytes() {
            return ByteString.copyFromUtf8(this.localKey_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public int getResultCode() {
            return this.resultCode_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public String getSign() {
            return this.sign_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EncryptProfileOrBuilder
        public ByteString getSignBytes() {
            return ByteString.copyFromUtf8(this.sign_);
        }

        public static Builder newBuilder(EncryptProfile encryptProfile) {
            return DEFAULT_INSTANCE.createBuilder(encryptProfile);
        }

        public static EncryptProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EncryptProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EncryptProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EncryptProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EncryptProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EncryptProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EncryptProfile parseFrom(InputStream inputStream) throws IOException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EncryptProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EncryptProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EncryptProfileOrBuilder extends MessageLiteOrBuilder {
        String getDeviceImei();

        ByteString getDeviceImeiBytes();

        String getEsimEid();

        ByteString getEsimEidBytes();

        String getLocalKey();

        ByteString getLocalKeyBytes();

        int getResultCode();

        String getSign();

        ByteString getSignBytes();
    }

    public static final class EsimProcess extends GeneratedMessageLite<EsimProcess, Builder> implements EsimProcessOrBuilder {
        private static final EsimProcess DEFAULT_INSTANCE;
        public static final int OPERATORTYPE_FIELD_NUMBER = 1;
        private static volatile Parser<EsimProcess> PARSER;
        private int operatorType_;

        public static final class Builder extends GeneratedMessageLite.Builder<EsimProcess, Builder> implements EsimProcessOrBuilder {
            public Builder clearOperatorType() {
                copyOnWrite();
                ((EsimProcess) this.instance).clearOperatorType();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EsimProcessOrBuilder
            public int getOperatorType() {
                return ((EsimProcess) this.instance).getOperatorType();
            }

            public Builder setOperatorType(int i) {
                copyOnWrite();
                ((EsimProcess) this.instance).setOperatorType(i);
                return this;
            }

            private Builder() {
                super(EsimProcess.DEFAULT_INSTANCE);
            }
        }

        static {
            EsimProcess esimProcess = new EsimProcess();
            DEFAULT_INSTANCE = esimProcess;
            GeneratedMessageLite.registerDefaultInstance(EsimProcess.class, esimProcess);
        }

        private EsimProcess() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperatorType() {
            this.operatorType_ = 0;
        }

        public static EsimProcess getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EsimProcess parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EsimProcess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EsimProcess parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EsimProcess> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperatorType(int i) {
            this.operatorType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new EsimProcess();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"operatorType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EsimProcess> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (EsimProcess.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.EsimProcessOrBuilder
        public int getOperatorType() {
            return this.operatorType_;
        }

        public static Builder newBuilder(EsimProcess esimProcess) {
            return DEFAULT_INSTANCE.createBuilder(esimProcess);
        }

        public static EsimProcess parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EsimProcess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EsimProcess parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EsimProcess parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EsimProcess parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EsimProcess parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EsimProcess parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EsimProcess parseFrom(InputStream inputStream) throws IOException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EsimProcess parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EsimProcess parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EsimProcess parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EsimProcess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EsimProcessOrBuilder extends MessageLiteOrBuilder {
        int getOperatorType();
    }

    public static final class GetEncryptProfile extends GeneratedMessageLite<GetEncryptProfile, Builder> implements GetEncryptProfileOrBuilder {
        public static final int CLOUD_KEY_FIELD_NUMBER = 1;
        private static final GetEncryptProfile DEFAULT_INSTANCE;
        private static volatile Parser<GetEncryptProfile> PARSER;
        private String cloudKey_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<GetEncryptProfile, Builder> implements GetEncryptProfileOrBuilder {
            public Builder clearCloudKey() {
                copyOnWrite();
                ((GetEncryptProfile) this.instance).clearCloudKey();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEncryptProfileOrBuilder
            public String getCloudKey() {
                return ((GetEncryptProfile) this.instance).getCloudKey();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEncryptProfileOrBuilder
            public ByteString getCloudKeyBytes() {
                return ((GetEncryptProfile) this.instance).getCloudKeyBytes();
            }

            public Builder setCloudKey(String str) {
                copyOnWrite();
                ((GetEncryptProfile) this.instance).setCloudKey(str);
                return this;
            }

            public Builder setCloudKeyBytes(ByteString byteString) {
                copyOnWrite();
                ((GetEncryptProfile) this.instance).setCloudKeyBytes(byteString);
                return this;
            }

            private Builder() {
                super(GetEncryptProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            GetEncryptProfile getEncryptProfile = new GetEncryptProfile();
            DEFAULT_INSTANCE = getEncryptProfile;
            GeneratedMessageLite.registerDefaultInstance(GetEncryptProfile.class, getEncryptProfile);
        }

        private GetEncryptProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCloudKey() {
            this.cloudKey_ = getDefaultInstance().getCloudKey();
        }

        public static GetEncryptProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetEncryptProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetEncryptProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetEncryptProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetEncryptProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloudKey(String str) {
            str.getClass();
            this.cloudKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloudKeyBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cloudKey_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new GetEncryptProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"cloudKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetEncryptProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (GetEncryptProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEncryptProfileOrBuilder
        public String getCloudKey() {
            return this.cloudKey_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEncryptProfileOrBuilder
        public ByteString getCloudKeyBytes() {
            return ByteString.copyFromUtf8(this.cloudKey_);
        }

        public static Builder newBuilder(GetEncryptProfile getEncryptProfile) {
            return DEFAULT_INSTANCE.createBuilder(getEncryptProfile);
        }

        public static GetEncryptProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetEncryptProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetEncryptProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetEncryptProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetEncryptProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetEncryptProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetEncryptProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetEncryptProfile parseFrom(InputStream inputStream) throws IOException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetEncryptProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetEncryptProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetEncryptProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetEncryptProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface GetEncryptProfileOrBuilder extends MessageLiteOrBuilder {
        String getCloudKey();

        ByteString getCloudKeyBytes();
    }

    public static final class GetEsimInfo extends GeneratedMessageLite<GetEsimInfo, Builder> implements GetEsimInfoOrBuilder {
        private static final GetEsimInfo DEFAULT_INSTANCE;
        public static final int DEVICE_BATTERY_FIELD_NUMBER = 9;
        public static final int DEVICE_IMEI_FIELD_NUMBER = 3;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 5;
        public static final int DEVICE_SN_FIELD_NUMBER = 4;
        public static final int DEVICE_TYPE_FIELD_NUMBER = 6;
        public static final int ESIM_EID_FIELD_NUMBER = 2;
        public static final int NETWORK_STATUS_FIELD_NUMBER = 8;
        private static volatile Parser<GetEsimInfo> PARSER = null;
        public static final int PROFILE_DATA_FIELD_NUMBER = 7;
        public static final int RESULTCODE_FIELD_NUMBER = 1;
        public static final int SUPPORT_ENCRYPT_FIELD_NUMBER = 10;
        private int deviceBattery_;
        private int deviceType_;
        private int networkStatus_;
        private int resultCode_;
        private int supportEncrypt_;
        private String esimEid_ = "";
        private String deviceImei_ = "";
        private String deviceSn_ = "";
        private String deviceModel_ = "";
        private Internal.ProtobufList<LPAProfile> profileData_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<GetEsimInfo, Builder> implements GetEsimInfoOrBuilder {
            public Builder addAllProfileData(Iterable<? extends LPAProfile> iterable) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).addAllProfileData(iterable);
                return this;
            }

            public Builder addProfileData(LPAProfile lPAProfile) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).addProfileData(lPAProfile);
                return this;
            }

            public Builder clearDeviceBattery() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearDeviceBattery();
                return this;
            }

            public Builder clearDeviceImei() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearDeviceImei();
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearDeviceSn() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearDeviceSn();
                return this;
            }

            public Builder clearDeviceType() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearDeviceType();
                return this;
            }

            public Builder clearEsimEid() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearEsimEid();
                return this;
            }

            public Builder clearNetworkStatus() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearNetworkStatus();
                return this;
            }

            public Builder clearProfileData() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearProfileData();
                return this;
            }

            public Builder clearResultCode() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearResultCode();
                return this;
            }

            public Builder clearSupportEncrypt() {
                copyOnWrite();
                ((GetEsimInfo) this.instance).clearSupportEncrypt();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public int getDeviceBattery() {
                return ((GetEsimInfo) this.instance).getDeviceBattery();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public String getDeviceImei() {
                return ((GetEsimInfo) this.instance).getDeviceImei();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public ByteString getDeviceImeiBytes() {
                return ((GetEsimInfo) this.instance).getDeviceImeiBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public String getDeviceModel() {
                return ((GetEsimInfo) this.instance).getDeviceModel();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((GetEsimInfo) this.instance).getDeviceModelBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public String getDeviceSn() {
                return ((GetEsimInfo) this.instance).getDeviceSn();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public ByteString getDeviceSnBytes() {
                return ((GetEsimInfo) this.instance).getDeviceSnBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public int getDeviceType() {
                return ((GetEsimInfo) this.instance).getDeviceType();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public String getEsimEid() {
                return ((GetEsimInfo) this.instance).getEsimEid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public ByteString getEsimEidBytes() {
                return ((GetEsimInfo) this.instance).getEsimEidBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public int getNetworkStatus() {
                return ((GetEsimInfo) this.instance).getNetworkStatus();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public LPAProfile getProfileData(int i) {
                return ((GetEsimInfo) this.instance).getProfileData(i);
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public int getProfileDataCount() {
                return ((GetEsimInfo) this.instance).getProfileDataCount();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public List<LPAProfile> getProfileDataList() {
                return Collections.unmodifiableList(((GetEsimInfo) this.instance).getProfileDataList());
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public int getResultCode() {
                return ((GetEsimInfo) this.instance).getResultCode();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
            public int getSupportEncrypt() {
                return ((GetEsimInfo) this.instance).getSupportEncrypt();
            }

            public Builder removeProfileData(int i) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).removeProfileData(i);
                return this;
            }

            public Builder setDeviceBattery(int i) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setDeviceBattery(i);
                return this;
            }

            public Builder setDeviceImei(String str) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setDeviceImei(str);
                return this;
            }

            public Builder setDeviceImeiBytes(ByteString byteString) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setDeviceImeiBytes(byteString);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            public Builder setDeviceSn(String str) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setDeviceSn(str);
                return this;
            }

            public Builder setDeviceSnBytes(ByteString byteString) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setDeviceSnBytes(byteString);
                return this;
            }

            public Builder setDeviceType(int i) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setDeviceType(i);
                return this;
            }

            public Builder setEsimEid(String str) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setEsimEid(str);
                return this;
            }

            public Builder setEsimEidBytes(ByteString byteString) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setEsimEidBytes(byteString);
                return this;
            }

            public Builder setNetworkStatus(int i) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setNetworkStatus(i);
                return this;
            }

            public Builder setProfileData(int i, LPAProfile lPAProfile) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setProfileData(i, lPAProfile);
                return this;
            }

            public Builder setResultCode(int i) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setResultCode(i);
                return this;
            }

            public Builder setSupportEncrypt(int i) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setSupportEncrypt(i);
                return this;
            }

            private Builder() {
                super(GetEsimInfo.DEFAULT_INSTANCE);
            }

            public Builder addProfileData(int i, LPAProfile lPAProfile) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).addProfileData(i, lPAProfile);
                return this;
            }

            public Builder setProfileData(int i, LPAProfile.Builder builder) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).setProfileData(i, builder.build());
                return this;
            }

            public Builder addProfileData(LPAProfile.Builder builder) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).addProfileData(builder.build());
                return this;
            }

            public Builder addProfileData(int i, LPAProfile.Builder builder) {
                copyOnWrite();
                ((GetEsimInfo) this.instance).addProfileData(i, builder.build());
                return this;
            }
        }

        static {
            GetEsimInfo getEsimInfo = new GetEsimInfo();
            DEFAULT_INSTANCE = getEsimInfo;
            GeneratedMessageLite.registerDefaultInstance(GetEsimInfo.class, getEsimInfo);
        }

        private GetEsimInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllProfileData(Iterable<? extends LPAProfile> iterable) {
            ensureProfileDataIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.profileData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProfileData(LPAProfile lPAProfile) {
            lPAProfile.getClass();
            ensureProfileDataIsMutable();
            this.profileData_.add(lPAProfile);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceBattery() {
            this.deviceBattery_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceImei() {
            this.deviceImei_ = getDefaultInstance().getDeviceImei();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceSn() {
            this.deviceSn_ = getDefaultInstance().getDeviceSn();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceType() {
            this.deviceType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEsimEid() {
            this.esimEid_ = getDefaultInstance().getEsimEid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkStatus() {
            this.networkStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileData() {
            this.profileData_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCode() {
            this.resultCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportEncrypt() {
            this.supportEncrypt_ = 0;
        }

        private void ensureProfileDataIsMutable() {
            Internal.ProtobufList<LPAProfile> protobufList = this.profileData_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.profileData_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static GetEsimInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetEsimInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetEsimInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetEsimInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetEsimInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeProfileData(int i) {
            ensureProfileDataIsMutable();
            this.profileData_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBattery(int i) {
            this.deviceBattery_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceImei(String str) {
            str.getClass();
            this.deviceImei_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceImeiBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceImei_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceSn(String str) {
            str.getClass();
            this.deviceSn_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceSnBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceSn_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceType(int i) {
            this.deviceType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEsimEid(String str) {
            str.getClass();
            this.esimEid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEsimEidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.esimEid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkStatus(int i) {
            this.networkStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileData(int i, LPAProfile lPAProfile) {
            lPAProfile.getClass();
            ensureProfileDataIsMutable();
            this.profileData_.set(i, lPAProfile);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCode(int i) {
            this.resultCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportEncrypt(int i) {
            this.supportEncrypt_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new GetEsimInfo();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007\u001b\b\u0004\t\u0004\n\u0004", new Object[]{"resultCode_", "esimEid_", "deviceImei_", "deviceSn_", "deviceModel_", "deviceType_", "profileData_", LPAProfile.class, "networkStatus_", "deviceBattery_", "supportEncrypt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetEsimInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (GetEsimInfo.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public int getDeviceBattery() {
            return this.deviceBattery_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public String getDeviceImei() {
            return this.deviceImei_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public ByteString getDeviceImeiBytes() {
            return ByteString.copyFromUtf8(this.deviceImei_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public String getDeviceSn() {
            return this.deviceSn_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public ByteString getDeviceSnBytes() {
            return ByteString.copyFromUtf8(this.deviceSn_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public int getDeviceType() {
            return this.deviceType_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public String getEsimEid() {
            return this.esimEid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public ByteString getEsimEidBytes() {
            return ByteString.copyFromUtf8(this.esimEid_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public int getNetworkStatus() {
            return this.networkStatus_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public LPAProfile getProfileData(int i) {
            return this.profileData_.get(i);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public int getProfileDataCount() {
            return this.profileData_.size();
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public List<LPAProfile> getProfileDataList() {
            return this.profileData_;
        }

        public LPAProfileOrBuilder getProfileDataOrBuilder(int i) {
            return this.profileData_.get(i);
        }

        public List<? extends LPAProfileOrBuilder> getProfileDataOrBuilderList() {
            return this.profileData_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public int getResultCode() {
            return this.resultCode_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.GetEsimInfoOrBuilder
        public int getSupportEncrypt() {
            return this.supportEncrypt_;
        }

        public static Builder newBuilder(GetEsimInfo getEsimInfo) {
            return DEFAULT_INSTANCE.createBuilder(getEsimInfo);
        }

        public static GetEsimInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetEsimInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetEsimInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetEsimInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProfileData(int i, LPAProfile lPAProfile) {
            lPAProfile.getClass();
            ensureProfileDataIsMutable();
            this.profileData_.add(i, lPAProfile);
        }

        public static GetEsimInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetEsimInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetEsimInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetEsimInfo parseFrom(InputStream inputStream) throws IOException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetEsimInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetEsimInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetEsimInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetEsimInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface GetEsimInfoOrBuilder extends MessageLiteOrBuilder {
        int getDeviceBattery();

        String getDeviceImei();

        ByteString getDeviceImeiBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getDeviceSn();

        ByteString getDeviceSnBytes();

        int getDeviceType();

        String getEsimEid();

        ByteString getEsimEidBytes();

        int getNetworkStatus();

        LPAProfile getProfileData(int i);

        int getProfileDataCount();

        List<LPAProfile> getProfileDataList();

        int getResultCode();

        int getSupportEncrypt();
    }

    public enum LPAActiveStatus implements Internal.EnumLite {
        ACTIVE_UNDEFINE(0),
        ENABLE_STATUS(1),
        DISENABLE_STATUS(2),
        ENABLE_PROFILE_ING(3),
        UNRECOGNIZED(-1);

        public static final int ACTIVE_UNDEFINE_VALUE = 0;
        public static final int DISENABLE_STATUS_VALUE = 2;
        public static final int ENABLE_PROFILE_ING_VALUE = 3;
        public static final int ENABLE_STATUS_VALUE = 1;
        private static final Internal.EnumLiteMap<LPAActiveStatus> internalValueMap = new Internal.EnumLiteMap<LPAActiveStatus>() { // from class: com.heytap.wearable.lpa.proto.LPASyncProto.LPAActiveStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LPAActiveStatus findValueByNumber(int i) {
                return LPAActiveStatus.forNumber(i);
            }
        };
        private final int value;

        public static final class LPAActiveStatusVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new LPAActiveStatusVerifier();

            private LPAActiveStatusVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LPAActiveStatus.forNumber(i) != null;
            }
        }

        LPAActiveStatus(int i) {
            this.value = i;
        }

        public static LPAActiveStatus forNumber(int i) {
            if (i == 0) {
                return ACTIVE_UNDEFINE;
            }
            if (i == 1) {
                return ENABLE_STATUS;
            }
            if (i == 2) {
                return DISENABLE_STATUS;
            }
            if (i != 3) {
                return null;
            }
            return ENABLE_PROFILE_ING;
        }

        public static Internal.EnumLiteMap<LPAActiveStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return LPAActiveStatusVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static LPAActiveStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LPACommandId implements Internal.EnumLite {
        COMMANDID_UNDEFINE(0),
        GET_PROFILES(1),
        ADD_PROFILE(2),
        SET_EUICC_ENABLE(3),
        DELETE_PROFILE(4),
        ACTIVE_REPORTING_STATUS(5),
        RESET_EUICC(6),
        ESIM_PROCESS(7),
        UPDATE_PROFILE(8),
        GET_ENCRYPTED_ESIM_INFO(9),
        UNRECOGNIZED(-1);

        public static final int ACTIVE_REPORTING_STATUS_VALUE = 5;
        public static final int ADD_PROFILE_VALUE = 2;
        public static final int COMMANDID_UNDEFINE_VALUE = 0;
        public static final int DELETE_PROFILE_VALUE = 4;
        public static final int ESIM_PROCESS_VALUE = 7;
        public static final int GET_ENCRYPTED_ESIM_INFO_VALUE = 9;
        public static final int GET_PROFILES_VALUE = 1;
        public static final int RESET_EUICC_VALUE = 6;
        public static final int SET_EUICC_ENABLE_VALUE = 3;
        public static final int UPDATE_PROFILE_VALUE = 8;
        private static final Internal.EnumLiteMap<LPACommandId> internalValueMap = new Internal.EnumLiteMap<LPACommandId>() { // from class: com.heytap.wearable.lpa.proto.LPASyncProto.LPACommandId.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LPACommandId findValueByNumber(int i) {
                return LPACommandId.forNumber(i);
            }
        };
        private final int value;

        public static final class LPACommandIdVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new LPACommandIdVerifier();

            private LPACommandIdVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LPACommandId.forNumber(i) != null;
            }
        }

        LPACommandId(int i) {
            this.value = i;
        }

        public static LPACommandId forNumber(int i) {
            switch (i) {
                case 0:
                    return COMMANDID_UNDEFINE;
                case 1:
                    return GET_PROFILES;
                case 2:
                    return ADD_PROFILE;
                case 3:
                    return SET_EUICC_ENABLE;
                case 4:
                    return DELETE_PROFILE;
                case 5:
                    return ACTIVE_REPORTING_STATUS;
                case 6:
                    return RESET_EUICC;
                case 7:
                    return ESIM_PROCESS;
                case 8:
                    return UPDATE_PROFILE;
                case 9:
                    return GET_ENCRYPTED_ESIM_INFO;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<LPACommandId> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return LPACommandIdVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static LPACommandId valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LPANetworkStatus implements Internal.EnumLite {
        LPA_NETWORK_UNDEFINE(0),
        LPA_NETWORK_CONNECTED(1),
        LPA_NETWORK_DISCONNECTED(2),
        UNRECOGNIZED(-1);

        public static final int LPA_NETWORK_CONNECTED_VALUE = 1;
        public static final int LPA_NETWORK_DISCONNECTED_VALUE = 2;
        public static final int LPA_NETWORK_UNDEFINE_VALUE = 0;
        private static final Internal.EnumLiteMap<LPANetworkStatus> internalValueMap = new Internal.EnumLiteMap<LPANetworkStatus>() { // from class: com.heytap.wearable.lpa.proto.LPASyncProto.LPANetworkStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LPANetworkStatus findValueByNumber(int i) {
                return LPANetworkStatus.forNumber(i);
            }
        };
        private final int value;

        public static final class LPANetworkStatusVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new LPANetworkStatusVerifier();

            private LPANetworkStatusVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LPANetworkStatus.forNumber(i) != null;
            }
        }

        LPANetworkStatus(int i) {
            this.value = i;
        }

        public static LPANetworkStatus forNumber(int i) {
            if (i == 0) {
                return LPA_NETWORK_UNDEFINE;
            }
            if (i == 1) {
                return LPA_NETWORK_CONNECTED;
            }
            if (i != 2) {
                return null;
            }
            return LPA_NETWORK_DISCONNECTED;
        }

        public static Internal.EnumLiteMap<LPANetworkStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return LPANetworkStatusVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static LPANetworkStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LPAOperatorType implements Internal.EnumLite {
        CMCC(0),
        CUCC(1),
        CTCC(2),
        UNRECOGNIZED(-1);

        public static final int CMCC_VALUE = 0;
        public static final int CTCC_VALUE = 2;
        public static final int CUCC_VALUE = 1;
        private static final Internal.EnumLiteMap<LPAOperatorType> internalValueMap = new Internal.EnumLiteMap<LPAOperatorType>() { // from class: com.heytap.wearable.lpa.proto.LPASyncProto.LPAOperatorType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LPAOperatorType findValueByNumber(int i) {
                return LPAOperatorType.forNumber(i);
            }
        };
        private final int value;

        public static final class LPAOperatorTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new LPAOperatorTypeVerifier();

            private LPAOperatorTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LPAOperatorType.forNumber(i) != null;
            }
        }

        LPAOperatorType(int i) {
            this.value = i;
        }

        public static LPAOperatorType forNumber(int i) {
            if (i == 0) {
                return CMCC;
            }
            if (i == 1) {
                return CUCC;
            }
            if (i != 2) {
                return null;
            }
            return CTCC;
        }

        public static Internal.EnumLiteMap<LPAOperatorType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return LPAOperatorTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static LPAOperatorType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class LPAProfile extends GeneratedMessageLite<LPAProfile, Builder> implements LPAProfileOrBuilder {
        private static final LPAProfile DEFAULT_INSTANCE;
        private static volatile Parser<LPAProfile> PARSER = null;
        public static final int PROFILE_ACTIVE_FIELD_NUMBER = 2;
        public static final int PROFILE_AID_FIELD_NUMBER = 3;
        public static final int PROFILE_ICCID_FIELD_NUMBER = 1;
        public static final int PROFILE_IMSI_FIELD_NUMBER = 4;
        public static final int PROFILE_NAME_FIELD_NUMBER = 5;
        public static final int PROFILE_NICKNAME_FIELD_NUMBER = 6;
        public static final int PROFILE_TYPE_FIELD_NUMBER = 8;
        public static final int PROVIDER_NAME_FIELD_NUMBER = 7;
        private int profileActive_;
        private int profileType_;
        private String profileIccid_ = "";
        private String profileAid_ = "";
        private String profileImsi_ = "";
        private String profileName_ = "";
        private String profileNickname_ = "";
        private String providerName_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<LPAProfile, Builder> implements LPAProfileOrBuilder {
            public Builder clearProfileActive() {
                copyOnWrite();
                ((LPAProfile) this.instance).clearProfileActive();
                return this;
            }

            public Builder clearProfileAid() {
                copyOnWrite();
                ((LPAProfile) this.instance).clearProfileAid();
                return this;
            }

            public Builder clearProfileIccid() {
                copyOnWrite();
                ((LPAProfile) this.instance).clearProfileIccid();
                return this;
            }

            public Builder clearProfileImsi() {
                copyOnWrite();
                ((LPAProfile) this.instance).clearProfileImsi();
                return this;
            }

            public Builder clearProfileName() {
                copyOnWrite();
                ((LPAProfile) this.instance).clearProfileName();
                return this;
            }

            public Builder clearProfileNickname() {
                copyOnWrite();
                ((LPAProfile) this.instance).clearProfileNickname();
                return this;
            }

            public Builder clearProfileType() {
                copyOnWrite();
                ((LPAProfile) this.instance).clearProfileType();
                return this;
            }

            public Builder clearProviderName() {
                copyOnWrite();
                ((LPAProfile) this.instance).clearProviderName();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public int getProfileActive() {
                return ((LPAProfile) this.instance).getProfileActive();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public String getProfileAid() {
                return ((LPAProfile) this.instance).getProfileAid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public ByteString getProfileAidBytes() {
                return ((LPAProfile) this.instance).getProfileAidBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public String getProfileIccid() {
                return ((LPAProfile) this.instance).getProfileIccid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public ByteString getProfileIccidBytes() {
                return ((LPAProfile) this.instance).getProfileIccidBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public String getProfileImsi() {
                return ((LPAProfile) this.instance).getProfileImsi();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public ByteString getProfileImsiBytes() {
                return ((LPAProfile) this.instance).getProfileImsiBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public String getProfileName() {
                return ((LPAProfile) this.instance).getProfileName();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public ByteString getProfileNameBytes() {
                return ((LPAProfile) this.instance).getProfileNameBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public String getProfileNickname() {
                return ((LPAProfile) this.instance).getProfileNickname();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public ByteString getProfileNicknameBytes() {
                return ((LPAProfile) this.instance).getProfileNicknameBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public int getProfileType() {
                return ((LPAProfile) this.instance).getProfileType();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public String getProviderName() {
                return ((LPAProfile) this.instance).getProviderName();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
            public ByteString getProviderNameBytes() {
                return ((LPAProfile) this.instance).getProviderNameBytes();
            }

            public Builder setProfileActive(int i) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileActive(i);
                return this;
            }

            public Builder setProfileAid(String str) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileAid(str);
                return this;
            }

            public Builder setProfileAidBytes(ByteString byteString) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileAidBytes(byteString);
                return this;
            }

            public Builder setProfileIccid(String str) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileIccid(str);
                return this;
            }

            public Builder setProfileIccidBytes(ByteString byteString) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileIccidBytes(byteString);
                return this;
            }

            public Builder setProfileImsi(String str) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileImsi(str);
                return this;
            }

            public Builder setProfileImsiBytes(ByteString byteString) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileImsiBytes(byteString);
                return this;
            }

            public Builder setProfileName(String str) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileName(str);
                return this;
            }

            public Builder setProfileNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileNameBytes(byteString);
                return this;
            }

            public Builder setProfileNickname(String str) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileNickname(str);
                return this;
            }

            public Builder setProfileNicknameBytes(ByteString byteString) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileNicknameBytes(byteString);
                return this;
            }

            public Builder setProfileType(int i) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProfileType(i);
                return this;
            }

            public Builder setProviderName(String str) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProviderName(str);
                return this;
            }

            public Builder setProviderNameBytes(ByteString byteString) {
                copyOnWrite();
                ((LPAProfile) this.instance).setProviderNameBytes(byteString);
                return this;
            }

            private Builder() {
                super(LPAProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            LPAProfile lPAProfile = new LPAProfile();
            DEFAULT_INSTANCE = lPAProfile;
            GeneratedMessageLite.registerDefaultInstance(LPAProfile.class, lPAProfile);
        }

        private LPAProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileActive() {
            this.profileActive_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileAid() {
            this.profileAid_ = getDefaultInstance().getProfileAid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileIccid() {
            this.profileIccid_ = getDefaultInstance().getProfileIccid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileImsi() {
            this.profileImsi_ = getDefaultInstance().getProfileImsi();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileName() {
            this.profileName_ = getDefaultInstance().getProfileName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileNickname() {
            this.profileNickname_ = getDefaultInstance().getProfileNickname();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileType() {
            this.profileType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProviderName() {
            this.providerName_ = getDefaultInstance().getProviderName();
        }

        public static LPAProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LPAProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LPAProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LPAProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LPAProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileActive(int i) {
            this.profileActive_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileAid(String str) {
            str.getClass();
            this.profileAid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileAidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileAid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccid(String str) {
            str.getClass();
            this.profileIccid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileIccid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileImsi(String str) {
            str.getClass();
            this.profileImsi_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileImsiBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileImsi_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileName(String str) {
            str.getClass();
            this.profileName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileNickname(String str) {
            str.getClass();
            this.profileNickname_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileNicknameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileNickname_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileType(int i) {
            this.profileType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderName(String str) {
            str.getClass();
            this.providerName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.providerName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new LPAProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004", new Object[]{"profileIccid_", "profileActive_", "profileAid_", "profileImsi_", "profileName_", "profileNickname_", "providerName_", "profileType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LPAProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (LPAProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public int getProfileActive() {
            return this.profileActive_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public String getProfileAid() {
            return this.profileAid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public ByteString getProfileAidBytes() {
            return ByteString.copyFromUtf8(this.profileAid_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public String getProfileIccid() {
            return this.profileIccid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public ByteString getProfileIccidBytes() {
            return ByteString.copyFromUtf8(this.profileIccid_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public String getProfileImsi() {
            return this.profileImsi_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public ByteString getProfileImsiBytes() {
            return ByteString.copyFromUtf8(this.profileImsi_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public String getProfileName() {
            return this.profileName_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public ByteString getProfileNameBytes() {
            return ByteString.copyFromUtf8(this.profileName_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public String getProfileNickname() {
            return this.profileNickname_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public ByteString getProfileNicknameBytes() {
            return ByteString.copyFromUtf8(this.profileNickname_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public int getProfileType() {
            return this.profileType_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public String getProviderName() {
            return this.providerName_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.LPAProfileOrBuilder
        public ByteString getProviderNameBytes() {
            return ByteString.copyFromUtf8(this.providerName_);
        }

        public static Builder newBuilder(LPAProfile lPAProfile) {
            return DEFAULT_INSTANCE.createBuilder(lPAProfile);
        }

        public static LPAProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LPAProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LPAProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LPAProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LPAProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LPAProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LPAProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LPAProfile parseFrom(InputStream inputStream) throws IOException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LPAProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LPAProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LPAProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LPAProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LPAProfileOrBuilder extends MessageLiteOrBuilder {
        int getProfileActive();

        String getProfileAid();

        ByteString getProfileAidBytes();

        String getProfileIccid();

        ByteString getProfileIccidBytes();

        String getProfileImsi();

        ByteString getProfileImsiBytes();

        String getProfileName();

        ByteString getProfileNameBytes();

        String getProfileNickname();

        ByteString getProfileNicknameBytes();

        int getProfileType();

        String getProviderName();

        ByteString getProviderNameBytes();
    }

    public enum LPAResult implements Internal.EnumLite {
        RESULT_UNDEFINE(0),
        SUCCESS(1),
        FAILURE(2),
        NETWORK_ERROR(3),
        DOWNLOAD_BUSY(4),
        UNRECOGNIZED(-1);

        public static final int DOWNLOAD_BUSY_VALUE = 4;
        public static final int FAILURE_VALUE = 2;
        public static final int NETWORK_ERROR_VALUE = 3;
        public static final int RESULT_UNDEFINE_VALUE = 0;
        public static final int SUCCESS_VALUE = 1;
        private static final Internal.EnumLiteMap<LPAResult> internalValueMap = new Internal.EnumLiteMap<LPAResult>() { // from class: com.heytap.wearable.lpa.proto.LPASyncProto.LPAResult.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LPAResult findValueByNumber(int i) {
                return LPAResult.forNumber(i);
            }
        };
        private final int value;

        public static final class LPAResultVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new LPAResultVerifier();

            private LPAResultVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LPAResult.forNumber(i) != null;
            }
        }

        LPAResult(int i) {
            this.value = i;
        }

        public static LPAResult forNumber(int i) {
            if (i == 0) {
                return RESULT_UNDEFINE;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return FAILURE;
            }
            if (i == 3) {
                return NETWORK_ERROR;
            }
            if (i != 4) {
                return null;
            }
            return DOWNLOAD_BUSY;
        }

        public static Internal.EnumLiteMap<LPAResult> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return LPAResultVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static LPAResult valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum LPAServiceId implements Internal.EnumLite {
        SERVICE_ID_NONE(0),
        SERVICE_ID_ESIM(14),
        UNRECOGNIZED(-1);

        public static final int SERVICE_ID_ESIM_VALUE = 14;
        public static final int SERVICE_ID_NONE_VALUE = 0;
        private static final Internal.EnumLiteMap<LPAServiceId> internalValueMap = new Internal.EnumLiteMap<LPAServiceId>() { // from class: com.heytap.wearable.lpa.proto.LPASyncProto.LPAServiceId.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LPAServiceId findValueByNumber(int i) {
                return LPAServiceId.forNumber(i);
            }
        };
        private final int value;

        public static final class LPAServiceIdVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new LPAServiceIdVerifier();

            private LPAServiceIdVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LPAServiceId.forNumber(i) != null;
            }
        }

        LPAServiceId(int i) {
            this.value = i;
        }

        public static LPAServiceId forNumber(int i) {
            if (i == 0) {
                return SERVICE_ID_NONE;
            }
            if (i != 14) {
                return null;
            }
            return SERVICE_ID_ESIM;
        }

        public static Internal.EnumLiteMap<LPAServiceId> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return LPAServiceIdVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static LPAServiceId valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class RepalyDeleteProfile extends GeneratedMessageLite<RepalyDeleteProfile, Builder> implements RepalyDeleteProfileOrBuilder {
        private static final RepalyDeleteProfile DEFAULT_INSTANCE;
        private static volatile Parser<RepalyDeleteProfile> PARSER = null;
        public static final int PROFILE_ICCID_FIELD_NUMBER = 1;
        public static final int PROFILE_TYPE_FIELD_NUMBER = 3;
        public static final int RESULTCODE_FIELD_NUMBER = 2;
        private String profileIccid_ = "";
        private int profileType_;
        private int resultCode_;

        public static final class Builder extends GeneratedMessageLite.Builder<RepalyDeleteProfile, Builder> implements RepalyDeleteProfileOrBuilder {
            public Builder clearProfileIccid() {
                copyOnWrite();
                ((RepalyDeleteProfile) this.instance).clearProfileIccid();
                return this;
            }

            public Builder clearProfileType() {
                copyOnWrite();
                ((RepalyDeleteProfile) this.instance).clearProfileType();
                return this;
            }

            public Builder clearResultCode() {
                copyOnWrite();
                ((RepalyDeleteProfile) this.instance).clearResultCode();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyDeleteProfileOrBuilder
            public String getProfileIccid() {
                return ((RepalyDeleteProfile) this.instance).getProfileIccid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyDeleteProfileOrBuilder
            public ByteString getProfileIccidBytes() {
                return ((RepalyDeleteProfile) this.instance).getProfileIccidBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyDeleteProfileOrBuilder
            public int getProfileType() {
                return ((RepalyDeleteProfile) this.instance).getProfileType();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyDeleteProfileOrBuilder
            public int getResultCode() {
                return ((RepalyDeleteProfile) this.instance).getResultCode();
            }

            public Builder setProfileIccid(String str) {
                copyOnWrite();
                ((RepalyDeleteProfile) this.instance).setProfileIccid(str);
                return this;
            }

            public Builder setProfileIccidBytes(ByteString byteString) {
                copyOnWrite();
                ((RepalyDeleteProfile) this.instance).setProfileIccidBytes(byteString);
                return this;
            }

            public Builder setProfileType(int i) {
                copyOnWrite();
                ((RepalyDeleteProfile) this.instance).setProfileType(i);
                return this;
            }

            public Builder setResultCode(int i) {
                copyOnWrite();
                ((RepalyDeleteProfile) this.instance).setResultCode(i);
                return this;
            }

            private Builder() {
                super(RepalyDeleteProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            RepalyDeleteProfile repalyDeleteProfile = new RepalyDeleteProfile();
            DEFAULT_INSTANCE = repalyDeleteProfile;
            GeneratedMessageLite.registerDefaultInstance(RepalyDeleteProfile.class, repalyDeleteProfile);
        }

        private RepalyDeleteProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileIccid() {
            this.profileIccid_ = getDefaultInstance().getProfileIccid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileType() {
            this.profileType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCode() {
            this.resultCode_ = 0;
        }

        public static RepalyDeleteProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RepalyDeleteProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepalyDeleteProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RepalyDeleteProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccid(String str) {
            str.getClass();
            this.profileIccid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileIccid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileType(int i) {
            this.profileType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCode(int i) {
            this.resultCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new RepalyDeleteProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004", new Object[]{"profileIccid_", "resultCode_", "profileType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RepalyDeleteProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RepalyDeleteProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyDeleteProfileOrBuilder
        public String getProfileIccid() {
            return this.profileIccid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyDeleteProfileOrBuilder
        public ByteString getProfileIccidBytes() {
            return ByteString.copyFromUtf8(this.profileIccid_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyDeleteProfileOrBuilder
        public int getProfileType() {
            return this.profileType_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyDeleteProfileOrBuilder
        public int getResultCode() {
            return this.resultCode_;
        }

        public static Builder newBuilder(RepalyDeleteProfile repalyDeleteProfile) {
            return DEFAULT_INSTANCE.createBuilder(repalyDeleteProfile);
        }

        public static RepalyDeleteProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepalyDeleteProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RepalyDeleteProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RepalyDeleteProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RepalyDeleteProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RepalyDeleteProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RepalyDeleteProfile parseFrom(InputStream inputStream) throws IOException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepalyDeleteProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepalyDeleteProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RepalyDeleteProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyDeleteProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface RepalyDeleteProfileOrBuilder extends MessageLiteOrBuilder {
        String getProfileIccid();

        ByteString getProfileIccidBytes();

        int getProfileType();

        int getResultCode();
    }

    public static final class RepalyEnableProfile extends GeneratedMessageLite<RepalyEnableProfile, Builder> implements RepalyEnableProfileOrBuilder {
        private static final RepalyEnableProfile DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 3;
        private static volatile Parser<RepalyEnableProfile> PARSER = null;
        public static final int PROFILE_ICCID_FIELD_NUMBER = 1;
        public static final int RESULTCODE_FIELD_NUMBER = 2;
        private int enable_;
        private String profileIccid_ = "";
        private int resultCode_;

        public static final class Builder extends GeneratedMessageLite.Builder<RepalyEnableProfile, Builder> implements RepalyEnableProfileOrBuilder {
            public Builder clearEnable() {
                copyOnWrite();
                ((RepalyEnableProfile) this.instance).clearEnable();
                return this;
            }

            public Builder clearProfileIccid() {
                copyOnWrite();
                ((RepalyEnableProfile) this.instance).clearProfileIccid();
                return this;
            }

            public Builder clearResultCode() {
                copyOnWrite();
                ((RepalyEnableProfile) this.instance).clearResultCode();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyEnableProfileOrBuilder
            public int getEnable() {
                return ((RepalyEnableProfile) this.instance).getEnable();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyEnableProfileOrBuilder
            public String getProfileIccid() {
                return ((RepalyEnableProfile) this.instance).getProfileIccid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyEnableProfileOrBuilder
            public ByteString getProfileIccidBytes() {
                return ((RepalyEnableProfile) this.instance).getProfileIccidBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyEnableProfileOrBuilder
            public int getResultCode() {
                return ((RepalyEnableProfile) this.instance).getResultCode();
            }

            public Builder setEnable(int i) {
                copyOnWrite();
                ((RepalyEnableProfile) this.instance).setEnable(i);
                return this;
            }

            public Builder setProfileIccid(String str) {
                copyOnWrite();
                ((RepalyEnableProfile) this.instance).setProfileIccid(str);
                return this;
            }

            public Builder setProfileIccidBytes(ByteString byteString) {
                copyOnWrite();
                ((RepalyEnableProfile) this.instance).setProfileIccidBytes(byteString);
                return this;
            }

            public Builder setResultCode(int i) {
                copyOnWrite();
                ((RepalyEnableProfile) this.instance).setResultCode(i);
                return this;
            }

            private Builder() {
                super(RepalyEnableProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            RepalyEnableProfile repalyEnableProfile = new RepalyEnableProfile();
            DEFAULT_INSTANCE = repalyEnableProfile;
            GeneratedMessageLite.registerDefaultInstance(RepalyEnableProfile.class, repalyEnableProfile);
        }

        private RepalyEnableProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnable() {
            this.enable_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileIccid() {
            this.profileIccid_ = getDefaultInstance().getProfileIccid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCode() {
            this.resultCode_ = 0;
        }

        public static RepalyEnableProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RepalyEnableProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepalyEnableProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RepalyEnableProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnable(int i) {
            this.enable_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccid(String str) {
            str.getClass();
            this.profileIccid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileIccidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.profileIccid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCode(int i) {
            this.resultCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new RepalyEnableProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004", new Object[]{"profileIccid_", "resultCode_", "enable_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RepalyEnableProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RepalyEnableProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyEnableProfileOrBuilder
        public int getEnable() {
            return this.enable_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyEnableProfileOrBuilder
        public String getProfileIccid() {
            return this.profileIccid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyEnableProfileOrBuilder
        public ByteString getProfileIccidBytes() {
            return ByteString.copyFromUtf8(this.profileIccid_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyEnableProfileOrBuilder
        public int getResultCode() {
            return this.resultCode_;
        }

        public static Builder newBuilder(RepalyEnableProfile repalyEnableProfile) {
            return DEFAULT_INSTANCE.createBuilder(repalyEnableProfile);
        }

        public static RepalyEnableProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepalyEnableProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RepalyEnableProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RepalyEnableProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RepalyEnableProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RepalyEnableProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RepalyEnableProfile parseFrom(InputStream inputStream) throws IOException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepalyEnableProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepalyEnableProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RepalyEnableProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyEnableProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface RepalyEnableProfileOrBuilder extends MessageLiteOrBuilder {
        int getEnable();

        String getProfileIccid();

        ByteString getProfileIccidBytes();

        int getResultCode();
    }

    public static final class RepalyResetEuicc extends GeneratedMessageLite<RepalyResetEuicc, Builder> implements RepalyResetEuiccOrBuilder {
        private static final RepalyResetEuicc DEFAULT_INSTANCE;
        private static volatile Parser<RepalyResetEuicc> PARSER = null;
        public static final int RESULTCODE_FIELD_NUMBER = 1;
        private int resultCode_;

        public static final class Builder extends GeneratedMessageLite.Builder<RepalyResetEuicc, Builder> implements RepalyResetEuiccOrBuilder {
            public Builder clearResultCode() {
                copyOnWrite();
                ((RepalyResetEuicc) this.instance).clearResultCode();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyResetEuiccOrBuilder
            public int getResultCode() {
                return ((RepalyResetEuicc) this.instance).getResultCode();
            }

            public Builder setResultCode(int i) {
                copyOnWrite();
                ((RepalyResetEuicc) this.instance).setResultCode(i);
                return this;
            }

            private Builder() {
                super(RepalyResetEuicc.DEFAULT_INSTANCE);
            }
        }

        static {
            RepalyResetEuicc repalyResetEuicc = new RepalyResetEuicc();
            DEFAULT_INSTANCE = repalyResetEuicc;
            GeneratedMessageLite.registerDefaultInstance(RepalyResetEuicc.class, repalyResetEuicc);
        }

        private RepalyResetEuicc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCode() {
            this.resultCode_ = 0;
        }

        public static RepalyResetEuicc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RepalyResetEuicc parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepalyResetEuicc parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RepalyResetEuicc> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCode(int i) {
            this.resultCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new RepalyResetEuicc();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resultCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RepalyResetEuicc> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RepalyResetEuicc.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.RepalyResetEuiccOrBuilder
        public int getResultCode() {
            return this.resultCode_;
        }

        public static Builder newBuilder(RepalyResetEuicc repalyResetEuicc) {
            return DEFAULT_INSTANCE.createBuilder(repalyResetEuicc);
        }

        public static RepalyResetEuicc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepalyResetEuicc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RepalyResetEuicc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RepalyResetEuicc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RepalyResetEuicc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RepalyResetEuicc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RepalyResetEuicc parseFrom(InputStream inputStream) throws IOException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepalyResetEuicc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepalyResetEuicc parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RepalyResetEuicc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RepalyResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface RepalyResetEuiccOrBuilder extends MessageLiteOrBuilder {
        int getResultCode();
    }

    public enum ReportProfileSatus implements Internal.EnumLite {
        REPORT_UNDEFINE(0),
        DOWNLOADING(1),
        INSTALLING(2),
        ACTIVATING(3),
        ACTIVATION_SUCCESS(4),
        DOWNLOAD_FAILURE(5),
        ACTIVATION_FAILURE(6),
        LOW_BATTERY(7),
        NETWORK_DISCONNCTED(8),
        LPA_SHOW_QRCODE(9),
        ALREADY_EXISTS_CARD(10),
        UNRECOGNIZED(-1);

        public static final int ACTIVATING_VALUE = 3;
        public static final int ACTIVATION_FAILURE_VALUE = 6;
        public static final int ACTIVATION_SUCCESS_VALUE = 4;
        public static final int ALREADY_EXISTS_CARD_VALUE = 10;
        public static final int DOWNLOADING_VALUE = 1;
        public static final int DOWNLOAD_FAILURE_VALUE = 5;
        public static final int INSTALLING_VALUE = 2;
        public static final int LOW_BATTERY_VALUE = 7;
        public static final int LPA_SHOW_QRCODE_VALUE = 9;
        public static final int NETWORK_DISCONNCTED_VALUE = 8;
        public static final int REPORT_UNDEFINE_VALUE = 0;
        private static final Internal.EnumLiteMap<ReportProfileSatus> internalValueMap = new Internal.EnumLiteMap<ReportProfileSatus>() { // from class: com.heytap.wearable.lpa.proto.LPASyncProto.ReportProfileSatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ReportProfileSatus findValueByNumber(int i) {
                return ReportProfileSatus.forNumber(i);
            }
        };
        private final int value;

        public static final class ReportProfileSatusVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ReportProfileSatusVerifier();

            private ReportProfileSatusVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ReportProfileSatus.forNumber(i) != null;
            }
        }

        ReportProfileSatus(int i) {
            this.value = i;
        }

        public static ReportProfileSatus forNumber(int i) {
            switch (i) {
                case 0:
                    return REPORT_UNDEFINE;
                case 1:
                    return DOWNLOADING;
                case 2:
                    return INSTALLING;
                case 3:
                    return ACTIVATING;
                case 4:
                    return ACTIVATION_SUCCESS;
                case 5:
                    return DOWNLOAD_FAILURE;
                case 6:
                    return ACTIVATION_FAILURE;
                case 7:
                    return LOW_BATTERY;
                case 8:
                    return NETWORK_DISCONNCTED;
                case 9:
                    return LPA_SHOW_QRCODE;
                case 10:
                    return ALREADY_EXISTS_CARD;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<ReportProfileSatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ReportProfileSatusVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ReportProfileSatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ReportingStatus extends GeneratedMessageLite<ReportingStatus, Builder> implements ReportingStatusOrBuilder {
        public static final int ACTIVE_ICCID_FIELD_NUMBER = 1;
        private static final ReportingStatus DEFAULT_INSTANCE;
        private static volatile Parser<ReportingStatus> PARSER = null;
        public static final int PROFILE_TYPE_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 2;
        private String activeIccid_ = "";
        private int profileType_;
        private int status_;

        public static final class Builder extends GeneratedMessageLite.Builder<ReportingStatus, Builder> implements ReportingStatusOrBuilder {
            public Builder clearActiveIccid() {
                copyOnWrite();
                ((ReportingStatus) this.instance).clearActiveIccid();
                return this;
            }

            public Builder clearProfileType() {
                copyOnWrite();
                ((ReportingStatus) this.instance).clearProfileType();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((ReportingStatus) this.instance).clearStatus();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ReportingStatusOrBuilder
            public String getActiveIccid() {
                return ((ReportingStatus) this.instance).getActiveIccid();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ReportingStatusOrBuilder
            public ByteString getActiveIccidBytes() {
                return ((ReportingStatus) this.instance).getActiveIccidBytes();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ReportingStatusOrBuilder
            public int getProfileType() {
                return ((ReportingStatus) this.instance).getProfileType();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ReportingStatusOrBuilder
            public int getStatus() {
                return ((ReportingStatus) this.instance).getStatus();
            }

            public Builder setActiveIccid(String str) {
                copyOnWrite();
                ((ReportingStatus) this.instance).setActiveIccid(str);
                return this;
            }

            public Builder setActiveIccidBytes(ByteString byteString) {
                copyOnWrite();
                ((ReportingStatus) this.instance).setActiveIccidBytes(byteString);
                return this;
            }

            public Builder setProfileType(int i) {
                copyOnWrite();
                ((ReportingStatus) this.instance).setProfileType(i);
                return this;
            }

            public Builder setStatus(int i) {
                copyOnWrite();
                ((ReportingStatus) this.instance).setStatus(i);
                return this;
            }

            private Builder() {
                super(ReportingStatus.DEFAULT_INSTANCE);
            }
        }

        static {
            ReportingStatus reportingStatus = new ReportingStatus();
            DEFAULT_INSTANCE = reportingStatus;
            GeneratedMessageLite.registerDefaultInstance(ReportingStatus.class, reportingStatus);
        }

        private ReportingStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActiveIccid() {
            this.activeIccid_ = getDefaultInstance().getActiveIccid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileType() {
            this.profileType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static ReportingStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ReportingStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReportingStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReportingStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ReportingStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveIccid(String str) {
            str.getClass();
            this.activeIccid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveIccidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.activeIccid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileType(int i) {
            this.profileType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(int i) {
            this.status_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ReportingStatus();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004", new Object[]{"activeIccid_", "status_", "profileType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ReportingStatus> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ReportingStatus.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ReportingStatusOrBuilder
        public String getActiveIccid() {
            return this.activeIccid_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ReportingStatusOrBuilder
        public ByteString getActiveIccidBytes() {
            return ByteString.copyFromUtf8(this.activeIccid_);
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ReportingStatusOrBuilder
        public int getProfileType() {
            return this.profileType_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ReportingStatusOrBuilder
        public int getStatus() {
            return this.status_;
        }

        public static Builder newBuilder(ReportingStatus reportingStatus) {
            return DEFAULT_INSTANCE.createBuilder(reportingStatus);
        }

        public static ReportingStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReportingStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReportingStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ReportingStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ReportingStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ReportingStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReportingStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ReportingStatus parseFrom(InputStream inputStream) throws IOException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReportingStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReportingStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReportingStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReportingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ReportingStatusOrBuilder extends MessageLiteOrBuilder {
        String getActiveIccid();

        ByteString getActiveIccidBytes();

        int getProfileType();

        int getStatus();
    }

    public static final class ResetEuicc extends GeneratedMessageLite<ResetEuicc, Builder> implements ResetEuiccOrBuilder {
        private static final ResetEuicc DEFAULT_INSTANCE;
        public static final int DEVICE_MAC_FIELD_NUMBER = 1;
        private static volatile Parser<ResetEuicc> PARSER;
        private String deviceMac_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<ResetEuicc, Builder> implements ResetEuiccOrBuilder {
            public Builder clearDeviceMac() {
                copyOnWrite();
                ((ResetEuicc) this.instance).clearDeviceMac();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ResetEuiccOrBuilder
            public String getDeviceMac() {
                return ((ResetEuicc) this.instance).getDeviceMac();
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ResetEuiccOrBuilder
            public ByteString getDeviceMacBytes() {
                return ((ResetEuicc) this.instance).getDeviceMacBytes();
            }

            public Builder setDeviceMac(String str) {
                copyOnWrite();
                ((ResetEuicc) this.instance).setDeviceMac(str);
                return this;
            }

            public Builder setDeviceMacBytes(ByteString byteString) {
                copyOnWrite();
                ((ResetEuicc) this.instance).setDeviceMacBytes(byteString);
                return this;
            }

            private Builder() {
                super(ResetEuicc.DEFAULT_INSTANCE);
            }
        }

        static {
            ResetEuicc resetEuicc = new ResetEuicc();
            DEFAULT_INSTANCE = resetEuicc;
            GeneratedMessageLite.registerDefaultInstance(ResetEuicc.class, resetEuicc);
        }

        private ResetEuicc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceMac() {
            this.deviceMac_ = getDefaultInstance().getDeviceMac();
        }

        public static ResetEuicc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResetEuicc parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResetEuicc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetEuicc parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResetEuicc> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMac(String str) {
            str.getClass();
            this.deviceMac_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMacBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceMac_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ResetEuicc();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceMac_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ResetEuicc> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ResetEuicc.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ResetEuiccOrBuilder
        public String getDeviceMac() {
            return this.deviceMac_;
        }

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.ResetEuiccOrBuilder
        public ByteString getDeviceMacBytes() {
            return ByteString.copyFromUtf8(this.deviceMac_);
        }

        public static Builder newBuilder(ResetEuicc resetEuicc) {
            return DEFAULT_INSTANCE.createBuilder(resetEuicc);
        }

        public static ResetEuicc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetEuicc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetEuicc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ResetEuicc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResetEuicc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResetEuicc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResetEuicc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResetEuicc parseFrom(InputStream inputStream) throws IOException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResetEuicc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResetEuicc parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResetEuicc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResetEuicc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ResetEuiccOrBuilder extends MessageLiteOrBuilder {
        String getDeviceMac();

        ByteString getDeviceMacBytes();
    }

    public static final class UpdateProfile extends GeneratedMessageLite<UpdateProfile, Builder> implements UpdateProfileOrBuilder {
        private static final UpdateProfile DEFAULT_INSTANCE;
        private static volatile Parser<UpdateProfile> PARSER = null;
        public static final int PROFILE_TYPE_FIELD_NUMBER = 1;
        private int profileType_;

        public static final class Builder extends GeneratedMessageLite.Builder<UpdateProfile, Builder> implements UpdateProfileOrBuilder {
            public Builder clearProfileType() {
                copyOnWrite();
                ((UpdateProfile) this.instance).clearProfileType();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.UpdateProfileOrBuilder
            public int getProfileType() {
                return ((UpdateProfile) this.instance).getProfileType();
            }

            public Builder setProfileType(int i) {
                copyOnWrite();
                ((UpdateProfile) this.instance).setProfileType(i);
                return this;
            }

            private Builder() {
                super(UpdateProfile.DEFAULT_INSTANCE);
            }
        }

        static {
            UpdateProfile updateProfile = new UpdateProfile();
            DEFAULT_INSTANCE = updateProfile;
            GeneratedMessageLite.registerDefaultInstance(UpdateProfile.class, updateProfile);
        }

        private UpdateProfile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProfileType() {
            this.profileType_ = 0;
        }

        public static UpdateProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UpdateProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProfileType(int i) {
            this.profileType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new UpdateProfile();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"profileType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UpdateProfile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UpdateProfile.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.UpdateProfileOrBuilder
        public int getProfileType() {
            return this.profileType_;
        }

        public static Builder newBuilder(UpdateProfile updateProfile) {
            return DEFAULT_INSTANCE.createBuilder(updateProfile);
        }

        public static UpdateProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UpdateProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UpdateProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UpdateProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UpdateProfile parseFrom(InputStream inputStream) throws IOException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UpdateProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UpdateProfileOrBuilder extends MessageLiteOrBuilder {
        int getProfileType();
    }

    public static final class UpdateResult extends GeneratedMessageLite<UpdateResult, Builder> implements UpdateResultOrBuilder {
        public static final int CODE_FIELD_NUMBER = 9;
        private static final UpdateResult DEFAULT_INSTANCE;
        private static volatile Parser<UpdateResult> PARSER;
        private int code_;

        public static final class Builder extends GeneratedMessageLite.Builder<UpdateResult, Builder> implements UpdateResultOrBuilder {
            public Builder clearCode() {
                copyOnWrite();
                ((UpdateResult) this.instance).clearCode();
                return this;
            }

            @Override // com.heytap.wearable.lpa.proto.LPASyncProto.UpdateResultOrBuilder
            public int getCode() {
                return ((UpdateResult) this.instance).getCode();
            }

            public Builder setCode(int i) {
                copyOnWrite();
                ((UpdateResult) this.instance).setCode(i);
                return this;
            }

            private Builder() {
                super(UpdateResult.DEFAULT_INSTANCE);
            }
        }

        static {
            UpdateResult updateResult = new UpdateResult();
            DEFAULT_INSTANCE = updateResult;
            GeneratedMessageLite.registerDefaultInstance(UpdateResult.class, updateResult);
        }

        private UpdateResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        public static UpdateResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UpdateResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i) {
            this.code_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new UpdateResult();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\t\t\u0001\u0000\u0000\u0000\t\u0004", new Object[]{"code_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UpdateResult> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UpdateResult.class) {
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

        @Override // com.heytap.wearable.lpa.proto.LPASyncProto.UpdateResultOrBuilder
        public int getCode() {
            return this.code_;
        }

        public static Builder newBuilder(UpdateResult updateResult) {
            return DEFAULT_INSTANCE.createBuilder(updateResult);
        }

        public static UpdateResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UpdateResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UpdateResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UpdateResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UpdateResult parseFrom(InputStream inputStream) throws IOException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UpdateResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UpdateResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UpdateResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UpdateResultOrBuilder extends MessageLiteOrBuilder {
        int getCode();
    }

    private LPASyncProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
