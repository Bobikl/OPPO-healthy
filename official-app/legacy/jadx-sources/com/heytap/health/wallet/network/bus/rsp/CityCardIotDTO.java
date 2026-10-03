package com.heytap.health.wallet.network.bus.rsp;

import android.text.TextUtils;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010$\u001a\u00020\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u000eR$\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\n¨\u0006("}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/CityCardIotDTO;", "", "cityName", "", "cityCode", "recommendAppCode", "matchPin", "fullPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCityCode", "()Ljava/lang/String;", "getCityName", "getFullPin", "setFullPin", "(Ljava/lang/String;)V", "getMatchPin", "setMatchPin", "namePinyinList", "", "getNamePinyinList", "()Ljava/util/List;", "setNamePinyinList", "(Ljava/util/List;)V", "pinyinFirst", "getPinyinFirst", "setPinyinFirst", "getRecommendAppCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getSection", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CityCardIotDTO {

    @NotNull
    private final String cityCode;

    @NotNull
    private final String cityName;

    @Nullable
    private String fullPin;

    @Nullable
    private String matchPin;

    @Nullable
    private List<String> namePinyinList;
    public String pinyinFirst;

    @NotNull
    private final String recommendAppCode;

    public CityCardIotDTO(@NotNull String cityName, @NotNull String cityCode, @NotNull String recommendAppCode, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(recommendAppCode, "recommendAppCode");
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.recommendAppCode = recommendAppCode;
        this.matchPin = str;
        this.fullPin = str2;
    }

    public static /* synthetic */ CityCardIotDTO copy$default(CityCardIotDTO cityCardIotDTO, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cityCardIotDTO.cityName;
        }
        if ((i & 2) != 0) {
            str2 = cityCardIotDTO.cityCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cityCardIotDTO.recommendAppCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cityCardIotDTO.matchPin;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cityCardIotDTO.fullPin;
        }
        return cityCardIotDTO.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCityName() {
        return this.cityName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecommendAppCode() {
        return this.recommendAppCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMatchPin() {
        return this.matchPin;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFullPin() {
        return this.fullPin;
    }

    @NotNull
    public final CityCardIotDTO copy(@NotNull String cityName, @NotNull String cityCode, @NotNull String recommendAppCode, @Nullable String matchPin, @Nullable String fullPin) {
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(recommendAppCode, "recommendAppCode");
        return new CityCardIotDTO(cityName, cityCode, recommendAppCode, matchPin, fullPin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CityCardIotDTO)) {
            return false;
        }
        CityCardIotDTO cityCardIotDTO = (CityCardIotDTO) other;
        return Intrinsics.areEqual(this.cityName, cityCardIotDTO.cityName) && Intrinsics.areEqual(this.cityCode, cityCardIotDTO.cityCode) && Intrinsics.areEqual(this.recommendAppCode, cityCardIotDTO.recommendAppCode) && Intrinsics.areEqual(this.matchPin, cityCardIotDTO.matchPin) && Intrinsics.areEqual(this.fullPin, cityCardIotDTO.fullPin);
    }

    @NotNull
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    public final String getCityName() {
        return this.cityName;
    }

    @Nullable
    public final String getFullPin() {
        return this.fullPin;
    }

    @Nullable
    public final String getMatchPin() {
        return this.matchPin;
    }

    @Nullable
    public final List<String> getNamePinyinList() {
        return this.namePinyinList;
    }

    @NotNull
    public final String getPinyinFirst() {
        String str = this.pinyinFirst;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pinyinFirst");
        return null;
    }

    @NotNull
    public final String getRecommendAppCode() {
        return this.recommendAppCode;
    }

    @NotNull
    public final String getSection() {
        return TextUtils.isEmpty(getPinyinFirst()) ? "#" : getPinyinFirst();
    }

    public int hashCode() {
        int iHashCode = ((((this.cityName.hashCode() * 31) + this.cityCode.hashCode()) * 31) + this.recommendAppCode.hashCode()) * 31;
        String str = this.matchPin;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullPin;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFullPin(@Nullable String str) {
        this.fullPin = str;
    }

    public final void setMatchPin(@Nullable String str) {
        this.matchPin = str;
    }

    public final void setNamePinyinList(@Nullable List<String> list) {
        this.namePinyinList = list;
    }

    public final void setPinyinFirst(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pinyinFirst = str;
    }

    @NotNull
    public String toString() {
        return "CityCardIotDTO(cityName=" + this.cityName + ", cityCode=" + this.cityCode + ", recommendAppCode=" + this.recommendAppCode + ", matchPin=" + this.matchPin + ", fullPin=" + this.fullPin + ")";
    }

    public /* synthetic */ CityCardIotDTO(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
