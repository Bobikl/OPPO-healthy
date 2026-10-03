package com.oplus.nearx.database;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.oplus.aiunit.vision.ap9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/oplus/nearx/database/TapDatabase;", "", "Companion", "Callback", "a", "TapDatabase_release"}, k = 1, mv = {1, 4, 0})
public class TapDatabase {

    @NotNull
    public static final Lazy a = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ExecutorService>() { // from class: com.oplus.nearx.database.TapDatabase$Companion$sExecutor$2
        @Override // p010kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/nearx/database/TapDatabase$Callback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "TapDatabase_release"}, k = 1, mv = {1, 4, 0})
    public final class Callback extends SupportSQLiteOpenHelper.Callback {
        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkParameterIsNotNull(db, "db");
            TapDatabase.a(null);
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(@NotNull SupportSQLiteDatabase db, int oldVersion, int newVersion) {
            Intrinsics.checkParameterIsNotNull(db, "db");
            if (oldVersion >= newVersion) {
                return;
            }
            TapDatabase.a(null);
            throw null;
        }
    }

    public static final /* synthetic */ ap9 a(TapDatabase tapDatabase) {
        throw null;
    }
}
