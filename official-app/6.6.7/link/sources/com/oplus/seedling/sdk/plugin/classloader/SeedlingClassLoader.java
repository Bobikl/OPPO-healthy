package com.oplus.seedling.sdk.plugin.classloader;

import com.oplus.aiunit.vision.n8e;
import com.oplus.aiunit.vision.o8e;
import com.oplus.seedling.sdk.SeedlingInitConfig;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006#"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/classloader/SeedlingClassLoader;", "Lcom/oplus/aiunit/vision/n8e;", "", "name", "", "shouldUseHostClassLoaderToLoadClass", "Ljava/lang/Class;", "loadClass", "dexPath", "Ljava/lang/String;", "Ljava/lang/ClassLoader;", "mHostClassLoader", "Ljava/lang/ClassLoader;", "Lcom/oplus/seedling/sdk/SeedlingInitConfig;", "mSeedlingInitConfig", "Lcom/oplus/seedling/sdk/SeedlingInitConfig;", "", "createDate", "J", "getCreateDate", "()J", "setCreateDate", "(J)V", "", "serviceDecisionApiClasses", "Ljava/util/Set;", "getServiceDecisionApiClasses", "()Ljava/util/Set;", "pantaInterfacePackages", "getPantaInterfacePackages", "filePath", "nativeLibPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;Lcom/oplus/seedling/sdk/SeedlingInitConfig;)V", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0})
public final class SeedlingClassLoader extends n8e {

    @NotNull
    private static final String CHANNEL_CLASS_PREFIX = "com.oplus.channel.server.";

    @NotNull
    private static final String SEEDLING_CLASS_PREFIX = "com.oplus.seedling.sdk.";

    @NotNull
    private static final String TAG = "SeedlingClassLoader";
    private long createDate;

    @NotNull
    private final String dexPath;

    @NotNull
    private final ClassLoader mHostClassLoader;

    @Nullable
    private final SeedlingInitConfig mSeedlingInitConfig;

    @NotNull
    private final Set<String> pantaInterfacePackages;

    @NotNull
    private final Set<String> serviceDecisionApiClasses;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedlingClassLoader(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ClassLoader classLoader, @Nullable SeedlingInitConfig seedlingInitConfig) {
        super(str, str2, str3, o8e.a(classLoader, seedlingInitConfig != null ? seedlingInitConfig.getDeltaOfLCAParentClassLoader() : 1));
        Intrinsics.checkNotNullParameter(str, "dexPath");
        Intrinsics.checkNotNullParameter(str2, "filePath");
        Intrinsics.checkNotNullParameter(str3, "nativeLibPath");
        Intrinsics.checkNotNullParameter(classLoader, "mHostClassLoader");
        this.dexPath = str;
        this.mHostClassLoader = classLoader;
        this.mSeedlingInitConfig = seedlingInitConfig;
        this.createDate = System.currentTimeMillis();
        this.serviceDecisionApiClasses = SetsKt.setOf(new String[]{"pantanal.decision.DecisionCardConfig", "pantanal.decision.DecisionObserver", "pantanal.decision.IServiceDecision", "pantanal.decision.PantaSceneInfo", "pantanal.decision.PantaSceneListObserver", "pantanal.decision.SeedlingServiceInfo", "pantanal.decision.ServiceInfo", "pantanal.decision.StatisticsBean"});
        this.pantaInterfacePackages = SetsKt.setOf(new String[]{"pantanal.app.", "pantanal.annotaions."});
    }

    private final boolean shouldUseHostClassLoaderToLoadClass(String name) {
        if (name != null && StringsKt.startsWith$default(name, SEEDLING_CLASS_PREFIX, false, 2, (Object) null)) {
            return true;
        }
        if (name != null && StringsKt.startsWith$default(name, CHANNEL_CLASS_PREFIX, false, 2, (Object) null)) {
            return true;
        }
        if ((name != null && StringsKt.startsWith$default(name, n8e.FUNCTION, false, 2, (Object) null)) || CollectionsKt.contains(this.serviceDecisionApiClasses, name)) {
            return true;
        }
        Iterator<String> it = this.pantaInterfacePackages.iterator();
        while (it.hasNext()) {
            if (name != null && StringsKt.startsWith$default(name, it.next(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final long getCreateDate() {
        return this.createDate;
    }

    @NotNull
    public final Set<String> getPantaInterfacePackages() {
        return this.pantaInterfacePackages;
    }

    @NotNull
    public final Set<String> getServiceDecisionApiClasses() {
        return this.serviceDecisionApiClasses;
    }

    @Override // java.lang.ClassLoader
    @NotNull
    public Class<?> loadClass(@Nullable String name) throws ClassNotFoundException {
        n8e.INSTANCE.a(this.dexPath);
        if (shouldUseHostClassLoaderToLoadClass(name)) {
            Class<?> clsLoadClass = this.mHostClassLoader.loadClass(name);
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "clazz");
            return clsLoadClass;
        }
        Class<?> clsLoadClass2 = super.loadClass(name);
        Intrinsics.checkNotNullExpressionValue(clsLoadClass2, "clazz");
        return clsLoadClass2;
    }

    public final void setCreateDate(long j) {
        this.createDate = j;
    }
}
