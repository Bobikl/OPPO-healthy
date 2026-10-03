package com.heytap.common.manager;

import android.content.Context;
import android.os.Build;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.dm9;
import com.oplus.aiunit.vision.r7b;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001b\u0010\u0010\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\f\u0010\u001aR\u0019\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f¨\u0006#"}, d2 = {"Lcom/heytap/common/manager/ApkInfo;", "Lcom/oplus/aiunit/vision/dm9;", "", "packageName", "a", "model", "brand", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "TAG", "b", "OBRAND_ROM_VERSION", "c", "Lkotlin/Lazy;", "f", "()Ljava/lang/String;", "versionName", "", "d", "getVersionCode", "()I", "versionCode", "I", "sDebugable", "Landroid/content/Context;", "Landroid/content/Context;", "()Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/r7b;", b2n.f, "Lcom/oplus/aiunit/vision/r7b;", "()Lcom/oplus/aiunit/vision/r7b;", "logger", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/r7b;)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class ApkInfo implements dm9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String OBRAND_ROM_VERSION;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy versionName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy versionCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int sDebugable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final r7b logger;

    public ApkInfo(@NotNull Context context, @Nullable r7b r7bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logger = r7bVar;
        this.TAG = "Util";
        this.OBRAND_ROM_VERSION = "ro.build_bak.display.id";
        this.versionName = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.common.manager.ApkInfo$versionName$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                try {
                    String str = this.this$0.getContext().getPackageManager().getPackageInfo(this.this$0.getContext().getPackageName(), 0).versionName;
                    Intrinsics.checkNotNullExpressionValue(str, "info.versionName");
                    return str;
                } catch (Throwable unused) {
                    return "0";
                }
            }
        });
        this.versionCode = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.common.manager.ApkInfo$versionCode$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                try {
                    return this.this$0.getContext().getPackageManager().getPackageInfo(this.this$0.getContext().getPackageName(), 0).versionCode;
                } catch (Throwable unused) {
                    r7b logger = this.this$0.getLogger();
                    if (logger == null) {
                        return 0;
                    }
                    r7b.d(logger, this.this$0.TAG, "getVersionCode--Exception", null, null, 12, null);
                    return 0;
                }
            }
        });
        this.sDebugable = -1;
    }

    @Override // com.oplus.aiunit.vision.dm9
    @NotNull
    public String a() {
        return f();
    }

    @Override // com.oplus.aiunit.vision.dm9
    @NotNull
    public String brand() {
        String str = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str, "Build.BRAND");
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final r7b getLogger() {
        return this.logger;
    }

    @NotNull
    public final String e() {
        try {
            String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).packageName;
            Intrinsics.checkNotNullExpressionValue(str, "info.packageName");
            return str;
        } catch (Throwable th) {
            r7b r7bVar = this.logger;
            if (r7bVar != null) {
                r7b.d(r7bVar, this.TAG, "getPackageName:" + th, null, null, 12, null);
            }
            return "0";
        }
    }

    @NotNull
    public final String f() {
        return (String) this.versionName.getValue();
    }

    @Override // com.oplus.aiunit.vision.dm9
    @NotNull
    public String model() {
        String str = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "Build.MODEL");
        return str;
    }

    @Override // com.oplus.aiunit.vision.dm9
    @NotNull
    public String packageName() {
        return e();
    }
}
