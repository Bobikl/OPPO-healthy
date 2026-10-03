package com.heytap.health.core.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.m3k;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016JQ\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J3\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¨\u0006#"}, d2 = {"Lcom/heytap/health/core/provider/HealthSwitchProvider;", "Landroid/content/ContentProvider;", "", "getPrivacyStatus", "getStepPermissionStatus", "", "onCreate", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "Landroid/content/ContentValues;", "values", "insert", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", a8i.UPDATE, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "method", "arg", "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, "call", "<init>", "()V", "Companion", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class HealthSwitchProvider extends ContentProvider {

    @NotNull
    public static final String KEY_RESULT = "result";

    @NotNull
    public static final String METHOD_PRIVACY = "privacy";

    @NotNull
    public static final String METHOD_STEP = "step";
    public static final int PRIVACY_AGREE = 1;
    public static final int PRIVACY_AGREE_HEALTH_ONLY = 2;
    public static final int PRIVACY_NOT_AGREE = 0;
    public static final int STEP_PERMISSION_OFF = 0;
    public static final int STEP_PERMISSION_ON = 1;

    @NotNull
    private static final String TAG = "HealthSwitchProvider";

    private final int getPrivacyStatus() {
        if (m3k.g()) {
            return 1;
        }
        return m3k.h() ? 2 : 0;
    }

    private final int getStepPermissionStatus() {
        return !g3k.I() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(method, "method");
        a7b.f(TAG, "call method: " + method + ", arg: " + arg + ", caller: " + getCallingPackage());
        Bundle bundle = new Bundle();
        if (Intrinsics.areEqual(method, METHOD_PRIVACY)) {
            int privacyStatus = getPrivacyStatus();
            bundle.putInt("result", privacyStatus);
            a7b.f(TAG, "privacy status: " + privacyStatus);
        } else if (Intrinsics.areEqual(method, "step")) {
            int stepPermissionStatus = getStepPermissionStatus();
            bundle.putInt("result", stepPermissionStatus);
            a7b.f(TAG, "step permission status: " + stepPermissionStatus);
        } else {
            a7b.m(TAG, "unknown method: " + method);
        }
        return bundle;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        StringBuilder sb = new StringBuilder();
        sb.append("delete not supported, uri: ");
        sb.append(uri);
        return 0;
    }

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
        StringBuilder sb = new StringBuilder();
        sb.append("insert not supported, uri: ");
        sb.append(uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a7b.f(TAG, "HealthSwitchProvider onCreate");
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        StringBuilder sb = new StringBuilder();
        sb.append("query not supported, uri: ");
        sb.append(uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        StringBuilder sb = new StringBuilder();
        sb.append("update not supported, uri: ");
        sb.append(uri);
        return 0;
    }
}
