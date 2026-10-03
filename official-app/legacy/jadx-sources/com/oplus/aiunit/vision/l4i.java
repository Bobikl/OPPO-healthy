package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.callback.ICommonListener;
import com.heytap.databaseengine.callback.IDataOperateListener;
import com.heytap.databaseengine.model.SpaceCardMetaData;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.databaseengineservice.db.table.space.DBSpaceInfo;
import com.heytap.wearable.emergency.api.emergency.EmergencyMainApis;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\n\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u000b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J,\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0007J:\u0010\u0011\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/l4i;", "", "", "Lcom/heytap/databaseengine/model/SpaceInfo;", "spaceInfoList", "Lcom/heytap/databaseengine/callback/IDataOperateListener;", "listener", "Lcom/oplus/aiunit/vision/h4i;", "spaceDao", "", "c", "a", "", EmergencyMainApis.EVENT_OPEN_PAGE_PRAM_CODE, "cardCode", "Lcom/heytap/databaseengine/callback/ICommonListener;", "d", "b", "Ljava/util/List;", "mBlanketDataReturn", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpaceInfoHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpaceInfoHelper.kt\ncom/heytap/databaseengineservice/servicehelper/SpaceInfoHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n1855#2,2:224\n1855#2,2:226\n*S KotlinDebug\n*F\n+ 1 SpaceInfoHelper.kt\ncom/heytap/databaseengineservice/servicehelper/SpaceInfoHelper\n*L\n114#1:224,2\n190#1:226,2\n*E\n"})
public final class l4i {

    @NotNull
    public static final l4i INSTANCE = new l4i();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<Object> mBlanketDataReturn = new ArrayList();

    public final void a(@Nullable IDataOperateListener listener, @NotNull h4i spaceDao) {
        Intrinsics.checkNotNullParameter(spaceDao, "spaceDao");
        cj4.c("SpaceInfoHelper", "deleteSpaceInfo");
        if (listener == null) {
            cj4.d("SpaceInfoHelper", "insertSpaceInfo listener is null");
            return;
        }
        try {
            int iC = spaceDao.c();
            cj4.c("SpaceInfoHelper", "deleteSpaceInfo end, delete count: " + iC);
            g0b.b(listener, iC > 0 ? 0 : 101003, mBlanketDataReturn);
        } catch (Exception e2) {
            cj4.b("SpaceInfoHelper", "deleteSpaceInfo exception, message:" + e2.getMessage());
            g0b.b(listener, 101003, mBlanketDataReturn);
        }
    }

