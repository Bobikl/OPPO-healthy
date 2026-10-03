package com.oplus.seedling.sdk.seedling;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/RemoteViewText;", "", "text", "", "color", "fontSize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)V", "getColor", "()Ljava/lang/String;", "getFontSize", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getText", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Lcom/oplus/seedling/sdk/seedling/RemoteViewText;", "equals", "", "other", "hashCode", "", "toString", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RemoteViewText {

    @Nullable
    private final String color;

    @Nullable
    private final Float fontSize;

    @Nullable
    private final String text;

    public RemoteViewText() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RemoteViewText copy$default(RemoteViewText remoteViewText, String str, String str2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteViewText.text;
        }
        if ((i & 2) != 0) {
            str2 = remoteViewText.color;
        }
        if ((i & 4) != 0) {
            f = remoteViewText.fontSize;
        }
        return remoteViewText.copy(str, str2, f);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getFontSize() {
        return this.fontSize;
    }

    @NotNull
    public final RemoteViewText copy(@Nullable String text, @Nullable String color, @Nullable Float fontSize) {
        return new RemoteViewText(text, color, fontSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteViewText)) {
            return false;
        }
        RemoteViewText remoteViewText = (RemoteViewText) other;
        return Intrinsics.areEqual(this.text, remoteViewText.text) && Intrinsics.areEqual(this.color, remoteViewText.color) && Intrinsics.areEqual((Object) this.fontSize, (Object) remoteViewText.fontSize);
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final Float getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.fontSize;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RemoteViewText(text=" + this.text + ", color=" + this.color + ", fontSize=" + this.fontSize + ")";
    }

    public RemoteViewText(@Nullable String str, @Nullable String str2, @Nullable Float f) {
        this.text = str;
        this.color = str2;
        this.fontSize = f;
    }

    public /* synthetic */ RemoteViewText(String str, String str2, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : f);
    }
}
