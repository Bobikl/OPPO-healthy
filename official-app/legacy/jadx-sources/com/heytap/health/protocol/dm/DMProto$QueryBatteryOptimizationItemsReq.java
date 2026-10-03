package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$QueryBatteryOptimizationItemsReq extends GeneratedMessageLite<DMProto$QueryBatteryOptimizationItemsReq, Builder> implements DMProto$QueryBatteryOptimizationItemsReqOrBuilder {
    private static final DMProto$QueryBatteryOptimizationItemsReq DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$QueryBatteryOptimizationItemsReq> PARSER;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$QueryBatteryOptimizationItemsReq, Builder> implements DMProto$QueryBatteryOptimizationItemsReqOrBuilder {
        private Builder() {
            super(DMProto$QueryBatteryOptimizationItemsReq.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$QueryBatteryOptimizationItemsReq dMProto$QueryBatteryOptimizationItemsReq = new DMProto$QueryBatteryOptimizationItemsReq();
        DEFAULT_INSTANCE = dMProto$QueryBatteryOptimizationItemsReq;
        GeneratedMessageLite.registerDefaultInstance(DMProto$QueryBatteryOptimizationItemsReq.class, dMProto$QueryBatteryOptimizationItemsReq);
    }

    private DMProto$QueryBatteryOptimizationItemsReq() {
    }

    public static DMProto$QueryBatteryOptimizationItemsReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$QueryBatteryOptimizationItemsReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$QueryBatteryOptimizationItemsReq();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$QueryBatteryOptimizationItemsReq> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$QueryBatteryOptimizationItemsReq.class) {
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

    public static Builder newBuilder(DMProto$QueryBatteryOptimizationItemsReq dMProto$QueryBatteryOptimizationItemsReq) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$QueryBatteryOptimizationItemsReq);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$QueryBatteryOptimizationItemsReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$QueryBatteryOptimizationItemsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
