package com.oplus.accountsdk.open.core.storage.db;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.storage.table.AcOpenSQLKeyValue;
import com.oplus.aiunit.vision.hg;
import com.oplus.aiunit.vision.ic;

/* JADX INFO: loaded from: classes6.dex */
@Database(entities = {AcOpenSQLKeyValue.class}, version = 1)
public abstract class AcUserCenterDataBase extends RoomDatabase {
    public static final int DATA_VERSION = 1;
    public static volatile AcUserCenterDataBase f;

    public class a extends RoomDatabase.Callback {
        @Override // androidx.room.RoomDatabase.Callback
        public void onCreate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            AcLogUtil.i("AcUserCenterDataBase", "onCreate");
        }

        @Override // androidx.room.RoomDatabase.Callback
        public void onDestructiveMigration(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            AcLogUtil.i("AcUserCenterDataBase", "onDestructiveMigration");
        }
    }

    public static AcUserCenterDataBase e(Context context) {
        if (f == null) {
            synchronized (AcUserCenterDataBase.class) {
                if (f == null) {
                    f = (AcUserCenterDataBase) Room.databaseBuilder(context.getApplicationContext(), AcUserCenterDataBase.class, "acopen_no_cipher_data.db").allowMainThreadQueries().setQueryExecutor(ic.b().a()).fallbackToDestructiveMigrationOnDowngrade().fallbackToDestructiveMigration().setJournalMode(RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING).enableMultiInstanceInvalidation().addCallback(new a()).build();
                }
            }
        }
        return f;
    }

    public abstract hg d();
}
