package com.heytap.store.homemodule.data;

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

/* JADX INFO: loaded from: classes5.dex */
public final class IconDetails extends Message<IconDetails, Builder> {
    public static final String DEFAULT_CLICKURL = "";
    public static final String DEFAULT_JSONCLICKURL = "";
    public static final String DEFAULT_JSONURL = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_MODULECODE = "";
    public static final String DEFAULT_REMARK = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long beginAt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String clickUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
    public final Long endAt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public final Integer isLogin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public final String jsonClickUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public final String jsonUrl;

    @WireField(adapter = "com.homestead.model.protobuf.LabelDetails#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<LabelDetails> labelDetailss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 45)
    public final String link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 99)
    public final String moduleCode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String remark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer seq;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public final Integer showName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String url;
    public static final ProtoAdapter<IconDetails> ADAPTER = new ProtoAdapter_IconDetails();
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_SEQ = 0;
    public static final Long DEFAULT_BEGINAT = 0L;
    public static final Long DEFAULT_ENDAT = 0L;
    public static final Integer DEFAULT_ISLOGIN = 0;
    public static final Integer DEFAULT_SHOWNAME = 0;

    public static final class Builder extends Message.Builder<IconDetails, Builder> {
        public Long beginAt;
        public String clickUrl;
        public Long endAt;
        public Long id;
        public Integer isLogin;
        public String jsonClickUrl;
        public String jsonUrl;
        public List<LabelDetails> labelDetailss = Internal.newMutableList();
        public String link;
        public String moduleCode;
        public String remark;
        public Integer seq;
        public Integer showName;
        public String title;
        public String url;

        public Builder beginAt(Long l2) {
            this.beginAt = l2;
            return this;
        }

        public Builder clickUrl(String str) {
            this.clickUrl = str;
            return this;
        }

        public Builder endAt(Long l2) {
            this.endAt = l2;
            return this;
        }

        public Builder id(Long l2) {
            this.id = l2;
            return this;
        }

        public Builder isLogin(Integer num) {
            this.isLogin = num;
            return this;
        }

        public Builder jsonClickUrl(String str) {
            this.jsonClickUrl = str;
            return this;
        }

        public Builder jsonUrl(String str) {
            this.jsonUrl = str;
            return this;
        }

        public Builder labelDetailss(List<LabelDetails> list) {
            Internal.checkElementsNotNull(list);
            this.labelDetailss = list;
            return this;
        }

        public Builder link(String str) {
            this.link = str;
            return this;
        }

        public Builder moduleCode(String str) {
            this.moduleCode = str;
            return this;
        }

        public Builder remark(String str) {
            this.remark = str;
            return this;
        }

        public Builder seq(Integer num) {
            this.seq = num;
            return this;
        }

