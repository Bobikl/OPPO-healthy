package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006#"}, d2 = {"Lcom/heytap/health/health_archives/bean/IndicatorMriBean;", "", "title", "", "part", "symptom", "", "tuber", "Lcom/heytap/health/health_archives/bean/IndicatorMriBean$Tuber;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getPart", "()Ljava/lang/String;", "setPart", "(Ljava/lang/String;)V", "getSymptom", "()Ljava/util/List;", "setSymptom", "(Ljava/util/List;)V", "getTitle", "setTitle", "getTuber", "setTuber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Tuber", "TuberSize", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IndicatorMriBean {

    @Nullable
    private String part;

    @Nullable
    private List<String> symptom;

    @Nullable
    private String title;

    @Nullable
    private List<Tuber> tuber;

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/health_archives/bean/IndicatorMriBean$Tuber;", "", "result", "", "size", "", "Lcom/heytap/health/health_archives/bean/IndicatorMriBean$TuberSize;", "(Ljava/lang/String;Ljava/util/List;)V", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "getSize", "()Ljava/util/List;", "setSize", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Tuber {

        @Nullable
        private String result;

        @Nullable
        private List<TuberSize> size;

        /* JADX WARN: Multi-variable type inference failed */
        public Tuber() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tuber copy$default(Tuber tuber, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tuber.result;
            }
            if ((i & 2) != 0) {
                list = tuber.size;
            }
            return tuber.copy(str, list);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        @Nullable
        public final List<TuberSize> component2() {
            return this.size;
        }

        @NotNull
        public final Tuber copy(@Nullable String result, @Nullable List<TuberSize> size) {
            return new Tuber(result, size);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tuber)) {
                return false;
            }
            Tuber tuber = (Tuber) other;
            return Intrinsics.areEqual(this.result, tuber.result) && Intrinsics.areEqual(this.size, tuber.size);
        }

        @Nullable
        public final String getResult() {
            return this.result;
        }

        @Nullable
        public final List<TuberSize> getSize() {
            return this.size;
        }

        public int hashCode() {
            String str = this.result;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<TuberSize> list = this.size;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final void setResult(@Nullable String str) {
            this.result = str;
        }

        public final void setSize(@Nullable List<TuberSize> list) {
            this.size = list;
        }

        @NotNull
        public String toString() {
            return "Tuber(result=" + this.result + ", size=" + this.size + ")";
        }

        public Tuber(@Nullable String str, @Nullable List<TuberSize> list) {
            this.result = str;
            this.size = list;
        }

        public /* synthetic */ Tuber(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/health_archives/bean/IndicatorMriBean$TuberSize;", "", "value", "", "unit", "type", "partDirection", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPartDirection", "()Ljava/lang/String;", "setPartDirection", "(Ljava/lang/String;)V", "getType", "setType", "getUnit", "setUnit", "getValue", "setValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TuberSize {

        @Nullable
        private String partDirection;

        @Nullable
        private String type;

        @Nullable
        private String unit;

        @Nullable
        private String value;

        public TuberSize() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ TuberSize copy$default(TuberSize tuberSize, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tuberSize.value;
            }
            if ((i & 2) != 0) {
                str2 = tuberSize.unit;
            }
            if ((i & 4) != 0) {
                str3 = tuberSize.type;
            }
            if ((i & 8) != 0) {
                str4 = tuberSize.partDirection;
            }
            return tuberSize.copy(str, str2, str3, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPartDirection() {
            return this.partDirection;
        }

        @NotNull
        public final TuberSize copy(@Nullable String value, @Nullable String unit, @Nullable String type, @Nullable String partDirection) {
            return new TuberSize(value, unit, type, partDirection);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TuberSize)) {
                return false;
            }
            TuberSize tuberSize = (TuberSize) other;
            return Intrinsics.areEqual(this.value, tuberSize.value) && Intrinsics.areEqual(this.unit, tuberSize.unit) && Intrinsics.areEqual(this.type, tuberSize.type) && Intrinsics.areEqual(this.partDirection, tuberSize.partDirection);
        }

        @Nullable
        public final String getPartDirection() {
            return this.partDirection;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getUnit() {
            return this.unit;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.unit;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.type;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.partDirection;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final void setPartDirection(@Nullable String str) {
            this.partDirection = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setUnit(@Nullable String str) {
            this.unit = str;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }

        @NotNull
        public String toString() {
            return "TuberSize(value=" + this.value + ", unit=" + this.unit + ", type=" + this.type + ", partDirection=" + this.partDirection + ")";
        }

        public TuberSize(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.value = str;
            this.unit = str2;
            this.type = str3;
            this.partDirection = str4;
        }

        public /* synthetic */ TuberSize(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    public IndicatorMriBean() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndicatorMriBean copy$default(IndicatorMriBean indicatorMriBean, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indicatorMriBean.title;
        }
        if ((i & 2) != 0) {
            str2 = indicatorMriBean.part;
        }
        if ((i & 4) != 0) {
            list = indicatorMriBean.symptom;
        }
        if ((i & 8) != 0) {
            list2 = indicatorMriBean.tuber;
        }
        return indicatorMriBean.copy(str, str2, list, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPart() {
        return this.part;
    }

    @Nullable
    public final List<String> component3() {
        return this.symptom;
    }

    @Nullable
    public final List<Tuber> component4() {
        return this.tuber;
    }

    @NotNull
    public final IndicatorMriBean copy(@Nullable String title, @Nullable String part, @Nullable List<String> symptom, @Nullable List<Tuber> tuber) {
        return new IndicatorMriBean(title, part, symptom, tuber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorMriBean)) {
            return false;
        }
        IndicatorMriBean indicatorMriBean = (IndicatorMriBean) other;
        return Intrinsics.areEqual(this.title, indicatorMriBean.title) && Intrinsics.areEqual(this.part, indicatorMriBean.part) && Intrinsics.areEqual(this.symptom, indicatorMriBean.symptom) && Intrinsics.areEqual(this.tuber, indicatorMriBean.tuber);
    }

    @Nullable
    public final String getPart() {
        return this.part;
    }

    @Nullable
    public final List<String> getSymptom() {
        return this.symptom;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<Tuber> getTuber() {
        return this.tuber;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.part;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.symptom;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Tuber> list2 = this.tuber;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setPart(@Nullable String str) {
        this.part = str;
    }

    public final void setSymptom(@Nullable List<String> list) {
        this.symptom = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTuber(@Nullable List<Tuber> list) {
        this.tuber = list;
    }

    @NotNull
    public String toString() {
        return "IndicatorMriBean(title=" + this.title + ", part=" + this.part + ", symptom=" + this.symptom + ", tuber=" + this.tuber + ")";
    }

    public IndicatorMriBean(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<Tuber> list2) {
        this.title = str;
        this.part = str2;
        this.symptom = list;
        this.tuber = list2;
    }

    public /* synthetic */ IndicatorMriBean(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