    public final void b(@Nullable String pageCode, @Nullable String cardCode, @NotNull List<? extends SpaceInfo> spaceInfoList, @Nullable IDataOperateListener listener, @NotNull h4i spaceDao) {
        boolean z;
        Intrinsics.checkNotNullParameter(spaceInfoList, "spaceInfoList");
        Intrinsics.checkNotNullParameter(spaceDao, "spaceDao");
        cj4.c("SpaceInfoHelper", "insertOrUpdateSpaceInfo");
        if (listener == null) {
            cj4.d("SpaceInfoHelper", "insertOrUpdateSpaceInfo, listener is null");
            return;
        }
        boolean z2 = true;
        if (pageCode != null) {
            try {
                z = pageCode.length() == 0;
            } catch (Exception e2) {
                cj4.b("SpaceInfoHelper", "insertOrUpdateSpaceInfo exception, message:" + e2.getMessage());
                g0b.b(listener, 101001, mBlanketDataReturn);
                return;
            }
        }
        if (z) {
            cj4.d("SpaceInfoHelper", "insertOrUpdateSpaceInfo, pageCode is null or empty!");
            g0b.b(listener, 100001, mBlanketDataReturn);
            return;
        }
        List<DBSpaceInfo> listQuery = TextUtils.isEmpty(cardCode) ? spaceDao.query(pageCode) : spaceDao.d(pageCode, cardCode);
        if (listQuery != null && (listQuery.isEmpty() ^ true)) {
            cj4.c("SpaceInfoHelper", "insertOrUpdateSpaceInfo deleteList, delete count: " + spaceDao.a(listQuery));
        }
        if (spaceInfoList.isEmpty()) {
            cj4.c("SpaceInfoHelper", "spaceInfoList is null or empty");
            g0b.b(listener, 0, new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SpaceInfo spaceInfo : spaceInfoList) {
            DBSpaceInfo dBSpaceInfo = new DBSpaceInfo();
            dBSpaceInfo.setStrategyCode(spaceInfo.getStrategyCode());
            dBSpaceInfo.setCardCode(spaceInfo.getCardCode());
            dBSpaceInfo.setContainerCode(spaceInfo.getContainerCode());
            dBSpaceInfo.setContainerTitle(spaceInfo.getContainerTitle());
            dBSpaceInfo.setContainerType(spaceInfo.getContainerType());
            dBSpaceInfo.setDisplayEndTime(spaceInfo.getDisplayEndTime());
            dBSpaceInfo.setDisplayStatTime(spaceInfo.getDisplayStatTime());
            List<SpaceCardMetaData> materielList = spaceInfo.getMaterielList();
            dBSpaceInfo.setMaterielList(materielList == null || materielList.isEmpty() ? "" : sc8.g(spaceInfo.getMaterielList()));
            dBSpaceInfo.setMoreTitle(spaceInfo.getMoreTitle());
            dBSpaceInfo.setMoreJumplUrl(spaceInfo.getMoreJumpUrl());
            dBSpaceInfo.setPageCode(spaceInfo.getPageCode());
            dBSpaceInfo.setPriority(spaceInfo.getPriority());
            arrayList.add(dBSpaceInfo);
        }
        List<Long> listB = spaceDao.b(arrayList);
        cj4.c("SpaceInfoHelper", "insertOrUpdateSpaceInfo insertList, insert count:" + (listB != null ? Integer.valueOf(listB.size()) : null));
        List<Long> list = listB;
        if (list != null && !list.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            return;
        }
        g0b.b(listener, 0, listB);
    }

    public final void c(@Nullable List<? extends SpaceInfo> spaceInfoList, @Nullable IDataOperateListener listener, @NotNull h4i spaceDao) {
        Intrinsics.checkNotNullParameter(spaceDao, "spaceDao");
        cj4.c("SpaceInfoHelper", "insertSpaceInfo");
        if (listener == null) {
            cj4.d("SpaceInfoHelper", "insertSpaceInfo listener is null");
            return;
        }
        try {
            List<Long> listB = spaceDao.b(ts4.INSTANCE.f(spaceInfoList));
            Intrinsics.checkNotNullExpressionValue(listB, "spaceDao.insertList(data)");
            cj4.c("SpaceInfoHelper", "insertSpaceInfo end, insert count:" + listB.size());
            if (listB.isEmpty()) {
                return;
            }
            g0b.b(listener, 0, listB);
        } catch (Exception e2) {
            cj4.b("SpaceInfoHelper", "insertSpaceInfo exception, message:" + e2.getMessage());
            g0b.b(listener, 101001, mBlanketDataReturn);
        }
    }

    public final void d(@Nullable String pageCode, @Nullable String cardCode, @Nullable ICommonListener listener, @NotNull h4i spaceDao) {
        boolean z;
        Intrinsics.checkNotNullParameter(spaceDao, "spaceDao");
        cj4.c("SpaceInfoHelper", "querySpaceByPageCode");
        if (listener == null) {
            cj4.d("SpaceInfoHelper", "querySpaceByPageCode, listener is null");
            return;
        }
        if (pageCode != null) {
            try {
                z = pageCode.length() == 0;
            } catch (Exception e2) {
                cj4.b("SpaceInfoHelper", "querySpaceByPageCode exception, message:" + e2.getMessage());
                g0b.a(listener, 101002, mBlanketDataReturn);
                return;
            }
        }
        if (z) {
            cj4.d("SpaceInfoHelper", "querySpaceByPageCode, spaceId is null or empty!");
            g0b.a(listener, 100001, mBlanketDataReturn);
            return;
        }
        List<DBSpaceInfo> listQuery = TextUtils.isEmpty(cardCode) ? spaceDao.query(pageCode) : spaceDao.d(pageCode, cardCode);
        ArrayList arrayList = new ArrayList();
        if (listQuery != null) {
            for (DBSpaceInfo dBSpaceInfo : listQuery) {
                SpaceInfo spaceInfo = new SpaceInfo();
                spaceInfo.setStrategyCode(dBSpaceInfo.getStrategyCode());
                spaceInfo.setCardCode(dBSpaceInfo.getCardCode());
                spaceInfo.setContainerCode(dBSpaceInfo.getContainerCode());
                spaceInfo.setContainerTitle(dBSpaceInfo.getContainerTitle());
                spaceInfo.setContainerType(dBSpaceInfo.getContainerType());
                spaceInfo.setDisplayEndTime(dBSpaceInfo.getDisplayEndTime());
                spaceInfo.setDisplayStatTime(dBSpaceInfo.getDisplayStatTime());
                spaceInfo.setMaterielList(sc8.d(dBSpaceInfo.getMaterielList(), SpaceCardMetaData.class));
                spaceInfo.setMoreTitle(dBSpaceInfo.getMoreTitle());
                spaceInfo.setMoreJumpUrl(dBSpaceInfo.getMoreJumplUrl());
                spaceInfo.setPageCode(dBSpaceInfo.getPageCode());
                spaceInfo.setPriority(dBSpaceInfo.getPriority());
                arrayList.add(spaceInfo);
            }
        }
        g0b.d(listener, 0, arrayList);
        cj4.c("SpaceInfoHelper", "querySpaceByPageCode end");
    }
}
