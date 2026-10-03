package com.oplus.channel.client.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.oplus.aiunit.vision.a8i;
import com.oplus.channel.client.ClientChannel;
import com.oplus.channel.client.ClientProxy;
import com.oplus.channel.client.utils.LogUtil;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016JO\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u001bJ;\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/oplus/channel/client/provider/ChannelClientProvider;", "Landroid/content/ContentProvider;", "()V", "call", "Landroid/os/Bundle;", "method", "", "arg", BridgeConstant.KEY_EXTRAS, "delete", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", a8i.UPDATE, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class ChannelClientProvider extends ContentProvider {

    @NotNull
    public static final String TAG = "ChannelClientProvider";

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Object next;
        Intrinsics.checkNotNullParameter(method, "method");
        Bundle bundle = new Bundle();
        if (!Intrinsics.areEqual(method, "pull")) {
            LogUtil.w(TAG, "call, failed with method=" + method + ", arg=" + ((Object) arg) + ", extras=" + extras);
            bundle.putInt("call_result", 1);
            return bundle;
        }
        if (arg == null) {
            LogUtil.w(TAG, "call, failed with method=" + method + ", arg=" + ((Object) arg) + ", extras=" + extras);
            bundle.putInt("call_result", 1);
            return bundle;
        }
        Iterator<T> it = ClientChannel.INSTANCE.getClientList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ClientProxy) next).getClientName(), arg));
        ClientProxy clientProxy = (ClientProxy) next;
        if (clientProxy == null) {
            LogUtil.w(TAG, "call, failed with clientProxy=" + clientProxy + ", clientName=" + ((Object) arg));
            bundle.putInt("call_result", 1);
            return bundle;
        }
        LogUtil.i(TAG, "call, clientProxy=" + clientProxy + ", clientName=" + ((Object) arg));
        if (extras == null || extras.getByteArray("RESULT_COMMAND_LIST") == null) {
            LogUtil.d(TAG, "call, has no RESULT_COMMAND_LIST in extras");
            clientProxy.pullAndRunCommand();
            bundle.putInt("call_result", 0);
            return bundle;
        }
        LogUtil.d(TAG, "call, has RESULT_COMMAND_LIST in extras");
        clientProxy.processCommandList(clientProxy.handlePullCommand(extras).getCommandClients());
        bundle.putInt("call_result", 0);
        bundle.putBoolean("consumed", true);
        return bundle;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
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
