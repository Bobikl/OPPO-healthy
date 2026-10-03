package com.heytap.okhttp.extension.gslbconfig;

import com.heytap.nearx.cloudconfig.anotation.FieldIndex;
import com.oplus.aiunit.vision.zma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@zma
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/heytap/okhttp/extension/gslbconfig/GslbEntity;", "", "", "toString", "", "hashCode", "other", "", "equals", "url", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "gslbValue", "a", "c", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class GslbEntity {

    @FieldIndex(index = 2)
    @NotNull
    private String gslbValue;

    @FieldIndex(index = 1)
    @NotNull
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public GslbEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGslbValue() {
        return this.gslbValue;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gslbValue = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GslbEntity)) {
            return false;
        }
        GslbEntity gslbEntity = (GslbEntity) other;
        return Intrinsics.areEqual(this.url, gslbEntity.url) && Intrinsics.areEqual(this.gslbValue, gslbEntity.gslbValue);
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.gslbValue;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GslbEntity(url=" + this.url + ", gslbValue=" + this.gslbValue + ")";
    }

    public GslbEntity(@NotNull String url, @NotNull String gslbValue) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(gslbValue, "gslbValue");
        this.url = url;
        this.gslbValue = gslbValue;
    }

    public /* synthetic */ GslbEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
