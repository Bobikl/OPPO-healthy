package com.oplus.channel.server.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.oplus.aiunit.vision.a8i;
import com.oplus.channel.server.ServerChannel;
import com.oplus.channel.server.data.CommandDataManager;
import com.oplus.channel.server.provider.ChannelServerProvider;
import com.oplus.channel.server.utils.LogUtil;
import com.oplus.channel.server.utils.WorkHandler;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016JO\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0010\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u001e¨\u0006 "}, d2 = {"Lcom/oplus/channel/server/provider/ChannelServerProvider;", "Landroid/content/ContentProvider;", "()V", "call", "Landroid/os/Bundle;", "method", "", "arg", BridgeConstant.KEY_EXTRAS, "delete", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getAuthority", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", a8i.UPDATE, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ChannelServerProvider extends ContentProvider {
    private static final char BATCH_CLIENT_SPLIT = '#';

    @NotNull
    public static final String TAG = "ChannelServerProvider";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: call$lambda-3$lambda-2, reason: not valid java name */
    public static final void m5171call$lambda3$lambda2(IServerProvider iServerProvider, String str, Ref.ObjectRef callbackId, byte[] bArr) {
        Intrinsics.checkNotNullParameter(callbackId, "$callbackId");
        iServerProvider.runCallback(str, (String) callbackId.element, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: call$lambda-7$lambda-6$lambda-5, reason: not valid java name */
    public static final void m5172call$lambda7$lambda6$lambda5(String callbackId, String str, IServerProvider iServerProvider, byte[] bArr) {
        Intrinsics.checkNotNullExpressionValue(callbackId, "callbackId");
        if (!StringsKt__StringsKt.contains$default((CharSequence) callbackId, BATCH_CLIENT_SPLIT, false, 2, (Object) null)) {
            iServerProvider.runCallback(str, callbackId, bArr);
            return;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) callbackId, new char[]{BATCH_CLIENT_SPLIT}, false, 0, 6, (Object) null);
        String str2 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 0);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
        if (str3 != null) {
            String str4 = StringsKt__StringsJVMKt.isBlank(str3) ^ true ? str3 : null;
            if (str4 != null) {
                str = str4;
            }
        }
        iServerProvider.runCallback(str, str2, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String method, @Nullable final String arg, @Nullable Bundle extras) {
        String str;
        T t;
        Intrinsics.checkNotNullParameter(method, "method");
        Bundle bundle = new Bundle();
        Object obj = extras == null ? null : extras.get("RESULT_CALLBACK_ID");
        if (!Intrinsics.areEqual("pullCommand", method) && !Intrinsics.areEqual("callback", method) && !Intrinsics.areEqual("batch_callback", method)) {
            bundle.putInt("call_result", 1);
            bundle.putInt("batch_call_result", 1);
            return bundle;
        }
        if (arg == null) {
            LogUtil.w(TAG, "call, failed with method=[" + method + "], arg=[" + ((Object) arg) + ']');
            bundle.putInt("call_result", 1);
            bundle.putInt("batch_call_result", 1);
            return bundle;
        }
        final IServerProvider serverProviderByAuthority = ServerChannel.INSTANCE.getServerProviderByAuthority(getAuthority());
        if (serverProviderByAuthority == null) {
            LogUtil.w(TAG, "call, failed with server=[" + serverProviderByAuthority + "], arg=[" + ((Object) arg) + "], authority=" + getAuthority());
            bundle.putInt("call_result", 1);
            bundle.putInt("batch_call_result", 1);
            return bundle;
        }
        if (serverProviderByAuthority.getIdleState() == -1) {
            LogUtil.d(TAG, "call, failed with idle state, return");
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("RESULT_IDLE_STATE", true);
            return bundle2;
        }
        int iHashCode = method.hashCode();
        if (iHashCode != -983883450) {
            if (iHashCode != -172220347) {
                if (iHashCode == 544471978 && method.equals("batch_callback")) {
                    if (extras != null) {
                        String[] stringArray = extras.getStringArray("RESULT_CALLBACK_ID_LIST");
                        if (stringArray == null) {
                            stringArray = new String[0];
                        }
                        final byte[] byteArray = extras.getByteArray("RESULT_CALLBACK_DATA");
                        if (byteArray == null) {
                            LogUtil.w(TAG, "call, failed with data = null method=[" + method + "], clientName=[" + ((Object) arg) + "], resultCallBackId=[" + obj + ']');
                            bundle.putInt("batch_call_result", 1);
                            return bundle;
                        }
                        LogUtil.i(TAG, "call, method=[" + method + "], clientName=[" + ((Object) arg) + "], callbackIds=[" + ArraysKt___ArraysKt.toList(stringArray) + "], resultCallBackId=[" + obj + ']');
                        for (final String str2 : stringArray) {
                            WorkHandler.INSTANCE.getInstance().post(new Runnable() { // from class: com.oplus.aiunit.vision.q73
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChannelServerProvider.m5172call$lambda7$lambda6$lambda5(str2, arg, serverProviderByAuthority, byteArray);
                                }
                            });
                        }
                    }
                    bundle.putInt("batch_call_result", 0);
                    return bundle;
                }
            } else if (method.equals("callback")) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                String str3 = "";
                objectRef.element = "";
                if (extras != null) {
                    String string = extras.getString("RESULT_CALLBACK_ID");
                    if (string != null) {
                        t = str3;
                        t = string;
                    }
                    t = str3;
                    objectRef.element = t;
                    final byte[] byteArray2 = extras.getByteArray("RESULT_CALLBACK_DATA");
                    if (byteArray2 == null) {
                        LogUtil.w(TAG, "call, failed with data = null method=[" + method + "], clientName=[" + ((Object) arg) + "], resultCallBackId=[" + obj + ']');
                        bundle.putInt("call_result", 1);
                        return bundle;
                    }
                    LogUtil.i(TAG, "call, method=[" + method + "], clientName=[" + ((Object) arg) + "], resultCallBackId=[" + obj + ']');
                    WorkHandler.INSTANCE.getInstance().post(new Runnable() { // from class: com.oplus.aiunit.vision.p73
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChannelServerProvider.m5171call$lambda3$lambda2(serverProviderByAuthority, arg, objectRef, byteArray2);
                        }
                    });
                }
                bundle.putInt("call_result", 0);
                return bundle;
            }
            str = "call_result";
        } else {
            str = "call_result";
            if (method.equals("pullCommand")) {
                LogUtil.i(TAG, "call, method=[" + method + "], clientName=[" + ((Object) arg) + "], resultCallBackId=[" + obj + ']');
                CommandDataManager commandDataManager = CommandDataManager.INSTANCE;
                CommandDataManager.CacheCommandData cacheCommandDataQueryCacheCommandData = commandDataManager.queryCacheCommandData(arg);
                if (cacheCommandDataQueryCacheCommandData != null) {
                    try {
                        cacheCommandDataQueryCacheCommandData.acquireLock();
                    } finally {
                        if (cacheCommandDataQueryCacheCommandData != null) {
                            cacheCommandDataQueryCacheCommandData.releaseLock();
                        }
                    }
                }
                Bundle bundleEncodeCacheCommandData = cacheCommandDataQueryCacheCommandData == null ? null : cacheCommandDataQueryCacheCommandData.encodeCacheCommandData(arg, "pullCommand");
                if (bundleEncodeCacheCommandData == null) {
                    bundleEncodeCacheCommandData = new Bundle();
                }
                bundleEncodeCacheCommandData.putInt(str, 0);
                bundleEncodeCacheCommandData.putBoolean("RESULT_BATCH_CALLBACK_SUPPORT", true);
                commandDataManager.removeCachedCommandData(arg, "pullCommand");
                return bundleEncodeCacheCommandData;
            }
        }
        bundle.putInt(str, 1);
        bundle.putInt("batch_call_result", 1);
        return bundle;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @NotNull
    public abstract String getAuthority();

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
