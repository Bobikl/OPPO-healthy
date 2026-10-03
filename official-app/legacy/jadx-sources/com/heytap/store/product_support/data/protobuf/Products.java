package com.heytap.store.product_support.data.protobuf;

import com.oplus.aiunit.vision.hp6;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Products extends Message<Products, Builder> {
    public static final ProtoAdapter<Products> ADAPTER = new ProtoAdapter_Products();
    public static final Integer DEFAULT_FILTER = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.homestead.model.protobuf.ProductDetails#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<ProductDetails> details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer filter;

    @WireField(adapter = "com.homestead.model.protobuf.Meta#ADAPTER", tag = 1)
    public final Meta meta;

    public static final class Builder extends Message.Builder<Products, Builder> {
        public List<ProductDetails> details = Internal.newMutableList();
        public Integer filter;
        public Meta meta;

        public Builder details(List<ProductDetails> list) {
            Internal.checkElementsNotNull(list);
            this.details = list;
            return this;
        }

        public Builder filter(Integer num) {
            this.filter = num;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Products build() {
            return new Products(this.meta, this.details, this.filter, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_Products extends ProtoAdapter<Products> {
        public ProtoAdapter_Products() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Products.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Products decode(ProtoReader protoReader) throws IOException {
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
                    builder.details.add(ProductDetails.ADAPTER.decode(protoReader));
                } else if (iNextTag != 3) {
                    FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                    builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.filter(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Products products) throws IOException {
            Meta meta = products.meta;
            if (meta != null) {
                Meta.ADAPTER.encodeWithTag(protoWriter, 1, meta);
            }
            ProductDetails.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, products.details);
            Integer num = products.filter;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, num);
            }
            protoWriter.writeBytes(products.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Products products) {
            Meta meta = products.meta;
            int iEncodedSizeWithTag = (meta != null ? Meta.ADAPTER.encodedSizeWithTag(1, meta) : 0) + ProductDetails.ADAPTER.asRepeated().encodedSizeWithTag(2, products.details);
            Integer num = products.filter;
            return iEncodedSizeWithTag + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(3, num) : 0) + products.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Products redact(Products products) {
            Builder builderNewBuilder = products.newBuilder();
            Meta meta = builderNewBuilder.meta;
            if (meta != null) {
                builderNewBuilder.meta = Meta.ADAPTER.redact(meta);
            }
            Internal.redactElements(builderNewBuilder.details, ProductDetails.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public Products(Meta meta, List<ProductDetails> list, Integer num) {
        this(meta, list, num, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Products)) {
            return false;
        }
        Products products = (Products) obj;
        return getUnknownFields().equals(products.getUnknownFields()) && Internal.equals(this.meta, products.meta) && this.details.equals(products.details) && Internal.equals(this.filter, products.filter);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        Meta meta = this.meta;
        int iHashCode2 = (((iHashCode + (meta != null ? meta.hashCode() : 0)) * 37) + this.details.hashCode()) * 37;
        Integer num = this.filter;
        int iHashCode3 = iHashCode2 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.meta != null) {
            sb.append(", meta=");
            sb.append(this.meta);
        }
        if (!this.details.isEmpty()) {
            sb.append(", details=");
            sb.append(this.details);
        }
        if (this.filter != null) {
            sb.append(", filter=");
            sb.append(this.filter);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Products{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public Products(Meta meta, List<ProductDetails> list, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = meta;
        this.details = Internal.immutableCopyOf(hp6.DETAIL_ENTRY, list);
        this.filter = num;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.meta = this.meta;
        builder.details = Internal.copyOf(hp6.DETAIL_ENTRY, this.details);
        builder.filter = this.filter;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
