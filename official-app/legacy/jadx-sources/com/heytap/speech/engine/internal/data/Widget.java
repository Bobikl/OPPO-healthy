package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/internal/data/Widget;", "", "intentName", "", "skillId", "type", "duiWidget", "segment", "", "Lcom/heytap/speech/engine/internal/data/Segment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDuiWidget", "()Ljava/lang/String;", "setDuiWidget", "(Ljava/lang/String;)V", "getIntentName", "setIntentName", "getSegment", "()Ljava/util/List;", "setSegment", "(Ljava/util/List;)V", "getSkillId", "setSkillId", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Widget {

    @Nullable
    private String duiWidget;

    @Nullable
    private String intentName;

    @Nullable
    private List<Segment> segment;

    @Nullable
    private String skillId;

    @Nullable
    private String type;

    public Widget() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Widget copy$default(Widget widget, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widget.intentName;
        }
        if ((i & 2) != 0) {
            str2 = widget.skillId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = widget.type;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = widget.duiWidget;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = widget.segment;
        }
        return widget.copy(str, str5, str6, str7, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntentName() {
        return this.intentName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSkillId() {
        return this.skillId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDuiWidget() {
        return this.duiWidget;
    }

    @Nullable
    public final List<Segment> component5() {
        return this.segment;
    }

    @NotNull
    public final Widget copy(@Nullable String intentName, @Nullable String skillId, @Nullable String type, @Nullable String duiWidget, @Nullable List<Segment> segment) {
        return new Widget(intentName, skillId, type, duiWidget, segment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Widget)) {
            return false;
        }
        Widget widget = (Widget) other;
        return Intrinsics.areEqual(this.intentName, widget.intentName) && Intrinsics.areEqual(this.skillId, widget.skillId) && Intrinsics.areEqual(this.type, widget.type) && Intrinsics.areEqual(this.duiWidget, widget.duiWidget) && Intrinsics.areEqual(this.segment, widget.segment);
    }

    @Nullable
    public final String getDuiWidget() {
        return this.duiWidget;
    }

    @Nullable
    public final String getIntentName() {
        return this.intentName;
    }

    @Nullable
    public final List<Segment> getSegment() {
        return this.segment;
    }

    @Nullable
    public final String getSkillId() {
        return this.skillId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.intentName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skillId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.duiWidget;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Segment> list = this.segment;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final void setDuiWidget(@Nullable String str) {
        this.duiWidget = str;
    }

    public final void setIntentName(@Nullable String str) {
        this.intentName = str;
    }

    public final void setSegment(@Nullable List<Segment> list) {
        this.segment = list;
    }

    public final void setSkillId(@Nullable String str) {
        this.skillId = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "Widget(intentName=" + ((Object) this.intentName) + ", skillId=" + ((Object) this.skillId) + ", type=" + ((Object) this.type) + ", duiWidget=" + ((Object) this.duiWidget) + ", segment=" + this.segment + ')';
    }

    public Widget(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<Segment> list) {
        this.intentName = str;
        this.skillId = str2;
        this.type = str3;
        this.duiWidget = str4;
        this.segment = list;
    }

    public /* synthetic */ Widget(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }
}
