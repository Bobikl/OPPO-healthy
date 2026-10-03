package com.heytap.health.connect.rawapi;

import android.content.Context;
import com.oplus.aiunit.vision.cm9;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/connect/rawapi/c;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/connect/rawapi/IHeytap;", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "", "c", "b", "Ljava/io/PrintWriter;", "writer", "", "", "args", "a", "(Ljava/io/PrintWriter;[Ljava/lang/String;)V", "<init>", "()V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
public final class c implements cm9<IHeytap> {
    @Override // com.oplus.aiunit.vision.cm9
    public void a(@NotNull PrintWriter writer, @NotNull String[] args) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(args, "args");
        b.INSTANCE.a().c(writer, args);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b.INSTANCE.a().g();
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b.INSTANCE.a().f(context);
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IHeytap d() {
        return b.INSTANCE.a().d();
    }
}
