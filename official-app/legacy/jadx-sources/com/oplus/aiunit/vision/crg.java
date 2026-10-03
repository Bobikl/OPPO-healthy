package com.oplus.aiunit.vision;

import android.database.ContentObserver;
import android.net.Uri;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0007*\u0001-\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007R\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b\u0019\u0010!\"\u0004\b\"\u0010#R(\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0016\u0010!\"\u0004\b&\u0010#R\"\u0010)\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/oplus/aiunit/vision/crg;", "", "Landroid/net/Uri;", ParserTag.TAG_URI, "", MapSchema.FIELD_NAME_ENTRY, b2n.f, "", "serviceId", "fileHash", "", "f", "hash", b2n.g, "TAG", "Ljava/lang/String;", "a", "Landroid/net/Uri;", "loadFailUri", "b", "initSdkFailUri", "", "c", "Ljava/util/Map;", "upkFileHashMap", "d", "Ljava/lang/Object;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "", "Ljava/util/Set;", "()Ljava/util/Set;", "setMShouldRenderFailServiceIds", "(Ljava/util/Set;)V", "mShouldRenderFailServiceIds", "", "setMShouldRenderFailPositionsInDecisionList", "mShouldRenderFailPositionsInDecisionList", "Z", "isForceInitSdkFail", "()Z", "setForceInitSdkFail", "(Z)V", "com/oplus/aiunit/vision/crg$a", "i", "Lcom/oplus/aiunit/vision/crg$a;", "mContentObserver", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class crg {

    @NotNull
    public static final crg INSTANCE = new crg();

    @NotNull
    public static final String TAG = "SeedlingSdkDebugUtil";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Uri loadFailUri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Uri initSdkFailUri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, String> upkFileHashMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Object lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isRegistered;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static Set<String> mShouldRenderFailServiceIds;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static Set<Integer> mShouldRenderFailPositionsInDecisionList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static boolean isForceInitSdkFail;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final a mContentObserver;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/crg$a", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "onChange", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends ContentObserver {
        public a() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, @Nullable Uri uri) {
            String path;
            String path2;
            super.onChange(selfChange, uri);
            f7b.l(crg.TAG, Intrinsics.stringPlus("onChange uri = ", uri));
            if ((uri == null || (path = uri.getPath()) == null || !StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) "loadfail", false, 2, (Object) null)) ? false : true) {
                crg.g(uri);
                return;
            }
            if ((uri == null || (path2 = uri.getPath()) == null || !StringsKt__StringsKt.contains$default((CharSequence) path2, (CharSequence) "initsdkfail", false, 2, (Object) null)) ? false : true) {
                crg.e(uri);
            }
        }
    }

    static {
        Uri uri = Uri.parse("content://com.oplus.seedlingsdk.developer/loadfail");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(\"content://$AUTHORITY/$PATH_LOAD_FAIL\")");
        loadFailUri = uri;
        Uri uri2 = Uri.parse("content://com.oplus.seedlingsdk.developer/initsdkfail");
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(\"content://$AUTHORITY/$PATH_INIT_SDK_FAIL\")");
        initSdkFailUri = uri2;
        upkFileHashMap = new ConcurrentHashMap();
        lock = new Object();
        isRegistered = new AtomicBoolean(false);
        mShouldRenderFailServiceIds = new LinkedHashSet();
        mShouldRenderFailPositionsInDecisionList = new LinkedHashSet();
        mContentObserver = new a();
    }

    @JvmStatic
    public static final void e(Uri uri) {
        String queryParameter = uri.getQueryParameter("is_trigger_init_sdk_fail");
        isForceInitSdkFail = Intrinsics.areEqual("1", queryParameter);
        f7b.d(TAG, "loadFailOnChange getQueryParameter paramsIsInitFail = " + ((Object) queryParameter) + ", isForceInitSdkFail = " + isForceInitSdkFail);
    }

    @JvmStatic
    public static final synchronized boolean f(@NotNull String serviceId, @Nullable String fileHash) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        String str = upkFileHashMap.get(serviceId);
        boolean z = true;
        if (str == null) {
            f7b.l(TAG, "last hash is null, need to copy from ums, isAlwaysUseUmsUpk = true");
            return true;
        }
        if (Intrinsics.areEqual(str, fileHash)) {
            z = false;
        }
        f7b.l(TAG, "lastHash = " + ((Object) str) + ", fileHash = " + ((Object) fileHash) + ", isAlwaysUseUmsUpk = " + z);
        return z;
    }

    @JvmStatic
    public static final void g(Uri uri) {
        mShouldRenderFailServiceIds.clear();
        mShouldRenderFailPositionsInDecisionList.clear();
        String queryParameter = uri.getQueryParameter(Constants.KEY_SERVICE_IDS);
        String queryParameter2 = uri.getQueryParameter("positions");
        f7b.d(TAG, Intrinsics.stringPlus("loadFailOnChange getQueryParameter serviceIds = ", queryParameter));
        f7b.d(TAG, Intrinsics.stringPlus("loadFailOnChange getQueryParameter positions = ", queryParameter2));
        if (queryParameter != null && (!StringsKt__StringsJVMKt.isBlank(queryParameter))) {
            INSTANCE.d().addAll(CollectionsKt___CollectionsKt.toSet(StringsKt__StringsKt.split$default((CharSequence) queryParameter, new String[]{","}, false, 0, 6, (Object) null)));
        }
        if (queryParameter2 != null && (!StringsKt__StringsJVMKt.isBlank(queryParameter2))) {
            Set<Integer> setC = INSTANCE.c();
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) queryParameter2, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            setC.addAll(arrayList);
        }
        f7b.d(TAG, Intrinsics.stringPlus("loadFailOnChange mShouldRenderFailServiceIds = ", mShouldRenderFailServiceIds));
        f7b.d(TAG, Intrinsics.stringPlus("loadFailOnChange mShouldRenderFailPositionsInDecisionList = ", mShouldRenderFailPositionsInDecisionList));
    }

    @JvmStatic
    public static final synchronized void h(@NotNull String serviceId, @Nullable String hash) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        upkFileHashMap.put(serviceId, hash);
    }

    @NotNull
    public final Set<Integer> c() {
        return mShouldRenderFailPositionsInDecisionList;
    }

    @NotNull
    public final Set<String> d() {
        return mShouldRenderFailServiceIds;
    }
}
