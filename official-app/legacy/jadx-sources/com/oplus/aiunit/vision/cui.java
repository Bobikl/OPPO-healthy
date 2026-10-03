package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/cui;", "", "Companion", "a", "databaseengine_release"}, k = 1, mv = {1, 8, 0})
public final class cui {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.cui$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/cui$a;", "", "Landroid/content/Context;", "context", "", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "databaseengine_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean a(@Nullable Context context) {
            Object objM5287constructorimpl;
            boolean z = false;
            if (context != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    File externalFilesDir = context.getApplicationContext().getExternalFilesDir(null);
                    StatFs statFs = new StatFs(externalFilesDir != null ? externalFilesDir.getPath() : null);
                    long availableBytes = statFs.getAvailableBytes();
                    z = availableBytes < 104857600;
                    if (z) {
                        me8.e("StorageCheckUtil", "total space:" + statFs.getTotalBytes() + ", available space:" + availableBytes + ", less is:" + z + ", cost time is:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                    }
                    objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl != null) {
                    me8.i("StorageCheckUtil", "error:" + thM5290exceptionOrNullimpl.getMessage());
                }
                Result.m5286boximpl(objM5287constructorimpl);
            }
            return z;
        }
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context) {
        return INSTANCE.a(context);
    }
}
