package com.oplus.mydevices.sdk;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.oplus.aiunit.vision.a8i;
import com.oplus.mydevices.sdk.internal.IDeviceCallProcessor;
import com.oplus.mydevices.sdk.utils.CursorExtKt;
import com.oplus.mydevices.sdk.utils.LogUtils;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016J/\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0007H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010!\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020%H\u0016J\u001a\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0007H\u0017JK\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0002\u0010.JC\u0010/\u001a\u0004\u0018\u00010+2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0002\u00100JC\u00101\u001a\u0004\u0018\u00010+2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0002\u00102J9\u00103\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001dH\u0016¢\u0006\u0002\u00104R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/oplus/mydevices/sdk/DeviceAppProvider;", "Landroid/content/ContentProvider;", "()V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "mAuthority", "", "mCallProcessor", "Lcom/oplus/mydevices/sdk/internal/IDeviceCallProcessor;", "getMCallProcessor", "()Lcom/oplus/mydevices/sdk/internal/IDeviceCallProcessor;", "mCallProcessor$delegate", "Lkotlin/Lazy;", "mDbOpenHelper", "Lcom/oplus/mydevices/sdk/DeviceInfoDbOpenHelper;", "mUriMatcher", "Landroid/content/UriMatcher;", "call", "Landroid/os/Bundle;", "method", "arg", BridgeConstant.KEY_EXTRAS, "delete", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getAuthority", "getType", "insert", "values", "Landroid/content/ContentValues;", "isSupportedUri", "", "onCreate", "openAssetFile", "Landroid/content/res/AssetFileDescriptor;", "mode", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "queryDatabase", "(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "queryWithMacSelection", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", a8i.UPDATE, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public class DeviceAppProvider extends ContentProvider {
    private static final long MAX_QUERY_TIME = 3;
    private static final String TAG = "DeviceAppProvider";
    private static final int URL_CODE_DEVICES_INFO = 1;
    private String mAuthority;
    private DeviceInfoDbOpenHelper mDbOpenHelper;

    /* JADX INFO: renamed from: mCallProcessor$delegate, reason: from kotlin metadata */
    private final Lazy mCallProcessor = LazyKt__LazyJVMKt.lazy(new Function0<IDeviceCallProcessor>() { // from class: com.oplus.mydevices.sdk.DeviceAppProvider$mCallProcessor$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final IDeviceCallProcessor invoke() {
            return IDeviceCallProcessor.INSTANCE.create();
        }
    });
    private final UriMatcher mUriMatcher = new UriMatcher(-1);
    private ExecutorService executor = Executors.newCachedThreadPool();

    private final String getAuthority() {
        String str = this.mAuthority;
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            ProviderInfo providerInfoFindProvider$sdk_domesticRelease = Utils.INSTANCE.findProvider$sdk_domesticRelease(getContext());
            this.mAuthority = providerInfoFindProvider$sdk_domesticRelease != null ? providerInfoFindProvider$sdk_domesticRelease.authority : null;
        }
        String str2 = this.mAuthority;
        return str2 != null ? str2 : "";
    }

    private final IDeviceCallProcessor getMCallProcessor() {
        return (IDeviceCallProcessor) this.mCallProcessor.getValue();
    }

    private final boolean isSupportedUri(Uri uri) {
        return this.mUriMatcher.match(uri) == 1;
    }

    @SuppressLint({"TooGenericExceptionCaught"})
    private final Cursor queryDatabase(final String selection, final String[] projection, final String[] selectionArgs, final String sortOrder) {
        try {
            return (Cursor) this.executor.submit(new Callable<Cursor>() { // from class: com.oplus.mydevices.sdk.DeviceAppProvider$queryDatabase$future$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                @Nullable
                public final Cursor call() {
                    Cursor cursorQuery;
                    if (Utils.isMacSelection(selection)) {
                        return this.this$0.queryWithMacSelection(projection, selection, selectionArgs, sortOrder);
                    }
                    DeviceInfoDbOpenHelper deviceInfoDbOpenHelper = this.this$0.mDbOpenHelper;
                    SQLiteDatabase readableDatabaseSafely = deviceInfoDbOpenHelper != null ? deviceInfoDbOpenHelper.getReadableDatabaseSafely() : null;
                    if (readableDatabaseSafely == null || (cursorQuery = readableDatabaseSafely.query(DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME, projection, selection, selectionArgs, null, null, sortOrder, null)) == null) {
                        return null;
                    }
                    return CursorExtKt.decryptedCursor(cursorQuery, this.this$0.getContext());
                }
            }).get(3L, TimeUnit.SECONDS);
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(TAG, "queryCursor: " + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Range"})
    public final Cursor queryWithMacSelection(String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Cursor cursorQuery;
        DeviceInfoDbOpenHelper deviceInfoDbOpenHelper = this.mDbOpenHelper;
        SQLiteDatabase readableDatabaseSafely = deviceInfoDbOpenHelper != null ? deviceInfoDbOpenHelper.getReadableDatabaseSafely() : null;
        if (readableDatabaseSafely == null || (cursorQuery = readableDatabaseSafely.query(DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME, null, null, null, null, null, sortOrder, null)) == null) {
            return null;
        }
        return CursorExtKt.decryptedCursorWithMacSelection(cursorQuery, getContext(), selectionArgs != null ? selectionArgs[0] : null);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(method, "method");
        try {
            IDeviceCallProcessor mCallProcessor = getMCallProcessor();
            if (arg == null) {
                arg = "";
            }
            if (extras == null) {
                extras = new Bundle();
            }
            mCallProcessor.process(method, arg, extras);
        } catch (Exception unused) {
            LogUtils.INSTANCE.i(TAG, "call process error!");
        }
        return new Bundle();
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d(TAG, "delete uri: " + uri + ", selection: " + selection);
        if (!isSupportedUri(uri)) {
            logUtils.d(TAG, "not support uri");
            return 0;
        }
        DeviceInfoDbOpenHelper deviceInfoDbOpenHelper = this.mDbOpenHelper;
        SQLiteDatabase writableDatabaseSafely = deviceInfoDbOpenHelper != null ? deviceInfoDbOpenHelper.getWritableDatabaseSafely() : null;
        Integer numValueOf = writableDatabaseSafely != null ? Integer.valueOf(writableDatabaseSafely.delete(DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME, selection, selectionArgs)) : null;
        logUtils.d(TAG, "delete count: " + numValueOf);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        LogUtils.INSTANCE.d(TAG, "getType");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d(TAG, "insert uri:" + uri);
        if (!isSupportedUri(uri)) {
            logUtils.d(TAG, "not support uri");
            return null;
        }
        DeviceInfoDbOpenHelper deviceInfoDbOpenHelper = this.mDbOpenHelper;
        SQLiteDatabase writableDatabaseSafely = deviceInfoDbOpenHelper != null ? deviceInfoDbOpenHelper.getWritableDatabaseSafely() : null;
        if ((writableDatabaseSafely != null ? writableDatabaseSafely.insertWithOnConflict(DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME, null, values, 5) : -1L) < 0) {
            logUtils.e(TAG, "insert failed !");
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        String authority = getAuthority();
        LogUtils.INSTANCE.i(TAG, "onCreate, " + authority);
        this.mDbOpenHelper = new DeviceInfoDbOpenHelper(context);
        this.mUriMatcher.addURI(authority, DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME, 1);
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"ResourceType, getLastPathSegmentRisk"})
    @Nullable
    public AssetFileDescriptor openAssetFile(@NotNull Uri uri, @NotNull String mode) throws SecurityException, FileNotFoundException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mode, "mode");
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d(TAG, "openAssetFile with uri: " + uri + ", mode: " + mode);
        if (!Intrinsics.areEqual("r", mode)) {
            logUtils.e(TAG, "openAssetFile, Only read-only access is supported, mode must be [r].");
            return null;
        }
        int i = -1;
        try {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                i = Integer.parseInt(lastPathSegment);
            }
        } catch (NumberFormatException e2) {
            LogUtils.INSTANCE.e(TAG, "e: " + e2);
        }
        Context context = getContext();
        Resources resources = context != null ? context.getResources() : null;
        if (resources == null) {
            return null;
        }
        try {
            return resources.openRawResourceFd(i);
        } catch (Resources.NotFoundException e3) {
            LogUtils.INSTANCE.e(TAG, "" + e3);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"Range"})
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        int callingPid = Binder.getCallingPid();
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d(TAG, "pid[" + callingPid + "] query uri: " + uri);
        if (isSupportedUri(uri)) {
            return queryDatabase(selection, projection, selectionArgs, sortOrder);
        }
        logUtils.d(TAG, "not support uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d(TAG, "update uri: " + uri + ", selection: " + selection);
        if (!isSupportedUri(uri)) {
            logUtils.d(TAG, "not support uri");
            return 0;
        }
        DeviceInfoDbOpenHelper deviceInfoDbOpenHelper = this.mDbOpenHelper;
        Integer numValueOf = null;
        SQLiteDatabase writableDatabaseSafely = deviceInfoDbOpenHelper != null ? deviceInfoDbOpenHelper.getWritableDatabaseSafely() : null;
        if (values != null && writableDatabaseSafely != null) {
            numValueOf = Integer.valueOf(writableDatabaseSafely.update(DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME, values, selection, selectionArgs));
        }
        logUtils.d(TAG, "update count:" + numValueOf);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
