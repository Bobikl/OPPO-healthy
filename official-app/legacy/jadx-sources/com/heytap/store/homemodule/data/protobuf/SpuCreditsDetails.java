package com.heytap.store.homemodule.data.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class SpuCreditsDetails extends Message<SpuCreditsDetails, Builder> {
    public static final String DEFAULT_CREDITSRATEDESC = "";
    public static final String DEFAULT_CREDITTEXT = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAMEEXTRA = "";
    public static final String DEFAULT_SAVEMONEY = "";
    public static final String DEFAULT_URL = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String creditText;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String creditsRateDesc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long goodsSkuId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long goodsSpuId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String link;

    @WireField(adapter = "com.homestead.model.protobuf.Meta#ADAPTER", tag = 1)
    public final com.heytap.store.homemodule.data.Meta meta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String nameExtra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 4)
    public final Double price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String saveMoney;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String url;
    public static final ProtoAdapter<SpuCreditsDetails> ADAPTER = new ProtoAdapter_SpuCreditsDetails();
    public static final Long DEFAULT_GOODSSKUID = 0L;
    public static final Long DEFAULT_GOODSSPUID = 0L;
    public static final Double DEFAULT_PRICE = Double.valueOf(0.0d);

    public static final class Builder extends Message.Builder<SpuCreditsDetails, Builder> {
        public String creditText;
        public String creditsRateDesc;
        public Long goodsSkuId;
        public Long goodsSpuId;
        public String link;
        public com.heytap.store.homemodule.data.Meta meta;
        public String name;
        public String nameExtra;
        public Double price;
        public String saveMoney;
        public String url;

        public Builder creditText(String str) {
            this.creditText = str;
            return this;
        }

        public Builder creditsRateDesc(String str) {
            this.creditsRateDesc = str;
            return this;
        }

        public Builder goodsSkuId(Long l2) {
            this.goodsSkuId = l2;
            return this;
        }

        public Builder goodsSpuId(Long l2) {
            this.goodsSpuId = l2;
            return this;
        }

        public Builder link(String str) {
            this.link = str;
            return this;
        }

        public Builder meta(com.heytap.store.homemodule.data.Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder nameExtra(String str) {
            this.nameExtra = str;
            return this;
        }

        public Builder price(Double d) {
            this.price = d;
            return this;
        }

        public Builder saveMoney(String str) {
            this.saveMoney = str;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SpuCreditsDetails build() {
            return new SpuCreditsDetails(this.meta, this.goodsSkuId, this.goodsSpuId, this.price, this.name, this.nameExtra, this.url, this.creditsRateDesc, this.saveMoney, this.creditText, this.link, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_SpuCreditsDetails extends ProtoAdapter<SpuCreditsDetails> {
        public ProtoAdapter_SpuCreditsDetails() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) SpuCreditsDetails.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public SpuCreditsDetails decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                switch (iNextTag) {
                    case 1:
                        builder.meta(com.heytap.store.homemodule.data.Meta.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        builder.goodsSkuId(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 3:
                        builder.goodsSpuId(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 4:
                        builder.price(ProtoAdapter.DOUBLE.decode(protoReader));
                        break;
                    case 5:
                        builder.name(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 6:
                        builder.nameExtra(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 7:
                        builder.url(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 8:
                        builder.creditsRateDesc(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 9:
                        builder.saveMoney(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 10:
                        builder.creditText(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 11:
                        builder.link(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                        builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, SpuCreditsDetails spuCreditsDetails) throws IOException {
            com.heytap.store.homemodule.data.Meta meta = spuCreditsDetails.meta;
            if (meta != null) {
                com.heytap.store.homemodule.data.Meta.ADAPTER.encodeWithTag(protoWriter, 1, meta);
            }
            Long l2 = spuCreditsDetails.goodsSkuId;
            if (l2 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, l2);
            }
            Long l3 = spuCreditsDetails.goodsSpuId;
            if (l3 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, l3);
            }
            Double d = spuCreditsDetails.price;
            if (d != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, d);
            }
            String str = spuCreditsDetails.name;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str);
            }
            String str2 = spuCreditsDetails.nameExtra;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str2);
            }
            String str3 = spuCreditsDetails.url;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str3);
            }
            String str4 = spuCreditsDetails.creditsRateDesc;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, str4);
            }
            String str5 = spuCreditsDetails.saveMoney;
            if (str5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, str5);
            }
            String str6 = spuCreditsDetails.creditText;
            if (str6 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, str6);
            }
            String str7 = spuCreditsDetails.link;
            if (str7 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, str7);
            }
            protoWriter.writeBytes(spuCreditsDetails.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(SpuCreditsDetails spuCreditsDetails) {
            com.heytap.store.homemodule.data.Meta meta = spuCreditsDetails.meta;
            int iEncodedSizeWithTag = meta != null ? com.heytap.store.homemodule.data.Meta.ADAPTER.encodedSizeWithTag(1, meta) : 0;
            Long l2 = spuCreditsDetails.goodsSkuId;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (l2 != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, l2) : 0);
            Long l3 = spuCreditsDetails.goodsSpuId;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (l3 != null ? ProtoAdapter.INT64.encodedSizeWithTag(3, l3) : 0);
            Double d = spuCreditsDetails.price;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (d != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(4, d) : 0);
            String str = spuCreditsDetails.name;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str) : 0);
            String str2 = spuCreditsDetails.nameExtra;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str2) : 0);
            String str3 = spuCreditsDetails.url;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str3) : 0);
            String str4 = spuCreditsDetails.creditsRateDesc;
            int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, str4) : 0);
            String str5 = spuCreditsDetails.saveMoney;
            int iEncodedSizeWithTag9 = iEncodedSizeWithTag8 + (str5 != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, str5) : 0);
            String str6 = spuCreditsDetails.creditText;
            int iEncodedSizeWithTag10 = iEncodedSizeWithTag9 + (str6 != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, str6) : 0);
            String str7 = spuCreditsDetails.link;
            return iEncodedSizeWithTag10 + (str7 != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, str7) : 0) + spuCreditsDetails.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public SpuCreditsDetails redact(SpuCreditsDetails spuCreditsDetails) {
            Builder builderNewBuilder = spuCreditsDetails.newBuilder();
            com.heytap.store.homemodule.data.Meta meta = builderNewBuilder.meta;
            if (meta != null) {
                builderNewBuilder.meta = com.heytap.store.homemodule.data.Meta.ADAPTER.redact(meta);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public SpuCreditsDetails(com.heytap.store.homemodule.data.Meta meta, Long l2, Long l3, Double d, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(meta, l2, l3, d, str, str2, str3, str4, str5, str6, str7, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpuCreditsDetails)) {
            return false;
        }
        SpuCreditsDetails spuCreditsDetails = (SpuCreditsDetails) obj;
        return getUnknownFields().equals(spuCreditsDetails.getUnknownFields()) && Internal.equals(this.meta, spuCreditsDetails.meta) && Internal.equals(this.goodsSkuId, spuCreditsDetails.goodsSkuId) && Internal.equals(this.goodsSpuId, spuCreditsDetails.goodsSpuId) && Internal.equals(this.price, spuCreditsDetails.price) && Internal.equals(this.name, spuCreditsDetails.name) && Internal.equals(this.nameExtra, spuCreditsDetails.nameExtra) && Internal.equals(this.url, spuCreditsDetails.url) && Internal.equals(this.creditsRateDesc, spuCreditsDetails.creditsRateDesc) && Internal.equals(this.saveMoney, spuCreditsDetails.saveMoney) && Internal.equals(this.creditText, spuCreditsDetails.creditText) && Internal.equals(this.link, spuCreditsDetails.link);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        com.heytap.store.homemodule.data.Meta meta = this.meta;
        int iHashCode2 = (iHashCode + (meta != null ? meta.hashCode() : 0)) * 37;
        Long l2 = this.goodsSkuId;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.goodsSpuId;
        int iHashCode4 = (iHashCode3 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Double d = this.price;
        int iHashCode5 = (iHashCode4 + (d != null ? d.hashCode() : 0)) * 37;
        String str = this.name;
        int iHashCode6 = (iHashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.nameExtra;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.url;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.creditsRateDesc;
        int iHashCode9 = (iHashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.saveMoney;
        int iHashCode10 = (iHashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.creditText;
        int iHashCode11 = (iHashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.link;
        int iHashCode12 = iHashCode11 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.meta != null) {
            sb.append(", meta=");
            sb.append(this.meta);
        }
        if (this.goodsSkuId != null) {
            sb.append(", goodsSkuId=");
            sb.append(this.goodsSkuId);
        }
        if (this.goodsSpuId != null) {
            sb.append(", goodsSpuId=");
            sb.append(this.goodsSpuId);
        }
        if (this.price != null) {
            sb.append(", price=");
            sb.append(this.price);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.nameExtra != null) {
            sb.append(", nameExtra=");
            sb.append(this.nameExtra);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.creditsRateDesc != null) {
            sb.append(", creditsRateDesc=");
            sb.append(this.creditsRateDesc);
        }
        if (this.saveMoney != null) {
            sb.append(", saveMoney=");
            sb.append(this.saveMoney);
        }
        if (this.creditText != null) {
            sb.append(", creditText=");
            sb.append(this.creditText);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "SpuCreditsDetails{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public SpuCreditsDetails(com.heytap.store.homemodule.data.Meta meta, Long l2, Long l3, Double d, String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = meta;
        this.goodsSkuId = l2;
        this.goodsSpuId = l3;
        this.price = d;
        this.name = str;
        this.nameExtra = str2;
        this.url = str3;
        this.creditsRateDesc = str4;
        this.saveMoney = str5;
        this.creditText = str6;
        this.link = str7;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.meta = this.meta;
        builder.goodsSkuId = this.goodsSkuId;
        builder.goodsSpuId = this.goodsSpuId;
        builder.price = this.price;
        builder.name = this.name;
        builder.nameExtra = this.nameExtra;
        builder.url = this.url;
        builder.creditsRateDesc = this.creditsRateDesc;
        builder.saveMoney = this.saveMoney;
        builder.creditText = this.creditText;
        builder.link = this.link;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
