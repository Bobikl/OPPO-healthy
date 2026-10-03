package com.oplus.aiunit.vision;

import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u001f\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR2\u0010\u0010\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\n\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/wu6;", "", "other", "", "equals", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "a", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "()Lcom/heytap/speech/engine/protocol/directive/Directive;", "d", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "list", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "origin", "<init>", "(Lcom/heytap/speech/engine/protocol/directive/Directive;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class wu6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Directive<? extends DirectivePayload> d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends Directive<? extends DirectivePayload>> list;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String origin;

    public wu6(@NotNull Directive<? extends DirectivePayload> d) {
        Intrinsics.checkNotNullParameter(d, "d");
        this.d = d;
    }

    @NotNull
    public final Directive<? extends DirectivePayload> a() {
        return this.d;
    }

    @Nullable
    public final List<Directive<? extends DirectivePayload>> b() {
        return this.list;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    public final void d(@Nullable List<? extends Directive<? extends DirectivePayload>> list) {
        this.list = list;
    }

    public final void e(@Nullable String str) {
        this.origin = str;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof wu6) {
            return this == other || Intrinsics.areEqual(this.d, ((wu6) other).d);
        }
        return false;
    }
}
