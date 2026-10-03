package com.heytap.health.watch.notification.impl.flashback;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.fkj;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016JM\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006$"}, d2 = {"Lcom/heytap/health/watch/notification/impl/flashback/FlashbackProvider;", "Landroid/content/ContentProvider;", "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, "", "handleMessage", "", "onCreate", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "", "strings", "s", "strings1", "s1", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "Landroid/content/ContentValues;", "contentValues", "insert", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", a8i.UPDATE, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "authority", "method", "arg", "call", "<init>", "()V", "Companion", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class FlashbackProvider extends ContentProvider {
    private static final int APPLY = 8;
    private static final int COMMIT = 9;

    @NotNull
    public static final String COMMON_PROVIDER_AUTHORITY = "com.coloros.health.common.provider";
    private static final int CONTAINS = 7;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int GET_ALL = 1;
    private static final int GET_BOOLEAN = 6;
    private static final int GET_FLOAT = 5;
    private static final int GET_INT = 3;
    private static final int GET_LONG = 4;
    private static final int GET_STRING = 2;

    @NotNull
    private static final String METHOD_FLSAHBACK_SEND = "flashback_send";

    @NotNull
    private static final String PATH_APPLY = "apply";

    @NotNull
    public static final String PATH_COMMIT = "commit";

    @NotNull
    private static final String PATH_CONTAINS = "contains";

    @NotNull
    private static final String PATH_GET_ALL = "getAll";

    @NotNull
    private static final String PATH_GET_BOOLEAN = "getBoolean";

    @NotNull
    private static final String PATH_GET_FLOAT = "getFloat";

    @NotNull
    private static final String PATH_GET_INT = "getInt";

    @NotNull
    private static final String PATH_GET_LONG = "getLong";

    @NotNull
    private static final String PATH_GET_STRING = "getString";

    @NotNull
    private static final String PATH_WILDCARD = "*/";

    @NotNull
    private static final String TAG = "NTF_FlashbackProvider";
    private static boolean switchStatus;

    /* JADX INFO: renamed from: com.heytap.health.watch.notification.impl.flashback.FlashbackProvider$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0012R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u0014\u0010%\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0012¨\u0006("}, d2 = {"Lcom/heytap/health/watch/notification/impl/flashback/FlashbackProvider$a;", "", "", "status", "", "b", fkj.PARAM_SWITCH_STATUS, "Z", "a", "()Z", "c", "(Z)V", "", "APPLY", "I", "COMMIT", "", "COMMON_PROVIDER_AUTHORITY", "Ljava/lang/String;", "CONTAINS", "GET_ALL", "GET_BOOLEAN", "GET_FLOAT", "GET_INT", "GET_LONG", "GET_STRING", "METHOD_FLSAHBACK_SEND", "PATH_APPLY", "PATH_COMMIT", "PATH_CONTAINS", "PATH_GET_ALL", "PATH_GET_BOOLEAN", "PATH_GET_FLOAT", "PATH_GET_INT", "PATH_GET_LONG", "PATH_GET_STRING", "PATH_WILDCARD", "TAG", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return FlashbackProvider.switchStatus;
        }

        public final void b(boolean status) {
            c(status);
        }

        public final void c(boolean z) {
            FlashbackProvider.switchStatus = z;
        }
    }

    private final void handleMessage(Bundle extras) {
        a.INSTANCE.f(extras);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String authority, @NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("[call] --> authority: ");
        sb.append(authority);
        sb.append(", method: ");
        sb.append(method);
        if (!TextUtils.equals(COMMON_PROVIDER_AUTHORITY, authority)) {
            a7b.b(TAG, "[call] --> illegal authority , not match!!");
            return null;
        }
        if (!TextUtils.equals(METHOD_FLSAHBACK_SEND, method)) {
            a7b.b(TAG, "[call] --> illegal method , not match!!");
            return null;
        }
        if (extras == null) {
            a7b.b(TAG, "[call] -->  extras is null!");
            return null;
        }
        handleMessage(extras);
        return super.call(authority, method, arg, extras);
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        Intrinsics.checkNotNullParameter(uri, "uri");
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
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/getAll", 1);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/getString", 2);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/getInt", 3);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/getLong", 4);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/getFloat", 5);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/getBoolean", 6);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/contains", 7);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/apply", 8);
        uriMatcher.addURI(COMMON_PROVIDER_AUTHORITY, "*/commit", 9);
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
