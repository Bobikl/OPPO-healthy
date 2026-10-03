package com.heytap.health.watch.records.db;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.aiunit.vision.RecordFileDbBean;
import com.oplus.aiunit.vision.bhf;
import com.oplus.aiunit.vision.c1j;
import com.oplus.aiunit.vision.pwf;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/watch/records/db/RecordFileDaoImpl;", "Lcom/oplus/aiunit/vision/bhf;", "", "uniqueFlag", "", "pageSize", TypedValues.CycleType.S_WAVE_OFFSET, "", "Lcom/oplus/aiunit/vision/dhf;", "d", "", "fileId", "c", "record", "", "a", "b", "delete", "TAG", "Ljava/lang/String;", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/aiunit/vision/bhf;", "mRecordFileDao", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RecordFileDaoImpl implements bhf {

    @NotNull
    public static final String TAG = "RecordFileDaoImpl";

    @NotNull
    public static final RecordFileDaoImpl INSTANCE = new RecordFileDaoImpl();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mRecordFileDao = LazyKt__LazyJVMKt.lazy(new Function0<bhf>() { // from class: com.heytap.health.watch.records.db.RecordFileDaoImpl$mRecordFileDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final bhf invoke() {
            return RecordFileDatabase.Companion.a().e();
        }
    });

    @Override // com.oplus.aiunit.vision.bhf
    public void a(@NotNull RecordFileDbBean record) {
        Intrinsics.checkNotNullParameter(record, "record");
        pwf.a(TAG, "insert record " + record);
        record.q(c1j.INSTANCE.a(record.getUniqueFlag()));
        bhf bhfVarE = e();
        if (bhfVarE != null) {
            bhfVarE.a(record);
        }
    }

    @Override // com.oplus.aiunit.vision.bhf
    public void b(@NotNull String uniqueFlag, long fileId) {
        Intrinsics.checkNotNullParameter(uniqueFlag, "uniqueFlag");
        pwf.a(TAG, "delete fileId " + fileId);
        bhf bhfVarE = e();
        if (bhfVarE != null) {
            bhfVarE.b(c1j.INSTANCE.a(uniqueFlag), fileId);
        }
    }

    @Override // com.oplus.aiunit.vision.bhf
    @Nullable
    public RecordFileDbBean c(@NotNull String uniqueFlag, long fileId) {
        Intrinsics.checkNotNullParameter(uniqueFlag, "uniqueFlag");
        pwf.a(TAG, "query fileId " + fileId);
        bhf bhfVarE = e();
        if (bhfVarE != null) {
            return bhfVarE.c(c1j.INSTANCE.a(uniqueFlag), fileId);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.bhf
    @Nullable
    public List<RecordFileDbBean> d(@NotNull String uniqueFlag, int pageSize, int offset) {
        Intrinsics.checkNotNullParameter(uniqueFlag, "uniqueFlag");
        pwf.a(TAG, "query pageSize " + pageSize + " offset " + offset);
        bhf bhfVarE = e();
        if (bhfVarE != null) {
            return bhfVarE.d(c1j.INSTANCE.a(uniqueFlag), pageSize, offset);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.bhf
    public void delete(@NotNull String uniqueFlag) {
        Intrinsics.checkNotNullParameter(uniqueFlag, "uniqueFlag");
        pwf.a(TAG, "delete");
        bhf bhfVarE = e();
        if (bhfVarE != null) {
            bhfVarE.delete(c1j.INSTANCE.a(uniqueFlag));
        }
    }

    public final bhf e() {
        return (bhf) mRecordFileDao.getValue();
    }
}
