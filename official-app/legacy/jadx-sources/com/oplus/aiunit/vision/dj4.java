package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class dj4 {
    public static final String DB_NAME = "cities.db";
    public static final String DB_PATH = b78.a().getDir("databases", 0).getAbsolutePath();
    public static final String TB_CITY = "all_cities";
    public SQLiteDatabase a;
    public String b = "en_US";

    public void a() {
        this.a.close();
        this.a = null;
    }

    public ArrayList<CityBean> b(String str, String str2) {
        Cursor cursorRawQuery;
        if (this.a == null) {
            f();
        }
        if (TextUtils.isEmpty(str)) {
            cursorRawQuery = this.a.rawQuery("select * from all_cities where locale =? and (city_id > 848 or city_id < 827) and flag2=0 order by first_letter", new String[]{str2});
        } else {
            cursorRawQuery = this.a.rawQuery("select * from all_cities where locale =?  and (name like ? or full_spell like ? ) and (city_id > 848 or city_id < 827) and flag2=0 order by first_letter", new String[]{str2, "%" + str + "%", str + "%"});
        }
        if (cursorRawQuery == null) {
            return null;
        }
        ArrayList<CityBean> arrayList = new ArrayList<>();
        while (cursorRawQuery.moveToNext()) {
            arrayList.add(new CityBean(cursorRawQuery));
        }
        cursorRawQuery.close();
        a();
        return arrayList;
    }

    public String c(String str, int i) {
        if (this.a == null) {
            f();
        }
        SQLiteDatabase sQLiteDatabase = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String string = "";
        sb.append("");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from all_cities where locale =?  and city_id =? ", new String[]{str, sb.toString()});
        if (cursorRawQuery != null) {
            while (cursorRawQuery.moveToNext()) {
                string = cursorRawQuery.getString(0);
            }
            cursorRawQuery.close();
            a();
        }
        return string;
    }

    public String d(CityBean cityBean) {
        if (this.a == null) {
            f();
        }
        String string = "";
        if (cityBean == null) {
            return "";
        }
        Cursor cursorRawQuery = this.a.rawQuery("select name from all_cities where locale =?  and city_id =? ", new String[]{this.b, cityBean.getCityId() + ""});
        if (cursorRawQuery != null) {
            while (cursorRawQuery.moveToNext()) {
                string = cursorRawQuery.getString(0);
            }
            cursorRawQuery.close();
            a();
        }
        return string;
    }

    public final SQLiteDatabase e(String str) {
        try {
            return SQLiteDatabase.openOrCreateDatabase(str, (SQLiteDatabase.CursorFactory) null);
        } catch (Exception e2) {
            kw0.b("DBManager", "IO exception " + e2.getMessage());
            return null;
        }
    }

    public final void f() {
        this.a = e(DB_PATH + "/" + DB_NAME);
    }
}
