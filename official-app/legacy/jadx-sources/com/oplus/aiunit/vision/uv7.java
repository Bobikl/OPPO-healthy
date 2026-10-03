package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001bj\b\u0012\u0004\u0012\u00020\u0006`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/uv7;", "", "Landroid/content/Context;", "context", "", "d", "Lcom/oplus/aiunit/vision/uv7$a;", "observer", "f", b2n.g, "", "SYSTEM_FOLDING_MODE_KEY", "Ljava/lang/String;", "", "SYSTEM_FOLDING_MODE_UNSUPPORTED", "I", "SYSTEM_FOLDING_MODE_OPEN", "SYSTEM_FOLDING_MODE_CLOSE", "a", "c", "()I", b2n.f, "(I)V", "foldStatus", "Landroid/database/ContentObserver;", "b", "Landroid/database/ContentObserver;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "foldObservers", "Landroid/content/Context;", "appContext", "", MapSchema.FIELD_NAME_ENTRY, "()Z", "isSupportFoldScreen", "<init>", "()V", "coui-support-component_release"}, k = 1, mv = {1, 8, 0})
public final class uv7 {
    public static final int SYSTEM_FOLDING_MODE_CLOSE = 0;

    @NotNull
    public static final String SYSTEM_FOLDING_MODE_KEY = "oplus_system_folding_mode";
    public static final int SYSTEM_FOLDING_MODE_OPEN = 1;
    public static final int SYSTEM_FOLDING_MODE_UNSUPPORTED = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static ContentObserver observer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static Context appContext;

    @NotNull
    public static final uv7 INSTANCE = new uv7();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int foldStatus = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ArrayList<a> foldObservers = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/uv7$a;", "", "", "foldStatus", "", "a", "coui-support-component_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(int foldStatus);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/uv7$b", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "coui-support-component_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFoldSettingsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FoldSettingsHelper.kt\ncom/coui/appcompat/baseview/util/FoldSettingsHelper$registerFoldObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1855#2,2:132\n*S KotlinDebug\n*F\n+ 1 FoldSettingsHelper.kt\ncom/coui/appcompat/baseview/util/FoldSettingsHelper$registerFoldObserver$1\n*L\n99#1:132,2\n*E\n"})
    public static final class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            uv7 uv7Var = uv7.INSTANCE;
            Context context = uv7.appContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context = null;
            }
            uv7Var.g(Settings.Global.getInt(context.getContentResolver(), "oplus_system_folding_mode", -1));
            bj2.a("FoldSettingsHelper", "FoldSettings.onChange=" + uv7Var.c());
            Iterator it = uv7.foldObservers.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(uv7.INSTANCE.c());
            }
        }
    }

    public final int c() {
        return foldStatus;
    }

    public final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        appContext = applicationContext;
        if (applicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            applicationContext = null;
        }
        foldStatus = Settings.Global.getInt(applicationContext.getContentResolver(), "oplus_system_folding_mode", -1);
    }

    public final boolean e() {
        return foldStatus != -1;
    }

    public final void f(@NotNull a observer2) {
        Intrinsics.checkNotNullParameter(observer2, "observer");
        if (observer == null) {
            b bVar = new b(new Handler(Looper.getMainLooper()));
            Context context = appContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context = null;
            }
            context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("oplus_system_folding_mode"), false, bVar);
            observer = bVar;
        }
        foldObservers.add(observer2);
    }

    public final void g(int i) {
        foldStatus = i;
    }

    public final void h(@NotNull a observer2) {
        Intrinsics.checkNotNullParameter(observer2, "observer");
        ArrayList<a> arrayList = foldObservers;
        arrayList.remove(observer2);
        if (arrayList.isEmpty()) {
            ContentObserver contentObserver = observer;
            if (contentObserver != null) {
                Context context = appContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appContext");
                    context = null;
                }
                context.getContentResolver().unregisterContentObserver(contentObserver);
            }
            observer = null;
        }
    }
}
