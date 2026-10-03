package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/internal/data/Segment;", "", "name", "", "pinyin", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPinyin", "setPinyin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Segment {

    @Nullable
    private String name;

    @Nullable
    private String pinyin;

    /* JADX WARN: Multi-variable type inference failed */
    public Segment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Segment copy$default(Segment segment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segment.name;
        }
        if ((i & 2) != 0) {
            str2 = segment.pinyin;
        }
        return segment.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPinyin() {
        return this.pinyin;
    }

    @NotNull
    public final Segment copy(@Nullable String name, @Nullable String pinyin) {
        return new Segment(name, pinyin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return Intrinsics.areEqual(this.name, segment.name) && Intrinsics.areEqual(this.pinyin, segment.pinyin);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPinyin() {
        return this.pinyin;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pinyin;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPinyin(@Nullable String str) {
        this.pinyin = str;
    }

    @NotNull
    public String toString() {
        return "Segment(name=" + ((Object) this.name) + ", pinyin=" + ((Object) this.pinyin) + ')';
    }

    public Segment(@Nullable String str, @Nullable String str2) {
        this.name = str;
        this.pinyin = str2;
    }

    public /* synthetic */ Segment(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
