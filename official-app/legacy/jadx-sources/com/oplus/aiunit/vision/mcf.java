package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.cqf;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B3\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/mcf;", "Lcom/oplus/aiunit/vision/cqf;", "Req", "", "Rsp", "Lcom/oplus/aiunit/vision/gea$a;", "request", "()Lcom/oplus/aiunit/vision/cqf;", "a", "(Lcom/oplus/aiunit/vision/cqf;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/oplus/aiunit/vision/gea;", "Ljava/util/List;", "interceptors", "b", "Lcom/oplus/aiunit/vision/cqf;", "", "c", "I", "index", "<init>", "(Ljava/util/List;Lcom/oplus/aiunit/vision/cqf;I)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class mcf<Req extends cqf, Rsp> implements gea.a<Req, Rsp> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<gea<Req, Rsp>> interceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Req request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int index;

    /* JADX WARN: Multi-variable type inference failed */
    public mcf(@NotNull List<? extends gea<Req, Rsp>> interceptors, @NotNull Req request, int i) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.interceptors = interceptors;
        this.request = request;
        this.index = i;
    }

    @Override // com.oplus.aiunit.vision.gea.a
    @Nullable
    public Object a(@NotNull Req req, @NotNull Continuation<? super Rsp> continuation) {
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("index >= interceptors.size");
        }
        return this.interceptors.get(this.index).a(new mcf(this.interceptors, req, this.index + 1), continuation);
    }

    @Override // com.oplus.aiunit.vision.gea.a
    @NotNull
    public Req request() {
        return this.request;
    }

    public /* synthetic */ mcf(List list, cqf cqfVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, cqfVar, (i2 & 4) != 0 ? 0 : i);
    }
}
