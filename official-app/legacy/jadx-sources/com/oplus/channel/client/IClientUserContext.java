package com.oplus.channel.client;

import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.UserHandle;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0015H&J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\"\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H&J \u0010\u001c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H&J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006*"}, d2 = {"Lcom/oplus/channel/client/IClientUserContext;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "acquireUnstableContentProviderClient", "Landroid/content/ContentProviderClient;", ParserTag.TAG_URI, "Landroid/net/Uri;", "providerAuthority", "", "bindService", "", "intent", "Landroid/content/Intent;", "conn", "Landroid/content/ServiceConnection;", UTraceSQLiteHelperKt.COL_FLAGS, "", "getUserHandle", "Landroid/os/UserHandle;", "getUserId", "notifyChange", "observer", "Landroid/database/ContentObserver;", "registerContentObserver", "notifyForDescendants", "", "registerReceiver", "receiver", "Landroid/content/BroadcastReceiver;", "filter", "Landroid/content/IntentFilter;", "sendBroadcast", "startActivity", "startService", "unbindService", "unregisterContentObserver", "unregisterReceiver", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface IClientUserContext {
    @Nullable
    ContentProviderClient acquireUnstableContentProviderClient(@NotNull Uri uri);

    @Nullable
    ContentProviderClient acquireUnstableContentProviderClient(@NotNull String providerAuthority);

    void bindService(@NotNull Intent intent);

    void bindService(@NotNull Intent intent, @NotNull ServiceConnection conn, int flags);

    @NotNull
    Context getContext();

    @NotNull
    UserHandle getUserHandle();

    int getUserId();

    void notifyChange(@NotNull Uri uri, @Nullable ContentObserver observer);

    void notifyChange(@NotNull Uri uri, @Nullable ContentObserver observer, int flags);

    void registerContentObserver(@NotNull Uri uri, boolean notifyForDescendants, @NotNull ContentObserver observer);

    void registerReceiver(@NotNull BroadcastReceiver receiver);

    void registerReceiver(@NotNull BroadcastReceiver receiver, @NotNull IntentFilter filter);

    void sendBroadcast(@NotNull Intent intent);

    void setContext(@NotNull Context context);

    void startActivity(@NotNull Intent intent);

    void startService(@NotNull Intent intent);

    void unbindService(@NotNull ServiceConnection conn);

    void unregisterContentObserver(@NotNull ContentObserver observer);

    void unregisterReceiver(@NotNull BroadcastReceiver receiver);
}
