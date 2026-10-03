package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.widget.state.data.StateConstantsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeFloatingAdData;", "", "code", "", "data", "Lcom/heytap/store/homemodule/data/HomeFloatingAdData$Data;", "errorMessage", "", "errorType", "(Ljava/lang/Integer;Lcom/heytap/store/homemodule/data/HomeFloatingAdData$Data;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Lcom/heytap/store/homemodule/data/HomeFloatingAdData$Data;", "getErrorMessage", "()Ljava/lang/String;", "getErrorType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Lcom/heytap/store/homemodule/data/HomeFloatingAdData$Data;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/HomeFloatingAdData;", "equals", "", "other", "hashCode", "toString", "Data", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeFloatingAdData {

    @Nullable
    private final Integer code;

    @Nullable
    private final Data data;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final String errorType;

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jn\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006,"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeFloatingAdData$Data;", "", "id", "", "advertId", "", StateConstantsKt.STATE_ACTION_BTN_CLICK, "", "link", "login", "", "pic", "picJson", "title", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvertId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getButtonText", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLink", "getLogin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPic", "getPicJson", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/HomeFloatingAdData$Data;", "equals", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Data {

        @Nullable
        private final Long advertId;

        @Nullable
        private final String buttonText;

        @Nullable
        private final Integer id;

        @Nullable
        private final String link;

        @Nullable
        private final Boolean login;

        @Nullable
        private final String pic;

        @Nullable
        private final String picJson;

        @Nullable
        private final String title;

        public Data() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getAdvertId() {
            return this.advertId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getLogin() {
            return this.login;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPic() {
            return this.pic;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPicJson() {
            return this.picJson;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Data copy(@Nullable Integer id, @Nullable Long advertId, @Nullable String buttonText, @Nullable String link, @Nullable Boolean login, @Nullable String pic, @Nullable String picJson, @Nullable String title) {
            return new Data(id, advertId, buttonText, link, login, pic, picJson, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.id, data.id) && Intrinsics.areEqual(this.advertId, data.advertId) && Intrinsics.areEqual(this.buttonText, data.buttonText) && Intrinsics.areEqual(this.link, data.link) && Intrinsics.areEqual(this.login, data.login) && Intrinsics.areEqual(this.pic, data.pic) && Intrinsics.areEqual(this.picJson, data.picJson) && Intrinsics.areEqual(this.title, data.title);
        }

        @Nullable
        public final Long getAdvertId() {
            return this.advertId;
        }

        @Nullable
        public final String getButtonText() {
            return this.buttonText;
        }

        @Nullable
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getLink() {
            return this.link;
        }

        @Nullable
        public final Boolean getLogin() {
            return this.login;
        }

        @Nullable
        public final String getPic() {
            return this.pic;
        }

        @Nullable
        public final String getPicJson() {
            return this.picJson;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Long l2 = this.advertId;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.buttonText;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.link;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.login;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.pic;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.picJson;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.title;
            return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Data(id=" + this.id + ", advertId=" + this.advertId + ", buttonText=" + ((Object) this.buttonText) + ", link=" + ((Object) this.link) + ", login=" + this.login + ", pic=" + ((Object) this.pic) + ", picJson=" + ((Object) this.picJson) + ", title=" + ((Object) this.title) + ')';
        }

        public Data(@Nullable Integer num, @Nullable Long l2, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.id = num;
            this.advertId = l2;
            this.buttonText = str;
            this.link = str2;
            this.login = bool;
            this.pic = str3;
            this.picJson = str4;
            this.title = str5;
        }

        public /* synthetic */ Data(Integer num, Long l2, String str, String str2, Boolean bool, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? -1L : l2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) == 0 ? str5 : "");
        }
    }

    public HomeFloatingAdData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ HomeFloatingAdData copy$default(HomeFloatingAdData homeFloatingAdData, Integer num, Data data, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = homeFloatingAdData.code;
        }
        if ((i & 2) != 0) {
            data = homeFloatingAdData.data;
        }
        if ((i & 4) != 0) {
            str = homeFloatingAdData.errorMessage;
        }
        if ((i & 8) != 0) {
            str2 = homeFloatingAdData.errorType;
        }
        return homeFloatingAdData.copy(num, data, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @NotNull
    public final HomeFloatingAdData copy(@Nullable Integer code, @Nullable Data data, @Nullable String errorMessage, @Nullable String errorType) {
        return new HomeFloatingAdData(code, data, errorMessage, errorType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeFloatingAdData)) {
            return false;
        }
        HomeFloatingAdData homeFloatingAdData = (HomeFloatingAdData) other;
        return Intrinsics.areEqual(this.code, homeFloatingAdData.code) && Intrinsics.areEqual(this.data, homeFloatingAdData.data) && Intrinsics.areEqual(this.errorMessage, homeFloatingAdData.errorMessage) && Intrinsics.areEqual(this.errorType, homeFloatingAdData.errorType);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Data data = this.data;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorType;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomeFloatingAdData(code=" + this.code + ", data=" + this.data + ", errorMessage=" + ((Object) this.errorMessage) + ", errorType=" + ((Object) this.errorType) + ')';
    }

    public HomeFloatingAdData(@Nullable Integer num, @Nullable Data data, @Nullable String str, @Nullable String str2) {
        this.code = num;
        this.data = data;
        this.errorMessage = str;
        this.errorType = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HomeFloatingAdData(Integer num, Data data, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2 = (i & 1) != 0 ? 0 : num;
        Data data2 = (i & 2) != 0 ? new Data(null, null, null, null, null, null, null, null, 255, null) : data;
        String str3 = "";
        String str4 = (i & 4) != 0 ? "" : str;
        if ((i & 8) == 0) {
            str3 = str2;
        }
        this(num2, data2, str4, str3);
    }
}
