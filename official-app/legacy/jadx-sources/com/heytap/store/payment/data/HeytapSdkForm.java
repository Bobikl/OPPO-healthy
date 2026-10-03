package com.heytap.store.payment.data;

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
public final class HeytapSdkForm extends Message<HeytapSdkForm, Builder> {
    public static final ProtoAdapter<HeytapSdkForm> ADAPTER = new ProtoAdapter_HeytapSdkForm();
    public static final String DEFAULT_APPID = "";
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_MCHID = "";
    public static final String DEFAULT_NONCE = "";
    public static final String DEFAULT_PREPAYID = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_TIMESTAMP = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String appId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String ext;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String mchId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String nonce;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String prePayId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String sign;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String timestamp;

    public static final class Builder extends Message.Builder<HeytapSdkForm, Builder> {
        public String appId;
        public String ext;
        public String mchId;
        public String nonce;
        public String prePayId;
        public String sign;
        public String timestamp;

        public Builder appId(String str) {
            this.appId = str;
            return this;
        }

        public Builder ext(String str) {
            this.ext = str;
            return this;
        }

        public Builder mchId(String str) {
            this.mchId = str;
            return this;
        }

        public Builder nonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder prePayId(String str) {
            this.prePayId = str;
            return this;
        }

        public Builder sign(String str) {
            this.sign = str;
            return this;
        }

        public Builder timestamp(String str) {
            this.timestamp = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public HeytapSdkForm build() {
            return new HeytapSdkForm(this.appId, this.mchId, this.prePayId, this.ext, this.nonce, this.timestamp, this.sign, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_HeytapSdkForm extends ProtoAdapter<HeytapSdkForm> {
        public ProtoAdapter_HeytapSdkForm() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) HeytapSdkForm.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public HeytapSdkForm decode(ProtoReader protoReader) throws IOException {
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
                        builder.appId(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 2:
                        builder.mchId(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 3:
                        builder.prePayId(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 4:
                        builder.ext(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 5:
                        builder.nonce(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 6:
                        builder.timestamp(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 7:
                        builder.sign(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.getNextFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, HeytapSdkForm heytapSdkForm) throws IOException {
            String str = heytapSdkForm.appId;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
            }
            String str2 = heytapSdkForm.mchId;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str2);
            }
            String str3 = heytapSdkForm.prePayId;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str3);
            }
            String str4 = heytapSdkForm.ext;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str4);
            }
            String str5 = heytapSdkForm.nonce;
            if (str5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str5);
            }
            String str6 = heytapSdkForm.timestamp;
            if (str6 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str6);
            }
            String str7 = heytapSdkForm.sign;
            if (str7 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str7);
            }
            protoWriter.writeBytes(heytapSdkForm.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(HeytapSdkForm heytapSdkForm) {
            String str = heytapSdkForm.appId;
            int iEncodedSizeWithTag = str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0;
            String str2 = heytapSdkForm.mchId;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, str2) : 0);
            String str3 = heytapSdkForm.prePayId;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str3) : 0);
            String str4 = heytapSdkForm.ext;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str4) : 0);
            String str5 = heytapSdkForm.nonce;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (str5 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str5) : 0);
            String str6 = heytapSdkForm.timestamp;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + (str6 != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str6) : 0);
            String str7 = heytapSdkForm.sign;
            return iEncodedSizeWithTag6 + (str7 != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str7) : 0) + heytapSdkForm.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public HeytapSdkForm redact(HeytapSdkForm heytapSdkForm) {
            Builder builderNewBuilder = heytapSdkForm.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public HeytapSdkForm(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeytapSdkForm)) {
            return false;
        }
        HeytapSdkForm heytapSdkForm = (HeytapSdkForm) obj;
        return getUnknownFields().equals(heytapSdkForm.getUnknownFields()) && Internal.equals(this.appId, heytapSdkForm.appId) && Internal.equals(this.mchId, heytapSdkForm.mchId) && Internal.equals(this.prePayId, heytapSdkForm.prePayId) && Internal.equals(this.ext, heytapSdkForm.ext) && Internal.equals(this.nonce, heytapSdkForm.nonce) && Internal.equals(this.timestamp, heytapSdkForm.timestamp) && Internal.equals(this.sign, heytapSdkForm.sign);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        String str = this.appId;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.mchId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.prePayId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.ext;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.nonce;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.timestamp;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.sign;
        int iHashCode8 = iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.appId != null) {
            sb.append(", appId=");
            sb.append(this.appId);
        }
        if (this.mchId != null) {
            sb.append(", mchId=");
            sb.append(this.mchId);
        }
        if (this.prePayId != null) {
            sb.append(", prePayId=");
            sb.append(this.prePayId);
        }
        if (this.ext != null) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.nonce != null) {
            sb.append(", nonce=");
            sb.append(this.nonce);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        if (this.sign != null) {
            sb.append(", sign=");
            sb.append(this.sign);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "HeytapSdkForm{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public HeytapSdkForm(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.appId = str;
        this.mchId = str2;
        this.prePayId = str3;
        this.ext = str4;
        this.nonce = str5;
        this.timestamp = str6;
        this.sign = str7;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.appId = this.appId;
        builder.mchId = this.mchId;
        builder.prePayId = this.prePayId;
        builder.ext = this.ext;
        builder.nonce = this.nonce;
        builder.timestamp = this.timestamp;
        builder.sign = this.sign;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
