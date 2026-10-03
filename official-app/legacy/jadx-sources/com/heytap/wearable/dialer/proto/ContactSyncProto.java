package com.heytap.wearable.dialer.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.StringValue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ContactSyncProto {

    /* JADX INFO: renamed from: com.heytap.wearable.dialer.proto.ContactSyncProto$1, reason: invalid class name */
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

    public static final class ContactCleanRequest extends GeneratedMessageLite<ContactCleanRequest, Builder> implements ContactCleanRequestOrBuilder {
        private static final ContactCleanRequest DEFAULT_INSTANCE;
        private static volatile Parser<ContactCleanRequest> PARSER = null;
        public static final int TIMEINTERVAL_FIELD_NUMBER = 1;
        private long timeInterval_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactCleanRequest, Builder> implements ContactCleanRequestOrBuilder {
            public Builder clearTimeInterval() {
                copyOnWrite();
                ((ContactCleanRequest) this.instance).clearTimeInterval();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactCleanRequestOrBuilder
            public long getTimeInterval() {
                return ((ContactCleanRequest) this.instance).getTimeInterval();
            }

            public Builder setTimeInterval(long j2) {
                copyOnWrite();
                ((ContactCleanRequest) this.instance).setTimeInterval(j2);
                return this;
            }

            private Builder() {
                super(ContactCleanRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            ContactCleanRequest contactCleanRequest = new ContactCleanRequest();
            DEFAULT_INSTANCE = contactCleanRequest;
            GeneratedMessageLite.registerDefaultInstance(ContactCleanRequest.class, contactCleanRequest);
        }

        private ContactCleanRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeInterval() {
            this.timeInterval_ = 0L;
        }

        public static ContactCleanRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactCleanRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactCleanRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactCleanRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactCleanRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeInterval(long j2) {
            this.timeInterval_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactCleanRequest();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"timeInterval_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactCleanRequest> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactCleanRequest.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactCleanRequestOrBuilder
        public long getTimeInterval() {
            return this.timeInterval_;
        }

        public static Builder newBuilder(ContactCleanRequest contactCleanRequest) {
            return DEFAULT_INSTANCE.createBuilder(contactCleanRequest);
        }

        public static ContactCleanRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactCleanRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactCleanRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactCleanRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContactCleanRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactCleanRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactCleanRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactCleanRequest parseFrom(InputStream inputStream) throws IOException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactCleanRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactCleanRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactCleanRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactCleanRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactCleanRequestOrBuilder extends MessageLiteOrBuilder {
        long getTimeInterval();
    }

    public static final class ContactCleanResponse extends GeneratedMessageLite<ContactCleanResponse, Builder> implements ContactCleanResponseOrBuilder {
        private static final ContactCleanResponse DEFAULT_INSTANCE;
        private static volatile Parser<ContactCleanResponse> PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 2;
        public static final int TIMEINTERVAL_FIELD_NUMBER = 1;
        private int result_;
        private long timeInterval_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactCleanResponse, Builder> implements ContactCleanResponseOrBuilder {
            public Builder clearResult() {
                copyOnWrite();
                ((ContactCleanResponse) this.instance).clearResult();
                return this;
            }

            public Builder clearTimeInterval() {
                copyOnWrite();
                ((ContactCleanResponse) this.instance).clearTimeInterval();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactCleanResponseOrBuilder
            public int getResult() {
                return ((ContactCleanResponse) this.instance).getResult();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactCleanResponseOrBuilder
            public long getTimeInterval() {
                return ((ContactCleanResponse) this.instance).getTimeInterval();
            }

            public Builder setResult(int i) {
                copyOnWrite();
                ((ContactCleanResponse) this.instance).setResult(i);
                return this;
            }

            public Builder setTimeInterval(long j2) {
                copyOnWrite();
                ((ContactCleanResponse) this.instance).setTimeInterval(j2);
                return this;
            }

            private Builder() {
                super(ContactCleanResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            ContactCleanResponse contactCleanResponse = new ContactCleanResponse();
            DEFAULT_INSTANCE = contactCleanResponse;
            GeneratedMessageLite.registerDefaultInstance(ContactCleanResponse.class, contactCleanResponse);
        }

        private ContactCleanResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeInterval() {
            this.timeInterval_ = 0L;
        }

        public static ContactCleanResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactCleanResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactCleanResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactCleanResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactCleanResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(int i) {
            this.result_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeInterval(long j2) {
            this.timeInterval_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactCleanResponse();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u000b", new Object[]{"timeInterval_", "result_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactCleanResponse> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactCleanResponse.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactCleanResponseOrBuilder
        public int getResult() {
            return this.result_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactCleanResponseOrBuilder
        public long getTimeInterval() {
            return this.timeInterval_;
        }

        public static Builder newBuilder(ContactCleanResponse contactCleanResponse) {
            return DEFAULT_INSTANCE.createBuilder(contactCleanResponse);
        }

        public static ContactCleanResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactCleanResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactCleanResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactCleanResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContactCleanResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactCleanResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactCleanResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactCleanResponse parseFrom(InputStream inputStream) throws IOException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactCleanResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactCleanResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactCleanResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactCleanResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactCleanResponseOrBuilder extends MessageLiteOrBuilder {
        int getResult();

        long getTimeInterval();
    }

    public static final class ContactSortOrder extends GeneratedMessageLite<ContactSortOrder, Builder> implements ContactSortOrderOrBuilder {
        public static final int CONTACTID_FIELD_NUMBER = 2;
        private static final ContactSortOrder DEFAULT_INSTANCE;
        private static volatile Parser<ContactSortOrder> PARSER = null;
        public static final int SORTKEY_FIELD_NUMBER = 1;
        private long contactId_;
        private int sortKey_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSortOrder, Builder> implements ContactSortOrderOrBuilder {
            public Builder clearContactId() {
                copyOnWrite();
                ((ContactSortOrder) this.instance).clearContactId();
                return this;
            }

            public Builder clearSortKey() {
                copyOnWrite();
                ((ContactSortOrder) this.instance).clearSortKey();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderOrBuilder
            public long getContactId() {
                return ((ContactSortOrder) this.instance).getContactId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderOrBuilder
            public int getSortKey() {
                return ((ContactSortOrder) this.instance).getSortKey();
            }

            public Builder setContactId(long j2) {
                copyOnWrite();
                ((ContactSortOrder) this.instance).setContactId(j2);
                return this;
            }

            public Builder setSortKey(int i) {
                copyOnWrite();
                ((ContactSortOrder) this.instance).setSortKey(i);
                return this;
            }

            private Builder() {
                super(ContactSortOrder.DEFAULT_INSTANCE);
            }
        }

        static {
            ContactSortOrder contactSortOrder = new ContactSortOrder();
            DEFAULT_INSTANCE = contactSortOrder;
            GeneratedMessageLite.registerDefaultInstance(ContactSortOrder.class, contactSortOrder);
        }

        private ContactSortOrder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContactId() {
            this.contactId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSortKey() {
            this.sortKey_ = 0;
        }

        public static ContactSortOrder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSortOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSortOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSortOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSortOrder> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContactId(long j2) {
            this.contactId_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSortKey(int i) {
            this.sortKey_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSortOrder();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0002", new Object[]{"sortKey_", "contactId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSortOrder> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSortOrder.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderOrBuilder
        public long getContactId() {
            return this.contactId_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderOrBuilder
        public int getSortKey() {
            return this.sortKey_;
        }

        public static Builder newBuilder(ContactSortOrder contactSortOrder) {
            return DEFAULT_INSTANCE.createBuilder(contactSortOrder);
        }

        public static ContactSortOrder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSortOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSortOrder parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSortOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContactSortOrder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSortOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSortOrder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSortOrder parseFrom(InputStream inputStream) throws IOException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSortOrder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSortOrder parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSortOrder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSortOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ContactSortOrderList extends GeneratedMessageLite<ContactSortOrderList, Builder> implements ContactSortOrderListOrBuilder {
        private static final ContactSortOrderList DEFAULT_INSTANCE;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile Parser<ContactSortOrderList> PARSER;
        private Internal.ProtobufList<ContactSortOrder> list_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSortOrderList, Builder> implements ContactSortOrderListOrBuilder {
            public Builder addAllList(Iterable<? extends ContactSortOrder> iterable) {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).addAllList(iterable);
                return this;
            }

            public Builder addList(ContactSortOrder contactSortOrder) {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).addList(contactSortOrder);
                return this;
            }

            public Builder clearList() {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).clearList();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderListOrBuilder
            public ContactSortOrder getList(int i) {
                return ((ContactSortOrderList) this.instance).getList(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderListOrBuilder
            public int getListCount() {
                return ((ContactSortOrderList) this.instance).getListCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderListOrBuilder
            public List<ContactSortOrder> getListList() {
                return Collections.unmodifiableList(((ContactSortOrderList) this.instance).getListList());
            }

            public Builder removeList(int i) {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).removeList(i);
                return this;
            }

            public Builder setList(int i, ContactSortOrder contactSortOrder) {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).setList(i, contactSortOrder);
                return this;
            }

            private Builder() {
                super(ContactSortOrderList.DEFAULT_INSTANCE);
            }

            public Builder addList(int i, ContactSortOrder contactSortOrder) {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).addList(i, contactSortOrder);
                return this;
            }

            public Builder setList(int i, ContactSortOrder.Builder builder) {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).setList(i, builder.build());
                return this;
            }

            public Builder addList(ContactSortOrder.Builder builder) {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).addList(builder.build());
                return this;
            }

            public Builder addList(int i, ContactSortOrder.Builder builder) {
                copyOnWrite();
                ((ContactSortOrderList) this.instance).addList(i, builder.build());
                return this;
            }
        }

        static {
            ContactSortOrderList contactSortOrderList = new ContactSortOrderList();
            DEFAULT_INSTANCE = contactSortOrderList;
            GeneratedMessageLite.registerDefaultInstance(ContactSortOrderList.class, contactSortOrderList);
        }

        private ContactSortOrderList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllList(Iterable<? extends ContactSortOrder> iterable) {
            ensureListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.list_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addList(ContactSortOrder contactSortOrder) {
            contactSortOrder.getClass();
            ensureListIsMutable();
            this.list_.add(contactSortOrder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearList() {
            this.list_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureListIsMutable() {
            Internal.ProtobufList<ContactSortOrder> protobufList = this.list_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.list_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ContactSortOrderList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSortOrderList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSortOrderList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSortOrderList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSortOrderList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeList(int i) {
            ensureListIsMutable();
            this.list_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setList(int i, ContactSortOrder contactSortOrder) {
            contactSortOrder.getClass();
            ensureListIsMutable();
            this.list_.set(i, contactSortOrder);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSortOrderList();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"list_", ContactSortOrder.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSortOrderList> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSortOrderList.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderListOrBuilder
        public ContactSortOrder getList(int i) {
            return this.list_.get(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderListOrBuilder
        public int getListCount() {
            return this.list_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSortOrderListOrBuilder
        public List<ContactSortOrder> getListList() {
            return this.list_;
        }

        public ContactSortOrderOrBuilder getListOrBuilder(int i) {
            return this.list_.get(i);
        }

        public List<? extends ContactSortOrderOrBuilder> getListOrBuilderList() {
            return this.list_;
        }

        public static Builder newBuilder(ContactSortOrderList contactSortOrderList) {
            return DEFAULT_INSTANCE.createBuilder(contactSortOrderList);
        }

        public static ContactSortOrderList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSortOrderList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSortOrderList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSortOrderList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addList(int i, ContactSortOrder contactSortOrder) {
            contactSortOrder.getClass();
            ensureListIsMutable();
            this.list_.add(i, contactSortOrder);
        }

        public static ContactSortOrderList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSortOrderList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSortOrderList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSortOrderList parseFrom(InputStream inputStream) throws IOException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSortOrderList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSortOrderList parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSortOrderList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSortOrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactSortOrderListOrBuilder extends MessageLiteOrBuilder {
        ContactSortOrder getList(int i);

        int getListCount();

        List<ContactSortOrder> getListList();
    }

    public interface ContactSortOrderOrBuilder extends MessageLiteOrBuilder {
        long getContactId();

        int getSortKey();
    }

    public static final class ContactSyncBlockNum extends GeneratedMessageLite<ContactSyncBlockNum, Builder> implements ContactSyncBlockNumOrBuilder {
        private static final ContactSyncBlockNum DEFAULT_INSTANCE;
        public static final int E164_NUMBER_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int ORIGINAL_NUMBER_FIELD_NUMBER = 3;
        private static volatile Parser<ContactSyncBlockNum> PARSER = null;
        public static final int SYNC_STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private StringValue e164Number_;
        private long id_;
        private StringValue originalNumber_;
        private int syncStatus_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncBlockNum, Builder> implements ContactSyncBlockNumOrBuilder {
            public Builder clearE164Number() {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).clearE164Number();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).clearId();
                return this;
            }

            public Builder clearOriginalNumber() {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).clearOriginalNumber();
                return this;
            }

            public Builder clearSyncStatus() {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).clearSyncStatus();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
            public StringValue getE164Number() {
                return ((ContactSyncBlockNum) this.instance).getE164Number();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
            public long getId() {
                return ((ContactSyncBlockNum) this.instance).getId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
            public StringValue getOriginalNumber() {
                return ((ContactSyncBlockNum) this.instance).getOriginalNumber();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
            public ContactSyncStatus getSyncStatus() {
                return ((ContactSyncBlockNum) this.instance).getSyncStatus();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
            public int getSyncStatusValue() {
                return ((ContactSyncBlockNum) this.instance).getSyncStatusValue();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
            public boolean hasE164Number() {
                return ((ContactSyncBlockNum) this.instance).hasE164Number();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
            public boolean hasOriginalNumber() {
                return ((ContactSyncBlockNum) this.instance).hasOriginalNumber();
            }

            public Builder mergeE164Number(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).mergeE164Number(stringValue);
                return this;
            }

            public Builder mergeOriginalNumber(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).mergeOriginalNumber(stringValue);
                return this;
            }

            public Builder setE164Number(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).setE164Number(stringValue);
                return this;
            }

            public Builder setId(long j2) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).setId(j2);
                return this;
            }

            public Builder setOriginalNumber(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).setOriginalNumber(stringValue);
                return this;
            }

            public Builder setSyncStatus(ContactSyncStatus contactSyncStatus) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).setSyncStatus(contactSyncStatus);
                return this;
            }

            public Builder setSyncStatusValue(int i) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).setSyncStatusValue(i);
                return this;
            }

            private Builder() {
                super(ContactSyncBlockNum.DEFAULT_INSTANCE);
            }

            public Builder setE164Number(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).setE164Number(builder.build());
                return this;
            }

            public Builder setOriginalNumber(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncBlockNum) this.instance).setOriginalNumber(builder.build());
                return this;
            }
        }

        static {
            ContactSyncBlockNum contactSyncBlockNum = new ContactSyncBlockNum();
            DEFAULT_INSTANCE = contactSyncBlockNum;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncBlockNum.class, contactSyncBlockNum);
        }

        private ContactSyncBlockNum() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearE164Number() {
            this.e164Number_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOriginalNumber() {
            this.originalNumber_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncStatus() {
            this.syncStatus_ = 0;
        }

        public static ContactSyncBlockNum getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeE164Number(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.e164Number_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.e164Number_ = stringValue;
            } else {
                this.e164Number_ = StringValue.newBuilder(this.e164Number_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOriginalNumber(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.originalNumber_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.originalNumber_ = stringValue;
            } else {
                this.originalNumber_ = StringValue.newBuilder(this.originalNumber_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncBlockNum parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncBlockNum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncBlockNum> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setE164Number(StringValue stringValue) {
            stringValue.getClass();
            this.e164Number_ = stringValue;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j2) {
            this.id_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginalNumber(StringValue stringValue) {
            stringValue.getClass();
            this.originalNumber_ = stringValue;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncStatus(ContactSyncStatus contactSyncStatus) {
            this.syncStatus_ = contactSyncStatus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncStatusValue(int i) {
            this.syncStatus_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSyncBlockNum();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "syncStatus_", "id_", "originalNumber_", "e164Number_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncBlockNum> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncBlockNum.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
        public StringValue getE164Number() {
            StringValue stringValue = this.e164Number_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
        public StringValue getOriginalNumber() {
            StringValue stringValue = this.originalNumber_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
        public ContactSyncStatus getSyncStatus() {
            ContactSyncStatus contactSyncStatusForNumber = ContactSyncStatus.forNumber(this.syncStatus_);
            return contactSyncStatusForNumber == null ? ContactSyncStatus.UNRECOGNIZED : contactSyncStatusForNumber;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
        public int getSyncStatusValue() {
            return this.syncStatus_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
        public boolean hasE164Number() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumOrBuilder
        public boolean hasOriginalNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ContactSyncBlockNum contactSyncBlockNum) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncBlockNum);
        }

        public static ContactSyncBlockNum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncBlockNum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncBlockNum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContactSyncBlockNum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncBlockNum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncBlockNum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncBlockNum parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncBlockNum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncBlockNum parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncBlockNum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncBlockNum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ContactSyncBlockNumList extends GeneratedMessageLite<ContactSyncBlockNumList, Builder> implements ContactSyncBlockNumListOrBuilder {
        public static final int BLOCK_NUM_LIST_FIELD_NUMBER = 2;
        private static final ContactSyncBlockNumList DEFAULT_INSTANCE;
        private static volatile Parser<ContactSyncBlockNumList> PARSER = null;
        public static final int SYNCREASONS_FIELD_NUMBER = 1;
        public static final int SYNCTIME_FIELD_NUMBER = 3;
        private long syncTime_;
        private int syncReasonsMemoizedSerializedSize = -1;
        private Internal.IntList syncReasons_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<ContactSyncBlockNum> blockNumList_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncBlockNumList, Builder> implements ContactSyncBlockNumListOrBuilder {
            public Builder addAllBlockNumList(Iterable<? extends ContactSyncBlockNum> iterable) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).addAllBlockNumList(iterable);
                return this;
            }

            public Builder addAllSyncReasons(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).addAllSyncReasons(iterable);
                return this;
            }

            public Builder addBlockNumList(ContactSyncBlockNum contactSyncBlockNum) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).addBlockNumList(contactSyncBlockNum);
                return this;
            }

            public Builder addSyncReasons(int i) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).addSyncReasons(i);
                return this;
            }

            public Builder clearBlockNumList() {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).clearBlockNumList();
                return this;
            }

            public Builder clearSyncReasons() {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).clearSyncReasons();
                return this;
            }

            public Builder clearSyncTime() {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).clearSyncTime();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
            public ContactSyncBlockNum getBlockNumList(int i) {
                return ((ContactSyncBlockNumList) this.instance).getBlockNumList(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
            public int getBlockNumListCount() {
                return ((ContactSyncBlockNumList) this.instance).getBlockNumListCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
            public List<ContactSyncBlockNum> getBlockNumListList() {
                return Collections.unmodifiableList(((ContactSyncBlockNumList) this.instance).getBlockNumListList());
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
            public int getSyncReasons(int i) {
                return ((ContactSyncBlockNumList) this.instance).getSyncReasons(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
            public int getSyncReasonsCount() {
                return ((ContactSyncBlockNumList) this.instance).getSyncReasonsCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
            public List<Integer> getSyncReasonsList() {
                return Collections.unmodifiableList(((ContactSyncBlockNumList) this.instance).getSyncReasonsList());
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
            public long getSyncTime() {
                return ((ContactSyncBlockNumList) this.instance).getSyncTime();
            }

            public Builder removeBlockNumList(int i) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).removeBlockNumList(i);
                return this;
            }

            public Builder setBlockNumList(int i, ContactSyncBlockNum contactSyncBlockNum) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).setBlockNumList(i, contactSyncBlockNum);
                return this;
            }

            public Builder setSyncReasons(int i, int i2) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).setSyncReasons(i, i2);
                return this;
            }

            public Builder setSyncTime(long j2) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).setSyncTime(j2);
                return this;
            }

            private Builder() {
                super(ContactSyncBlockNumList.DEFAULT_INSTANCE);
            }

            public Builder addBlockNumList(int i, ContactSyncBlockNum contactSyncBlockNum) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).addBlockNumList(i, contactSyncBlockNum);
                return this;
            }

            public Builder setBlockNumList(int i, ContactSyncBlockNum.Builder builder) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).setBlockNumList(i, builder.build());
                return this;
            }

            public Builder addBlockNumList(ContactSyncBlockNum.Builder builder) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).addBlockNumList(builder.build());
                return this;
            }

            public Builder addBlockNumList(int i, ContactSyncBlockNum.Builder builder) {
                copyOnWrite();
                ((ContactSyncBlockNumList) this.instance).addBlockNumList(i, builder.build());
                return this;
            }
        }

        static {
            ContactSyncBlockNumList contactSyncBlockNumList = new ContactSyncBlockNumList();
            DEFAULT_INSTANCE = contactSyncBlockNumList;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncBlockNumList.class, contactSyncBlockNumList);
        }

        private ContactSyncBlockNumList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlockNumList(Iterable<? extends ContactSyncBlockNum> iterable) {
            ensureBlockNumListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.blockNumList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSyncReasons(Iterable<? extends Integer> iterable) {
            ensureSyncReasonsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.syncReasons_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlockNumList(ContactSyncBlockNum contactSyncBlockNum) {
            contactSyncBlockNum.getClass();
            ensureBlockNumListIsMutable();
            this.blockNumList_.add(contactSyncBlockNum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSyncReasons(int i) {
            ensureSyncReasonsIsMutable();
            this.syncReasons_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlockNumList() {
            this.blockNumList_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncReasons() {
            this.syncReasons_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncTime() {
            this.syncTime_ = 0L;
        }

        private void ensureBlockNumListIsMutable() {
            Internal.ProtobufList<ContactSyncBlockNum> protobufList = this.blockNumList_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.blockNumList_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureSyncReasonsIsMutable() {
            Internal.IntList intList = this.syncReasons_;
            if (intList.isModifiable()) {
                return;
            }
            this.syncReasons_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static ContactSyncBlockNumList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncBlockNumList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncBlockNumList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncBlockNumList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBlockNumList(int i) {
            ensureBlockNumListIsMutable();
            this.blockNumList_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockNumList(int i, ContactSyncBlockNum contactSyncBlockNum) {
            contactSyncBlockNum.getClass();
            ensureBlockNumListIsMutable();
            this.blockNumList_.set(i, contactSyncBlockNum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncReasons(int i, int i2) {
            ensureSyncReasonsIsMutable();
            this.syncReasons_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncTime(long j2) {
            this.syncTime_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSyncBlockNumList();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001'\u0002\u001b\u0003\u0002", new Object[]{"syncReasons_", "blockNumList_", ContactSyncBlockNum.class, "syncTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncBlockNumList> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncBlockNumList.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
        public ContactSyncBlockNum getBlockNumList(int i) {
            return this.blockNumList_.get(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
        public int getBlockNumListCount() {
            return this.blockNumList_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
        public List<ContactSyncBlockNum> getBlockNumListList() {
            return this.blockNumList_;
        }

        public ContactSyncBlockNumOrBuilder getBlockNumListOrBuilder(int i) {
            return this.blockNumList_.get(i);
        }

        public List<? extends ContactSyncBlockNumOrBuilder> getBlockNumListOrBuilderList() {
            return this.blockNumList_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
        public int getSyncReasons(int i) {
            return this.syncReasons_.getInt(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
        public int getSyncReasonsCount() {
            return this.syncReasons_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
        public List<Integer> getSyncReasonsList() {
            return this.syncReasons_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncBlockNumListOrBuilder
        public long getSyncTime() {
            return this.syncTime_;
        }

        public static Builder newBuilder(ContactSyncBlockNumList contactSyncBlockNumList) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncBlockNumList);
        }

        public static ContactSyncBlockNumList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncBlockNumList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncBlockNumList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlockNumList(int i, ContactSyncBlockNum contactSyncBlockNum) {
            contactSyncBlockNum.getClass();
            ensureBlockNumListIsMutable();
            this.blockNumList_.add(i, contactSyncBlockNum);
        }

        public static ContactSyncBlockNumList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncBlockNumList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncBlockNumList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncBlockNumList parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncBlockNumList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncBlockNumList parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncBlockNumList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncBlockNumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactSyncBlockNumListOrBuilder extends MessageLiteOrBuilder {
        ContactSyncBlockNum getBlockNumList(int i);

        int getBlockNumListCount();

        List<ContactSyncBlockNum> getBlockNumListList();

        int getSyncReasons(int i);

        int getSyncReasonsCount();

        List<Integer> getSyncReasonsList();

        long getSyncTime();
    }

    public interface ContactSyncBlockNumOrBuilder extends MessageLiteOrBuilder {
        StringValue getE164Number();

        long getId();

        StringValue getOriginalNumber();

        ContactSyncStatus getSyncStatus();

        int getSyncStatusValue();

        boolean hasE164Number();

        boolean hasOriginalNumber();
    }

    public static final class ContactSyncCallLog extends GeneratedMessageLite<ContactSyncCallLog, Builder> implements ContactSyncCallLogOrBuilder {
        public static final int ACCOUNTID_FIELD_NUMBER = 10;
        public static final int DATE_FIELD_NUMBER = 5;
        private static final ContactSyncCallLog DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 6;
        public static final int HEY_TAP_SUB_ID_FIELD_NUMBER = 11;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int ISNEW_FIELD_NUMBER = 8;
        public static final int LASTMODIFIED_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 9;
        public static final int NUMBER_FIELD_NUMBER = 4;
        private static volatile Parser<ContactSyncCallLog> PARSER = null;
        public static final int SYNC_STATUS_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 7;
        private StringValue accountId_;
        private int bitField0_;
        private long date_;
        private long duration_;
        private StringValue heyTapSubId_;
        private long id_;
        private int isNew_;
        private long lastModified_;
        private StringValue name_;
        private StringValue number_;
        private int syncStatus_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncCallLog, Builder> implements ContactSyncCallLogOrBuilder {
            public Builder clearAccountId() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearAccountId();
                return this;
            }

            public Builder clearDate() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearDate();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearDuration();
                return this;
            }

            public Builder clearHeyTapSubId() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearHeyTapSubId();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearId();
                return this;
            }

            public Builder clearIsNew() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearIsNew();
                return this;
            }

            public Builder clearLastModified() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearLastModified();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearNumber();
                return this;
            }

            public Builder clearSyncStatus() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearSyncStatus();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).clearType();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public StringValue getAccountId() {
                return ((ContactSyncCallLog) this.instance).getAccountId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public long getDate() {
                return ((ContactSyncCallLog) this.instance).getDate();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public long getDuration() {
                return ((ContactSyncCallLog) this.instance).getDuration();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public StringValue getHeyTapSubId() {
                return ((ContactSyncCallLog) this.instance).getHeyTapSubId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public long getId() {
                return ((ContactSyncCallLog) this.instance).getId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public int getIsNew() {
                return ((ContactSyncCallLog) this.instance).getIsNew();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public long getLastModified() {
                return ((ContactSyncCallLog) this.instance).getLastModified();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public StringValue getName() {
                return ((ContactSyncCallLog) this.instance).getName();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public StringValue getNumber() {
                return ((ContactSyncCallLog) this.instance).getNumber();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public ContactSyncStatus getSyncStatus() {
                return ((ContactSyncCallLog) this.instance).getSyncStatus();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public int getSyncStatusValue() {
                return ((ContactSyncCallLog) this.instance).getSyncStatusValue();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public int getType() {
                return ((ContactSyncCallLog) this.instance).getType();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public boolean hasAccountId() {
                return ((ContactSyncCallLog) this.instance).hasAccountId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public boolean hasHeyTapSubId() {
                return ((ContactSyncCallLog) this.instance).hasHeyTapSubId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public boolean hasName() {
                return ((ContactSyncCallLog) this.instance).hasName();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
            public boolean hasNumber() {
                return ((ContactSyncCallLog) this.instance).hasNumber();
            }

            public Builder mergeAccountId(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).mergeAccountId(stringValue);
                return this;
            }

            public Builder mergeHeyTapSubId(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).mergeHeyTapSubId(stringValue);
                return this;
            }

            public Builder mergeName(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).mergeName(stringValue);
                return this;
            }

            public Builder mergeNumber(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).mergeNumber(stringValue);
                return this;
            }

            public Builder setAccountId(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setAccountId(stringValue);
                return this;
            }

            public Builder setDate(long j2) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setDate(j2);
                return this;
            }

            public Builder setDuration(long j2) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setDuration(j2);
                return this;
            }

            public Builder setHeyTapSubId(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setHeyTapSubId(stringValue);
                return this;
            }

            public Builder setId(long j2) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setId(j2);
                return this;
            }

            public Builder setIsNew(int i) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setIsNew(i);
                return this;
            }

            public Builder setLastModified(long j2) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setLastModified(j2);
                return this;
            }

            public Builder setName(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setName(stringValue);
                return this;
            }

            public Builder setNumber(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setNumber(stringValue);
                return this;
            }

            public Builder setSyncStatus(ContactSyncStatus contactSyncStatus) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setSyncStatus(contactSyncStatus);
                return this;
            }

            public Builder setSyncStatusValue(int i) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setSyncStatusValue(i);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(ContactSyncCallLog.DEFAULT_INSTANCE);
            }

            public Builder setAccountId(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setAccountId(builder.build());
                return this;
            }

            public Builder setHeyTapSubId(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setHeyTapSubId(builder.build());
                return this;
            }

            public Builder setName(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setName(builder.build());
                return this;
            }

            public Builder setNumber(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncCallLog) this.instance).setNumber(builder.build());
                return this;
            }
        }

        static {
            ContactSyncCallLog contactSyncCallLog = new ContactSyncCallLog();
            DEFAULT_INSTANCE = contactSyncCallLog;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncCallLog.class, contactSyncCallLog);
        }

        private ContactSyncCallLog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccountId() {
            this.accountId_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDate() {
            this.date_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeyTapSubId() {
            this.heyTapSubId_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsNew() {
            this.isNew_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastModified() {
            this.lastModified_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.number_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncStatus() {
            this.syncStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static ContactSyncCallLog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAccountId(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.accountId_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.accountId_ = stringValue;
            } else {
                this.accountId_ = StringValue.newBuilder(this.accountId_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeyTapSubId(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.heyTapSubId_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.heyTapSubId_ = stringValue;
            } else {
                this.heyTapSubId_ = StringValue.newBuilder(this.heyTapSubId_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeName(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.name_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.name_ = stringValue;
            } else {
                this.name_ = StringValue.newBuilder(this.name_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNumber(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.number_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.number_ = stringValue;
            } else {
                this.number_ = StringValue.newBuilder(this.number_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncCallLog parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncCallLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncCallLog> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccountId(StringValue stringValue) {
            stringValue.getClass();
            this.accountId_ = stringValue;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDate(long j2) {
            this.date_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(long j2) {
            this.duration_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeyTapSubId(StringValue stringValue) {
            stringValue.getClass();
            this.heyTapSubId_ = stringValue;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j2) {
            this.id_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsNew(int i) {
            this.isNew_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastModified(long j2) {
            this.lastModified_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(StringValue stringValue) {
            stringValue.getClass();
            this.name_ = stringValue;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(StringValue stringValue) {
            stringValue.getClass();
            this.number_ = stringValue;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncStatus(ContactSyncStatus contactSyncStatus) {
            this.syncStatus_ = contactSyncStatus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncStatusValue(int i) {
            this.syncStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSyncCallLog();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002\u0004ဉ\u0000\u0005\u0002\u0006\u0002\u0007\u0004\b\u0004\tဉ\u0001\nဉ\u0002\u000bဉ\u0003", new Object[]{"bitField0_", "syncStatus_", "id_", "lastModified_", "number_", "date_", "duration_", "type_", "isNew_", "name_", "accountId_", "heyTapSubId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncCallLog> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncCallLog.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public StringValue getAccountId() {
            StringValue stringValue = this.accountId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public long getDate() {
            return this.date_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public long getDuration() {
            return this.duration_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public StringValue getHeyTapSubId() {
            StringValue stringValue = this.heyTapSubId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public int getIsNew() {
            return this.isNew_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public long getLastModified() {
            return this.lastModified_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public StringValue getName() {
            StringValue stringValue = this.name_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public StringValue getNumber() {
            StringValue stringValue = this.number_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public ContactSyncStatus getSyncStatus() {
            ContactSyncStatus contactSyncStatusForNumber = ContactSyncStatus.forNumber(this.syncStatus_);
            return contactSyncStatusForNumber == null ? ContactSyncStatus.UNRECOGNIZED : contactSyncStatusForNumber;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public int getSyncStatusValue() {
            return this.syncStatus_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public boolean hasAccountId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public boolean hasHeyTapSubId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ContactSyncCallLog contactSyncCallLog) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncCallLog);
        }

        public static ContactSyncCallLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncCallLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncCallLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContactSyncCallLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncCallLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncCallLog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncCallLog parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncCallLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncCallLog parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncCallLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCallLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ContactSyncCallLogList extends GeneratedMessageLite<ContactSyncCallLogList, Builder> implements ContactSyncCallLogListOrBuilder {
        public static final int CALL_LOG_LIST_FIELD_NUMBER = 2;
        private static final ContactSyncCallLogList DEFAULT_INSTANCE;
        private static volatile Parser<ContactSyncCallLogList> PARSER = null;
        public static final int SYNCREASONS_FIELD_NUMBER = 1;
        public static final int SYNCTIME_FIELD_NUMBER = 3;
        private long syncTime_;
        private int syncReasonsMemoizedSerializedSize = -1;
        private Internal.IntList syncReasons_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<ContactSyncCallLog> callLogList_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncCallLogList, Builder> implements ContactSyncCallLogListOrBuilder {
            public Builder addAllCallLogList(Iterable<? extends ContactSyncCallLog> iterable) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).addAllCallLogList(iterable);
                return this;
            }

            public Builder addAllSyncReasons(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).addAllSyncReasons(iterable);
                return this;
            }

            public Builder addCallLogList(ContactSyncCallLog contactSyncCallLog) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).addCallLogList(contactSyncCallLog);
                return this;
            }

            public Builder addSyncReasons(int i) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).addSyncReasons(i);
                return this;
            }

            public Builder clearCallLogList() {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).clearCallLogList();
                return this;
            }

            public Builder clearSyncReasons() {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).clearSyncReasons();
                return this;
            }

            public Builder clearSyncTime() {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).clearSyncTime();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
            public ContactSyncCallLog getCallLogList(int i) {
                return ((ContactSyncCallLogList) this.instance).getCallLogList(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
            public int getCallLogListCount() {
                return ((ContactSyncCallLogList) this.instance).getCallLogListCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
            public List<ContactSyncCallLog> getCallLogListList() {
                return Collections.unmodifiableList(((ContactSyncCallLogList) this.instance).getCallLogListList());
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
            public int getSyncReasons(int i) {
                return ((ContactSyncCallLogList) this.instance).getSyncReasons(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
            public int getSyncReasonsCount() {
                return ((ContactSyncCallLogList) this.instance).getSyncReasonsCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
            public List<Integer> getSyncReasonsList() {
                return Collections.unmodifiableList(((ContactSyncCallLogList) this.instance).getSyncReasonsList());
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
            public long getSyncTime() {
                return ((ContactSyncCallLogList) this.instance).getSyncTime();
            }

            public Builder removeCallLogList(int i) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).removeCallLogList(i);
                return this;
            }

            public Builder setCallLogList(int i, ContactSyncCallLog contactSyncCallLog) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).setCallLogList(i, contactSyncCallLog);
                return this;
            }

            public Builder setSyncReasons(int i, int i2) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).setSyncReasons(i, i2);
                return this;
            }

            public Builder setSyncTime(long j2) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).setSyncTime(j2);
                return this;
            }

            private Builder() {
                super(ContactSyncCallLogList.DEFAULT_INSTANCE);
            }

            public Builder addCallLogList(int i, ContactSyncCallLog contactSyncCallLog) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).addCallLogList(i, contactSyncCallLog);
                return this;
            }

            public Builder setCallLogList(int i, ContactSyncCallLog.Builder builder) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).setCallLogList(i, builder.build());
                return this;
            }

            public Builder addCallLogList(ContactSyncCallLog.Builder builder) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).addCallLogList(builder.build());
                return this;
            }

            public Builder addCallLogList(int i, ContactSyncCallLog.Builder builder) {
                copyOnWrite();
                ((ContactSyncCallLogList) this.instance).addCallLogList(i, builder.build());
                return this;
            }
        }

        static {
            ContactSyncCallLogList contactSyncCallLogList = new ContactSyncCallLogList();
            DEFAULT_INSTANCE = contactSyncCallLogList;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncCallLogList.class, contactSyncCallLogList);
        }

        private ContactSyncCallLogList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCallLogList(Iterable<? extends ContactSyncCallLog> iterable) {
            ensureCallLogListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.callLogList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSyncReasons(Iterable<? extends Integer> iterable) {
            ensureSyncReasonsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.syncReasons_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallLogList(ContactSyncCallLog contactSyncCallLog) {
            contactSyncCallLog.getClass();
            ensureCallLogListIsMutable();
            this.callLogList_.add(contactSyncCallLog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSyncReasons(int i) {
            ensureSyncReasonsIsMutable();
            this.syncReasons_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallLogList() {
            this.callLogList_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncReasons() {
            this.syncReasons_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncTime() {
            this.syncTime_ = 0L;
        }

        private void ensureCallLogListIsMutable() {
            Internal.ProtobufList<ContactSyncCallLog> protobufList = this.callLogList_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.callLogList_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureSyncReasonsIsMutable() {
            Internal.IntList intList = this.syncReasons_;
            if (intList.isModifiable()) {
                return;
            }
            this.syncReasons_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static ContactSyncCallLogList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncCallLogList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncCallLogList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncCallLogList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCallLogList(int i) {
            ensureCallLogListIsMutable();
            this.callLogList_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallLogList(int i, ContactSyncCallLog contactSyncCallLog) {
            contactSyncCallLog.getClass();
            ensureCallLogListIsMutable();
            this.callLogList_.set(i, contactSyncCallLog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncReasons(int i, int i2) {
            ensureSyncReasonsIsMutable();
            this.syncReasons_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncTime(long j2) {
            this.syncTime_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSyncCallLogList();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001'\u0002\u001b\u0003\u0002", new Object[]{"syncReasons_", "callLogList_", ContactSyncCallLog.class, "syncTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncCallLogList> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncCallLogList.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
        public ContactSyncCallLog getCallLogList(int i) {
            return this.callLogList_.get(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
        public int getCallLogListCount() {
            return this.callLogList_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
        public List<ContactSyncCallLog> getCallLogListList() {
            return this.callLogList_;
        }

        public ContactSyncCallLogOrBuilder getCallLogListOrBuilder(int i) {
            return this.callLogList_.get(i);
        }

        public List<? extends ContactSyncCallLogOrBuilder> getCallLogListOrBuilderList() {
            return this.callLogList_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
        public int getSyncReasons(int i) {
            return this.syncReasons_.getInt(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
        public int getSyncReasonsCount() {
            return this.syncReasons_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
        public List<Integer> getSyncReasonsList() {
            return this.syncReasons_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCallLogListOrBuilder
        public long getSyncTime() {
            return this.syncTime_;
        }

        public static Builder newBuilder(ContactSyncCallLogList contactSyncCallLogList) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncCallLogList);
        }

        public static ContactSyncCallLogList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncCallLogList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncCallLogList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCallLogList(int i, ContactSyncCallLog contactSyncCallLog) {
            contactSyncCallLog.getClass();
            ensureCallLogListIsMutable();
            this.callLogList_.add(i, contactSyncCallLog);
        }

        public static ContactSyncCallLogList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncCallLogList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncCallLogList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncCallLogList parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncCallLogList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncCallLogList parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncCallLogList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCallLogList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactSyncCallLogListOrBuilder extends MessageLiteOrBuilder {
        ContactSyncCallLog getCallLogList(int i);

        int getCallLogListCount();

        List<ContactSyncCallLog> getCallLogListList();

        int getSyncReasons(int i);

        int getSyncReasonsCount();

        List<Integer> getSyncReasonsList();

        long getSyncTime();
    }

    public interface ContactSyncCallLogOrBuilder extends MessageLiteOrBuilder {
        StringValue getAccountId();

        long getDate();

        long getDuration();

        StringValue getHeyTapSubId();

        long getId();

        int getIsNew();

        long getLastModified();

        StringValue getName();

        StringValue getNumber();

        ContactSyncStatus getSyncStatus();

        int getSyncStatusValue();

        int getType();

        boolean hasAccountId();

        boolean hasHeyTapSubId();

        boolean hasName();

        boolean hasNumber();
    }

    public static final class ContactSyncCheck extends GeneratedMessageLite<ContactSyncCheck, Builder> implements ContactSyncCheckOrBuilder {
        public static final int CHECK_TIME_FIELD_NUMBER = 2;
        public static final int CHECK_TYPE_FIELD_NUMBER = 1;
        private static final ContactSyncCheck DEFAULT_INSTANCE;
        private static volatile Parser<ContactSyncCheck> PARSER;
        private long checkTime_;
        private int checkType_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncCheck, Builder> implements ContactSyncCheckOrBuilder {
            public Builder clearCheckTime() {
                copyOnWrite();
                ((ContactSyncCheck) this.instance).clearCheckTime();
                return this;
            }

            public Builder clearCheckType() {
                copyOnWrite();
                ((ContactSyncCheck) this.instance).clearCheckType();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCheckOrBuilder
            public long getCheckTime() {
                return ((ContactSyncCheck) this.instance).getCheckTime();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCheckOrBuilder
            public ContactSyncCheckType getCheckType() {
                return ((ContactSyncCheck) this.instance).getCheckType();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCheckOrBuilder
            public int getCheckTypeValue() {
                return ((ContactSyncCheck) this.instance).getCheckTypeValue();
            }

            public Builder setCheckTime(long j2) {
                copyOnWrite();
                ((ContactSyncCheck) this.instance).setCheckTime(j2);
                return this;
            }

            public Builder setCheckType(ContactSyncCheckType contactSyncCheckType) {
                copyOnWrite();
                ((ContactSyncCheck) this.instance).setCheckType(contactSyncCheckType);
                return this;
            }

            public Builder setCheckTypeValue(int i) {
                copyOnWrite();
                ((ContactSyncCheck) this.instance).setCheckTypeValue(i);
                return this;
            }

            private Builder() {
                super(ContactSyncCheck.DEFAULT_INSTANCE);
            }
        }

        static {
            ContactSyncCheck contactSyncCheck = new ContactSyncCheck();
            DEFAULT_INSTANCE = contactSyncCheck;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncCheck.class, contactSyncCheck);
        }

        private ContactSyncCheck() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCheckTime() {
            this.checkTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCheckType() {
            this.checkType_ = 0;
        }

        public static ContactSyncCheck getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncCheck parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncCheck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncCheck parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncCheck> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCheckTime(long j2) {
            this.checkTime_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCheckType(ContactSyncCheckType contactSyncCheckType) {
            this.checkType_ = contactSyncCheckType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCheckTypeValue(int i) {
            this.checkType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSyncCheck();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"checkType_", "checkTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncCheck> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncCheck.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCheckOrBuilder
        public long getCheckTime() {
            return this.checkTime_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCheckOrBuilder
        public ContactSyncCheckType getCheckType() {
            ContactSyncCheckType contactSyncCheckTypeForNumber = ContactSyncCheckType.forNumber(this.checkType_);
            return contactSyncCheckTypeForNumber == null ? ContactSyncCheckType.UNRECOGNIZED : contactSyncCheckTypeForNumber;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCheckOrBuilder
        public int getCheckTypeValue() {
            return this.checkType_;
        }

        public static Builder newBuilder(ContactSyncCheck contactSyncCheck) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncCheck);
        }

        public static ContactSyncCheck parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCheck) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncCheck parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncCheck parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContactSyncCheck parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncCheck parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncCheck parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncCheck parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncCheck parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncCheck parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncCheck parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncCheck) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactSyncCheckOrBuilder extends MessageLiteOrBuilder {
        long getCheckTime();

        ContactSyncCheckType getCheckType();

        int getCheckTypeValue();
    }

    public enum ContactSyncCheckType implements Internal.EnumLite {
        CHECK_TYPE_UNDEFINE(0),
        CHECK_TYPE_CONTACT(1),
        CHECK_TYPE_CALL_LOG(2),
        CHECK_TYPE_BLOCK_NUM(3),
        UNRECOGNIZED(-1);

        public static final int CHECK_TYPE_BLOCK_NUM_VALUE = 3;
        public static final int CHECK_TYPE_CALL_LOG_VALUE = 2;
        public static final int CHECK_TYPE_CONTACT_VALUE = 1;
        public static final int CHECK_TYPE_UNDEFINE_VALUE = 0;
        private static final Internal.EnumLiteMap<ContactSyncCheckType> internalValueMap = new Internal.EnumLiteMap<ContactSyncCheckType>() { // from class: com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCheckType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ContactSyncCheckType findValueByNumber(int i) {
                return ContactSyncCheckType.forNumber(i);
            }
        };
        private final int value;

        public static final class ContactSyncCheckTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ContactSyncCheckTypeVerifier();

            private ContactSyncCheckTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ContactSyncCheckType.forNumber(i) != null;
            }
        }

        ContactSyncCheckType(int i) {
            this.value = i;
        }

        public static ContactSyncCheckType forNumber(int i) {
            if (i == 0) {
                return CHECK_TYPE_UNDEFINE;
            }
            if (i == 1) {
                return CHECK_TYPE_CONTACT;
            }
            if (i == 2) {
                return CHECK_TYPE_CALL_LOG;
            }
            if (i != 3) {
                return null;
            }
            return CHECK_TYPE_BLOCK_NUM;
        }

        public static Internal.EnumLiteMap<ContactSyncCheckType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ContactSyncCheckTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ContactSyncCheckType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum ContactSyncCmdId implements Internal.EnumLite {
        CMD_ID_CONTACT_SYNC_UNDEFINE(0),
        CMD_ID_CONTACT_SYNC_CONTACT(1),
        CMD_ID_CONTACT_SYNC_CALL_LOG(2),
        CMD_ID_CONTACT_SYNC_BLOCK_NUM(3),
        CMD_ID_CONTACT_SYNC_CHECK(4),
        CMD_ID_CONTACT_SYNC_CONTACT_RESULT(5),
        CMD_ID_CONTACT_SYNC_CALL_RESULT(6),
        CMD_ID_CONTACT_SYNC_BLOCK_RESULT(7),
        CMD_ID_CONTACT_SORT_CONTACT_RESULT(8),
        CMD_ID_CONTACT_CLEAR_SYNC_RESULT(9),
        CMD_ID_CONTACT_SWITCH_SYNC_MODEL(10),
        CMD_ID_CONTACT_OBTAIN_WATCH_SYNC_MODEL(11),
        CMD_ID_CONTACT_CLEAR_CONTACT(12),
        CMD_ID_CONTACT_SYNC_CONTACT_REQUEST(13),
        UNRECOGNIZED(-1);

        public static final int CMD_ID_CONTACT_CLEAR_CONTACT_VALUE = 12;
        public static final int CMD_ID_CONTACT_CLEAR_SYNC_RESULT_VALUE = 9;
        public static final int CMD_ID_CONTACT_OBTAIN_WATCH_SYNC_MODEL_VALUE = 11;
        public static final int CMD_ID_CONTACT_SORT_CONTACT_RESULT_VALUE = 8;
        public static final int CMD_ID_CONTACT_SWITCH_SYNC_MODEL_VALUE = 10;
        public static final int CMD_ID_CONTACT_SYNC_BLOCK_NUM_VALUE = 3;
        public static final int CMD_ID_CONTACT_SYNC_BLOCK_RESULT_VALUE = 7;
        public static final int CMD_ID_CONTACT_SYNC_CALL_LOG_VALUE = 2;
        public static final int CMD_ID_CONTACT_SYNC_CALL_RESULT_VALUE = 6;
        public static final int CMD_ID_CONTACT_SYNC_CHECK_VALUE = 4;
        public static final int CMD_ID_CONTACT_SYNC_CONTACT_REQUEST_VALUE = 13;
        public static final int CMD_ID_CONTACT_SYNC_CONTACT_RESULT_VALUE = 5;
        public static final int CMD_ID_CONTACT_SYNC_CONTACT_VALUE = 1;
        public static final int CMD_ID_CONTACT_SYNC_UNDEFINE_VALUE = 0;
        private static final Internal.EnumLiteMap<ContactSyncCmdId> internalValueMap = new Internal.EnumLiteMap<ContactSyncCmdId>() { // from class: com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncCmdId.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ContactSyncCmdId findValueByNumber(int i) {
                return ContactSyncCmdId.forNumber(i);
            }
        };
        private final int value;

        public static final class ContactSyncCmdIdVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ContactSyncCmdIdVerifier();

            private ContactSyncCmdIdVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ContactSyncCmdId.forNumber(i) != null;
            }
        }

        ContactSyncCmdId(int i) {
            this.value = i;
        }

        public static ContactSyncCmdId forNumber(int i) {
            switch (i) {
                case 0:
                    return CMD_ID_CONTACT_SYNC_UNDEFINE;
                case 1:
                    return CMD_ID_CONTACT_SYNC_CONTACT;
                case 2:
                    return CMD_ID_CONTACT_SYNC_CALL_LOG;
                case 3:
                    return CMD_ID_CONTACT_SYNC_BLOCK_NUM;
                case 4:
                    return CMD_ID_CONTACT_SYNC_CHECK;
                case 5:
                    return CMD_ID_CONTACT_SYNC_CONTACT_RESULT;
                case 6:
                    return CMD_ID_CONTACT_SYNC_CALL_RESULT;
                case 7:
                    return CMD_ID_CONTACT_SYNC_BLOCK_RESULT;
                case 8:
                    return CMD_ID_CONTACT_SORT_CONTACT_RESULT;
                case 9:
                    return CMD_ID_CONTACT_CLEAR_SYNC_RESULT;
                case 10:
                    return CMD_ID_CONTACT_SWITCH_SYNC_MODEL;
                case 11:
                    return CMD_ID_CONTACT_OBTAIN_WATCH_SYNC_MODEL;
                case 12:
                    return CMD_ID_CONTACT_CLEAR_CONTACT;
                case 13:
                    return CMD_ID_CONTACT_SYNC_CONTACT_REQUEST;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<ContactSyncCmdId> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ContactSyncCmdIdVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ContactSyncCmdId valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ContactSyncContact extends GeneratedMessageLite<ContactSyncContact, Builder> implements ContactSyncContactOrBuilder {
        public static final int CONTACTID_FIELD_NUMBER = 2;
        public static final int CONTACTLASTUPDATEDTIMESTAMP_FIELD_NUMBER = 5;
        public static final int DATA_LIST_FIELD_NUMBER = 6;
        private static final ContactSyncContact DEFAULT_INSTANCE;
        public static final int DISPLAYNAME_FIELD_NUMBER = 4;
        public static final int FORECONTACTID_FIELD_NUMBER = 9;
        public static final int ISVIP_FIELD_NUMBER = 8;
        public static final int NAMERAWCONTACTID_FIELD_NUMBER = 7;
        private static volatile Parser<ContactSyncContact> PARSER = null;
        public static final int SECTIONNAME_FIELD_NUMBER = 10;
        public static final int STARRED_FIELD_NUMBER = 3;
        public static final int SYNC_STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private long contactId_;
        private long contactLastUpdatedTimestamp_;
        private Internal.ProtobufList<ContactSyncContactData> dataList_ = GeneratedMessageLite.emptyProtobufList();
        private StringValue displayName_;
        private long foreContactId_;
        private boolean isVip_;
        private long nameRawContactId_;
        private StringValue sectionName_;
        private int starred_;
        private int syncStatus_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncContact, Builder> implements ContactSyncContactOrBuilder {
            public Builder addAllDataList(Iterable<? extends ContactSyncContactData> iterable) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).addAllDataList(iterable);
                return this;
            }

            public Builder addDataList(ContactSyncContactData contactSyncContactData) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).addDataList(contactSyncContactData);
                return this;
            }

            public Builder clearContactId() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearContactId();
                return this;
            }

            public Builder clearContactLastUpdatedTimestamp() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearContactLastUpdatedTimestamp();
                return this;
            }

            public Builder clearDataList() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearDataList();
                return this;
            }

            public Builder clearDisplayName() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearDisplayName();
                return this;
            }

            public Builder clearForeContactId() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearForeContactId();
                return this;
            }

            public Builder clearIsVip() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearIsVip();
                return this;
            }

            public Builder clearNameRawContactId() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearNameRawContactId();
                return this;
            }

            public Builder clearSectionName() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearSectionName();
                return this;
            }

            public Builder clearStarred() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearStarred();
                return this;
            }

            public Builder clearSyncStatus() {
                copyOnWrite();
                ((ContactSyncContact) this.instance).clearSyncStatus();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public long getContactId() {
                return ((ContactSyncContact) this.instance).getContactId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public long getContactLastUpdatedTimestamp() {
                return ((ContactSyncContact) this.instance).getContactLastUpdatedTimestamp();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public ContactSyncContactData getDataList(int i) {
                return ((ContactSyncContact) this.instance).getDataList(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public int getDataListCount() {
                return ((ContactSyncContact) this.instance).getDataListCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public List<ContactSyncContactData> getDataListList() {
                return Collections.unmodifiableList(((ContactSyncContact) this.instance).getDataListList());
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public StringValue getDisplayName() {
                return ((ContactSyncContact) this.instance).getDisplayName();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public long getForeContactId() {
                return ((ContactSyncContact) this.instance).getForeContactId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public boolean getIsVip() {
                return ((ContactSyncContact) this.instance).getIsVip();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public long getNameRawContactId() {
                return ((ContactSyncContact) this.instance).getNameRawContactId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public StringValue getSectionName() {
                return ((ContactSyncContact) this.instance).getSectionName();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public int getStarred() {
                return ((ContactSyncContact) this.instance).getStarred();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public ContactSyncStatus getSyncStatus() {
                return ((ContactSyncContact) this.instance).getSyncStatus();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public int getSyncStatusValue() {
                return ((ContactSyncContact) this.instance).getSyncStatusValue();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public boolean hasDisplayName() {
                return ((ContactSyncContact) this.instance).hasDisplayName();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
            public boolean hasSectionName() {
                return ((ContactSyncContact) this.instance).hasSectionName();
            }

            public Builder mergeDisplayName(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).mergeDisplayName(stringValue);
                return this;
            }

            public Builder mergeSectionName(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).mergeSectionName(stringValue);
                return this;
            }

            public Builder removeDataList(int i) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).removeDataList(i);
                return this;
            }

            public Builder setContactId(long j2) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setContactId(j2);
                return this;
            }

            public Builder setContactLastUpdatedTimestamp(long j2) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setContactLastUpdatedTimestamp(j2);
                return this;
            }

            public Builder setDataList(int i, ContactSyncContactData contactSyncContactData) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setDataList(i, contactSyncContactData);
                return this;
            }

            public Builder setDisplayName(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setDisplayName(stringValue);
                return this;
            }

            public Builder setForeContactId(long j2) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setForeContactId(j2);
                return this;
            }

            public Builder setIsVip(boolean z) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setIsVip(z);
                return this;
            }

            public Builder setNameRawContactId(long j2) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setNameRawContactId(j2);
                return this;
            }

            public Builder setSectionName(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setSectionName(stringValue);
                return this;
            }

            public Builder setStarred(int i) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setStarred(i);
                return this;
            }

            public Builder setSyncStatus(ContactSyncStatus contactSyncStatus) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setSyncStatus(contactSyncStatus);
                return this;
            }

            public Builder setSyncStatusValue(int i) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setSyncStatusValue(i);
                return this;
            }

            private Builder() {
                super(ContactSyncContact.DEFAULT_INSTANCE);
            }

            public Builder addDataList(int i, ContactSyncContactData contactSyncContactData) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).addDataList(i, contactSyncContactData);
                return this;
            }

            public Builder setDataList(int i, ContactSyncContactData.Builder builder) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setDataList(i, builder.build());
                return this;
            }

            public Builder setDisplayName(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setDisplayName(builder.build());
                return this;
            }

            public Builder setSectionName(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).setSectionName(builder.build());
                return this;
            }

            public Builder addDataList(ContactSyncContactData.Builder builder) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).addDataList(builder.build());
                return this;
            }

            public Builder addDataList(int i, ContactSyncContactData.Builder builder) {
                copyOnWrite();
                ((ContactSyncContact) this.instance).addDataList(i, builder.build());
                return this;
            }
        }

        static {
            ContactSyncContact contactSyncContact = new ContactSyncContact();
            DEFAULT_INSTANCE = contactSyncContact;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncContact.class, contactSyncContact);
        }

        private ContactSyncContact() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDataList(Iterable<? extends ContactSyncContactData> iterable) {
            ensureDataListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(ContactSyncContactData contactSyncContactData) {
            contactSyncContactData.getClass();
            ensureDataListIsMutable();
            this.dataList_.add(contactSyncContactData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContactId() {
            this.contactId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContactLastUpdatedTimestamp() {
            this.contactLastUpdatedTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataList() {
            this.dataList_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplayName() {
            this.displayName_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForeContactId() {
            this.foreContactId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsVip() {
            this.isVip_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNameRawContactId() {
            this.nameRawContactId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSectionName() {
            this.sectionName_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarred() {
            this.starred_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncStatus() {
            this.syncStatus_ = 0;
        }

        private void ensureDataListIsMutable() {
            Internal.ProtobufList<ContactSyncContactData> protobufList = this.dataList_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.dataList_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ContactSyncContact getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDisplayName(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.displayName_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.displayName_ = stringValue;
            } else {
                this.displayName_ = StringValue.newBuilder(this.displayName_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSectionName(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.sectionName_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.sectionName_ = stringValue;
            } else {
                this.sectionName_ = StringValue.newBuilder(this.sectionName_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncContact parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncContact) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncContact parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncContact> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDataList(int i) {
            ensureDataListIsMutable();
            this.dataList_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContactId(long j2) {
            this.contactId_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContactLastUpdatedTimestamp(long j2) {
            this.contactLastUpdatedTimestamp_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, ContactSyncContactData contactSyncContactData) {
            contactSyncContactData.getClass();
            ensureDataListIsMutable();
            this.dataList_.set(i, contactSyncContactData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayName(StringValue stringValue) {
            stringValue.getClass();
            this.displayName_ = stringValue;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForeContactId(long j2) {
            this.foreContactId_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsVip(boolean z) {
            this.isVip_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameRawContactId(long j2) {
            this.nameRawContactId_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSectionName(StringValue stringValue) {
            stringValue.getClass();
            this.sectionName_ = stringValue;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarred(int i) {
            this.starred_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncStatus(ContactSyncStatus contactSyncStatus) {
            this.syncStatus_ = contactSyncStatus.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncStatusValue(int i) {
            this.syncStatus_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSyncContact();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\f\u0002\u0002\u0003\u0004\u0004ဉ\u0000\u0005\u0002\u0006\u001b\u0007\u0002\b\u0007\t\u0002\nဉ\u0001", new Object[]{"bitField0_", "syncStatus_", "contactId_", "starred_", "displayName_", "contactLastUpdatedTimestamp_", "dataList_", ContactSyncContactData.class, "nameRawContactId_", "isVip_", "foreContactId_", "sectionName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncContact> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncContact.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public long getContactId() {
            return this.contactId_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public long getContactLastUpdatedTimestamp() {
            return this.contactLastUpdatedTimestamp_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public ContactSyncContactData getDataList(int i) {
            return this.dataList_.get(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public int getDataListCount() {
            return this.dataList_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public List<ContactSyncContactData> getDataListList() {
            return this.dataList_;
        }

        public ContactSyncContactDataOrBuilder getDataListOrBuilder(int i) {
            return this.dataList_.get(i);
        }

        public List<? extends ContactSyncContactDataOrBuilder> getDataListOrBuilderList() {
            return this.dataList_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public StringValue getDisplayName() {
            StringValue stringValue = this.displayName_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public long getForeContactId() {
            return this.foreContactId_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public boolean getIsVip() {
            return this.isVip_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public long getNameRawContactId() {
            return this.nameRawContactId_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public StringValue getSectionName() {
            StringValue stringValue = this.sectionName_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public int getStarred() {
            return this.starred_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public ContactSyncStatus getSyncStatus() {
            ContactSyncStatus contactSyncStatusForNumber = ContactSyncStatus.forNumber(this.syncStatus_);
            return contactSyncStatusForNumber == null ? ContactSyncStatus.UNRECOGNIZED : contactSyncStatusForNumber;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public int getSyncStatusValue() {
            return this.syncStatus_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public boolean hasDisplayName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactOrBuilder
        public boolean hasSectionName() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(ContactSyncContact contactSyncContact) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncContact);
        }

        public static ContactSyncContact parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContact) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncContact parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncContact parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, ContactSyncContactData contactSyncContactData) {
            contactSyncContactData.getClass();
            ensureDataListIsMutable();
            this.dataList_.add(i, contactSyncContactData);
        }

        public static ContactSyncContact parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncContact parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncContact parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncContact parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncContact parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncContact parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncContact parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContact) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ContactSyncContactData extends GeneratedMessageLite<ContactSyncContactData, Builder> implements ContactSyncContactDataOrBuilder {
        public static final int DATA10_FIELD_NUMBER = 12;
        public static final int DATA11_FIELD_NUMBER = 13;
        public static final int DATA12_FIELD_NUMBER = 14;
        public static final int DATA13_FIELD_NUMBER = 15;
        public static final int DATA14_FIELD_NUMBER = 16;
        public static final int DATA1_FIELD_NUMBER = 3;
        public static final int DATA2_FIELD_NUMBER = 4;
        public static final int DATA3_FIELD_NUMBER = 5;
        public static final int DATA4_FIELD_NUMBER = 6;
        public static final int DATA5_FIELD_NUMBER = 7;
        public static final int DATA6_FIELD_NUMBER = 8;
        public static final int DATA7_FIELD_NUMBER = 9;
        public static final int DATA8_FIELD_NUMBER = 10;
        public static final int DATA9_FIELD_NUMBER = 11;
        private static final ContactSyncContactData DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MIMETYPE_FIELD_NUMBER = 2;
        private static volatile Parser<ContactSyncContactData> PARSER;
        private int bitField0_;
        private StringValue data10_;
        private StringValue data11_;
        private StringValue data12_;
        private StringValue data13_;
        private StringValue data14_;
        private StringValue data1_;
        private StringValue data2_;
        private StringValue data3_;
        private StringValue data4_;
        private StringValue data5_;
        private StringValue data6_;
        private StringValue data7_;
        private StringValue data8_;
        private StringValue data9_;
        private long id_;
        private StringValue mimeType_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncContactData, Builder> implements ContactSyncContactDataOrBuilder {
            public Builder clearData1() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData1();
                return this;
            }

            public Builder clearData10() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData10();
                return this;
            }

            public Builder clearData11() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData11();
                return this;
            }

            public Builder clearData12() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData12();
                return this;
            }

            public Builder clearData13() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData13();
                return this;
            }

            public Builder clearData14() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData14();
                return this;
            }

            public Builder clearData2() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData2();
                return this;
            }

            public Builder clearData3() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData3();
                return this;
            }

            public Builder clearData4() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData4();
                return this;
            }

            public Builder clearData5() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData5();
                return this;
            }

            public Builder clearData6() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData6();
                return this;
            }

            public Builder clearData7() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData7();
                return this;
            }

            public Builder clearData8() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData8();
                return this;
            }

            public Builder clearData9() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearData9();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearId();
                return this;
            }

            public Builder clearMimeType() {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).clearMimeType();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData1() {
                return ((ContactSyncContactData) this.instance).getData1();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData10() {
                return ((ContactSyncContactData) this.instance).getData10();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData11() {
                return ((ContactSyncContactData) this.instance).getData11();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData12() {
                return ((ContactSyncContactData) this.instance).getData12();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData13() {
                return ((ContactSyncContactData) this.instance).getData13();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData14() {
                return ((ContactSyncContactData) this.instance).getData14();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData2() {
                return ((ContactSyncContactData) this.instance).getData2();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData3() {
                return ((ContactSyncContactData) this.instance).getData3();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData4() {
                return ((ContactSyncContactData) this.instance).getData4();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData5() {
                return ((ContactSyncContactData) this.instance).getData5();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData6() {
                return ((ContactSyncContactData) this.instance).getData6();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData7() {
                return ((ContactSyncContactData) this.instance).getData7();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData8() {
                return ((ContactSyncContactData) this.instance).getData8();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getData9() {
                return ((ContactSyncContactData) this.instance).getData9();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public long getId() {
                return ((ContactSyncContactData) this.instance).getId();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public StringValue getMimeType() {
                return ((ContactSyncContactData) this.instance).getMimeType();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData1() {
                return ((ContactSyncContactData) this.instance).hasData1();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData10() {
                return ((ContactSyncContactData) this.instance).hasData10();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData11() {
                return ((ContactSyncContactData) this.instance).hasData11();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData12() {
                return ((ContactSyncContactData) this.instance).hasData12();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData13() {
                return ((ContactSyncContactData) this.instance).hasData13();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData14() {
                return ((ContactSyncContactData) this.instance).hasData14();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData2() {
                return ((ContactSyncContactData) this.instance).hasData2();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData3() {
                return ((ContactSyncContactData) this.instance).hasData3();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData4() {
                return ((ContactSyncContactData) this.instance).hasData4();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData5() {
                return ((ContactSyncContactData) this.instance).hasData5();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData6() {
                return ((ContactSyncContactData) this.instance).hasData6();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData7() {
                return ((ContactSyncContactData) this.instance).hasData7();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData8() {
                return ((ContactSyncContactData) this.instance).hasData8();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasData9() {
                return ((ContactSyncContactData) this.instance).hasData9();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
            public boolean hasMimeType() {
                return ((ContactSyncContactData) this.instance).hasMimeType();
            }

            public Builder mergeData1(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData1(stringValue);
                return this;
            }

            public Builder mergeData10(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData10(stringValue);
                return this;
            }

            public Builder mergeData11(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData11(stringValue);
                return this;
            }

            public Builder mergeData12(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData12(stringValue);
                return this;
            }

            public Builder mergeData13(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData13(stringValue);
                return this;
            }

            public Builder mergeData14(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData14(stringValue);
                return this;
            }

            public Builder mergeData2(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData2(stringValue);
                return this;
            }

            public Builder mergeData3(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData3(stringValue);
                return this;
            }

            public Builder mergeData4(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData4(stringValue);
                return this;
            }

            public Builder mergeData5(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData5(stringValue);
                return this;
            }

            public Builder mergeData6(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData6(stringValue);
                return this;
            }

            public Builder mergeData7(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData7(stringValue);
                return this;
            }

            public Builder mergeData8(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData8(stringValue);
                return this;
            }

            public Builder mergeData9(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeData9(stringValue);
                return this;
            }

            public Builder mergeMimeType(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).mergeMimeType(stringValue);
                return this;
            }

            public Builder setData1(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData1(stringValue);
                return this;
            }

            public Builder setData10(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData10(stringValue);
                return this;
            }

            public Builder setData11(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData11(stringValue);
                return this;
            }

            public Builder setData12(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData12(stringValue);
                return this;
            }

            public Builder setData13(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData13(stringValue);
                return this;
            }

            public Builder setData14(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData14(stringValue);
                return this;
            }

            public Builder setData2(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData2(stringValue);
                return this;
            }

            public Builder setData3(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData3(stringValue);
                return this;
            }

            public Builder setData4(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData4(stringValue);
                return this;
            }

            public Builder setData5(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData5(stringValue);
                return this;
            }

            public Builder setData6(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData6(stringValue);
                return this;
            }

            public Builder setData7(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData7(stringValue);
                return this;
            }

            public Builder setData8(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData8(stringValue);
                return this;
            }

            public Builder setData9(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData9(stringValue);
                return this;
            }

            public Builder setId(long j2) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setId(j2);
                return this;
            }

            public Builder setMimeType(StringValue stringValue) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setMimeType(stringValue);
                return this;
            }

            private Builder() {
                super(ContactSyncContactData.DEFAULT_INSTANCE);
            }

            public Builder setData1(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData1(builder.build());
                return this;
            }

            public Builder setData10(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData10(builder.build());
                return this;
            }

            public Builder setData11(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData11(builder.build());
                return this;
            }

            public Builder setData12(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData12(builder.build());
                return this;
            }

            public Builder setData13(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData13(builder.build());
                return this;
            }

            public Builder setData14(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData14(builder.build());
                return this;
            }

            public Builder setData2(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData2(builder.build());
                return this;
            }

            public Builder setData3(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData3(builder.build());
                return this;
            }

            public Builder setData4(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData4(builder.build());
                return this;
            }

            public Builder setData5(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData5(builder.build());
                return this;
            }

            public Builder setData6(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData6(builder.build());
                return this;
            }

            public Builder setData7(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData7(builder.build());
                return this;
            }

            public Builder setData8(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData8(builder.build());
                return this;
            }

            public Builder setData9(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setData9(builder.build());
                return this;
            }

            public Builder setMimeType(StringValue.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactData) this.instance).setMimeType(builder.build());
                return this;
            }
        }

        static {
            ContactSyncContactData contactSyncContactData = new ContactSyncContactData();
            DEFAULT_INSTANCE = contactSyncContactData;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncContactData.class, contactSyncContactData);
        }

        private ContactSyncContactData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData1() {
            this.data1_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData10() {
            this.data10_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData11() {
            this.data11_ = null;
            this.bitField0_ &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData12() {
            this.data12_ = null;
            this.bitField0_ &= -4097;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData13() {
            this.data13_ = null;
            this.bitField0_ &= -8193;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData14() {
            this.data14_ = null;
            this.bitField0_ &= -16385;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData2() {
            this.data2_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData3() {
            this.data3_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData4() {
            this.data4_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData5() {
            this.data5_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData6() {
            this.data6_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData7() {
            this.data7_ = null;
            this.bitField0_ &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData8() {
            this.data8_ = null;
            this.bitField0_ &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData9() {
            this.data9_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMimeType() {
            this.mimeType_ = null;
            this.bitField0_ &= -2;
        }

        public static ContactSyncContactData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData1(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data1_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data1_ = stringValue;
            } else {
                this.data1_ = StringValue.newBuilder(this.data1_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData10(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data10_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data10_ = stringValue;
            } else {
                this.data10_ = StringValue.newBuilder(this.data10_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData11(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data11_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data11_ = stringValue;
            } else {
                this.data11_ = StringValue.newBuilder(this.data11_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData12(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data12_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data12_ = stringValue;
            } else {
                this.data12_ = StringValue.newBuilder(this.data12_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData13(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data13_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data13_ = stringValue;
            } else {
                this.data13_ = StringValue.newBuilder(this.data13_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData14(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data14_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data14_ = stringValue;
            } else {
                this.data14_ = StringValue.newBuilder(this.data14_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData2(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data2_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data2_ = stringValue;
            } else {
                this.data2_ = StringValue.newBuilder(this.data2_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData3(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data3_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data3_ = stringValue;
            } else {
                this.data3_ = StringValue.newBuilder(this.data3_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData4(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data4_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data4_ = stringValue;
            } else {
                this.data4_ = StringValue.newBuilder(this.data4_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData5(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data5_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data5_ = stringValue;
            } else {
                this.data5_ = StringValue.newBuilder(this.data5_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData6(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data6_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data6_ = stringValue;
            } else {
                this.data6_ = StringValue.newBuilder(this.data6_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData7(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data7_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data7_ = stringValue;
            } else {
                this.data7_ = StringValue.newBuilder(this.data7_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData8(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data8_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data8_ = stringValue;
            } else {
                this.data8_ = StringValue.newBuilder(this.data8_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData9(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.data9_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.data9_ = stringValue;
            } else {
                this.data9_ = StringValue.newBuilder(this.data9_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMimeType(StringValue stringValue) {
            stringValue.getClass();
            StringValue stringValue2 = this.mimeType_;
            if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
                this.mimeType_ = stringValue;
            } else {
                this.mimeType_ = StringValue.newBuilder(this.mimeType_).mergeFrom(stringValue).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncContactData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncContactData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncContactData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncContactData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData1(StringValue stringValue) {
            stringValue.getClass();
            this.data1_ = stringValue;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData10(StringValue stringValue) {
            stringValue.getClass();
            this.data10_ = stringValue;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData11(StringValue stringValue) {
            stringValue.getClass();
            this.data11_ = stringValue;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData12(StringValue stringValue) {
            stringValue.getClass();
            this.data12_ = stringValue;
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData13(StringValue stringValue) {
            stringValue.getClass();
            this.data13_ = stringValue;
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData14(StringValue stringValue) {
            stringValue.getClass();
            this.data14_ = stringValue;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData2(StringValue stringValue) {
            stringValue.getClass();
            this.data2_ = stringValue;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData3(StringValue stringValue) {
            stringValue.getClass();
            this.data3_ = stringValue;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData4(StringValue stringValue) {
            stringValue.getClass();
            this.data4_ = stringValue;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData5(StringValue stringValue) {
            stringValue.getClass();
            this.data5_ = stringValue;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData6(StringValue stringValue) {
            stringValue.getClass();
            this.data6_ = stringValue;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData7(StringValue stringValue) {
            stringValue.getClass();
            this.data7_ = stringValue;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData8(StringValue stringValue) {
            stringValue.getClass();
            this.data8_ = stringValue;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData9(StringValue stringValue) {
            stringValue.getClass();
            this.data9_ = stringValue;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j2) {
            this.id_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMimeType(StringValue stringValue) {
            stringValue.getClass();
            this.mimeType_ = stringValue;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ContactSyncContactData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0002\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fဉ\n\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e", new Object[]{"bitField0_", "id_", "mimeType_", "data1_", "data2_", "data3_", "data4_", "data5_", "data6_", "data7_", "data8_", "data9_", "data10_", "data11_", "data12_", "data13_", "data14_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncContactData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncContactData.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData1() {
            StringValue stringValue = this.data1_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData10() {
            StringValue stringValue = this.data10_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData11() {
            StringValue stringValue = this.data11_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData12() {
            StringValue stringValue = this.data12_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData13() {
            StringValue stringValue = this.data13_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData14() {
            StringValue stringValue = this.data14_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData2() {
            StringValue stringValue = this.data2_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData3() {
            StringValue stringValue = this.data3_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData4() {
            StringValue stringValue = this.data4_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData5() {
            StringValue stringValue = this.data5_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData6() {
            StringValue stringValue = this.data6_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData7() {
            StringValue stringValue = this.data7_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData8() {
            StringValue stringValue = this.data8_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getData9() {
            StringValue stringValue = this.data9_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public StringValue getMimeType() {
            StringValue stringValue = this.mimeType_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData1() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData10() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData11() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData12() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData13() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData14() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData2() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData3() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData4() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData5() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData6() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData7() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData8() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasData9() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactDataOrBuilder
        public boolean hasMimeType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ContactSyncContactData contactSyncContactData) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncContactData);
        }

        public static ContactSyncContactData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContactData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncContactData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncContactData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContactSyncContactData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncContactData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncContactData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncContactData parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncContactData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncContactData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncContactData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContactData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactSyncContactDataOrBuilder extends MessageLiteOrBuilder {
        StringValue getData1();

        StringValue getData10();

        StringValue getData11();

        StringValue getData12();

        StringValue getData13();

        StringValue getData14();

        StringValue getData2();

        StringValue getData3();

        StringValue getData4();

        StringValue getData5();

        StringValue getData6();

        StringValue getData7();

        StringValue getData8();

        StringValue getData9();

        long getId();

        StringValue getMimeType();

        boolean hasData1();

        boolean hasData10();

        boolean hasData11();

        boolean hasData12();

        boolean hasData13();

        boolean hasData14();

        boolean hasData2();

        boolean hasData3();

        boolean hasData4();

        boolean hasData5();

        boolean hasData6();

        boolean hasData7();

        boolean hasData8();

        boolean hasData9();

        boolean hasMimeType();
    }

    public static final class ContactSyncContactList extends GeneratedMessageLite<ContactSyncContactList, Builder> implements ContactSyncContactListOrBuilder {
        public static final int CONTACT_LIST_FIELD_NUMBER = 2;
        private static final ContactSyncContactList DEFAULT_INSTANCE;
        private static volatile Parser<ContactSyncContactList> PARSER = null;
        public static final int SYNCREASONS_FIELD_NUMBER = 1;
        public static final int SYNCTIME_FIELD_NUMBER = 3;
        private long syncTime_;
        private int syncReasonsMemoizedSerializedSize = -1;
        private Internal.IntList syncReasons_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<ContactSyncContact> contactList_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncContactList, Builder> implements ContactSyncContactListOrBuilder {
            public Builder addAllContactList(Iterable<? extends ContactSyncContact> iterable) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).addAllContactList(iterable);
                return this;
            }

            public Builder addAllSyncReasons(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).addAllSyncReasons(iterable);
                return this;
            }

            public Builder addContactList(ContactSyncContact contactSyncContact) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).addContactList(contactSyncContact);
                return this;
            }

            public Builder addSyncReasons(int i) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).addSyncReasons(i);
                return this;
            }

            public Builder clearContactList() {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).clearContactList();
                return this;
            }

            public Builder clearSyncReasons() {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).clearSyncReasons();
                return this;
            }

            public Builder clearSyncTime() {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).clearSyncTime();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
            public ContactSyncContact getContactList(int i) {
                return ((ContactSyncContactList) this.instance).getContactList(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
            public int getContactListCount() {
                return ((ContactSyncContactList) this.instance).getContactListCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
            public List<ContactSyncContact> getContactListList() {
                return Collections.unmodifiableList(((ContactSyncContactList) this.instance).getContactListList());
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
            public int getSyncReasons(int i) {
                return ((ContactSyncContactList) this.instance).getSyncReasons(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
            public int getSyncReasonsCount() {
                return ((ContactSyncContactList) this.instance).getSyncReasonsCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
            public List<Integer> getSyncReasonsList() {
                return Collections.unmodifiableList(((ContactSyncContactList) this.instance).getSyncReasonsList());
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
            public long getSyncTime() {
                return ((ContactSyncContactList) this.instance).getSyncTime();
            }

            public Builder removeContactList(int i) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).removeContactList(i);
                return this;
            }

            public Builder setContactList(int i, ContactSyncContact contactSyncContact) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).setContactList(i, contactSyncContact);
                return this;
            }

            public Builder setSyncReasons(int i, int i2) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).setSyncReasons(i, i2);
                return this;
            }

            public Builder setSyncTime(long j2) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).setSyncTime(j2);
                return this;
            }

            private Builder() {
                super(ContactSyncContactList.DEFAULT_INSTANCE);
            }

            public Builder addContactList(int i, ContactSyncContact contactSyncContact) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).addContactList(i, contactSyncContact);
                return this;
            }

            public Builder setContactList(int i, ContactSyncContact.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).setContactList(i, builder.build());
                return this;
            }

            public Builder addContactList(ContactSyncContact.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).addContactList(builder.build());
                return this;
            }

            public Builder addContactList(int i, ContactSyncContact.Builder builder) {
                copyOnWrite();
                ((ContactSyncContactList) this.instance).addContactList(i, builder.build());
                return this;
            }
        }

        static {
            ContactSyncContactList contactSyncContactList = new ContactSyncContactList();
            DEFAULT_INSTANCE = contactSyncContactList;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncContactList.class, contactSyncContactList);
        }

        private ContactSyncContactList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllContactList(Iterable<? extends ContactSyncContact> iterable) {
            ensureContactListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.contactList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSyncReasons(Iterable<? extends Integer> iterable) {
            ensureSyncReasonsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.syncReasons_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContactList(ContactSyncContact contactSyncContact) {
            contactSyncContact.getClass();
            ensureContactListIsMutable();
            this.contactList_.add(contactSyncContact);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSyncReasons(int i) {
            ensureSyncReasonsIsMutable();
            this.syncReasons_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContactList() {
            this.contactList_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncReasons() {
            this.syncReasons_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncTime() {
            this.syncTime_ = 0L;
        }

        private void ensureContactListIsMutable() {
            Internal.ProtobufList<ContactSyncContact> protobufList = this.contactList_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.contactList_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureSyncReasonsIsMutable() {
            Internal.IntList intList = this.syncReasons_;
            if (intList.isModifiable()) {
                return;
            }
            this.syncReasons_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static ContactSyncContactList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncContactList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncContactList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncContactList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncContactList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeContactList(int i) {
            ensureContactListIsMutable();
            this.contactList_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContactList(int i, ContactSyncContact contactSyncContact) {
            contactSyncContact.getClass();
            ensureContactListIsMutable();
            this.contactList_.set(i, contactSyncContact);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncReasons(int i, int i2) {
            ensureSyncReasonsIsMutable();
            this.syncReasons_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncTime(long j2) {
            this.syncTime_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSyncContactList();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001'\u0002\u001b\u0003\u0002", new Object[]{"syncReasons_", "contactList_", ContactSyncContact.class, "syncTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncContactList> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncContactList.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
        public ContactSyncContact getContactList(int i) {
            return this.contactList_.get(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
        public int getContactListCount() {
            return this.contactList_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
        public List<ContactSyncContact> getContactListList() {
            return this.contactList_;
        }

        public ContactSyncContactOrBuilder getContactListOrBuilder(int i) {
            return this.contactList_.get(i);
        }

        public List<? extends ContactSyncContactOrBuilder> getContactListOrBuilderList() {
            return this.contactList_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
        public int getSyncReasons(int i) {
            return this.syncReasons_.getInt(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
        public int getSyncReasonsCount() {
            return this.syncReasons_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
        public List<Integer> getSyncReasonsList() {
            return this.syncReasons_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncContactListOrBuilder
        public long getSyncTime() {
            return this.syncTime_;
        }

        public static Builder newBuilder(ContactSyncContactList contactSyncContactList) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncContactList);
        }

        public static ContactSyncContactList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContactList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncContactList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncContactList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContactList(int i, ContactSyncContact contactSyncContact) {
            contactSyncContact.getClass();
            ensureContactListIsMutable();
            this.contactList_.add(i, contactSyncContact);
        }

        public static ContactSyncContactList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncContactList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncContactList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncContactList parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncContactList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncContactList parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncContactList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncContactList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactSyncContactListOrBuilder extends MessageLiteOrBuilder {
        ContactSyncContact getContactList(int i);

        int getContactListCount();

        List<ContactSyncContact> getContactListList();

        int getSyncReasons(int i);

        int getSyncReasonsCount();

        List<Integer> getSyncReasonsList();

        long getSyncTime();
    }

    public interface ContactSyncContactOrBuilder extends MessageLiteOrBuilder {
        long getContactId();

        long getContactLastUpdatedTimestamp();

        ContactSyncContactData getDataList(int i);

        int getDataListCount();

        List<ContactSyncContactData> getDataListList();

        StringValue getDisplayName();

        long getForeContactId();

        boolean getIsVip();

        long getNameRawContactId();

        StringValue getSectionName();

        int getStarred();

        ContactSyncStatus getSyncStatus();

        int getSyncStatusValue();

        boolean hasDisplayName();

        boolean hasSectionName();
    }

    public enum ContactSyncModel implements Internal.EnumLite {
        MODEL_UNDEFINE(0),
        CONTACTSSOURCE_PHONE(1),
        CONTACTSSOURCE_WATCH(2),
        MODEL_WATCH2PHONE_ING(3),
        MODEL_SWITCH_ING(4),
        UNRECOGNIZED(-1);

        public static final int CONTACTSSOURCE_PHONE_VALUE = 1;
        public static final int CONTACTSSOURCE_WATCH_VALUE = 2;
        public static final int MODEL_SWITCH_ING_VALUE = 4;
        public static final int MODEL_UNDEFINE_VALUE = 0;
        public static final int MODEL_WATCH2PHONE_ING_VALUE = 3;
        private static final Internal.EnumLiteMap<ContactSyncModel> internalValueMap = new Internal.EnumLiteMap<ContactSyncModel>() { // from class: com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncModel.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ContactSyncModel findValueByNumber(int i) {
                return ContactSyncModel.forNumber(i);
            }
        };
        private final int value;

        public static final class ContactSyncModelVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ContactSyncModelVerifier();

            private ContactSyncModelVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ContactSyncModel.forNumber(i) != null;
            }
        }

        ContactSyncModel(int i) {
            this.value = i;
        }

        public static ContactSyncModel forNumber(int i) {
            if (i == 0) {
                return MODEL_UNDEFINE;
            }
            if (i == 1) {
                return CONTACTSSOURCE_PHONE;
            }
            if (i == 2) {
                return CONTACTSSOURCE_WATCH;
            }
            if (i == 3) {
                return MODEL_WATCH2PHONE_ING;
            }
            if (i != 4) {
                return null;
            }
            return MODEL_SWITCH_ING;
        }

        public static Internal.EnumLiteMap<ContactSyncModel> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ContactSyncModelVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ContactSyncModel valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum ContactSyncReason implements Internal.EnumLite {
        SYNC_REASON_UNDEFINE(0),
        SYNC_REASON_PAIR(1),
        SYNC_REASON_CONTENT_CHANGE(2),
        SYNC_REASON_DAILY_CHECK(3),
        SYNC_REASON_USER_MANUAL_CHECK(4),
        SYNC_REASON_DEVICE_SWITCH(5),
        SYNC_REASON_PERM_GRANTED(6),
        SYNC_REASON_DEVICE_RECONNECTED(7),
        SYNC_REASON_COMMONLY_USED_CONTACT(8),
        SYNC_REASON_SWITCH_CONTACT_DISCONNECT(9),
        SYNC_REASON_SWITCH_CONTACT_SYNC_MODEL(10),
        SYNC_REASON_SWITCH_CONTACT_SYNC_MODEL_SYNC_CONTACT(11),
        SYNC_REASON_INIT_SYNC_CONTACT(12),
        SYNC_REASON_FULL_SYNC_CONTACT(13),
        UNRECOGNIZED(-1);

        public static final int SYNC_REASON_COMMONLY_USED_CONTACT_VALUE = 8;
        public static final int SYNC_REASON_CONTENT_CHANGE_VALUE = 2;
        public static final int SYNC_REASON_DAILY_CHECK_VALUE = 3;
        public static final int SYNC_REASON_DEVICE_RECONNECTED_VALUE = 7;
        public static final int SYNC_REASON_DEVICE_SWITCH_VALUE = 5;
        public static final int SYNC_REASON_FULL_SYNC_CONTACT_VALUE = 13;
        public static final int SYNC_REASON_INIT_SYNC_CONTACT_VALUE = 12;
        public static final int SYNC_REASON_PAIR_VALUE = 1;
        public static final int SYNC_REASON_PERM_GRANTED_VALUE = 6;
        public static final int SYNC_REASON_SWITCH_CONTACT_DISCONNECT_VALUE = 9;
        public static final int SYNC_REASON_SWITCH_CONTACT_SYNC_MODEL_SYNC_CONTACT_VALUE = 11;
        public static final int SYNC_REASON_SWITCH_CONTACT_SYNC_MODEL_VALUE = 10;
        public static final int SYNC_REASON_UNDEFINE_VALUE = 0;
        public static final int SYNC_REASON_USER_MANUAL_CHECK_VALUE = 4;
        private static final Internal.EnumLiteMap<ContactSyncReason> internalValueMap = new Internal.EnumLiteMap<ContactSyncReason>() { // from class: com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncReason.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ContactSyncReason findValueByNumber(int i) {
                return ContactSyncReason.forNumber(i);
            }
        };
        private final int value;

        public static final class ContactSyncReasonVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ContactSyncReasonVerifier();

            private ContactSyncReasonVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ContactSyncReason.forNumber(i) != null;
            }
        }

        ContactSyncReason(int i) {
            this.value = i;
        }

        public static ContactSyncReason forNumber(int i) {
            switch (i) {
                case 0:
                    return SYNC_REASON_UNDEFINE;
                case 1:
                    return SYNC_REASON_PAIR;
                case 2:
                    return SYNC_REASON_CONTENT_CHANGE;
                case 3:
                    return SYNC_REASON_DAILY_CHECK;
                case 4:
                    return SYNC_REASON_USER_MANUAL_CHECK;
                case 5:
                    return SYNC_REASON_DEVICE_SWITCH;
                case 6:
                    return SYNC_REASON_PERM_GRANTED;
                case 7:
                    return SYNC_REASON_DEVICE_RECONNECTED;
                case 8:
                    return SYNC_REASON_COMMONLY_USED_CONTACT;
                case 9:
                    return SYNC_REASON_SWITCH_CONTACT_DISCONNECT;
                case 10:
                    return SYNC_REASON_SWITCH_CONTACT_SYNC_MODEL;
                case 11:
                    return SYNC_REASON_SWITCH_CONTACT_SYNC_MODEL_SYNC_CONTACT;
                case 12:
                    return SYNC_REASON_INIT_SYNC_CONTACT;
                case 13:
                    return SYNC_REASON_FULL_SYNC_CONTACT;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<ContactSyncReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ContactSyncReasonVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ContactSyncReason valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ContactSyncResult extends GeneratedMessageLite<ContactSyncResult, Builder> implements ContactSyncResultOrBuilder {
        private static final ContactSyncResult DEFAULT_INSTANCE;
        public static final int FINISH_FIELD_NUMBER = 4;
        private static volatile Parser<ContactSyncResult> PARSER = null;
        public static final int STATUE_FIELD_NUMBER = 2;
        public static final int SYNCREASONS_FIELD_NUMBER = 1;
        public static final int SYNCTIME_FIELD_NUMBER = 3;
        private int finish_;
        private int statue_;
        private int syncReasonsMemoizedSerializedSize = -1;
        private Internal.IntList syncReasons_ = GeneratedMessageLite.emptyIntList();
        private long syncTime_;

        public static final class Builder extends GeneratedMessageLite.Builder<ContactSyncResult, Builder> implements ContactSyncResultOrBuilder {
            public Builder addAllSyncReasons(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((ContactSyncResult) this.instance).addAllSyncReasons(iterable);
                return this;
            }

            public Builder addSyncReasons(int i) {
                copyOnWrite();
                ((ContactSyncResult) this.instance).addSyncReasons(i);
                return this;
            }

            public Builder clearFinish() {
                copyOnWrite();
                ((ContactSyncResult) this.instance).clearFinish();
                return this;
            }

            public Builder clearStatue() {
                copyOnWrite();
                ((ContactSyncResult) this.instance).clearStatue();
                return this;
            }

            public Builder clearSyncReasons() {
                copyOnWrite();
                ((ContactSyncResult) this.instance).clearSyncReasons();
                return this;
            }

            public Builder clearSyncTime() {
                copyOnWrite();
                ((ContactSyncResult) this.instance).clearSyncTime();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
            public int getFinish() {
                return ((ContactSyncResult) this.instance).getFinish();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
            public ContactSyncResultStatue getStatue() {
                return ((ContactSyncResult) this.instance).getStatue();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
            public int getStatueValue() {
                return ((ContactSyncResult) this.instance).getStatueValue();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
            public int getSyncReasons(int i) {
                return ((ContactSyncResult) this.instance).getSyncReasons(i);
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
            public int getSyncReasonsCount() {
                return ((ContactSyncResult) this.instance).getSyncReasonsCount();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
            public List<Integer> getSyncReasonsList() {
                return Collections.unmodifiableList(((ContactSyncResult) this.instance).getSyncReasonsList());
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
            public long getSyncTime() {
                return ((ContactSyncResult) this.instance).getSyncTime();
            }

            public Builder setFinish(int i) {
                copyOnWrite();
                ((ContactSyncResult) this.instance).setFinish(i);
                return this;
            }

            public Builder setStatue(ContactSyncResultStatue contactSyncResultStatue) {
                copyOnWrite();
                ((ContactSyncResult) this.instance).setStatue(contactSyncResultStatue);
                return this;
            }

            public Builder setStatueValue(int i) {
                copyOnWrite();
                ((ContactSyncResult) this.instance).setStatueValue(i);
                return this;
            }

            public Builder setSyncReasons(int i, int i2) {
                copyOnWrite();
                ((ContactSyncResult) this.instance).setSyncReasons(i, i2);
                return this;
            }

            public Builder setSyncTime(long j2) {
                copyOnWrite();
                ((ContactSyncResult) this.instance).setSyncTime(j2);
                return this;
            }

            private Builder() {
                super(ContactSyncResult.DEFAULT_INSTANCE);
            }
        }

        static {
            ContactSyncResult contactSyncResult = new ContactSyncResult();
            DEFAULT_INSTANCE = contactSyncResult;
            GeneratedMessageLite.registerDefaultInstance(ContactSyncResult.class, contactSyncResult);
        }

        private ContactSyncResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSyncReasons(Iterable<? extends Integer> iterable) {
            ensureSyncReasonsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.syncReasons_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSyncReasons(int i) {
            ensureSyncReasonsIsMutable();
            this.syncReasons_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFinish() {
            this.finish_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatue() {
            this.statue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncReasons() {
            this.syncReasons_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyncTime() {
            this.syncTime_ = 0L;
        }

        private void ensureSyncReasonsIsMutable() {
            Internal.IntList intList = this.syncReasons_;
            if (intList.isModifiable()) {
                return;
            }
            this.syncReasons_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static ContactSyncResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContactSyncResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContactSyncResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContactSyncResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFinish(int i) {
            this.finish_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatue(ContactSyncResultStatue contactSyncResultStatue) {
            this.statue_ = contactSyncResultStatue.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatueValue(int i) {
            this.statue_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncReasons(int i, int i2) {
            ensureSyncReasonsIsMutable();
            this.syncReasons_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyncTime(long j2) {
            this.syncTime_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ContactSyncResult();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002\f\u0003\u0002\u0004\u000b", new Object[]{"syncReasons_", "statue_", "syncTime_", "finish_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContactSyncResult> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContactSyncResult.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
        public int getFinish() {
            return this.finish_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
        public ContactSyncResultStatue getStatue() {
            ContactSyncResultStatue contactSyncResultStatueForNumber = ContactSyncResultStatue.forNumber(this.statue_);
            return contactSyncResultStatueForNumber == null ? ContactSyncResultStatue.UNRECOGNIZED : contactSyncResultStatueForNumber;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
        public int getStatueValue() {
            return this.statue_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
        public int getSyncReasons(int i) {
            return this.syncReasons_.getInt(i);
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
        public int getSyncReasonsCount() {
            return this.syncReasons_.size();
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
        public List<Integer> getSyncReasonsList() {
            return this.syncReasons_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultOrBuilder
        public long getSyncTime() {
            return this.syncTime_;
        }

        public static Builder newBuilder(ContactSyncResult contactSyncResult) {
            return DEFAULT_INSTANCE.createBuilder(contactSyncResult);
        }

        public static ContactSyncResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContactSyncResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContactSyncResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContactSyncResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContactSyncResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContactSyncResult parseFrom(InputStream inputStream) throws IOException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContactSyncResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContactSyncResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContactSyncResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContactSyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContactSyncResultOrBuilder extends MessageLiteOrBuilder {
        int getFinish();

        ContactSyncResultStatue getStatue();

        int getStatueValue();

        int getSyncReasons(int i);

        int getSyncReasonsCount();

        List<Integer> getSyncReasonsList();

        long getSyncTime();
    }

    public enum ContactSyncResultStatue implements Internal.EnumLite {
        CONTACT_SYNC_SUCCESS(0),
        CONTACT_SYNC_ERROR(1),
        UNRECOGNIZED(-1);

        public static final int CONTACT_SYNC_ERROR_VALUE = 1;
        public static final int CONTACT_SYNC_SUCCESS_VALUE = 0;
        private static final Internal.EnumLiteMap<ContactSyncResultStatue> internalValueMap = new Internal.EnumLiteMap<ContactSyncResultStatue>() { // from class: com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncResultStatue.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ContactSyncResultStatue findValueByNumber(int i) {
                return ContactSyncResultStatue.forNumber(i);
            }
        };
        private final int value;

        public static final class ContactSyncResultStatueVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ContactSyncResultStatueVerifier();

            private ContactSyncResultStatueVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ContactSyncResultStatue.forNumber(i) != null;
            }
        }

        ContactSyncResultStatue(int i) {
            this.value = i;
        }

        public static ContactSyncResultStatue forNumber(int i) {
            if (i == 0) {
                return CONTACT_SYNC_SUCCESS;
            }
            if (i != 1) {
                return null;
            }
            return CONTACT_SYNC_ERROR;
        }

        public static Internal.EnumLiteMap<ContactSyncResultStatue> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ContactSyncResultStatueVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ContactSyncResultStatue valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum ContactSyncServiceId implements Internal.EnumLite {
        SERVICE_ID_CONTACT_SYNC_UNDEFINE(0),
        SERVICE_ID_CONTACT_SYNC_ADDRESS_BOOK(15),
        UNRECOGNIZED(-1);

        public static final int SERVICE_ID_CONTACT_SYNC_ADDRESS_BOOK_VALUE = 15;
        public static final int SERVICE_ID_CONTACT_SYNC_UNDEFINE_VALUE = 0;
        private static final Internal.EnumLiteMap<ContactSyncServiceId> internalValueMap = new Internal.EnumLiteMap<ContactSyncServiceId>() { // from class: com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncServiceId.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ContactSyncServiceId findValueByNumber(int i) {
                return ContactSyncServiceId.forNumber(i);
            }
        };
        private final int value;

        public static final class ContactSyncServiceIdVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ContactSyncServiceIdVerifier();

            private ContactSyncServiceIdVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ContactSyncServiceId.forNumber(i) != null;
            }
        }

        ContactSyncServiceId(int i) {
            this.value = i;
        }

        public static ContactSyncServiceId forNumber(int i) {
            if (i == 0) {
                return SERVICE_ID_CONTACT_SYNC_UNDEFINE;
            }
            if (i != 15) {
                return null;
            }
            return SERVICE_ID_CONTACT_SYNC_ADDRESS_BOOK;
        }

        public static Internal.EnumLiteMap<ContactSyncServiceId> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ContactSyncServiceIdVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ContactSyncServiceId valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum ContactSyncStatus implements Internal.EnumLite {
        SYNCED(0),
        ADD(1),
        UPDATE(2),
        DELETE(3),
        UNRECOGNIZED(-1);

        public static final int ADD_VALUE = 1;
        public static final int DELETE_VALUE = 3;
        public static final int SYNCED_VALUE = 0;
        public static final int UPDATE_VALUE = 2;
        private static final Internal.EnumLiteMap<ContactSyncStatus> internalValueMap = new Internal.EnumLiteMap<ContactSyncStatus>() { // from class: com.heytap.wearable.dialer.proto.ContactSyncProto.ContactSyncStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ContactSyncStatus findValueByNumber(int i) {
                return ContactSyncStatus.forNumber(i);
            }
        };
        private final int value;

        public static final class ContactSyncStatusVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ContactSyncStatusVerifier();

            private ContactSyncStatusVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ContactSyncStatus.forNumber(i) != null;
            }
        }

        ContactSyncStatus(int i) {
            this.value = i;
        }

        public static ContactSyncStatus forNumber(int i) {
            if (i == 0) {
                return SYNCED;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return UPDATE;
            }
            if (i != 3) {
                return null;
            }
            return DELETE;
        }

        public static Internal.EnumLiteMap<ContactSyncStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ContactSyncStatusVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ContactSyncStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class DataClear extends GeneratedMessageLite<DataClear, Builder> implements DataClearOrBuilder {
        private static final DataClear DEFAULT_INSTANCE;
        private static volatile Parser<DataClear> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<DataClear, Builder> implements DataClearOrBuilder {
            public Builder clearType() {
                copyOnWrite();
                ((DataClear) this.instance).clearType();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.DataClearOrBuilder
            public int getType() {
                return ((DataClear) this.instance).getType();
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((DataClear) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(DataClear.DEFAULT_INSTANCE);
            }
        }

        static {
            DataClear dataClear = new DataClear();
            DEFAULT_INSTANCE = dataClear;
            GeneratedMessageLite.registerDefaultInstance(DataClear.class, dataClear);
        }

        private DataClear() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static DataClear getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DataClear parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DataClear) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataClear parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DataClear> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new DataClear();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DataClear> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DataClear.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.DataClearOrBuilder
        public int getType() {
            return this.type_;
        }

        public static Builder newBuilder(DataClear dataClear) {
            return DEFAULT_INSTANCE.createBuilder(dataClear);
        }

        public static DataClear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataClear) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DataClear parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DataClear parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DataClear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DataClear parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DataClear parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DataClear parseFrom(InputStream inputStream) throws IOException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataClear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DataClear parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DataClear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DataClear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DataClearOrBuilder extends MessageLiteOrBuilder {
        int getType();
    }

    public enum DataClearType implements Internal.EnumLite {
        CLEAR_TYPE_UNDEFINE(0),
        CLEAR_TYPE_CONTACT(1),
        CLEAR_TYPE_CALL_LOG(2),
        CLEAR_TYPE_BLOCK_NUM(3),
        UNRECOGNIZED(-1);

        public static final int CLEAR_TYPE_BLOCK_NUM_VALUE = 3;
        public static final int CLEAR_TYPE_CALL_LOG_VALUE = 2;
        public static final int CLEAR_TYPE_CONTACT_VALUE = 1;
        public static final int CLEAR_TYPE_UNDEFINE_VALUE = 0;
        private static final Internal.EnumLiteMap<DataClearType> internalValueMap = new Internal.EnumLiteMap<DataClearType>() { // from class: com.heytap.wearable.dialer.proto.ContactSyncProto.DataClearType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DataClearType findValueByNumber(int i) {
                return DataClearType.forNumber(i);
            }
        };
        private final int value;

        public static final class DataClearTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new DataClearTypeVerifier();

            private DataClearTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return DataClearType.forNumber(i) != null;
            }
        }

        DataClearType(int i) {
            this.value = i;
        }

        public static DataClearType forNumber(int i) {
            if (i == 0) {
                return CLEAR_TYPE_UNDEFINE;
            }
            if (i == 1) {
                return CLEAR_TYPE_CONTACT;
            }
            if (i == 2) {
                return CLEAR_TYPE_CALL_LOG;
            }
            if (i != 3) {
                return null;
            }
            return CLEAR_TYPE_BLOCK_NUM;
        }

        public static Internal.EnumLiteMap<DataClearType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return DataClearTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DataClearType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SwitchStatus extends GeneratedMessageLite<SwitchStatus, Builder> implements SwitchStatusOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final SwitchStatus DEFAULT_INSTANCE;
        private static volatile Parser<SwitchStatus> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int code_;
        private int status_;

        public static final class Builder extends GeneratedMessageLite.Builder<SwitchStatus, Builder> implements SwitchStatusOrBuilder {
            public Builder clearCode() {
                copyOnWrite();
                ((SwitchStatus) this.instance).clearCode();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((SwitchStatus) this.instance).clearStatus();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.SwitchStatusOrBuilder
            public int getCode() {
                return ((SwitchStatus) this.instance).getCode();
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.SwitchStatusOrBuilder
            public int getStatus() {
                return ((SwitchStatus) this.instance).getStatus();
            }

            public Builder setCode(int i) {
                copyOnWrite();
                ((SwitchStatus) this.instance).setCode(i);
                return this;
            }

            public Builder setStatus(int i) {
                copyOnWrite();
                ((SwitchStatus) this.instance).setStatus(i);
                return this;
            }

            private Builder() {
                super(SwitchStatus.DEFAULT_INSTANCE);
            }
        }

        static {
            SwitchStatus switchStatus = new SwitchStatus();
            DEFAULT_INSTANCE = switchStatus;
            GeneratedMessageLite.registerDefaultInstance(SwitchStatus.class, switchStatus);
        }

        private SwitchStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static SwitchStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SwitchStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SwitchStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SwitchStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i) {
            this.code_ = i;
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
                    return new SwitchStatus();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"status_", "code_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SwitchStatus> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SwitchStatus.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.SwitchStatusOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.SwitchStatusOrBuilder
        public int getStatus() {
            return this.status_;
        }

        public static Builder newBuilder(SwitchStatus switchStatus) {
            return DEFAULT_INSTANCE.createBuilder(switchStatus);
        }

        public static SwitchStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SwitchStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SwitchStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SwitchStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SwitchStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SwitchStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SwitchStatus parseFrom(InputStream inputStream) throws IOException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SwitchStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SwitchStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SwitchStatusOrBuilder extends MessageLiteOrBuilder {
        int getCode();

        int getStatus();
    }

    public static final class WatchStatus extends GeneratedMessageLite<WatchStatus, Builder> implements WatchStatusOrBuilder {
        private static final WatchStatus DEFAULT_INSTANCE;
        private static volatile Parser<WatchStatus> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int status_;

        public static final class Builder extends GeneratedMessageLite.Builder<WatchStatus, Builder> implements WatchStatusOrBuilder {
            public Builder clearStatus() {
                copyOnWrite();
                ((WatchStatus) this.instance).clearStatus();
                return this;
            }

            @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.WatchStatusOrBuilder
            public int getStatus() {
                return ((WatchStatus) this.instance).getStatus();
            }

            public Builder setStatus(int i) {
                copyOnWrite();
                ((WatchStatus) this.instance).setStatus(i);
                return this;
            }

            private Builder() {
                super(WatchStatus.DEFAULT_INSTANCE);
            }
        }

        static {
            WatchStatus watchStatus = new WatchStatus();
            DEFAULT_INSTANCE = watchStatus;
            GeneratedMessageLite.registerDefaultInstance(WatchStatus.class, watchStatus);
        }

        private WatchStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static WatchStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WatchStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WatchStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WatchStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WatchStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
                    return new WatchStatus();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"status_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WatchStatus> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (WatchStatus.class) {
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

        @Override // com.heytap.wearable.dialer.proto.ContactSyncProto.WatchStatusOrBuilder
        public int getStatus() {
            return this.status_;
        }

        public static Builder newBuilder(WatchStatus watchStatus) {
            return DEFAULT_INSTANCE.createBuilder(watchStatus);
        }

        public static WatchStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WatchStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WatchStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WatchStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WatchStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WatchStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WatchStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WatchStatus parseFrom(InputStream inputStream) throws IOException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WatchStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WatchStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WatchStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WatchStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface WatchStatusOrBuilder extends MessageLiteOrBuilder {
        int getStatus();
    }

    private ContactSyncProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
