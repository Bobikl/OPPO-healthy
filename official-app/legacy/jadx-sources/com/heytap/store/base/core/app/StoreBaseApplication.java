package com.heytap.store.base.core.app;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.base.core.initializer.ApplicationInitializer;
import com.heytap.store.platform.mvvm.ViewModelApplication;
import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0005H\u0004R7\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/base/core/app/StoreBaseApplication;", "Lcom/heytap/store/platform/mvvm/ViewModelApplication;", "()V", "initializerMap", "Ljava/util/LinkedHashMap;", "", "Lcom/heytap/store/base/core/initializer/ApplicationInitializer;", "Lkotlin/collections/LinkedHashMap;", "getInitializerMap", "()Ljava/util/LinkedHashMap;", "initializerMap$delegate", "Lkotlin/Lazy;", "addInitializer", "", "pair", "Lkotlin/Pair;", "applicationInitializer", "onCallApplicationInitializer", "onCreate", "removeInitializer", "initializerKey", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class StoreBaseApplication extends ViewModelApplication {
    private static StoreBaseApplication APP;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: initializerMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy initializerMap = LazyKt__LazyJVMKt.lazy(new Function0<LinkedHashMap<String, ApplicationInitializer>>() { // from class: com.heytap.store.base.core.app.StoreBaseApplication$initializerMap$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final LinkedHashMap<String, ApplicationInitializer> invoke() {
            return new LinkedHashMap<>();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/base/core/app/StoreBaseApplication$Companion;", "", "()V", "APP", "Lcom/heytap/store/base/core/app/StoreBaseApplication;", ParserTag.TAG_GET, ExifInterface.GPS_DIRECTION_TRUE, "()Lcom/heytap/store/base/core/app/StoreBaseApplication;", "getProcessName", "", "baseApp", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <T extends StoreBaseApplication> T get() {
            T t = (T) StoreBaseApplication.APP;
            if (t != null) {
                return t;
            }
            Intrinsics.throwUninitializedPropertyAccessException("APP");
            return null;
        }

        @NotNull
        public final String getProcessName(@NotNull StoreBaseApplication baseApp) {
            Intrinsics.checkNotNullParameter(baseApp, "baseApp");
            String processName = Application.getProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "{\n                Applic…ocessName()\n            }");
            return processName;
        }
    }

    public StoreBaseApplication() {
        APP = this;
        applicationInitializer();
    }

    @JvmStatic
    @NotNull
    public static final <T extends StoreBaseApplication> T get() {
        return (T) INSTANCE.get();
    }

    private final LinkedHashMap<String, ApplicationInitializer> getInitializerMap() {
        return (LinkedHashMap) this.initializerMap.getValue();
    }

    private final void onCallApplicationInitializer() {
        LinkedHashMap<String, ApplicationInitializer> initializerMap = getInitializerMap();
        ArrayList arrayList = new ArrayList(initializerMap.size());
        Iterator<Map.Entry<String, ApplicationInitializer>> it = initializerMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ApplicationInitializer) it2.next()).initialize(this);
        }
    }

    public void addInitializer(@NotNull Pair<String, ? extends ApplicationInitializer> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        getInitializerMap().put(pair.getFirst(), pair.getSecond());
    }

    public void applicationInitializer() {
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        onCallApplicationInitializer();
    }

    public final void removeInitializer(@NotNull String initializerKey) {
        Intrinsics.checkNotNullParameter(initializerKey, "initializerKey");
        getInitializerMap().remove(initializerKey);
    }
}
