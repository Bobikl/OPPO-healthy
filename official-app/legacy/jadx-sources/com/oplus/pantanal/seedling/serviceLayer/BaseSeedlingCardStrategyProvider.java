package com.oplus.pantanal.seedling.serviceLayer;

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
import com.oplus.channel.client.provider.ChannelClientProvider;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.dsl.DSLUtils;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J1\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016JO\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u001f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010!J;\u0010\"\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010#R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/oplus/pantanal/seedling/serviceLayer/BaseSeedlingCardStrategyProvider;", "Lcom/oplus/channel/client/provider/ChannelClientProvider;", "()V", "allowVisitPackageNameList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "packageManager", "Landroid/content/pm/PackageManager;", "sysAppUids", "", "call", "Landroid/os/Bundle;", "method", "arg", BridgeConstant.KEY_EXTRAS, "checkCallPermission", "", "delete", ParserTag.TAG_URI, "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "insert", "values", "Landroid/content/ContentValues;", "onCreate", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", a8i.UPDATE, "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class BaseSeedlingCardStrategyProvider extends ChannelClientProvider {

    @NotNull
    private static final String TAG = "BaseSeedlingCardStrategyProvider";

    @NotNull
    private ArrayList<String> allowVisitPackageNameList;

    @Nullable
    private PackageManager packageManager;

    @NotNull
    private final ArrayList<Integer> sysAppUids = new ArrayList<>();

    public BaseSeedlingCardStrategyProvider() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.allowVisitPackageNameList = arrayList;
        arrayList.add("com.coloros.assistantscreen");
        this.allowVisitPackageNameList.add("com.oplus.assistantscreen");
        this.allowVisitPackageNameList.add("com.oplus.cardservice");
        this.allowVisitPackageNameList.add(DSLUtils.SMART_PACKAGE);
    }

    private final boolean checkCallPermission() {
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
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
                if ((applicationInfo.flags & 1) == 1) {
                    this.sysAppUids.add(Integer.valueOf(callingUid));
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.INSTANCE.e(TAG, "checkPermission error:" + e2.getMessage());
        }
        Logger.INSTANCE.d(TAG, "checkPermission:result: true");
        return true;
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
