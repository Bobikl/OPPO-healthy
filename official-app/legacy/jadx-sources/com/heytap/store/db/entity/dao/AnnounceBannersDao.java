package com.heytap.store.db.entity.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.heytap.store.db.entity.main.AnnounceBanners;
import com.oplus.aiunit.vision.a6;
import com.oplus.aiunit.vision.cs4;
import com.oplus.aiunit.vision.d05;
import com.oplus.aiunit.vision.wz4;
import com.oplus.aiunit.vision.yye;
import com.oplus.drs.core.config.entity.DebugModeEntity;

/* JADX INFO: loaded from: classes4.dex */
public class AnnounceBannersDao extends a6<AnnounceBanners, Long> {
    public static final String TABLENAME = "ANNOUNCE_BANNERS";

    public static class Properties {
        public static final yye Id = new yye(0, Long.class, "id", true, "_id");
        public static final yye AnnounceId = new yye(1, Long.class, "announceId", false, "ANNOUNCE_ID");
        public static final yye Url = new yye(2, String.class, "url", false, "URL");
        public static final yye Link = new yye(3, String.class, "link", false, "LINK");
        public static final yye Seq = new yye(4, Integer.class, "seq", false, "SEQ");
        public static final yye BeginAt = new yye(5, Long.class, "beginAt", false, "BEGIN_AT");
        public static final yye EndAt = new yye(6, Long.class, DebugModeEntity.KEY_END_AT, false, "END_AT");
        public static final yye IsLogin = new yye(7, Integer.class, "isLogin", false, "IS_LOGIN");
    }

    public AnnounceBannersDao(cs4 cs4Var) {
        super(cs4Var);
    }

    public static void createTable(wz4 wz4Var, boolean z) {
        wz4Var.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ANNOUNCE_BANNERS\" (\"_id\" INTEGER PRIMARY KEY ,\"ANNOUNCE_ID\" INTEGER,\"URL\" TEXT,\"LINK\" TEXT,\"SEQ\" INTEGER,\"BEGIN_AT\" INTEGER,\"END_AT\" INTEGER,\"IS_LOGIN\" INTEGER);");
    }

    public static void dropTable(wz4 wz4Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ANNOUNCE_BANNERS\"");
        wz4Var.execSQL(sb.toString());
    }

    @Override // com.oplus.aiunit.vision.a6
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AnnounceBannersDao(cs4 cs4Var, DaoSession daoSession) {
        super(cs4Var, daoSession);
    }

    @Override // com.oplus.aiunit.vision.a6
    public Long getKey(AnnounceBanners announceBanners) {
        if (announceBanners != null) {
            return announceBanners.getId();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.a6
    public boolean hasKey(AnnounceBanners announceBanners) {
        return announceBanners.getId() != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.a6
    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // com.oplus.aiunit.vision.a6
    public final Long updateKeyAfterInsert(AnnounceBanners announceBanners, long j2) {
        announceBanners.setId(Long.valueOf(j2));
        return Long.valueOf(j2);
    }

    @Override // com.oplus.aiunit.vision.a6
    public final void bindValues(d05 d05Var, AnnounceBanners announceBanners) {
        d05Var.clearBindings();
        Long id = announceBanners.getId();
        if (id != null) {
            d05Var.bindLong(1, id.longValue());
        }
        Long announceId = announceBanners.getAnnounceId();
        if (announceId != null) {
            d05Var.bindLong(2, announceId.longValue());
        }
        String url = announceBanners.getUrl();
        if (url != null) {
            d05Var.bindString(3, url);
        }
        String link = announceBanners.getLink();
        if (link != null) {
            d05Var.bindString(4, link);
        }
        Integer seq = announceBanners.getSeq();
        if (seq != null) {
            d05Var.bindLong(5, seq.intValue());
        }
        Long beginAt = announceBanners.getBeginAt();
        if (beginAt != null) {
            d05Var.bindLong(6, beginAt.longValue());
        }
        Long endAt = announceBanners.getEndAt();
        if (endAt != null) {
            d05Var.bindLong(7, endAt.longValue());
        }
        Integer isLogin = announceBanners.getIsLogin();
        if (isLogin != null) {
            d05Var.bindLong(8, isLogin.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.a6
    public AnnounceBanners readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        String string = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string2 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        Integer numValueOf = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Long lValueOf3 = cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7));
        int i8 = i + 6;
        int i9 = i + 7;
        return new AnnounceBanners(lValueOf, lValueOf2, string, string2, numValueOf, lValueOf3, cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)), cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
    }

    @Override // com.oplus.aiunit.vision.a6
    public void readEntity(Cursor cursor, AnnounceBanners announceBanners, int i) {
        int i2 = i + 0;
        announceBanners.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        announceBanners.setAnnounceId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        announceBanners.setUrl(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        announceBanners.setLink(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        announceBanners.setSeq(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        announceBanners.setBeginAt(cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)));
        int i8 = i + 6;
        announceBanners.setEndAt(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i + 7;
        announceBanners.setIsLogin(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
    }

    @Override // com.oplus.aiunit.vision.a6
    public final void bindValues(SQLiteStatement sQLiteStatement, AnnounceBanners announceBanners) {
        sQLiteStatement.clearBindings();
        Long id = announceBanners.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long announceId = announceBanners.getAnnounceId();
        if (announceId != null) {
            sQLiteStatement.bindLong(2, announceId.longValue());
        }
        String url = announceBanners.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(3, url);
        }
        String link = announceBanners.getLink();
        if (link != null) {
            sQLiteStatement.bindString(4, link);
        }
        Integer seq = announceBanners.getSeq();
        if (seq != null) {
            sQLiteStatement.bindLong(5, seq.intValue());
        }
        Long beginAt = announceBanners.getBeginAt();
        if (beginAt != null) {
            sQLiteStatement.bindLong(6, beginAt.longValue());
        }
        Long endAt = announceBanners.getEndAt();
        if (endAt != null) {
            sQLiteStatement.bindLong(7, endAt.longValue());
        }
        Integer isLogin = announceBanners.getIsLogin();
        if (isLogin != null) {
            sQLiteStatement.bindLong(8, isLogin.intValue());
        }
    }
}
