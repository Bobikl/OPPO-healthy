package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.weight.FamilyMemberInfo;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.heytap.databaseengine.model.weight.WeightGoal;
import com.heytap.databaseengine.option.DataDeleteOption;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengine.option.DataReadOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes15.dex */
public class bz1 {

    public class a extends ro0<CommonBackBean> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ro0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            px1.c("BodyFatRepository", "insertWeightGoalsInternalOnIo： errorCode " + commonBackBean.getErrorCode());
        }

        @Override // com.oplus.aiunit.vision.ro0, com.oplus.aiunit.vision.rfd
        public void onError(Throwable th) {
            super.onError(th);
            px1.b("BodyFatRepository", "insertWeightGoalsInternalOnIo error: " + th.getMessage());
        }
    }

    public static /* synthetic */ cz1 O(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "delFamilyMember： errorCode " + commonBackBean.getErrorCode());
        return new cz1(commonBackBean.getErrorCode());
    }

    public static /* synthetic */ cz1 P(Throwable th) throws Throwable {
        return new cz1(3000);
    }

    public static /* synthetic */ cz1 Q(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "delWeightBodyFat： errorCode " + commonBackBean.getErrorCode());
        return new cz1(commonBackBean.getErrorCode());
    }

    public static /* synthetic */ cz1 R(Throwable th) throws Throwable {
        return new cz1(3000);
    }

    public static /* synthetic */ Long S(Throwable th) throws Throwable {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long T(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "fetchAllWeightBodyFatCount： errorCode " + commonBackBean.getErrorCode());
        int iP0 = p0(commonBackBean.getObj());
        if (iP0 <= 0) {
            return 0L;
        }
        return Long.valueOf(iP0);
    }

    public static /* synthetic */ Long U(Throwable th) throws Throwable {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long V(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "fetchAllWeightBodyFatCount： errorCode " + commonBackBean.getErrorCode());
        int iP0 = p0(commonBackBean.getObj());
        if (iP0 <= 0) {
            return 0L;
        }
        return Long.valueOf(iP0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List W(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "fetchAllWeightBodyFatList： errorCode " + commonBackBean.getErrorCode());
        if (commonBackBean.getObj() != null) {
            l9b.f("BodyFatRepository", "fetchAllWeightBodyFatList：result :" + commonBackBean.getObj());
        } else {
            px1.c("BodyFatRepository", "fetchAllWeightBodyFatList：result is null");
        }
        return r0(commonBackBean.getObj(), WeightBodyFat.class);
    }

    public static /* synthetic */ List X(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ int Y(FamilyMemberInfo familyMemberInfo, FamilyMemberInfo familyMemberInfo2) {
        return Long.compare(familyMemberInfo2.getCreateTimestamp(), familyMemberInfo.getCreateTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List Z(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "fetchFamilyList： errorCode " + commonBackBean.getErrorCode());
        if (commonBackBean.getObj() != null) {
            l9b.f("BodyFatRepository", "fetchFamilyList result: " + commonBackBean.getObj());
        }
        List listR0 = r0(commonBackBean.getObj(), FamilyMemberInfo.class);
        if (!listR0.isEmpty()) {
            listR0.sort(new Comparator() { // from class: com.oplus.aiunit.vision.iy1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return bz1.Y((FamilyMemberInfo) obj, (FamilyMemberInfo) obj2);
                }
            });
            listR0.sort(Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.jy1
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((FamilyMemberInfo) obj).getSubAccount();
                }
            }));
        }
        px1.c("BodyFatRepository", "fetchFamilyList size:" + listR0.size());
        return listR0;
    }

    public static /* synthetic */ List a0(Throwable th) throws Throwable {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b0(CommonBackBean commonBackBean) throws Throwable {
        if (commonBackBean.getObj() != null) {
            l9b.f("BodyFatRepository", "fetchLatestWeightBodyFatList：result :" + commonBackBean.getObj());
        }
        List listR0 = r0(commonBackBean.getObj(), WeightBodyFat.class);
        px1.c("BodyFatRepository", "fetchLatestWeightBodyFatList： errorCode " + commonBackBean.getErrorCode() + "/size:" + listR0.size());
        return listR0;
    }

    public static /* synthetic */ List c0(Throwable th) throws Throwable {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d0(CommonBackBean commonBackBean) throws Throwable {
        if (commonBackBean.getObj() != null) {
            l9b.f("BodyFatRepository", "fetchWeightBodyFatList：result :" + commonBackBean.getObj());
        }
        List listR0 = r0(commonBackBean.getObj(), WeightBodyFat.class);
        px1.c("BodyFatRepository", "fetchWeightBodyFatList： errorCode " + commonBackBean.getErrorCode() + "/size:" + listR0.size());
        return listR0;
    }

    public static /* synthetic */ List e0(Throwable th) throws Throwable {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f0(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "fetchWeightGoalList: errorCode " + commonBackBean.getErrorCode());
        List<WeightGoal> listR0 = r0(commonBackBean.getObj(), WeightGoal.class);
        q0(listR0);
        px1.c("BodyFatRepository", "fetchWeightGoalList size:" + listR0.size());
        return listR0;
    }

    public static /* synthetic */ List g0(Throwable th) throws Throwable {
        px1.b("BodyFatRepository", "fetchWeightGoalList error: " + th.getMessage());
        return new ArrayList();
    }

    public static /* synthetic */ cz1 h0(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "insertFamilyMember： errorCode " + commonBackBean.getErrorCode());
        return new cz1(commonBackBean.getErrorCode());
    }

    public static /* synthetic */ cz1 i0(Throwable th) throws Throwable {
        return new cz1(3000);
    }

    public static /* synthetic */ uaa j0(WeightBodyFat weightBodyFat, CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "insertWeightBodyFat： errorCode " + commonBackBean.getErrorCode());
        return new uaa(commonBackBean.getErrorCode(), weightBodyFat.getWeight());
    }

    public static /* synthetic */ uaa k0(WeightBodyFat weightBodyFat, Throwable th) throws Throwable {
        return new uaa(3000, weightBodyFat.getWeight());
    }

    public static /* synthetic */ cz1 l0(CommonBackBean commonBackBean) throws Throwable {
        px1.c("BodyFatRepository", "insertWeightGoal： errorCode " + commonBackBean.getErrorCode());
        return new cz1(commonBackBean.getErrorCode());
    }

    public static /* synthetic */ cz1 m0(Throwable th) throws Throwable {
        return new cz1(3000);
    }

    public static /* synthetic */ List n0(String str) {
        return new ArrayList();
    }

    public static /* synthetic */ int o0(WeightGoal weightGoal, WeightGoal weightGoal2) {
        return Long.compare(weightGoal2.getCreatedAt(), weightGoal.getCreatedAt());
    }

    public ddd<cz1> B(String str) {
        px1.c("BodyFatRepository", "delFamilyMember");
        DataDeleteOption dataDeleteOption = new DataDeleteOption();
        dataDeleteOption.setSsoid(cn.c().getSsoid());
        dataDeleteOption.setWeightUserTagId(str);
        dataDeleteOption.setDataTable(1020);
        return SportHealthDataAPI.getInstance().deleteSportHealthData(dataDeleteOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ry1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.O((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.sy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.P((Throwable) obj);
            }
        });
    }

    public ddd<cz1> C(String str, List<String> list) {
        px1.c("BodyFatRepository", "delWeightBodyFat");
        DataDeleteOption dataDeleteOption = new DataDeleteOption();
        dataDeleteOption.setSsoid(cn.c().getSsoid());
        dataDeleteOption.setWeightIdList(list);
        dataDeleteOption.setWeightUserTagId(str);
        dataDeleteOption.setDataTable(1021);
        return SportHealthDataAPI.getInstance().deleteSportHealthData(dataDeleteOption).j0(new g18() { // from class: com.oplus.aiunit.vision.zx1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.Q((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.ky1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.R((Throwable) obj);
            }
        });
    }

    public ddd<Long> D() {
        px1.c("BodyFatRepository", "fetchAllWeightBodyFatCount");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(cn.c().getSsoid());
        dataReadOption.setDataTable(1021);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.vy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.T((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.wy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.U((Throwable) obj);
            }
        });
    }

    public ddd<Long> E(String str) {
        px1.c("BodyFatRepository", "fetchAllWeightBodyFatCount userId:" + str);
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setWeightUserTagId(str);
        dataReadOption.setCount(-1);
        dataReadOption.setSsoid(cn.c().getSsoid());
        dataReadOption.setDataTable(1021);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ny1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.V((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.oy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.S((Throwable) obj);
            }
        });
    }

    public ddd<List<WeightBodyFat>> F(String str) {
        px1.c("BodyFatRepository", "fetchAllWeightBodyFatList userId:" + str);
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(cn.c().getSsoid());
        dataReadOption.setWeightUserTagId(str);
        dataReadOption.setDataTable(1021);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ey1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.W((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.fy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.X((Throwable) obj);
            }
        });
    }

    public ddd<List<FamilyMemberInfo>> G() {
        px1.c("BodyFatRepository", "fetchFamilyList");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(cn.c().getSsoid());
        dataReadOption.setDataTable(1020);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ty1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.Z((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.uy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.a0((Throwable) obj);
            }
        });
    }

    public ddd<List<WeightBodyFat>> H(String str, long j2, long j3, int i) {
        px1.c("BodyFatRepository", "fetchLatestWeightBodyFatList startTime:" + j2 + "/endTime:" + j3);
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(cn.c().getSsoid());
        dataReadOption.setWeightUserTagId(str);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setDataTable(1021);
        dataReadOption.setSortOrder(i);
        dataReadOption.setAggregateType(112);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.gy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.b0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.hy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.c0((Throwable) obj);
            }
        });
    }

    public ddd<List<WeightBodyFat>> I(String str, long j2, int i, int i2) {
        px1.c("BodyFatRepository", "fetchWeightBodyFatList minTime:" + j2 + "/count:" + i);
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(cn.c().getSsoid());
        if (!TextUtils.isEmpty(str)) {
            dataReadOption.setWeightUserTagId(str);
        }
        dataReadOption.setWeightMeasurementMinTimestamp(j2);
        dataReadOption.setCount(i);
        dataReadOption.setDataTable(1021);
        dataReadOption.setSortOrder(i2);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.zy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.d0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.az1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.e0((Throwable) obj);
            }
        });
    }

    public ddd<List<WeightGoal>> J(String str) {
        px1.c("BodyFatRepository", "fetchWeightGoalList userTagId:" + str);
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(cn.c().getSsoid());
        if (!TextUtils.isEmpty(str)) {
            dataReadOption.setWeightUserTagId(str);
        }
        dataReadOption.setDataTable(1084);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.cy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.f0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.dy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.g0((Throwable) obj);
            }
        });
    }

    public ddd<cz1> K(FamilyMemberInfo familyMemberInfo) {
        px1.c("BodyFatRepository", "insertFamilyMember");
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDatas(Collections.singletonList(familyMemberInfo));
        dataInsertOption.setDataTable(1020);
        return SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ly1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.h0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.my1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.i0((Throwable) obj);
            }
        });
    }

    public ddd<uaa> L(final WeightBodyFat weightBodyFat) {
        px1.c("BodyFatRepository", "insertWeightBodyFat");
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDatas(Collections.singletonList(weightBodyFat));
        dataInsertOption.setDataTable(1021);
        return SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).j0(new g18() { // from class: com.oplus.aiunit.vision.xy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.j0(weightBodyFat, (CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.yy1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.k0(weightBodyFat, (Throwable) obj);
            }
        });
    }

    public ddd<cz1> M(WeightGoal weightGoal) {
        px1.c("BodyFatRepository", "insertWeightGoal");
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDatas(Collections.singletonList(weightGoal));
        dataInsertOption.setDataTable(1084);
        return SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ay1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.l0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.by1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return bz1.m0((Throwable) obj);
            }
        });
    }

    public final void N(List<WeightGoal> list) {
        px1.c("BodyFatRepository", "insertWeightGoalsInternalOnIo size:" + list.size());
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDatas(new ArrayList(list));
        dataInsertOption.setDataTable(1084);
        SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).K0(tig.d()).subscribe(new a());
    }

    public final int p0(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return 0;
    }

    public final void q0(List<WeightGoal> list) {
        if (w0b.a(list)) {
            return;
        }
        HashMap map = new HashMap();
        for (WeightGoal weightGoal : list) {
            if (weightGoal != null && weightGoal.getState() == 0) {
                ((List) map.computeIfAbsent(weightGoal.getUserTagId(), new Function() { // from class: com.oplus.aiunit.vision.py1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return bz1.n0((String) obj);
                    }
                })).add(weightGoal);
            }
        }
        if (map.isEmpty()) {
            return;
        }
        String ssoid = cn.c().getSsoid();
        ArrayList arrayList = new ArrayList();
        for (List list2 : map.values()) {
            if (list2.size() > 1) {
                list2.sort(new Comparator() { // from class: com.oplus.aiunit.vision.qy1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return bz1.o0((WeightGoal) obj, (WeightGoal) obj2);
                    }
                });
                for (int i = 1; i < list2.size(); i++) {
                    WeightGoal weightGoal2 = (WeightGoal) list2.get(i);
                    WeightGoal weightGoal3 = (WeightGoal) list2.get(i - 1);
                    weightGoal2.setState(1);
                    weightGoal2.setActualEndDate(weightGoal3.getEffectiveDate());
                    weightGoal2.setLatestWeightG(weightGoal3.getInitialWeightG());
                    weightGoal2.setSsoid(ssoid);
                    arrayList.add(weightGoal2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        N(arrayList);
    }

    public final <T> List<T> r0(Object obj, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        if (!(obj instanceof List)) {
            return arrayList;
        }
        for (Object obj2 : (List) obj) {
            if (cls.isInstance(obj2)) {
                arrayList.add(cls.cast(obj2));
            }
        }
        return arrayList;
    }
}