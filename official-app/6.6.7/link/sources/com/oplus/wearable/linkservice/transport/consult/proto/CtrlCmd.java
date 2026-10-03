package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class CtrlCmd extends GeneratedMessageLite<CtrlCmd, Builder> implements CtrlCmdOrBuilder {
    public static final int CMD_FIELD_NUMBER = 1;
    private static final CtrlCmd DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int PARAM_FIELD_NUMBER = 3;
    private static volatile Parser<CtrlCmd> PARSER;
    private int cmd_;
    private int direction_;
    private ByteString param_ = ByteString.EMPTY;

    public static /* synthetic */ class 1 {
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

    public static final class Builder extends GeneratedMessageLite.Builder<CtrlCmd, Builder> implements CtrlCmdOrBuilder {
        public Builder clearCmd() {
            copyOnWrite();
            ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).clearCmd();
            return this;
        }

        public Builder clearDirection() {
            copyOnWrite();
            ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).clearDirection();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).clearParam();
            return this;
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
        public GMS_CMD getCmd() {
            return ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).getCmd();
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
        public int getCmdValue() {
            return ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).getCmdValue();
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
        public CMD_DIRECTION getDirection() {
            return ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).getDirection();
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
        public int getDirectionValue() {
            return ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).getDirectionValue();
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
        public ByteString getParam() {
            return ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).getParam();
        }

        public Builder setCmd(GMS_CMD gms_cmd) {
            copyOnWrite();
            ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).setCmd(gms_cmd);
            return this;
        }

        public Builder setCmdValue(int i) {
            copyOnWrite();
            ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).setCmdValue(i);
            return this;
        }

        public Builder setDirection(CMD_DIRECTION cmd_direction) {
            copyOnWrite();
            ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).setDirection(cmd_direction);
            return this;
        }

        public Builder setDirectionValue(int i) {
            copyOnWrite();
            ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).setDirectionValue(i);
            return this;
        }

        public Builder setParam(ByteString byteString) {
            copyOnWrite();
            ((CtrlCmd) ((GeneratedMessageLite.Builder) this).instance).setParam(byteString);
            return this;
        }

        private Builder() {
            super(CtrlCmd.DEFAULT_INSTANCE);
        }
    }

    static {
        CtrlCmd ctrlCmd = new CtrlCmd();
        DEFAULT_INSTANCE = ctrlCmd;
        GeneratedMessageLite.registerDefaultInstance(CtrlCmd.class, ctrlCmd);
    }

    private CtrlCmd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmd() {
        this.cmd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirection() {
        this.direction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    public static CtrlCmd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CtrlCmd parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CtrlCmd) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CtrlCmd parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CtrlCmd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmd(GMS_CMD gms_cmd) {
        this.cmd_ = gms_cmd.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmdValue(int i) {
        this.cmd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirection(CMD_DIRECTION cmd_direction) {
        this.direction_ = cmd_direction.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionValue(int i) {
        this.direction_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParam(ByteString byteString) {
        byteString.getClass();
        this.param_ = byteString;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CtrlCmd();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\n", new Object[]{"cmd_", "direction_", "param_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CtrlCmd.class) {
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

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
    public GMS_CMD getCmd() {
        GMS_CMD gms_cmdForNumber = GMS_CMD.forNumber(this.cmd_);
        return gms_cmdForNumber == null ? GMS_CMD.UNRECOGNIZED : gms_cmdForNumber;
    }

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
    public int getCmdValue() {
        return this.cmd_;
    }

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
    public CMD_DIRECTION getDirection() {
        CMD_DIRECTION cmd_directionForNumber = CMD_DIRECTION.forNumber(this.direction_);
        return cmd_directionForNumber == null ? CMD_DIRECTION.UNRECOGNIZED : cmd_directionForNumber;
    }

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
    public int getDirectionValue() {
        return this.direction_;
    }

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.CtrlCmdOrBuilder
    public ByteString getParam() {
        return this.param_;
    }

    public static Builder newBuilder(CtrlCmd ctrlCmd) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ctrlCmd);
    }

    public static CtrlCmd parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CtrlCmd) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CtrlCmd parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CtrlCmd parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CtrlCmd parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CtrlCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CtrlCmd parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CtrlCmd parseFrom(InputStream inputStream) throws IOException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CtrlCmd parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CtrlCmd parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CtrlCmd parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CtrlCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
