package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class mmm extends vcm<yum> {
    public mmm(Context context) {
        super(context);
    }

    @Override // com.oplus.aiunit.vision.vcm
    public final long a() {
        if (!e()) {
            return 0L;
        }
        try {
            return DatabaseUtils.queryNumEntries(this.a, "apm");
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    @Override // com.oplus.aiunit.vision.vcm
    public final long b(yum yumVar) {
        if (!e()) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("eventId", yumVar.b);
            contentValues.put("data", yumVar.f19163c);
            contentValues.put("createTime", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("monitorKey", yumVar.d);
            return this.a.insert("apm", null, contentValues);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    @Override // com.oplus.aiunit.vision.vcm
    public final boolean c(ArrayList arrayList) {
        if (!e()) {
            return false;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yum yumVar = (yum) it.next();
                this.a.delete("apm", "id = " + yumVar.a, null);
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.vcm
    public final ArrayList f() {
        if (!e()) {
            return null;
        }
        try {
            Cursor cursorQuery = this.a.query("apm", lsm.a, null, null, null, null, "id ASC LIMIT + 100");
            try {
                ArrayList arrayList = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new yum(cursorQuery.getLong(0), cursorQuery.getString(1), cursorQuery.getBlob(2), cursorQuery.getString(3)));
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