        public Builder showName(Integer num) {
            this.showName = num;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public IconDetails build() {
            return new IconDetails(this.id, this.title, this.url, this.clickUrl, this.link, this.seq, this.labelDetailss, this.remark, this.beginAt, this.endAt, this.isLogin, this.showName, this.moduleCode, this.jsonUrl, this.jsonClickUrl, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_IconDetails extends ProtoAdapter<IconDetails> {
        public ProtoAdapter_IconDetails() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) IconDetails.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public IconDetails decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 45) {
                    builder.link(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 99) {
                    switch (iNextTag) {
                        case 1:
                            builder.id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.clickUrl(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.seq(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.labelDetailss.add(LabelDetails.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.remark(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.beginAt(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 9:
                            builder.endAt(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 10:
                            builder.isLogin(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            builder.showName(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 12:
                            builder.jsonUrl(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.jsonClickUrl(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                            builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    builder.moduleCode(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, IconDetails iconDetails) throws IOException {
            Long l2 = iconDetails.id;
            if (l2 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, l2);
            }
            String str = iconDetails.title;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
            }
            String str2 = iconDetails.url;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str2);
            }
            String str3 = iconDetails.clickUrl;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str3);
            }
            String str4 = iconDetails.link;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 45, str4);
            }
            Integer num = iconDetails.seq;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, num);
            }
            LabelDetails.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, iconDetails.labelDetailss);
            String str5 = iconDetails.remark;
            if (str5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str5);
            }
            Long l3 = iconDetails.beginAt;
            if (l3 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, l3);
            }
            Long l4 = iconDetails.endAt;
            if (l4 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, l4);
            }
            Integer num2 = iconDetails.isLogin;
            if (num2 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, num2);
            }
            Integer num3 = iconDetails.showName;
            if (num3 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, num3);
            }
            String str6 = iconDetails.moduleCode;
            if (str6 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 99, str6);
            }
            String str7 = iconDetails.jsonUrl;
            if (str7 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, str7);
            }
            String str8 = iconDetails.jsonClickUrl;
            if (str8 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, str8);
            }
            protoWriter.writeBytes(iconDetails.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(IconDetails iconDetails) {
            Long l2 = iconDetails.id;
            int iEncodedSizeWithTag = l2 != null ? ProtoAdapter.INT64.encodedSizeWithTag(1, l2) : 0;
            String str = iconDetails.title;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) : 0);
            String str2 = iconDetails.url;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str2) : 0);
            String str3 = iconDetails.clickUrl;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str3) : 0);
            String str4 = iconDetails.link;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(45, str4) : 0);
            Integer num = iconDetails.seq;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, num) : 0) + LabelDetails.ADAPTER.asRepeated().encodedSizeWithTag(6, iconDetails.labelDetailss);
            String str5 = iconDetails.remark;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + (str5 != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str5) : 0);
            Long l3 = iconDetails.beginAt;
            int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + (l3 != null ? ProtoAdapter.INT64.encodedSizeWithTag(8, l3) : 0);
            Long l4 = iconDetails.endAt;
            int iEncodedSizeWithTag9 = iEncodedSizeWithTag8 + (l4 != null ? ProtoAdapter.INT64.encodedSizeWithTag(9, l4) : 0);
            Integer num2 = iconDetails.isLogin;
            int iEncodedSizeWithTag10 = iEncodedSizeWithTag9 + (num2 != null ? ProtoAdapter.INT32.encodedSizeWithTag(10, num2) : 0);
            Integer num3 = iconDetails.showName;
            int iEncodedSizeWithTag11 = iEncodedSizeWithTag10 + (num3 != null ? ProtoAdapter.INT32.encodedSizeWithTag(11, num3) : 0);
            String str6 = iconDetails.moduleCode;
            int iEncodedSizeWithTag12 = iEncodedSizeWithTag11 + (str6 != null ? ProtoAdapter.STRING.encodedSizeWithTag(99, str6) : 0);
            String str7 = iconDetails.jsonUrl;
            int iEncodedSizeWithTag13 = iEncodedSizeWithTag12 + (str7 != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, str7) : 0);
            String str8 = iconDetails.jsonClickUrl;
            return iEncodedSizeWithTag13 + (str8 != null ? ProtoAdapter.STRING.encodedSizeWithTag(13, str8) : 0) + iconDetails.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public IconDetails redact(IconDetails iconDetails) {
            Builder builderNewBuilder = iconDetails.newBuilder();
            Internal.redactElements(builderNewBuilder.labelDetailss, LabelDetails.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public IconDetails(Long l2, String str, String str2, String str3, String str4, Integer num, List<LabelDetails> list, String str5, Long l3, Long l4, Integer num2, Integer num3, String str6, String str7, String str8) {
        this(l2, str, str2, str3, str4, num, list, str5, l3, l4, num2, num3, str6, str7, str8, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IconDetails)) {
            return false;
        }
        IconDetails iconDetails = (IconDetails) obj;
        return getUnknownFields().equals(iconDetails.getUnknownFields()) && Internal.equals(this.id, iconDetails.id) && Internal.equals(this.title, iconDetails.title) && Internal.equals(this.url, iconDetails.url) && Internal.equals(this.clickUrl, iconDetails.clickUrl) && Internal.equals(this.link, iconDetails.link) && Internal.equals(this.seq, iconDetails.seq) && this.labelDetailss.equals(iconDetails.labelDetailss) && Internal.equals(this.remark, iconDetails.remark) && Internal.equals(this.beginAt, iconDetails.beginAt) && Internal.equals(this.endAt, iconDetails.endAt) && Internal.equals(this.isLogin, iconDetails.isLogin) && Internal.equals(this.showName, iconDetails.showName) && Internal.equals(this.moduleCode, iconDetails.moduleCode) && Internal.equals(this.jsonUrl, iconDetails.jsonUrl) && Internal.equals(this.jsonClickUrl, iconDetails.jsonClickUrl);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        Long l2 = this.id;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 37;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.url;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.clickUrl;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.link;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num = this.seq;
        int iHashCode7 = (((iHashCode6 + (num != null ? num.hashCode() : 0)) * 37) + this.labelDetailss.hashCode()) * 37;
        String str5 = this.remark;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l3 = this.beginAt;
        int iHashCode9 = (iHashCode8 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Long l4 = this.endAt;
        int iHashCode10 = (iHashCode9 + (l4 != null ? l4.hashCode() : 0)) * 37;
        Integer num2 = this.isLogin;
        int iHashCode11 = (iHashCode10 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.showName;
        int iHashCode12 = (iHashCode11 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str6 = this.moduleCode;
        int iHashCode13 = (iHashCode12 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.jsonUrl;
        int iHashCode14 = (iHashCode13 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.jsonClickUrl;
        int iHashCode15 = iHashCode14 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.clickUrl != null) {
            sb.append(", clickUrl=");
            sb.append(this.clickUrl);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.seq != null) {
            sb.append(", seq=");
            sb.append(this.seq);
        }
        if (!this.labelDetailss.isEmpty()) {
            sb.append(", labelDetailss=");
            sb.append(this.labelDetailss);
        }
        if (this.remark != null) {
            sb.append(", remark=");
            sb.append(this.remark);
        }
        if (this.beginAt != null) {
            sb.append(", beginAt=");
            sb.append(this.beginAt);
        }
        if (this.endAt != null) {
            sb.append(", endAt=");
            sb.append(this.endAt);
        }
        if (this.isLogin != null) {
            sb.append(", isLogin=");
            sb.append(this.isLogin);
        }
        if (this.showName != null) {
            sb.append(", showName=");
            sb.append(this.showName);
        }
        if (this.moduleCode != null) {
            sb.append(", moduleCode=");
            sb.append(this.moduleCode);
        }
        if (this.jsonUrl != null) {
            sb.append(", jsonUrl=");
            sb.append(this.jsonUrl);
        }
        if (this.jsonClickUrl != null) {
            sb.append(", jsonClickUrl=");
            sb.append(this.jsonClickUrl);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "IconDetails{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public IconDetails(Long l2, String str, String str2, String str3, String str4, Integer num, List<LabelDetails> list, String str5, Long l3, Long l4, Integer num2, Integer num3, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l2;
        this.title = str;
        this.url = str2;
        this.clickUrl = str3;
        this.link = str4;
        this.seq = num;
        this.labelDetailss = Internal.immutableCopyOf("labelDetailss", list);
        this.remark = str5;
        this.beginAt = l3;
        this.endAt = l4;
        this.isLogin = num2;
        this.showName = num3;
        this.moduleCode = str6;
        this.jsonUrl = str7;
        this.jsonClickUrl = str8;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.title = this.title;
        builder.url = this.url;
        builder.clickUrl = this.clickUrl;
        builder.link = this.link;
        builder.seq = this.seq;
        builder.labelDetailss = Internal.copyOf("labelDetailss", this.labelDetailss);
        builder.remark = this.remark;
        builder.beginAt = this.beginAt;
        builder.endAt = this.endAt;
        builder.isLogin = this.isLogin;
        builder.showName = this.showName;
        builder.moduleCode = this.moduleCode;
        builder.jsonUrl = this.jsonUrl;
        builder.jsonClickUrl = this.jsonClickUrl;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
