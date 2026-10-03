package com.oplus.cardwidget.serviceLayer;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.actions.SearchIntents;
import com.oplus.aiunit.vision.a8i;
import com.oplus.cardwidget.util.Logger;
import com.oplus.channel.client.provider.ChannelClientProvider;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.dsl.DSLUtils;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JQ\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0002R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00120 j\b\u0012\u0004\u0012\u00020\u0012`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00040 j\b\u0012\u0004\u0012\u00020\u0004`!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006)"}, d2 = {"Lcom/oplus/cardwidget/serviceLayer/BaseCardStrategyProvider;", "Lcom/oplus/channel/client/provider/ChannelClientProvider;", "", "onCreate", "", "method", "arg", "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, "call", "Landroid/net/Uri;", ParserTag.TAG_URI, "Landroid/content/ContentValues;", "values", "insert", "selection", "", "selectionArgs", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "projection", "sortOrder", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", a8i.UPDATE, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "checkCallPermission", "Landroid/content/pm/PackageManager;", "packageManager", "Landroid/content/pm/PackageManager;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sysAppUids", "Ljava/util/ArrayList;", "allowVisitPackageNameList", "<init>", "()V", "Companion", "a", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public class BaseCardStrategyProvider extends ChannelClientProvider {

    @NotNull
    private static final String TAG = "BaseCardStrategyProvider";

    @NotNull
    private ArrayList<String> allowVisitPackageNameList;

    @Nullable
    private PackageManager packageManager;

    @NotNull
    private final ArrayList<Integer> sysAppUids = new ArrayList<>();

    public BaseCardStrategyProvider() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.allowVisitPackageNameList = arrayList;
        arrayList.add("com.coloros.assistantscreen");
        this.allowVisitPackageNameList.add("com.oplus.assistantscreen");
        this.allowVisitPackageNameList.add("com.oplus.cardservice");
        this.allowVisitPackageNameList.add(DSLUtils.SMART_PACKAGE);
    }

    @Override // com.oplus.channel.client.provider.ChannelClientProvider, android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (checkCallPermission()) {
            return super.call(method, arg, extras);
        }
        Logger.INSTANCE.e(TAG, "call permission limit !");
        return null;
    }

    public final boolean checkCallPermission() {
        Context applicationContext;
        int callingUid = Binder.getCallingUid();
        if (this.sysAppUids.contains(Integer.valueOf(callingUid))) {
            return true;
        }
        if (callingUid == Process.myUid() || callingUid == 1000) {
            this.sysAppUids.add(Integer.valueOf(callingUid));
            return true;
        }
        if (CollectionsKt___CollectionsKt.contains(this.allowVisitPackageNameList, getCallingPackage())) {
            this.sysAppUids.add(Integer.valueOf(callingUid));
            return true;
        }
        PackageManager packageManager = this.packageManager;
        if (packageManager == null) {
            Context context = getContext();
            packageManager = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getPackageManager();
        }
        this.packageManager = packageManager;
        try {
            Intrinsics.checkNotNull(packageManager);
            String nameForUid = packageManager.getNameForUid(callingUid);
            if (nameForUid != null) {
                PackageManager packageManager2 = this.packageManager;
                Intrinsics.checkNotNull(packageManager2);
                ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(nameForUid, 0);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager!!.getApplicationInfo(it, 0)");
                if ((applicationInfo.flags & 1) == 1) {
                    this.sysAppUids.add(Integer.valueOf(callingUid));
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.INSTANCE.e(TAG, "checkPermission e:" + e2);
        }
        Logger.INSTANCE.d(TAG, "checkPermission:result: true");
        return true;
    }

    @Override // com.oplus.channel.client.provider.ChannelClientProvider, android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (checkCallPermission()) {
            return super.delete(uri, selection, selectionArgs);
        }
        Logger.INSTANCE.e(TAG, "delete permission limit !");
        return 0;
    }

    @Override // com.oplus.channel.client.provider.ChannelClientProvider, android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (checkCallPermission()) {
            return super.insert(uri, values);
        }
        Logger.INSTANCE.e(TAG, "insert permission limit !");
        return null;
    }

    @Override // com.oplus.channel.client.provider.ChannelClientProvider, android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            this.allowVisitPackageNameList.add(context.getPackageName());
        }
        return super.onCreate();
    }

    @Override // com.oplus.channel.client.provider.ChannelClientProvider, android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (checkCallPermission()) {
            return super.query(uri, projection, selection, selectionArgs, sortOrder);
        }
        Logger.INSTANCE.e(TAG, "query permission limit !");
        return null;
    }

    @Override // com.oplus.channel.client.provider.ChannelClientProvider, android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (checkCallPermission()) {
            return super.update(uri, values, selection, selectionArgs);
        }
        Logger.INSTANCE.e(TAG, "update permission limit !");
        return 0;
    }
}
