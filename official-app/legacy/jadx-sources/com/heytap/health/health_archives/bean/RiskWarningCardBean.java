package com.heytap.health.health_archives.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00016B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Ja\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u00067"}, d2 = {"Lcom/heytap/health/health_archives/bean/RiskWarningCardBean;", "Landroid/os/Parcelable;", "name", "", "type", "code", "", "level", "aiSuggestions", "references", "riskRank", "", "Lcom/heytap/health/health_archives/bean/RiskWarningCardBean$RiskLevelUI;", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAiSuggestions", "()Ljava/lang/String;", "setAiSuggestions", "(Ljava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getLevel", "setLevel", "getName", "setName", "getReferences", "setReferences", "getRiskRank", "()Ljava/util/Map;", "setRiskRank", "(Ljava/util/Map;)V", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "RiskLevelUI", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RiskWarningCardBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RiskWarningCardBean> CREATOR = new a();

    @Nullable
    private String aiSuggestions;
    private int code;
    private int level;

    @NotNull
    private String name;

    @Nullable
    private String references;

    @Nullable
    private Map<String, RiskLevelUI> riskRank;

    @NotNull
    private String type;

    @Parcelize
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/health_archives/bean/RiskWarningCardBean$RiskLevelUI;", "Landroid/os/Parcelable;", "name", "", "color", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RiskLevelUI implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RiskLevelUI> CREATOR = new a();

        @NotNull
        private String color;

        @NotNull
        private String name;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RiskLevelUI> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RiskLevelUI createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskLevelUI(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RiskLevelUI[] newArray(int i) {
                return new RiskLevelUI[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RiskLevelUI() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RiskLevelUI copy$default(RiskLevelUI riskLevelUI, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = riskLevelUI.name;
            }
            if ((i & 2) != 0) {
                str2 = riskLevelUI.color;
            }
            return riskLevelUI.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final RiskLevelUI copy(@NotNull String name, @NotNull String color) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(color, "color");
            return new RiskLevelUI(name, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RiskLevelUI)) {
                return false;
            }
            RiskLevelUI riskLevelUI = (RiskLevelUI) other;
            return Intrinsics.areEqual(this.name, riskLevelUI.name) && Intrinsics.areEqual(this.color, riskLevelUI.color);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.color.hashCode();
        }

        public final void setColor(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.color = str;
        }

        public final void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }

        @NotNull
        public String toString() {
            return "RiskLevelUI(name=" + this.name + ", color=" + this.color + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeString(this.color);
        }

        public RiskLevelUI(@NotNull String name, @NotNull String color) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(color, "color");
            this.name = name;
            this.color = color;
        }

        public /* synthetic */ RiskLevelUI(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "--" : str, (i & 2) != 0 ? "#FFE928" : str2);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RiskWarningCardBean> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RiskWarningCardBean createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), RiskLevelUI.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new RiskWarningCardBean(string, string2, i, i2, string3, string4, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RiskWarningCardBean[] newArray(int i) {
            return new RiskWarningCardBean[i];
        }
    }

    public RiskWarningCardBean() {
        this(null, null, 0, 0, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RiskWarningCardBean copy$default(RiskWarningCardBean riskWarningCardBean, String str, String str2, int i, int i2, String str3, String str4, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = riskWarningCardBean.name;
        }
        if ((i3 & 2) != 0) {
            str2 = riskWarningCardBean.type;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            i = riskWarningCardBean.code;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = riskWarningCardBean.level;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = riskWarningCardBean.aiSuggestions;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = riskWarningCardBean.references;
        }
        String str7 = str4;
        if ((i3 & 64) != 0) {
            map = riskWarningCardBean.riskRank;
        }
        return riskWarningCardBean.copy(str, str5, i4, i5, str6, str7, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAiSuggestions() {
        return this.aiSuggestions;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReferences() {
        return this.references;
    }

    @Nullable
    public final Map<String, RiskLevelUI> component7() {
        return this.riskRank;
    }

    @NotNull
    public final RiskWarningCardBean copy(@NotNull String name, @NotNull String type, int code, int level, @Nullable String aiSuggestions, @Nullable String references, @Nullable Map<String, RiskLevelUI> riskRank) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new RiskWarningCardBean(name, type, code, level, aiSuggestions, references, riskRank);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiskWarningCardBean)) {
            return false;
        }
        RiskWarningCardBean riskWarningCardBean = (RiskWarningCardBean) other;
        return Intrinsics.areEqual(this.name, riskWarningCardBean.name) && Intrinsics.areEqual(this.type, riskWarningCardBean.type) && this.code == riskWarningCardBean.code && this.level == riskWarningCardBean.level && Intrinsics.areEqual(this.aiSuggestions, riskWarningCardBean.aiSuggestions) && Intrinsics.areEqual(this.references, riskWarningCardBean.references) && Intrinsics.areEqual(this.riskRank, riskWarningCardBean.riskRank);
    }

    @Nullable
    public final String getAiSuggestions() {
        return this.aiSuggestions;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getReferences() {
        return this.references;
    }

    @Nullable
    public final Map<String, RiskLevelUI> getRiskRank() {
        return this.riskRank;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.code)) * 31) + Integer.hashCode(this.level)) * 31;
        String str = this.aiSuggestions;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.references;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, RiskLevelUI> map = this.riskRank;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final void setAiSuggestions(@Nullable String str) {
        this.aiSuggestions = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setReferences(@Nullable String str) {
        this.references = str;
    }

    public final void setRiskRank(@Nullable Map<String, RiskLevelUI> map) {
        this.riskRank = map;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "RiskWarningCardBean(name=" + this.name + ", type=" + this.type + ", code=" + this.code + ", level=" + this.level + ", aiSuggestions=" + this.aiSuggestions + ", references=" + this.references + ", riskRank=" + this.riskRank + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeInt(this.code);
        parcel.writeInt(this.level);
        parcel.writeString(this.aiSuggestions);
        parcel.writeString(this.references);
        Map<String, RiskLevelUI> map = this.riskRank;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, RiskLevelUI> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, flags);
        }
    }

    public RiskWarningCardBean(@NotNull String name, @NotNull String type, int i, int i2, @Nullable String str, @Nullable String str2, @Nullable Map<String, RiskLevelUI> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.name = name;
        this.type = type;
        this.code = i;
        this.level = i2;
        this.aiSuggestions = str;
        this.references = str2;
        this.riskRank = map;
    }

    public /* synthetic */ RiskWarningCardBean(String str, String str2, int i, int i2, String str3, String str4, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : map);
    }
}
