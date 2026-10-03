package com.oplus.aiunit.vision;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\n\u0010\u0011R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/v8f;", "", "", "a", "Z", "h", "()Z", "isDistinct", "", "", "b", "[Ljava/lang/String;", "()[Ljava/lang/String;", "columns", "c", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "selection", "d", "g", "selectionArgs", "e", "groupBy", "having", "orderBy", "limit", "<init>", "(Z[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class v8f {
    public final boolean a;

    @Nullable
    public final String[] b;

    @Nullable
    public final String c;

    @Nullable
    public final String[] d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    public v8f(boolean z, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.a = z;
        this.b = strArr;
        this.c = str;
        this.d = strArr2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String[] getB() {
        return this.b;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getH() {
        return this.h;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getG() {
        return this.g;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String[] getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    public /* synthetic */ v8f(boolean z, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : strArr, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : strArr2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & Barcode.FORMAT_ITF) == 0 ? str5 : null);
    }
}
