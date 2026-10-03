package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.core.reconciliation.ClearReason;
import com.oplus.drs.core.reconciliation.FilterReason;
import com.oplus.drs.core.reconciliation.FlowControlReason;
import com.oplus.drs.core.reconciliation.UploadFailReason;
import com.oplus.drs.core.reconciliation.ValidationReason;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public class sv4 implements rv4 {
    public final x56 a;

    public class a implements Callable<Void> {
        public final /* synthetic */ Map i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16764j;

        public a(Map map, String str) {
            this.i = map;
            this.f16764j = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            SQLiteDatabase writableDatabase = sv4.this.a.getWritableDatabase();
            int iC = sv4.this.C();
            int iD = sv4.this.D();
            writableDatabase.beginTransaction();
            try {
                try {
                    for (Map.Entry entry : this.i.entrySet()) {
                        int iIntValue = entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0;
                        if (iIntValue > 0) {
                            tv4 tv4VarF = sv4.this.F(writableDatabase, this.f16764j, ((Long) entry.getKey()).longValue(), iC, iD);
                            tv4VarF.L(tv4VarF.r() + ((long) iIntValue));
                            tv4VarF.K(System.currentTimeMillis());
                            sv4.this.I(writableDatabase, tv4VarF);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception e2) {
                    z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateUploadAttemptBatch error: appId=%s, %s", this.f16764j, e2.getMessage()), e2);
                }
                return null;
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    public class b implements Callable<Void> {
        public final /* synthetic */ Map i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16765j;

        public b(Map map, String str) {
            this.i = map;
            this.f16765j = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            SQLiteDatabase writableDatabase = sv4.this.a.getWritableDatabase();
            int iC = sv4.this.C();
            int iD = sv4.this.D();
            writableDatabase.beginTransaction();
            try {
                try {
                    for (Map.Entry entry : this.i.entrySet()) {
                        int iIntValue = entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0;
                        if (iIntValue > 0) {
                            tv4 tv4VarF = sv4.this.F(writableDatabase, this.f16765j, ((Long) entry.getKey()).longValue(), iC, iD);
                            tv4VarF.N(tv4VarF.t() + ((long) iIntValue));
                            tv4VarF.K(System.currentTimeMillis());
                            sv4.this.I(writableDatabase, tv4VarF);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception e2) {
                    z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateUploadRequestCountBatch error: appId=%s, %s", this.f16765j, e2.getMessage()), e2);
                }
                return null;
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    public class c implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16766j;
        public final /* synthetic */ UploadFailReason k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f16767l;
        public final /* synthetic */ int m;

        public c(String str, long j2, UploadFailReason uploadFailReason, long j3, int i) {
            this.i = str;
            this.f16766j = j2;
            this.k = uploadFailReason;
            this.f16767l = j3;
            this.m = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16766j);
                tv4VarG.M(hgf.a(tv4VarG.s(), this.k.getCode(), this.f16767l));
                tv4VarG.O(hgf.a(tv4VarG.u(), this.m, this.f16767l));
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateUploadFailed: appId=%s, time=%d, count=%d, reason=%s, retry=%d", this.i, Long.valueOf(this.f16766j), Long.valueOf(this.f16767l), this.k.getDescription(), Integer.valueOf(this.m)));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateUploadFailed error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    public class d implements Callable<Void> {
        public final /* synthetic */ Map i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16769j;
        public final /* synthetic */ UploadFailReason k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f16770l;

        public d(Map map, String str, UploadFailReason uploadFailReason, int i) {
            this.i = map;
            this.f16769j = str;
            this.k = uploadFailReason;
            this.f16770l = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            SQLiteDatabase writableDatabase = sv4.this.a.getWritableDatabase();
            int iC = sv4.this.C();
            int iD = sv4.this.D();
            writableDatabase.beginTransaction();
            try {
                try {
                    for (Map.Entry entry : this.i.entrySet()) {
                        int iIntValue = entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0;
                        if (iIntValue > 0) {
                            tv4 tv4VarF = sv4.this.F(writableDatabase, this.f16769j, ((Long) entry.getKey()).longValue(), iC, iD);
                            String strA = hgf.a(tv4VarF.s(), this.k.getCode(), iIntValue);
                            if (this.f16770l > 0) {
                                strA = hgf.b(strA, 1L);
                            }
                            tv4VarF.M(strA);
                            tv4VarF.K(System.currentTimeMillis());
                            sv4.this.I(writableDatabase, tv4VarF);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception e2) {
                    z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateUploadFailedBatch error: appId=%s, %s", this.f16769j, e2.getMessage()), e2);
                }
                return null;
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    public class e implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16771j;
        public final /* synthetic */ long k;

        public e(String str, long j2, long j3) {
            this.i = str;
            this.f16771j = j2;
            this.k = j3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16771j);
                tv4VarG.P(tv4VarG.v() + this.k);
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateUploaded: appId=%s, time=%d, count=%d", this.i, Long.valueOf(this.f16771j), Long.valueOf(this.k)));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateUploaded error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    public class f implements Callable<Void> {
        public final /* synthetic */ Map i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16773j;
        public final /* synthetic */ int k;

        public f(Map map, String str, int i) {
            this.i = map;
            this.f16773j = str;
            this.k = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            SQLiteDatabase writableDatabase = sv4.this.a.getWritableDatabase();
            int iC = sv4.this.C();
            int iD = sv4.this.D();
            writableDatabase.beginTransaction();
            try {
                try {
                    for (Map.Entry entry : this.i.entrySet()) {
                        int iIntValue = entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0;
                        if (iIntValue > 0) {
                            tv4 tv4VarF = sv4.this.F(writableDatabase, this.f16773j, ((Long) entry.getKey()).longValue(), iC, iD);
                            long j2 = iIntValue;
                            tv4VarF.P(tv4VarF.v() + j2);
                            tv4VarF.O(hgf.a(tv4VarF.u(), this.k, j2));
                            tv4VarF.K(System.currentTimeMillis());
                            sv4.this.I(writableDatabase, tv4VarF);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception e2) {
                    z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateUploadedBatch error: appId=%s, %s", this.f16773j, e2.getMessage()), e2);
                }
                return null;
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    public class g implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16775j;
        public final /* synthetic */ ClearReason k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f16776l;

        public g(String str, long j2, ClearReason clearReason, long j3) {
            this.i = str;
            this.f16775j = j2;
            this.k = clearReason;
            this.f16776l = j3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16775j);
                tv4VarG.A(hgf.a(tv4VarG.d(), this.k.getCode(), this.f16776l));
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateCleared: appId=%s, time=%d, count=%d, reason=%s", this.i, Long.valueOf(this.f16775j), Long.valueOf(this.f16776l), this.k.getDescription()));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateCleared error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    public class h implements Callable<List<tv4>> {
        public h() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<tv4> call() {
            SQLiteDatabase writableDatabase = sv4.this.a.getWritableDatabase();
            ArrayList arrayList = new ArrayList();
            try {
                String string = UUID.randomUUID().toString();
                long jCurrentTimeMillis = System.currentTimeMillis();
                writableDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sequence_id", string);
                    contentValues.put("update_time", Long.valueOf(jCurrentTimeMillis));
                    int iUpdate = writableDatabase.update("data_reconciliation", contentValues, "(sequence_id='0' OR sequence_id IS NULL)", null);
                    if (iUpdate <= 0) {
                        z6b.k("DataReconciliationDaoImpl", "queryReconciliationList: no untagged records found");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        return arrayList;
                    }
                    z6b.k("DataReconciliationDaoImpl", String.format("queryReconciliationList: marked %d records with UUID=%s", Integer.valueOf(iUpdate), string));
                    Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT * FROM data_reconciliation WHERE sequence_id=? ORDER BY event_time ASC", new String[]{string});
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            arrayList.add(sv4.this.A(cursorRawQuery));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    z6b.q("DataReconciliationDaoImpl", String.format("queryReconciliationList: queried %d records with UUID=%s", Integer.valueOf(arrayList.size()), string));
                    return arrayList;
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("queryReconciliationList error: %s", e2.getMessage()), e2);
            }
        }
    }

    public class i implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16777j;
        public final /* synthetic */ long k;

        public i(String str, long j2, long j3) {
            this.i = str;
            this.f16777j = j2;
            this.k = j3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16777j);
                tv4VarG.G(tv4VarG.l() + this.k);
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateReceived: appId=%s, time=%d, count=%d, total=%d", this.i, Long.valueOf(this.f16777j), Long.valueOf(this.k), Long.valueOf(tv4VarG.l())));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateReceived error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    public class j implements Callable<Void> {
        public final /* synthetic */ List i;

        public j(List list) {
            this.i = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            SQLiteDatabase writableDatabase = sv4.this.a.getWritableDatabase();
            int i = 0;
            int i2 = 0;
            while (i < this.i.size()) {
                try {
                    int i3 = i + 100;
                    List listSubList = this.i.subList(i, Math.min(i3, this.i.size()));
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < listSubList.size(); i4++) {
                        if (i4 > 0) {
                            sb.append(",");
                        }
                        sb.append("?");
                    }
                    String str = "sequence_id IN (" + ((Object) sb) + ")";
                    String[] strArr = new String[listSubList.size()];
                    for (int i5 = 0; i5 < listSubList.size(); i5++) {
                        strArr[i5] = (String) listSubList.get(i5);
                    }
                    int iDelete = writableDatabase.delete("data_reconciliation", str, strArr);
                    i2 += iDelete;
                    z6b.k("DataReconciliationDaoImpl", String.format("removeBySequenceIds batch: deleted=%d", Integer.valueOf(iDelete)));
                    i = i3;
                } catch (Exception e2) {
                    z6b.p("DataReconciliationDaoImpl", String.format("removeBySequenceIds error: %s", e2.getMessage()), e2);
                    return null;
                }
            }
            z6b.q("DataReconciliationDaoImpl", String.format("removeBySequenceIds total: deleted=%d", Integer.valueOf(i2)));
            return null;
        }
    }

    public class k implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16780j;
        public final /* synthetic */ ValidationReason k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f16781l;

        public k(String str, long j2, ValidationReason validationReason, long j3) {
            this.i = str;
            this.f16780j = j2;
            this.k = validationReason;
            this.f16781l = j3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16780j);
                tv4VarG.Q(hgf.a(tv4VarG.w(), this.k.getCode(), this.f16781l));
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateValidationFailed: appId=%s, time=%d, count=%d, reason=%s", this.i, Long.valueOf(this.f16780j), Long.valueOf(this.f16781l), this.k.getDescription()));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateValidationFailed error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    public class l implements Callable<Void> {
        public final /* synthetic */ Map i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16782j;
        public final /* synthetic */ ValidationReason k;

        public l(Map map, String str, ValidationReason validationReason) {
            this.i = map;
            this.f16782j = str;
            this.k = validationReason;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            SQLiteDatabase writableDatabase = sv4.this.a.getWritableDatabase();
            int iC = sv4.this.C();
            int iD = sv4.this.D();
            writableDatabase.beginTransaction();
            try {
                try {
                    for (Map.Entry entry : this.i.entrySet()) {
                        int iIntValue = entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0;
                        if (iIntValue > 0) {
                            tv4 tv4VarF = sv4.this.F(writableDatabase, this.f16782j, ((Long) entry.getKey()).longValue(), iC, iD);
                            tv4VarF.Q(hgf.a(tv4VarF.w(), this.k.getCode(), iIntValue));
                            tv4VarF.K(System.currentTimeMillis());
                            sv4.this.I(writableDatabase, tv4VarF);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception e2) {
                    z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateValidationFailedBatch error: appId=%s, %s", this.f16782j, e2.getMessage()), e2);
                }
                return null;
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    public class m implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16784j;
        public final /* synthetic */ FilterReason k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f16785l;

        public m(String str, long j2, FilterReason filterReason, long j3) {
            this.i = str;
            this.f16784j = j2;
            this.k = filterReason;
            this.f16785l = j3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16784j);
                tv4VarG.D(hgf.a(tv4VarG.h(), this.k.getCode(), this.f16785l));
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateFiltered: appId=%s, time=%d, count=%d, reason=%s", this.i, Long.valueOf(this.f16784j), Long.valueOf(this.f16785l), this.k.getDescription()));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateFiltered error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    public class n implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16786j;
        public final /* synthetic */ int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f16787l;

        public n(String str, long j2, int i, long j3) {
            this.i = str;
            this.f16786j = j2;
            this.k = i;
            this.f16787l = j3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16786j);
                if (this.k == 0) {
                    tv4VarG.y(tv4VarG.b() + this.f16787l);
                } else {
                    tv4VarG.z(tv4VarG.c() + this.f16787l);
                }
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateCached: appId=%s, time=%d, count=%d, flag=%d", this.i, Long.valueOf(this.f16786j), Long.valueOf(this.f16787l), Integer.valueOf(this.k)));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateCached error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    public class o implements Callable<Void> {
        public final /* synthetic */ Map i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16788j;
        public final /* synthetic */ int k;

        public o(Map map, String str, int i) {
            this.i = map;
            this.f16788j = str;
            this.k = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            SQLiteDatabase writableDatabase = sv4.this.a.getWritableDatabase();
            int iC = sv4.this.C();
            int iD = sv4.this.D();
            writableDatabase.beginTransaction();
            try {
                try {
                    for (Map.Entry entry : this.i.entrySet()) {
                        int iIntValue = entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0;
                        if (iIntValue > 0) {
                            tv4 tv4VarF = sv4.this.F(writableDatabase, this.f16788j, ((Long) entry.getKey()).longValue(), iC, iD);
                            if (this.k == 0) {
                                tv4VarF.y(tv4VarF.b() + ((long) iIntValue));
                            } else {
                                tv4VarF.z(tv4VarF.c() + ((long) iIntValue));
                            }
                            tv4VarF.K(System.currentTimeMillis());
                            sv4.this.I(writableDatabase, tv4VarF);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception e2) {
                    z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateCachedBatch error: appId=%s, %s", this.f16788j, e2.getMessage()), e2);
                }
                return null;
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    public class p implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16790j;
        public final /* synthetic */ FlowControlReason k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f16791l;

        public p(String str, long j2, FlowControlReason flowControlReason, long j3) {
            this.i = str;
            this.f16790j = j2;
            this.k = flowControlReason;
            this.f16791l = j3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16790j);
                tv4VarG.E(hgf.a(tv4VarG.i(), this.k.getCode(), this.f16791l));
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateFlowControl: appId=%s, time=%d, triggerCount=%d, reason=%s", this.i, Long.valueOf(this.f16790j), Long.valueOf(this.f16791l), this.k.getDescription()));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateFlowControl error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    public class q implements Callable<Void> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f16792j;
        public final /* synthetic */ long k;

        public q(String str, long j2, long j3) {
            this.i = str;
            this.f16792j = j2;
            this.k = j3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                tv4 tv4VarG = sv4.this.G(this.i, this.f16792j);
                tv4VarG.L(tv4VarG.r() + this.k);
                tv4VarG.K(System.currentTimeMillis());
                sv4.this.J(tv4VarG);
                z6b.k("DataReconciliationDaoImpl", String.format("insertOrUpdateUploadAttempt: appId=%s, time=%d, count=%d", this.i, Long.valueOf(this.f16792j), Long.valueOf(this.k)));
                return null;
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateUploadAttempt error: appId=%s, %s", this.i, e2.getMessage()), e2);
                return null;
            }
        }
    }

    @Deprecated
    public sv4(Context context) {
        Context contextH = w56.h();
        this.a = new x56(contextH != null ? contextH : context);
    }

    public final tv4 A(Cursor cursor) {
        tv4 tv4Var = new tv4();
        tv4Var.F(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        tv4Var.x(cursor.getString(cursor.getColumnIndexOrThrow("app_id")));
        tv4Var.C(cursor.getLong(cursor.getColumnIndexOrThrow("event_time")));
        try {
            tv4Var.J(cursor.getInt(cursor.getColumnIndexOrThrow("source_process")));
        } catch (Exception unused) {
            tv4Var.J(0);
        }
        tv4Var.H(cursor.getInt(cursor.getColumnIndexOrThrow("record_date")));
        tv4Var.G(cursor.getLong(cursor.getColumnIndexOrThrow("received_count")));
        tv4Var.Q(cursor.getString(cursor.getColumnIndexOrThrow("validation_failed_reasons")));
        tv4Var.D(cursor.getString(cursor.getColumnIndexOrThrow("filtered_reasons")));
        tv4Var.y(cursor.getLong(cursor.getColumnIndexOrThrow("cached_count")));
        tv4Var.z(cursor.getLong(cursor.getColumnIndexOrThrow("cached_pending_count")));
        tv4Var.E(cursor.getString(cursor.getColumnIndexOrThrow("flow_control_reasons")));
        tv4Var.L(cursor.getLong(cursor.getColumnIndexOrThrow("upload_attempt_count")));
        try {
            tv4Var.N(cursor.getLong(cursor.getColumnIndexOrThrow("upload_request_count")));
        } catch (Exception unused2) {
            tv4Var.N(0L);
        }
        tv4Var.M(cursor.getString(cursor.getColumnIndexOrThrow("upload_failed_reasons")));
        tv4Var.O(cursor.getString(cursor.getColumnIndexOrThrow("upload_retry_distribution")));
        tv4Var.P(cursor.getLong(cursor.getColumnIndexOrThrow("uploaded_count")));
        tv4Var.A(cursor.getString(cursor.getColumnIndexOrThrow("clear_reasons")));
        tv4Var.I(cursor.getString(cursor.getColumnIndexOrThrow("sequence_id")));
        tv4Var.B(cursor.getLong(cursor.getColumnIndexOrThrow("create_time")));
        tv4Var.K(cursor.getLong(cursor.getColumnIndexOrThrow("update_time")));
        return tv4Var;
    }

    public final ContentValues B(tv4 tv4Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", tv4Var.a());
        contentValues.put("event_time", Long.valueOf(tv4Var.g()));
        contentValues.put("record_date", Integer.valueOf(tv4Var.m()));
        contentValues.put("source_process", Integer.valueOf(tv4Var.o()));
        contentValues.put("received_count", Long.valueOf(tv4Var.l()));
        contentValues.put("validation_failed_reasons", tv4Var.w());
        contentValues.put("filtered_reasons", tv4Var.h());
        contentValues.put("cached_count", Long.valueOf(tv4Var.b()));
        contentValues.put("cached_pending_count", Long.valueOf(tv4Var.c()));
        contentValues.put("flow_control_reasons", tv4Var.i());
        contentValues.put("upload_attempt_count", Long.valueOf(tv4Var.r()));
        contentValues.put("upload_request_count", Long.valueOf(tv4Var.t()));
        contentValues.put("upload_failed_reasons", tv4Var.s());
        contentValues.put("upload_retry_distribution", tv4Var.u());
        contentValues.put("uploaded_count", Long.valueOf(tv4Var.v()));
        contentValues.put("clear_reasons", tv4Var.d());
        contentValues.put("sequence_id", tv4Var.n());
        contentValues.put("create_time", Long.valueOf(tv4Var.f()));
        contentValues.put("update_time", Long.valueOf(tv4Var.q()));
        return contentValues;
    }

    public final int C() {
        return E() ? (int) (System.currentTimeMillis() / 300000) : Integer.parseInt(new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date()));
    }

    public final int D() {
        try {
            ChannelMode channelModeA = w56.a();
            if (channelModeA == ChannelMode.DRS) {
                return 1;
            }
            return channelModeA == ChannelMode.STANDALONE ? 2 : 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final boolean E() {
        return false;
    }

    public final tv4 F(SQLiteDatabase sQLiteDatabase, String str, long j2, int i2, int i3) {
        Cursor cursorQuery = sQLiteDatabase.query("data_reconciliation", null, "app_id=? AND event_time=? AND record_date=? AND source_process=? AND (sequence_id='0' OR sequence_id IS NULL)", new String[]{String.valueOf(str), String.valueOf(j2), String.valueOf(i2), String.valueOf(i3)}, null, null, null, "1");
        try {
            if (cursorQuery.moveToFirst()) {
                tv4 tv4VarA = A(cursorQuery);
                cursorQuery.close();
                return tv4VarA;
            }
            cursorQuery.close();
            tv4 tv4Var = new tv4();
            tv4Var.x(str);
            tv4Var.C(j2);
            tv4Var.H(i2);
            tv4Var.J(i3);
            tv4Var.I("0");
            tv4Var.B(System.currentTimeMillis());
            tv4Var.K(System.currentTimeMillis());
            return tv4Var;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public final tv4 G(String str, long j2) {
        return F(this.a.getWritableDatabase(), str, j2, C(), D());
    }

    public final <T> T H(Callable<T> callable) {
        try {
            return (T) u56.p(callable).get();
        } catch (Exception e2) {
            z6b.p("DataReconciliationDaoImpl", "runWrite error: " + e2.getMessage(), e2);
            return null;
        }
    }

    public final void I(SQLiteDatabase sQLiteDatabase, tv4 tv4Var) {
        ContentValues contentValuesB = B(tv4Var);
        if (tv4Var.j() > 0) {
            sQLiteDatabase.update("data_reconciliation", contentValuesB, "_id=?", new String[]{String.valueOf(tv4Var.j())});
        } else {
            tv4Var.F(sQLiteDatabase.insert("data_reconciliation", null, contentValuesB));
        }
    }

    public final void J(tv4 tv4Var) {
        I(this.a.getWritableDatabase(), tv4Var);
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void a(String str, long j2, long j3, FlowControlReason flowControlReason) {
        H(new p(str, j2, flowControlReason, j3));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void b(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        H(new j(list));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void c(String str, long j2, long j3, UploadFailReason uploadFailReason, int i2) {
        H(new c(str, j2, uploadFailReason, j3, i2));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public List<tv4> d() {
        return (List) H(new h());
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void e(String str, long j2, long j3, ClearReason clearReason) {
        H(new g(str, j2, clearReason, j3));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void f(String str, Map<Long, Integer> map, ValidationReason validationReason) {
        if (map == null || map.isEmpty()) {
            return;
        }
        H(new l(map, str, validationReason));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void g(String str, Map<Long, Integer> map, int i2) {
        if (map == null || map.isEmpty()) {
            return;
        }
        H(new o(map, str, i2));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void h(String str, long j2, long j3) {
        H(new i(str, j2, j3));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void i(String str, Map<Long, Integer> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        H(new b(map, str));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void j(String str, long j2, long j3, FilterReason filterReason) {
        H(new m(str, j2, filterReason, j3));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void k(String str, long j2, long j3) {
        H(new e(str, j2, j3));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void l(String str, Map<Long, Integer> map, int i2) {
        if (map == null || map.isEmpty()) {
            return;
        }
        H(new f(map, str, i2));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void m(String str, long j2, long j3) {
        H(new q(str, j2, j3));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void n(String str, long j2, long j3, ValidationReason validationReason) {
        H(new k(str, j2, validationReason, j3));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void o(String str, Map<Long, Integer> map, UploadFailReason uploadFailReason, int i2) {
        if (map == null || map.isEmpty()) {
            return;
        }
        H(new d(map, str, uploadFailReason, i2));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void p(String str, long j2, agf.b bVar) {
        if (bVar == null) {
            return;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        int iC = C();
        int iD = D();
        writableDatabase.beginTransaction();
        try {
            try {
                tv4 tv4VarF = F(writableDatabase, str, j2, iC, iD);
                if (bVar.a > 0) {
                    tv4VarF.G(tv4VarF.l() + ((long) bVar.a));
                }
                if (bVar.b > 0) {
                    tv4VarF.y(tv4VarF.b() + ((long) bVar.b));
                }
                for (Map.Entry<Integer, Integer> entry : bVar.f9351c.entrySet()) {
                    tv4VarF.Q(hgf.a(tv4VarF.w(), entry.getKey().intValue(), entry.getValue().intValue()));
                }
                for (Map.Entry<Integer, Integer> entry2 : bVar.d.entrySet()) {
                    tv4VarF.D(hgf.a(tv4VarF.h(), entry2.getKey().intValue(), entry2.getValue().intValue()));
                }
                for (Map.Entry<Integer, Integer> entry3 : bVar.f9352e.entrySet()) {
                    tv4VarF.E(hgf.a(tv4VarF.i(), entry3.getKey().intValue(), entry3.getValue().intValue()));
                }
                tv4VarF.K(System.currentTimeMillis());
                I(writableDatabase, tv4VarF);
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e2) {
                z6b.p("DataReconciliationDaoImpl", String.format("insertOrUpdateAllMetrics error: appId=%s, %s", str, e2.getMessage()), e2);
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void q(String str, long j2, long j3, int i2) {
        H(new n(str, j2, i2, j3));
    }

    @Override // com.oplus.aiunit.vision.rv4
    public void r(String str, Map<Long, Integer> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        H(new a(map, str));
    }
}
