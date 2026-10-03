package com.oplus.nearx.track.internal.storage.sp;

import android.content.Context;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.dxe;
import com.oplus.aiunit.vision.tx9;
import com.oplus.aiunit.vision.z0h;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.utils.ProcessUtil;
import io.protostuff.MapSchema;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001b\u0010!\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010 R\u001b\u0010\"\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/sp/SharePreferenceHelper;", "", "Lcom/oplus/aiunit/vision/tx9;", b2n.g, "", "appId", "i", "", b2n.f, "c", "a", "Ljava/lang/String;", "getFILE_NAME_TRACK_SP", "()Ljava/lang/String;", "setFILE_NAME_TRACK_SP", "(Ljava/lang/String;)V", "FILE_NAME_TRACK_SP", "Ljava/util/concurrent/ConcurrentHashMap;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "sharePreferenceMap", "", "Z", "enableUploadProcess", "d", "spName", "Landroid/content/Context;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Lazy;", "()Landroid/content/Context;", "context", "f", "()Lcom/oplus/aiunit/vision/tx9;", "preferenceImpl", "sharePreferenceProcessImpl", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class SharePreferenceHelper {

    @NotNull
    public static final SharePreferenceHelper INSTANCE = new SharePreferenceHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String FILE_NAME_TRACK_SP;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<Long, tx9> sharePreferenceMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final boolean enableUploadProcess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final String spName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy context;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy preferenceImpl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Lazy sharePreferenceProcessImpl;

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        GlobalConfigHelper globalConfigHelper = GlobalConfigHelper.INSTANCE;
        sb.append(globalConfigHelper.n());
        sb.append("track_preference");
        FILE_NAME_TRACK_SP = sb.toString();
        sharePreferenceMap = new ConcurrentHashMap<>();
        boolean zF = globalConfigHelper.f();
        enableUploadProcess = zF;
        ProcessUtil processUtil = ProcessUtil.INSTANCE;
        if (processUtil.g() || !zF) {
            str = FILE_NAME_TRACK_SP;
        } else {
            str = FILE_NAME_TRACK_SP + '_' + processUtil.b();
        }
        spName = str;
        context = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.oplus.nearx.track.internal.storage.sp.SharePreferenceHelper$context$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                return GlobalConfigHelper.INSTANCE.c();
            }
        });
        preferenceImpl = LazyKt__LazyJVMKt.lazy(new Function0<z0h>() { // from class: com.oplus.nearx.track.internal.storage.sp.SharePreferenceHelper$preferenceImpl$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final z0h invoke() {
                return new z0h(SharePreferenceHelper.INSTANCE.d(), SharePreferenceHelper.spName);
            }
        });
        sharePreferenceProcessImpl = LazyKt__LazyJVMKt.lazy(new Function0<dxe>() { // from class: com.oplus.nearx.track.internal.storage.sp.SharePreferenceHelper$sharePreferenceProcessImpl$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final dxe invoke() {
                return new dxe(SharePreferenceHelper.INSTANCE.d(), SharePreferenceHelper.spName);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final tx9 h() {
        return enableUploadProcess ? INSTANCE.e() : INSTANCE.f();
    }

    @JvmStatic
    @NotNull
    public static final tx9 i(long appId) {
        tx9 tx9Var = sharePreferenceMap.get(Long.valueOf(appId));
        return tx9Var == null ? INSTANCE.c(appId) : tx9Var;
    }

    public final tx9 c(long appId) {
        ConcurrentHashMap<Long, tx9> concurrentHashMap = sharePreferenceMap;
        if (concurrentHashMap.get(Long.valueOf(appId)) == null) {
            concurrentHashMap.putIfAbsent(Long.valueOf(appId), enableUploadProcess ? new z0h(GlobalConfigHelper.INSTANCE.c(), g(appId)) : new dxe(GlobalConfigHelper.INSTANCE.c(), g(appId)));
        }
        tx9 tx9Var = concurrentHashMap.get(Long.valueOf(appId));
        Intrinsics.checkNotNull(tx9Var);
        return tx9Var;
    }

    public final Context d() {
        return (Context) context.getValue();
    }

    public final tx9 e() {
        return (tx9) preferenceImpl.getValue();
    }

    public final tx9 f() {
        return (tx9) sharePreferenceProcessImpl.getValue();
    }

    public final String g(long appId) {
        ProcessUtil processUtil = ProcessUtil.INSTANCE;
        if (processUtil.g() || !enableUploadProcess) {
            return FILE_NAME_TRACK_SP + '_' + appId;
        }
        return FILE_NAME_TRACK_SP + '_' + processUtil.b() + '_' + appId;
    }
}
