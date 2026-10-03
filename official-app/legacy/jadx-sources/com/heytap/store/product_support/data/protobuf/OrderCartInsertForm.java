package com.heytap.store.product_support.data.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class OrderCartInsertForm extends Message<OrderCartInsertForm, Builder> {
    public static final String DEFAULT_CARTDRAFTMARK = "";
    public static final String DEFAULT_CARTID = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String cartDraftMark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String cartId;

    @WireField(adapter = "com.homestead.model.protobuf.Meta#ADAPTER", tag = 1)
    public final Meta meta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean value;
    public static final ProtoAdapter<OrderCartInsertForm> ADAPTER = new ProtoAdapter_OrderCartInsertForm();
    public static final Boolean DEFAULT_VALUE = Boolean.FALSE;

    public static final class Builder extends Message.Builder<OrderCartInsertForm, Builder> {
        public String cartDraftMark;
        public String cartId;
        public Meta meta;
        public Boolean value;

        public Builder cartDraftMark(String str) {
            this.cartDraftMark = str;
            return this;
        }

        public Builder cartId(String str) {
            this.cartId = str;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder value(Boolean bool) {
            this.value = bool;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public OrderCartInsertForm build() {
            return new OrderCartInsertForm(this.meta, this.value, this.cartId, this.cartDraftMark, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_OrderCartInsertForm extends ProtoAdapter<OrderCartInsertForm> {
        public ProtoAdapter_OrderCartInsertForm() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) OrderCartInsertForm.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public OrderCartInsertForm decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.meta(Meta.ADAPTER.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.value(ProtoAdapter.BOOL.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.cartId(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                    builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cartDraftMark(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, OrderCartInsertForm orderCartInsertForm) throws IOException {
            Meta meta = orderCartInsertForm.meta;
            if (meta != null) {
                Meta.ADAPTER.encodeWithTag(protoWriter, 1, meta);
            }
            Boolean bool = orderCartInsertForm.value;
            if (bool != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, bool);
            }
            String str = orderCartInsertForm.cartId;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
            }
            String str2 = orderCartInsertForm.cartDraftMark;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str2);
            }
            protoWriter.writeBytes(orderCartInsertForm.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(OrderCartInsertForm orderCartInsertForm) {
            Meta meta = orderCartInsertForm.meta;
            int iEncodedSizeWithTag = meta != null ? Meta.ADAPTER.encodedSizeWithTag(1, meta) : 0;
            Boolean bool = orderCartInsertForm.value;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (bool != null ? ProtoAdapter.BOOL.encodedSizeWithTag(2, bool) : 0);
            String str = orderCartInsertForm.cartId;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str) : 0);
            String str2 = orderCartInsertForm.cartDraftMark;
            return iEncodedSizeWithTag3 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str2) : 0) + orderCartInsertForm.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public OrderCartInsertForm redact(OrderCartInsertForm orderCartInsertForm) {
            Builder builderNewBuilder = orderCartInsertForm.newBuilder();
            Meta meta = builderNewBuilder.meta;
            if (meta != null) {
                builderNewBuilder.meta = Meta.ADAPTER.redact(meta);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public OrderCartInsertForm(Meta meta, Boolean bool, String str, String str2) {
        this(meta, bool, str, str2, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderCartInsertForm)) {
            return false;
        }
        OrderCartInsertForm orderCartInsertForm = (OrderCartInsertForm) obj;
        return getUnknownFields().equals(orderCartInsertForm.getUnknownFields()) && Internal.equals(this.meta, orderCartInsertForm.meta) && Internal.equals(this.value, orderCartInsertForm.value) && Internal.equals(this.cartId, orderCartInsertForm.cartId) && Internal.equals(this.cartDraftMark, orderCartInsertForm.cartDraftMark);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        Meta meta = this.meta;
        int iHashCode2 = (iHashCode + (meta != null ? meta.hashCode() : 0)) * 37;
        Boolean bool = this.value;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.cartId;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cartDraftMark;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.meta != null) {
            sb.append(", meta=");
            sb.append(this.meta);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.cartId != null) {
            sb.append(", cartId=");
            sb.append(this.cartId);
        }
        if (this.cartDraftMark != null) {
            sb.append(", cartDraftMark=");
            sb.append(this.cartDraftMark);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "OrderCartInsertForm{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public OrderCartInsertForm(Meta meta, Boolean bool, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = meta;
        this.value = bool;
        this.cartId = str;
        this.cartDraftMark = str2;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.meta = this.meta;
        builder.value = this.value;
        builder.cartId = this.cartId;
        builder.cartDraftMark = this.cartDraftMark;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
