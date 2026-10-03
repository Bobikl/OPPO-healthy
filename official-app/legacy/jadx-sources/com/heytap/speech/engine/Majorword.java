package com.heytap.speech.engine;

import androidx.annotation.Keep;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015JD\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/Majorword;", "", "greeting", "", "", "name", "pinyin", EventType.EventAssociationExtra.THRESHOLD, "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getGreeting", "()Ljava/util/List;", "setGreeting", "(Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPinyin", "setPinyin", "getThreshold", "()Ljava/lang/Double;", "setThreshold", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/heytap/speech/engine/Majorword;", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Majorword {

    @Nullable
    private List<String> greeting;

    @Nullable
    private String name;

    @Nullable
    private String pinyin;

    @Nullable
    private Double threshold;

    public Majorword() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Majorword copy$default(Majorword majorword, List list, String str, String str2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            list = majorword.greeting;
        }
        if ((i & 2) != 0) {
            str = majorword.name;
        }
        if ((i & 4) != 0) {
            str2 = majorword.pinyin;
        }
        if ((i & 8) != 0) {
            d = majorword.threshold;
        }
        return majorword.copy(list, str, str2, d);
    }

    @Nullable
    public final List<String> component1() {
        return this.greeting;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPinyin() {
        return this.pinyin;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getThreshold() {
        return this.threshold;
    }

    @NotNull
    public final Majorword copy(@Nullable List<String> greeting, @Nullable String name, @Nullable String pinyin, @Nullable Double threshold) {
        return new Majorword(greeting, name, pinyin, threshold);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Majorword)) {
            return false;
        }
        Majorword majorword = (Majorword) other;
        return Intrinsics.areEqual(this.greeting, majorword.greeting) && Intrinsics.areEqual(this.name, majorword.name) && Intrinsics.areEqual(this.pinyin, majorword.pinyin) && Intrinsics.areEqual((Object) this.threshold, (Object) majorword.threshold);
    }

    @Nullable
    public final List<String> getGreeting() {
        return this.greeting;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPinyin() {
        return this.pinyin;
    }

    @Nullable
    public final Double getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        List<String> list = this.greeting;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pinyin;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.threshold;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }

    public final void setGreeting(@Nullable List<String> list) {
        this.greeting = list;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPinyin(@Nullable String str) {
        this.pinyin = str;
    }

    public final void setThreshold(@Nullable Double d) {
        this.threshold = d;
    }

    @NotNull
    public String toString() {
        return "Majorword(greeting=" + this.greeting + ", name=" + ((Object) this.name) + ", pinyin=" + ((Object) this.pinyin) + ", threshold=" + this.threshold + ')';
    }

    public Majorword(@Nullable List<String> list, @Nullable String str, @Nullable String str2, @Nullable Double d) {
        this.greeting = list;
        this.name = str;
        this.pinyin = str2;
        this.threshold = d;
    }

    public /* synthetic */ Majorword(List list, String str, String str2, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : d);
    }
}
