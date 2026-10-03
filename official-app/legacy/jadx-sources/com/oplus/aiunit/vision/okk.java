package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import com.oplus.channel.server.IUserContext;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.sdk.UTraceCompat;
import com.oplus.utrace.sdk.UTraceContext;
import com.pantanal.server.content.sdk.StaticSdk;
import com.pantanal.server.content.upkmanage.entity.UpkInfo;
import com.pantanal.server.content.utils.UTraceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;
import p010kotlin.jdk7.AutoCloseableKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/okk;", "Lcom/oplus/aiunit/vision/oz9;", "Landroid/content/Context;", "context", "", "serviceId", "Lcom/oplus/utrace/sdk/UTraceContext;", "parentCtx", "", "version", "Lcom/pantanal/server/content/upkmanage/entity/UpkInfo;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/oplus/utrace/sdk/UTraceContext;Ljava/lang/Long;)Lcom/pantanal/server/content/upkmanage/entity/UpkInfo;", "Landroid/net/Uri;", "b", "(Ljava/lang/String;Lcom/oplus/utrace/sdk/UTraceContext;Ljava/lang/Long;)Landroid/net/Uri;", "<init>", "()V", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class okk implements oz9 {
    public static final Uri a = Uri.parse("content://com.oplus.pantanal.ums.statictis/upk");

    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    @Override // com.oplus.aiunit.vision.oz9
    @WorkerThread
    @Nullable
    public UpkInfo a(@NotNull Context context, @NotNull String serviceId, @Nullable UTraceContext parentCtx, @Nullable Long version) {
        Object objM5287constructorimpl;
        Throwable thM5290exceptionOrNullimpl;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        f7b.h("UpkExternalManager", "start query upkInfo from ums, serviceId:" + serviceId + ", version:" + version + ",UTraceContext:" + parentCtx);
        Uri uriB = b(serviceId, parentCtx, version);
        try {
            Result.Companion companion = Result.INSTANCE;
            IUserContext iUserContextC = StaticSdk.INSTANCE.c();
            if (iUserContextC != null) {
                f7b.h("UpkExternalManager", "get IUserContext,call UpkExternalManagerImpl query()");
                uriB = amk.a(uriB);
                contentProviderClientAcquireUnstableContentProviderClient = iUserContextC.acquireUnstableContentProviderClient(uriB);
            } else {
                f7b.h("UpkExternalManager", "get Context,call UpkExternalManagerImpl query()");
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriB);
            }
            Uri uri = uriB;
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                unit = null;
            } else {
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, null, null);
                    if (cursorQuery != null) {
                        Cursor cursor = cursorQuery;
                        try {
                            Cursor cursor2 = cursor;
                            cursor2.moveToFirst();
                            int columnIndex = cursor2.getColumnIndex(ParserTag.TAG_URI);
                            int columnIndex2 = cursor2.getColumnIndex("version");
                            int columnIndex3 = cursor2.getColumnIndex("hash");
                            UpkInfo upkInfo = new UpkInfo();
                            upkInfo.setServiceId(serviceId);
                            upkInfo.setVersionCode(cursor2.getInt(columnIndex2));
                            upkInfo.setCopyUri(Uri.parse(cursor2.getString(columnIndex)));
                            upkInfo.setFileHash(cursor2.getString(columnIndex3));
                            f7b.h("UpkExternalManager", "query upkInfo from ums result: serviceId: " + serviceId + ", version: " + cursor2.getInt(columnIndex2) + ", copyUri: " + ((Object) cursor2.getString(columnIndex)) + ", hash: " + ((Object) cursor2.getString(columnIndex3)));
                            CloseableKt.closeFinally(cursor, null);
                            AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, null);
                            return upkInfo;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(cursor, th);
                                throw th2;
                            }
                        }
                    }
                    f7b.m("UpkExternalManager", "query error, cursor is null");
                    Unit unit2 = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, null);
                    unit = Unit.INSTANCE;
                    thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                    if (thM5290exceptionOrNullimpl != null) {
                        f7b.g("UpkExternalManager", "query error", thM5290exceptionOrNullimpl);
                    }
                    f7b.m("UpkExternalManager", "prepareUpkInfo, return null");
                    return null;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, th3);
                        throw th4;
                    }
                }
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            objM5287constructorimpl = Result.m5287constructorimpl(unit);
        } catch (Throwable th5) {
            Result.Companion companion3 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th5));
        }
        thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            f7b.g("UpkExternalManager", "query error", thM5290exceptionOrNullimpl);
        }
        f7b.m("UpkExternalManager", "prepareUpkInfo, return null");
        return null;
    }

    public final Uri b(String serviceId, UTraceContext parentCtx, Long version) {
        Uri uriBuild;
        if (version == null) {
            uriBuild = parentCtx != null ? a.buildUpon().appendPath(serviceId).appendQueryParameter(UTraceUtils.KEY_URI_QUERY_PARAMETER_TRANCE, UTraceCompat.INSTANCE.writeToJsonString(parentCtx)).build() : a.buildUpon().appendPath(serviceId).build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "{\n            if (parent…)\n            }\n        }");
        } else {
            uriBuild = parentCtx != null ? a.buildUpon().appendPath(serviceId).appendQueryParameter("version", version.toString()).appendQueryParameter(UTraceUtils.KEY_URI_QUERY_PARAMETER_TRANCE, UTraceCompat.INSTANCE.writeToJsonString(parentCtx)).build() : a.buildUpon().appendPath(serviceId).appendQueryParameter("version", version.toString()).build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "{\n            if (parent…)\n            }\n        }");
        }
        return uriBuild;
    }
}
