package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0010\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\t\u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010$\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/v11;", "", "", "", "choices", "", b2n.g, "([Ljava/lang/String;)V", "", "a", "Ljava/lang/CharSequence;", b2n.f, "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "b", "f", "setSummary", "summary", "", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "animTitles", "", MapSchema.FIELD_NAME_ENTRY, "I", "()I", "setSelectedIndex", "(I)V", "selectedIndex", "setAnimHeight", "animHeight", "setAnimWidth", "animWidth", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "coui-support-card_release"}, k = 1, mv = {1, 8, 0})
public class v11 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public CharSequence title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public CharSequence summary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> choices;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<String> animTitles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int selectedIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int animHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int animWidth;

    public v11(@NotNull CharSequence title, @NotNull CharSequence summary) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.title = title;
        this.summary = summary;
        this.choices = new ArrayList();
        this.animTitles = new ArrayList();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAnimHeight() {
        return this.animHeight;
    }

    @NotNull
    public final List<String> b() {
        return this.animTitles;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAnimWidth() {
        return this.animWidth;
    }

    @NotNull
    public final List<String> d() {
        return this.choices;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final CharSequence getSummary() {
        return this.summary;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    public final void h(@NotNull String[] choices) {
        Intrinsics.checkNotNullParameter(choices, "choices");
        this.choices.clear();
        CollectionsKt__MutableCollectionsKt.addAll(this.choices, choices);
    }
}
