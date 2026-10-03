package com.heytap.health.protocol.defatcalorie;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.k35;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DefatCalorieProto$DefatCalorie extends GeneratedMessageLite<DefatCalorieProto$DefatCalorie, Builder> implements DefatCalorieProto$DefatCalorieOrBuilder {
    public static final int BASICCALORIE_FIELD_NUMBER = 2;
    private static final DefatCalorieProto$DefatCalorie DEFAULT_INSTANCE;
    public static final int INTAKECALORIE_FIELD_NUMBER = 3;
    private static volatile Parser<DefatCalorieProto$DefatCalorie> PARSER = null;
    public static final int TATALCALORIE_FIELD_NUMBER = 1;
    private int basicCalorie_;
    private int intakeCalorie_;
    private int tatalCalorie_;

    public static final class Builder extends GeneratedMessageLite.Builder<DefatCalorieProto$DefatCalorie, Builder> implements DefatCalorieProto$DefatCalorieOrBuilder {
        public Builder clearBasicCalorie() {
            copyOnWrite();
            ((DefatCalorieProto$DefatCalorie) this.instance).clearBasicCalorie();
            return this;
        }

        public Builder clearIntakeCalorie() {
            copyOnWrite();
            ((DefatCalorieProto$DefatCalorie) this.instance).clearIntakeCalorie();
            return this;
        }

        public Builder clearTatalCalorie() {
            copyOnWrite();
            ((DefatCalorieProto$DefatCalorie) this.instance).clearTatalCalorie();
            return this;
        }

        @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$DefatCalorieOrBuilder
        public int getBasicCalorie() {
            return ((DefatCalorieProto$DefatCalorie) this.instance).getBasicCalorie();
        }

        @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$DefatCalorieOrBuilder
        public int getIntakeCalorie() {
            return ((DefatCalorieProto$DefatCalorie) this.instance).getIntakeCalorie();
        }

        @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$DefatCalorieOrBuilder
        public int getTatalCalorie() {
            return ((DefatCalorieProto$DefatCalorie) this.instance).getTatalCalorie();
        }

        public Builder setBasicCalorie(int i) {
            copyOnWrite();
            ((DefatCalorieProto$DefatCalorie) this.instance).setBasicCalorie(i);
            return this;
        }

        public Builder setIntakeCalorie(int i) {
            copyOnWrite();
            ((DefatCalorieProto$DefatCalorie) this.instance).setIntakeCalorie(i);
            return this;
        }

        public Builder setTatalCalorie(int i) {
            copyOnWrite();
            ((DefatCalorieProto$DefatCalorie) this.instance).setTatalCalorie(i);
            return this;
        }

        private Builder() {
            super(DefatCalorieProto$DefatCalorie.DEFAULT_INSTANCE);
        }
    }

    static {
        DefatCalorieProto$DefatCalorie defatCalorieProto$DefatCalorie = new DefatCalorieProto$DefatCalorie();
        DEFAULT_INSTANCE = defatCalorieProto$DefatCalorie;
        GeneratedMessageLite.registerDefaultInstance(DefatCalorieProto$DefatCalorie.class, defatCalorieProto$DefatCalorie);
    }

    private DefatCalorieProto$DefatCalorie() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBasicCalorie() {
        this.basicCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntakeCalorie() {
        this.intakeCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTatalCalorie() {
        this.tatalCalorie_ = 0;
    }

    public static DefatCalorieProto$DefatCalorie getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DefatCalorieProto$DefatCalorie parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DefatCalorieProto$DefatCalorie> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBasicCalorie(int i) {
        this.basicCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntakeCalorie(int i) {
        this.intakeCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTatalCalorie(int i) {
        this.tatalCalorie_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = k35.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DefatCalorieProto$DefatCalorie();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"tatalCalorie_", "basicCalorie_", "intakeCalorie_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DefatCalorieProto$DefatCalorie> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DefatCalorieProto$DefatCalorie.class) {
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

    @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$DefatCalorieOrBuilder
    public int getBasicCalorie() {
        return this.basicCalorie_;
    }

    @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$DefatCalorieOrBuilder
    public int getIntakeCalorie() {
        return this.intakeCalorie_;
    }

    @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$DefatCalorieOrBuilder
    public int getTatalCalorie() {
        return this.tatalCalorie_;
    }

    public static Builder newBuilder(DefatCalorieProto$DefatCalorie defatCalorieProto$DefatCalorie) {
        return DEFAULT_INSTANCE.createBuilder(defatCalorieProto$DefatCalorie);
    }

    public static DefatCalorieProto$DefatCalorie parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(InputStream inputStream) throws IOException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DefatCalorieProto$DefatCalorie parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DefatCalorieProto$DefatCalorie) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
