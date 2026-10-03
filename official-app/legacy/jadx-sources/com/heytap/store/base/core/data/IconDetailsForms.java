package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jì\u0001\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u0003HÖ\u0001J\t\u0010[\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u001a\"\u0004\b(\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001c¨\u0006\\"}, d2 = {"Lcom/heytap/store/base/core/data/IconDetailsForms;", "", "id", "", "title", "", "showName", "url", "jsonUrl", "clickUrl", "jsonClickUrl", "beginAt", DebugModeEntity.KEY_END_AT, "seq", "labelDetailss", "", "Lcom/heytap/store/base/core/data/LabelDetailss;", "link", "isLogin", "moduleCode", "rows", "cols", "maxProductNum", "transparent", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getBeginAt", "()Ljava/lang/String;", "setBeginAt", "(Ljava/lang/String;)V", "getClickUrl", "setClickUrl", "getCols", "()Ljava/lang/Integer;", "setCols", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEndAt", "setEndAt", "getId", "setId", "setLogin", "getJsonClickUrl", "setJsonClickUrl", "getJsonUrl", "setJsonUrl", "getLabelDetailss", "()Ljava/util/List;", "setLabelDetailss", "(Ljava/util/List;)V", "getLink", "setLink", "getMaxProductNum", "setMaxProductNum", "getModuleCode", "setModuleCode", "getRows", "setRows", "getSeq", "setSeq", "getShowName", "setShowName", "getTitle", "setTitle", "getTransparent", "setTransparent", "getUrl", "setUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/heytap/store/base/core/data/IconDetailsForms;", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class IconDetailsForms {

    @Nullable
    private String beginAt;

    @Nullable
    private String clickUrl;

    @Nullable
    private Integer cols;

    @Nullable
    private String endAt;

    @Nullable
    private Integer id;

    @Nullable
    private String isLogin;

    @Nullable
    private String jsonClickUrl;

    @Nullable
    private String jsonUrl;

    @Nullable
    private List<LabelDetailss> labelDetailss;

    @Nullable
    private String link;

    @Nullable
    private Integer maxProductNum;

    @Nullable
    private String moduleCode;

    @Nullable
    private Integer rows;

    @Nullable
    private Integer seq;

    @Nullable
    private Integer showName;

    @Nullable
    private String title;

    @Nullable
    private String transparent;

    @Nullable
    private String url;

    public IconDetailsForms() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getSeq() {
        return this.seq;
    }

    @Nullable
    public final List<LabelDetailss> component11() {
        return this.labelDetailss;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIsLogin() {
        return this.isLogin;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getRows() {
        return this.rows;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getCols() {
        return this.cols;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getMaxProductNum() {
        return this.maxProductNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTransparent() {
        return this.transparent;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getShowName() {
        return this.showName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJsonUrl() {
        return this.jsonUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJsonClickUrl() {
        return this.jsonClickUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBeginAt() {
        return this.beginAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEndAt() {
        return this.endAt;
    }

    @NotNull
    public final IconDetailsForms copy(@Nullable Integer id, @Nullable String title, @Nullable Integer showName, @Nullable String url, @Nullable String jsonUrl, @Nullable String clickUrl, @Nullable String jsonClickUrl, @Nullable String beginAt, @Nullable String endAt, @Nullable Integer seq, @Nullable List<LabelDetailss> labelDetailss, @Nullable String link, @Nullable String isLogin, @Nullable String moduleCode, @Nullable Integer rows, @Nullable Integer cols, @Nullable Integer maxProductNum, @Nullable String transparent) {
        return new IconDetailsForms(id, title, showName, url, jsonUrl, clickUrl, jsonClickUrl, beginAt, endAt, seq, labelDetailss, link, isLogin, moduleCode, rows, cols, maxProductNum, transparent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconDetailsForms)) {
            return false;
        }
        IconDetailsForms iconDetailsForms = (IconDetailsForms) other;
        return Intrinsics.areEqual(this.id, iconDetailsForms.id) && Intrinsics.areEqual(this.title, iconDetailsForms.title) && Intrinsics.areEqual(this.showName, iconDetailsForms.showName) && Intrinsics.areEqual(this.url, iconDetailsForms.url) && Intrinsics.areEqual(this.jsonUrl, iconDetailsForms.jsonUrl) && Intrinsics.areEqual(this.clickUrl, iconDetailsForms.clickUrl) && Intrinsics.areEqual(this.jsonClickUrl, iconDetailsForms.jsonClickUrl) && Intrinsics.areEqual(this.beginAt, iconDetailsForms.beginAt) && Intrinsics.areEqual(this.endAt, iconDetailsForms.endAt) && Intrinsics.areEqual(this.seq, iconDetailsForms.seq) && Intrinsics.areEqual(this.labelDetailss, iconDetailsForms.labelDetailss) && Intrinsics.areEqual(this.link, iconDetailsForms.link) && Intrinsics.areEqual(this.isLogin, iconDetailsForms.isLogin) && Intrinsics.areEqual(this.moduleCode, iconDetailsForms.moduleCode) && Intrinsics.areEqual(this.rows, iconDetailsForms.rows) && Intrinsics.areEqual(this.cols, iconDetailsForms.cols) && Intrinsics.areEqual(this.maxProductNum, iconDetailsForms.maxProductNum) && Intrinsics.areEqual(this.transparent, iconDetailsForms.transparent);
    }

    @Nullable
    public final String getBeginAt() {
        return this.beginAt;
    }

    @Nullable
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @Nullable
    public final Integer getCols() {
        return this.cols;
    }

    @Nullable
    public final String getEndAt() {
        return this.endAt;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getJsonClickUrl() {
        return this.jsonClickUrl;
    }

    @Nullable
    public final String getJsonUrl() {
        return this.jsonUrl;
    }

    @Nullable
    public final List<LabelDetailss> getLabelDetailss() {
        return this.labelDetailss;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Integer getMaxProductNum() {
        return this.maxProductNum;
    }

    @Nullable
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @Nullable
    public final Integer getRows() {
        return this.rows;
    }

    @Nullable
    public final Integer getSeq() {
        return this.seq;
    }

    @Nullable
    public final Integer getShowName() {
        return this.showName;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.showName;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jsonUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clickUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jsonClickUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.beginAt;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.endAt;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.seq;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<LabelDetailss> list = this.labelDetailss;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.link;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.isLogin;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.moduleCode;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num4 = this.rows;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.cols;
        int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.maxProductNum;
        int iHashCode17 = (iHashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str11 = this.transparent;
        return iHashCode17 + (str11 != null ? str11.hashCode() : 0);
    }

    @Nullable
    public final String isLogin() {
        return this.isLogin;
    }

    public final void setBeginAt(@Nullable String str) {
        this.beginAt = str;
    }

    public final void setClickUrl(@Nullable String str) {
        this.clickUrl = str;
    }

    public final void setCols(@Nullable Integer num) {
        this.cols = num;
    }

    public final void setEndAt(@Nullable String str) {
        this.endAt = str;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setJsonClickUrl(@Nullable String str) {
        this.jsonClickUrl = str;
    }

    public final void setJsonUrl(@Nullable String str) {
        this.jsonUrl = str;
    }

    public final void setLabelDetailss(@Nullable List<LabelDetailss> list) {
        this.labelDetailss = list;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setLogin(@Nullable String str) {
        this.isLogin = str;
    }

    public final void setMaxProductNum(@Nullable Integer num) {
        this.maxProductNum = num;
    }

    public final void setModuleCode(@Nullable String str) {
        this.moduleCode = str;
    }

    public final void setRows(@Nullable Integer num) {
        this.rows = num;
    }

    public final void setSeq(@Nullable Integer num) {
        this.seq = num;
    }

    public final void setShowName(@Nullable Integer num) {
        this.showName = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTransparent(@Nullable String str) {
        this.transparent = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "IconDetailsForms(id=" + this.id + ", title=" + ((Object) this.title) + ", showName=" + this.showName + ", url=" + ((Object) this.url) + ", jsonUrl=" + ((Object) this.jsonUrl) + ", clickUrl=" + ((Object) this.clickUrl) + ", jsonClickUrl=" + ((Object) this.jsonClickUrl) + ", beginAt=" + ((Object) this.beginAt) + ", endAt=" + ((Object) this.endAt) + ", seq=" + this.seq + ", labelDetailss=" + this.labelDetailss + ", link=" + ((Object) this.link) + ", isLogin=" + ((Object) this.isLogin) + ", moduleCode=" + ((Object) this.moduleCode) + ", rows=" + this.rows + ", cols=" + this.cols + ", maxProductNum=" + this.maxProductNum + ", transparent=" + ((Object) this.transparent) + ')';
    }

    public IconDetailsForms(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num3, @Nullable List<LabelDetailss> list, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str11) {
        this.id = num;
        this.title = str;
        this.showName = num2;
        this.url = str2;
        this.jsonUrl = str3;
        this.clickUrl = str4;
        this.jsonClickUrl = str5;
        this.beginAt = str6;
        this.endAt = str7;
        this.seq = num3;
        this.labelDetailss = list;
        this.link = str8;
        this.isLogin = str9;
        this.moduleCode = str10;
        this.rows = num4;
        this.cols = num5;
        this.maxProductNum = num6;
        this.transparent = str11;
    }

    public /* synthetic */ IconDetailsForms(Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, Integer num3, List list, String str8, String str9, String str10, Integer num4, Integer num5, Integer num6, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : num4, (i & 32768) != 0 ? null : num5, (i & 65536) != 0 ? null : num6, (i & 131072) != 0 ? null : str11);
    }
}
