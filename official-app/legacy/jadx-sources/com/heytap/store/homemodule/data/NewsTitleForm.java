package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J/\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/heytap/store/homemodule/data/NewsTitleForm;", "", "newsDetailss", "", "Lcom/heytap/store/homemodule/data/NewsTitleForm$Detail;", "moreIsLogin", "", "moreLink", "", "(Ljava/util/List;ILjava/lang/String;)V", "getMoreIsLogin", "()I", "setMoreIsLogin", "(I)V", "getMoreLink", "()Ljava/lang/String;", "setMoreLink", "(Ljava/lang/String;)V", "getNewsDetailss", "()Ljava/util/List;", "setNewsDetailss", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Detail", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class NewsTitleForm {
    private int moreIsLogin;

    @NotNull
    private String moreLink;

    @Nullable
    private List<Detail> newsDetailss;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006'"}, d2 = {"Lcom/heytap/store/homemodule/data/NewsTitleForm$Detail;", "", "darkUrl", "", "lightUrl", "id", "", "link", "title", "type", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getDarkUrl", "()Ljava/lang/String;", "setDarkUrl", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getLightUrl", "setLightUrl", "getLink", "setLink", "getTitle", "setTitle", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Detail {

        @NotNull
        private String darkUrl;
        private int id;

        @NotNull
        private String lightUrl;

        @NotNull
        private String link;

        @NotNull
        private String title;
        private int type;

        public Detail() {
            this(null, null, 0, null, null, 0, 63, null);
        }

        public static /* synthetic */ Detail copy$default(Detail detail, String str, String str2, int i, String str3, String str4, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = detail.darkUrl;
            }
            if ((i3 & 2) != 0) {
                str2 = detail.lightUrl;
            }
            String str5 = str2;
            if ((i3 & 4) != 0) {
                i = detail.id;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                str3 = detail.link;
            }
            String str6 = str3;
            if ((i3 & 16) != 0) {
                str4 = detail.title;
            }
            String str7 = str4;
            if ((i3 & 32) != 0) {
                i2 = detail.type;
            }
            return detail.copy(str, str5, i4, str6, str7, i2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDarkUrl() {
            return this.darkUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLightUrl() {
            return this.lightUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        public final Detail copy(@NotNull String darkUrl, @NotNull String lightUrl, int id, @NotNull String link, @NotNull String title, int type) {
            Intrinsics.checkNotNullParameter(darkUrl, "darkUrl");
            Intrinsics.checkNotNullParameter(lightUrl, "lightUrl");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Detail(darkUrl, lightUrl, id, link, title, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) other;
            return Intrinsics.areEqual(this.darkUrl, detail.darkUrl) && Intrinsics.areEqual(this.lightUrl, detail.lightUrl) && this.id == detail.id && Intrinsics.areEqual(this.link, detail.link) && Intrinsics.areEqual(this.title, detail.title) && this.type == detail.type;
        }

        @NotNull
        public final String getDarkUrl() {
            return this.darkUrl;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getLightUrl() {
            return this.lightUrl;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((((((this.darkUrl.hashCode() * 31) + this.lightUrl.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + this.link.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.type);
        }

        public final void setDarkUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.darkUrl = str;
        }

        public final void setId(int i) {
            this.id = i;
        }

        public final void setLightUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.lightUrl = str;
        }

        public final void setLink(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.link = str;
        }

        public final void setTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.title = str;
        }

        public final void setType(int i) {
            this.type = i;
        }

        @NotNull
        public String toString() {
            return "Detail(darkUrl=" + this.darkUrl + ", lightUrl=" + this.lightUrl + ", id=" + this.id + ", link=" + this.link + ", title=" + this.title + ", type=" + this.type + ')';
        }

        public Detail(@NotNull String darkUrl, @NotNull String lightUrl, int i, @NotNull String link, @NotNull String title, int i2) {
            Intrinsics.checkNotNullParameter(darkUrl, "darkUrl");
            Intrinsics.checkNotNullParameter(lightUrl, "lightUrl");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(title, "title");
            this.darkUrl = darkUrl;
            this.lightUrl = lightUrl;
            this.id = i;
            this.link = link;
            this.title = title;
            this.type = i2;
        }

        public /* synthetic */ Detail(String str, String str2, int i, String str3, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? 0 : i2);
        }
    }

    public NewsTitleForm() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsTitleForm copy$default(NewsTitleForm newsTitleForm, List list, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = newsTitleForm.newsDetailss;
        }
        if ((i2 & 2) != 0) {
            i = newsTitleForm.moreIsLogin;
        }
        if ((i2 & 4) != 0) {
            str = newsTitleForm.moreLink;
        }
        return newsTitleForm.copy(list, i, str);
    }

    @Nullable
    public final List<Detail> component1() {
        return this.newsDetailss;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMoreIsLogin() {
        return this.moreIsLogin;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMoreLink() {
        return this.moreLink;
    }

    @NotNull
    public final NewsTitleForm copy(@Nullable List<Detail> newsDetailss, int moreIsLogin, @NotNull String moreLink) {
        Intrinsics.checkNotNullParameter(moreLink, "moreLink");
        return new NewsTitleForm(newsDetailss, moreIsLogin, moreLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsTitleForm)) {
            return false;
        }
        NewsTitleForm newsTitleForm = (NewsTitleForm) other;
        return Intrinsics.areEqual(this.newsDetailss, newsTitleForm.newsDetailss) && this.moreIsLogin == newsTitleForm.moreIsLogin && Intrinsics.areEqual(this.moreLink, newsTitleForm.moreLink);
    }

    public final int getMoreIsLogin() {
        return this.moreIsLogin;
    }

    @NotNull
    public final String getMoreLink() {
        return this.moreLink;
    }

    @Nullable
    public final List<Detail> getNewsDetailss() {
        return this.newsDetailss;
    }

    public int hashCode() {
        List<Detail> list = this.newsDetailss;
        return ((((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.moreIsLogin)) * 31) + this.moreLink.hashCode();
    }

    public final void setMoreIsLogin(int i) {
        this.moreIsLogin = i;
    }

    public final void setMoreLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moreLink = str;
    }

    public final void setNewsDetailss(@Nullable List<Detail> list) {
        this.newsDetailss = list;
    }

    @NotNull
    public String toString() {
        return "NewsTitleForm(newsDetailss=" + this.newsDetailss + ", moreIsLogin=" + this.moreIsLogin + ", moreLink=" + this.moreLink + ')';
    }

    public NewsTitleForm(@Nullable List<Detail> list, int i, @NotNull String moreLink) {
        Intrinsics.checkNotNullParameter(moreLink, "moreLink");
        this.newsDetailss = list;
        this.moreIsLogin = i;
        this.moreLink = moreLink;
    }

    public /* synthetic */ NewsTitleForm(List list, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str);
    }
}
