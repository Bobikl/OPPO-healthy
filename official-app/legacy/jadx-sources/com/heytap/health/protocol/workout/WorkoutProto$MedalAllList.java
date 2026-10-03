package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkoutProto$MedalAllList extends GeneratedMessageLite<WorkoutProto$MedalAllList, Builder> implements WorkoutProto$MedalAllListOrBuilder {
    private static final WorkoutProto$MedalAllList DEFAULT_INSTANCE;
    public static final int MEDALLIST_FIELD_NUMBER = 1;
    public static final int MEDALNAMEEN_FIELD_NUMBER = 3;
    public static final int MEDALNAMEZN_FIELD_NUMBER = 4;
    public static final int MEDALSORT_FIELD_NUMBER = 2;
    private static volatile Parser<WorkoutProto$MedalAllList> PARSER;
    private Internal.ProtobufList<WorkoutProto$MedalBean> medalList_ = GeneratedMessageLite.emptyProtobufList();
    private String medalNameEN_ = "";
    private String medalNameZN_ = "";
    private int medalSort_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$MedalAllList, Builder> implements WorkoutProto$MedalAllListOrBuilder {
        public Builder addAllMedalList(Iterable<? extends WorkoutProto$MedalBean> iterable) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).addAllMedalList(iterable);
            return this;
        }

        public Builder addMedalList(WorkoutProto$MedalBean workoutProto$MedalBean) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).addMedalList(workoutProto$MedalBean);
            return this;
        }

        public Builder clearMedalList() {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).clearMedalList();
            return this;
        }

        public Builder clearMedalNameEN() {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).clearMedalNameEN();
            return this;
        }

        public Builder clearMedalNameZN() {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).clearMedalNameZN();
            return this;
        }

        public Builder clearMedalSort() {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).clearMedalSort();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
        public WorkoutProto$MedalBean getMedalList(int i) {
            return ((WorkoutProto$MedalAllList) this.instance).getMedalList(i);
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
        public int getMedalListCount() {
            return ((WorkoutProto$MedalAllList) this.instance).getMedalListCount();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
        public List<WorkoutProto$MedalBean> getMedalListList() {
            return Collections.unmodifiableList(((WorkoutProto$MedalAllList) this.instance).getMedalListList());
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
        public String getMedalNameEN() {
            return ((WorkoutProto$MedalAllList) this.instance).getMedalNameEN();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
        public ByteString getMedalNameENBytes() {
            return ((WorkoutProto$MedalAllList) this.instance).getMedalNameENBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
        public String getMedalNameZN() {
            return ((WorkoutProto$MedalAllList) this.instance).getMedalNameZN();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
        public ByteString getMedalNameZNBytes() {
            return ((WorkoutProto$MedalAllList) this.instance).getMedalNameZNBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
        public int getMedalSort() {
            return ((WorkoutProto$MedalAllList) this.instance).getMedalSort();
        }

        public Builder removeMedalList(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).removeMedalList(i);
            return this;
        }

        public Builder setMedalList(int i, WorkoutProto$MedalBean workoutProto$MedalBean) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).setMedalList(i, workoutProto$MedalBean);
            return this;
        }

        public Builder setMedalNameEN(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).setMedalNameEN(str);
            return this;
        }

        public Builder setMedalNameENBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).setMedalNameENBytes(byteString);
            return this;
        }

        public Builder setMedalNameZN(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).setMedalNameZN(str);
            return this;
        }

        public Builder setMedalNameZNBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).setMedalNameZNBytes(byteString);
            return this;
        }

        public Builder setMedalSort(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).setMedalSort(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$MedalAllList.DEFAULT_INSTANCE);
        }

        public Builder addMedalList(int i, WorkoutProto$MedalBean workoutProto$MedalBean) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).addMedalList(i, workoutProto$MedalBean);
            return this;
        }

        public Builder setMedalList(int i, WorkoutProto$MedalBean.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).setMedalList(i, builder.build());
            return this;
        }

        public Builder addMedalList(WorkoutProto$MedalBean.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).addMedalList(builder.build());
            return this;
        }

        public Builder addMedalList(int i, WorkoutProto$MedalBean.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$MedalAllList) this.instance).addMedalList(i, builder.build());
            return this;
        }
    }

    static {
        WorkoutProto$MedalAllList workoutProto$MedalAllList = new WorkoutProto$MedalAllList();
        DEFAULT_INSTANCE = workoutProto$MedalAllList;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$MedalAllList.class, workoutProto$MedalAllList);
    }

    private WorkoutProto$MedalAllList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMedalList(Iterable<? extends WorkoutProto$MedalBean> iterable) {
        ensureMedalListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.medalList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMedalList(WorkoutProto$MedalBean workoutProto$MedalBean) {
        workoutProto$MedalBean.getClass();
        ensureMedalListIsMutable();
        this.medalList_.add(workoutProto$MedalBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedalList() {
        this.medalList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedalNameEN() {
        this.medalNameEN_ = getDefaultInstance().getMedalNameEN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedalNameZN() {
        this.medalNameZN_ = getDefaultInstance().getMedalNameZN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedalSort() {
        this.medalSort_ = 0;
    }

    private void ensureMedalListIsMutable() {
        Internal.ProtobufList<WorkoutProto$MedalBean> protobufList = this.medalList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.medalList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WorkoutProto$MedalAllList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$MedalAllList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$MedalAllList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$MedalAllList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMedalList(int i) {
        ensureMedalListIsMutable();
        this.medalList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedalList(int i, WorkoutProto$MedalBean workoutProto$MedalBean) {
        workoutProto$MedalBean.getClass();
        ensureMedalListIsMutable();
        this.medalList_.set(i, workoutProto$MedalBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedalNameEN(String str) {
        str.getClass();
        this.medalNameEN_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedalNameENBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.medalNameEN_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedalNameZN(String str) {
        str.getClass();
        this.medalNameZN_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedalNameZNBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.medalNameZN_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedalSort(int i) {
        this.medalSort_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$MedalAllList();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u000b\u0003Ȉ\u0004Ȉ", new Object[]{"medalList_", WorkoutProto$MedalBean.class, "medalSort_", "medalNameEN_", "medalNameZN_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$MedalAllList> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$MedalAllList.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
    public WorkoutProto$MedalBean getMedalList(int i) {
        return this.medalList_.get(i);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
    public int getMedalListCount() {
        return this.medalList_.size();
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
    public List<WorkoutProto$MedalBean> getMedalListList() {
        return this.medalList_;
    }

    public WorkoutProto$MedalBeanOrBuilder getMedalListOrBuilder(int i) {
        return this.medalList_.get(i);
    }

    public List<? extends WorkoutProto$MedalBeanOrBuilder> getMedalListOrBuilderList() {
        return this.medalList_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
    public String getMedalNameEN() {
        return this.medalNameEN_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
    public ByteString getMedalNameENBytes() {
        return ByteString.copyFromUtf8(this.medalNameEN_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
    public String getMedalNameZN() {
        return this.medalNameZN_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
    public ByteString getMedalNameZNBytes() {
        return ByteString.copyFromUtf8(this.medalNameZN_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalAllListOrBuilder
    public int getMedalSort() {
        return this.medalSort_;
    }

    public static Builder newBuilder(WorkoutProto$MedalAllList workoutProto$MedalAllList) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$MedalAllList);
    }

    public static WorkoutProto$MedalAllList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$MedalAllList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$MedalAllList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMedalList(int i, WorkoutProto$MedalBean workoutProto$MedalBean) {
        workoutProto$MedalBean.getClass();
        ensureMedalListIsMutable();
        this.medalList_.add(i, workoutProto$MedalBean);
    }

    public static WorkoutProto$MedalAllList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$MedalAllList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$MedalAllList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$MedalAllList parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$MedalAllList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$MedalAllList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$MedalAllList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MedalAllList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
