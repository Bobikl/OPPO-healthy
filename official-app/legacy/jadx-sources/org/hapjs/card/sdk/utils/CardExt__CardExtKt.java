package org.hapjs.card.sdk.utils;

import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.os.Handler;
import android.util.Log;
import com.amap.api.maps.model.MyLocationStyle;
import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.nearme.instant.xcard.CardClient;
import com.nearme.instant.xcard.track.CardEventTracker;
import com.nearme.instant.xcard.track.IEventTracker;
import com.nearme.instant.xcard.track.TrackerType;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.ExceptionsKt__ExceptionsKt;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.CharsKt__CharJVMKt;
import p010kotlin.text.StringsKt__StringsKt;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0006\u0010\n\u001a\u00020\u0004\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a>\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u001a \u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u001a\u0012\u0010\u0018\u001a\u00020\u0004*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0001\u001a\n\u0010\u001b\u001a\u00020\u0001*\u00020\t\u001a\"\u0010\u001c\u001a\u00020\f*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004\u001a.\u0010\u001c\u001a\u00020\f*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010$\u001a6\u0010\u001c\u001a\u00020\f*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010!\u001a\u00020\u0004\u001a\n\u0010%\u001a\u00020\f*\u00020&\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"INSTANT_KEY", "", "INSTANT_SECRET", "RECEIVER_EXPORTED", "", "TAG", "createPluginAssertManager", "Landroid/content/res/AssetManager;", "sourceDir", "Ljava/io/File;", "getSignaturesFlags", "initEventTrackerIfNeeded", "", HttpHeaders.CTX, "Landroid/content/Context;", "reportEngineInitError", "errorCode", "error", "", "hotLoad", "", "forceUpdate", "resetDefault", "reportHotLoadEngineError", "extractVersion", "Lcom/nearme/instant/xcard/CardClient;", "versionName", "getFileMD5", "registerReceiverExt", "receiver", "Landroid/content/BroadcastReceiver;", "filter", "Landroid/content/IntentFilter;", UTraceSQLiteHelperKt.COL_FLAGS, "broadcastPermission", "scheduler", "Landroid/os/Handler;", "safeClose", "Landroid/content/ContentProviderClient;", "card-sdk_liteRelease"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "org/hapjs/card/sdk/utils/CardExt")
final /* synthetic */ class CardExt__CardExtKt {

    @NotNull
    private static final String INSTANT_KEY = "1255";

    @NotNull
    private static final String INSTANT_SECRET = "Vhnmx6oS9A3rhu0rAUrBIvysJTCcROeW";

    @Nullable
    public static final AssetManager createPluginAssertManager(@NotNull File sourceDir) {
        Intrinsics.checkNotNullParameter(sourceDir, "sourceDir");
        try {
            AssetManager assetManager = (AssetManager) AssetManager.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            Method method = AssetManager.class.getMethod("addAssetPath", String.class);
            method.setAccessible(true);
            method.invoke(assetManager, sourceDir.getAbsolutePath());
            return assetManager;
        } catch (Exception e2) {
            Log.w(CardExt.TAG, "createAssertManager " + e2.getMessage());
            return null;
        }
    }

    public static final int extractVersion(@NotNull CardClient cardClient, @NotNull String versionName) {
        String strGroup;
        Intrinsics.checkNotNullParameter(cardClient, "<this>");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Pattern patternCompile = Pattern.compile("(\\d+)\\.(\\d+){0,2}\\.(\\d+){0,2}");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(versionName);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (!matcher.find() || matcher.groupCount() < 3) {
            return -1;
        }
        String strGroup2 = matcher.group(1);
        String str = null;
        if (strGroup2 != null && (strGroup = matcher.group(2)) != null) {
            Intrinsics.checkNotNull(strGroup);
            String strGroup3 = matcher.group(3);
            if (strGroup3 != null) {
                Intrinsics.checkNotNull(strGroup3);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format(Locale.US, "%02d%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(Integer.parseInt(strGroup2)), Integer.valueOf(Integer.parseInt(strGroup)), Integer.valueOf(Integer.parseInt(strGroup3))}, 3));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            }
        }
        if (str != null) {
            return Integer.parseInt(str);
        }
        return -1;
    }

    @NotNull
    public static final String getFileMD5(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("md5");
                byte[] bArr = new byte[1024];
                for (int i = fileInputStream.read(bArr); i >= 0; i = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i);
                }
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNull(bArrDigest);
                String strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: org.hapjs.card.sdk.utils.CardExt__CardExtKt$getFileMD5$1$1$1
                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                        return invoke(b.byteValue());
                    }

                    @NotNull
                    public final CharSequence invoke(byte b) {
                        String string = Integer.toString(b & 255, CharsKt__CharJVMKt.checkRadix(16));
                        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                        return StringsKt__StringsKt.padStart(string, 2, '0');
                    }
                }, 30, (Object) null);
                CloseableKt.closeFinally(fileInputStream, null);
                return strJoinToString$default;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return "";
        }
    }

    public static final int getSignaturesFlags() {
        return 134217792;
    }

    public static final void initEventTrackerIfNeeded(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        CardEventTracker.INSTANCE.initTrackerIfNeeded(ctx, TrackerType.TRACKER_TYPE_NEARX);
    }

    public static final void registerReceiverExt(@NotNull Context context, @NotNull BroadcastReceiver receiver, @NotNull IntentFilter filter, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(filter, "filter");
        context.registerReceiver(receiver, filter, i);
    }

    public static final void reportEngineInitError(@NotNull Context ctx, int i, @Nullable Throwable th, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        CardEventTracker cardEventTracker = CardEventTracker.INSTANCE;
        if (cardEventTracker.isTrackerValid()) {
            if (cardEventTracker.isEnvInitialized() || IEventTracker.DefaultImpls.initEnv$default(cardEventTracker, ctx, null, 2, null)) {
                if (!cardEventTracker.isAppInitialized(20142L)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("bizKey", INSTANT_KEY);
                    linkedHashMap.put("bizSecret", INSTANT_SECRET);
                    if (cardEventTracker.initForApp(ctx, 20142L, linkedHashMap)) {
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("errorCode", String.valueOf(i));
                if (th != null) {
                    String simpleName = th.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    linkedHashMap2.put("errorType", simpleName);
                    linkedHashMap2.put(MyLocationStyle.ERROR_INFO, ExceptionsKt__ExceptionsKt.stackTraceToString(th));
                }
                linkedHashMap2.put("cardVersionName", "10.0.13");
                linkedHashMap2.put("cardVersionCode", "100013");
                linkedHashMap2.put("engine_change", String.valueOf(z));
                linkedHashMap2.put(CardAction.EXTRA_FORCE_UPDATE, String.valueOf(z2));
                linkedHashMap2.put("reset_default", String.valueOf(z3));
                cardEventTracker.trackEvent(ctx, 20142L, "2022", "2206", linkedHashMap2);
            }
        }
    }

    public static final void reportHotLoadEngineError(@NotNull Context ctx, int i, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        CardEventTracker cardEventTracker = CardEventTracker.INSTANCE;
        if (cardEventTracker.isTrackerValid()) {
            if (cardEventTracker.isEnvInitialized() || IEventTracker.DefaultImpls.initEnv$default(cardEventTracker, ctx, null, 2, null)) {
                if (!cardEventTracker.isAppInitialized(20142L)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("bizKey", INSTANT_KEY);
                    linkedHashMap.put("bizSecret", INSTANT_SECRET);
                    if (cardEventTracker.initForApp(ctx, 20142L, linkedHashMap)) {
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("E_cate", "hotLoad");
                linkedHashMap2.put("E_keyName", "exception");
                linkedHashMap2.put("errorCode", String.valueOf(i));
                if (th != null) {
                    String simpleName = th.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    linkedHashMap2.put("errorType", simpleName);
                    linkedHashMap2.put(MyLocationStyle.ERROR_INFO, ExceptionsKt__ExceptionsKt.stackTraceToString(th));
                }
                linkedHashMap2.put("cardVersionName", "10.0.13");
                linkedHashMap2.put("cardVersionCode", "100013");
                cardEventTracker.trackEvent(ctx, 20142L, "2008", StatisticsUtil.HOME_PAGE_GOODS_SHOW, linkedHashMap2);
            }
        }
    }

    public static final void safeClose(@NotNull ContentProviderClient contentProviderClient) {
        Intrinsics.checkNotNullParameter(contentProviderClient, "<this>");
        contentProviderClient.close();
    }

    public static final void registerReceiverExt(@NotNull Context context, @NotNull BroadcastReceiver receiver, @NotNull IntentFilter filter, @Nullable String str, @Nullable Handler handler) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(filter, "filter");
        context.registerReceiver(receiver, filter, str, handler);
    }

    public static final void registerReceiverExt(@NotNull Context context, @NotNull BroadcastReceiver receiver, @NotNull IntentFilter filter, @Nullable String str, @Nullable Handler handler, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(filter, "filter");
        context.registerReceiver(receiver, filter, str, handler, i);
    }
}
