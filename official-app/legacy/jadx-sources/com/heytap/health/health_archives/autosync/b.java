package com.heytap.health.health_archives.autosync;

import com.heytap.databaseengine.model.healtharchive.HealthArchiveFile;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import com.heytap.health.health_archives.bean.AutoStructureRequestBean;
import com.heytap.health.health_archives.bean.StructureStateBean;
import com.heytap.health.health_archives.bean.UploadPdfBean;
import com.oplus.aiunit.vision.vik;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\r\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J6\u0010\u0017\u001a\u00020\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/autosync/b;", "", "", "Lcom/heytap/health/health_archives/bean/UploadPdfBean;", "uploadPdfs", "", "d", "b", "c", "Lcom/heytap/health/health_archives/bean/AutoStructureRequestBean;", "autoStructureList", "", "isSuccess", "a", "Lcom/heytap/health/health_archives/bean/StructureStateBean;", "queryResult", "f", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveFile;", "requestFileList", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "result", "", "errorCode", MapSchema.FIELD_NAME_ENTRY, "health_archives_release"}, k = 1, mv = {1, 8, 0})
public interface b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull b bVar, @Nullable StructureStateBean structureStateBean) {
        }

        public static void b(@NotNull b bVar, @Nullable List<HealthArchiveFile> list, @Nullable List<HealthArchiveRecord> list2, int i) {
            if (i > 0) {
                com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("type", Integer.valueOf(i)).b();
            }
        }
    }

    void a(@NotNull List<AutoStructureRequestBean> autoStructureList, boolean isSuccess);

    void b(@NotNull List<UploadPdfBean> uploadPdfs);

    void c(@NotNull List<UploadPdfBean> uploadPdfs);

    void d(@NotNull List<UploadPdfBean> uploadPdfs);

    void e(@Nullable List<HealthArchiveFile> requestFileList, @Nullable List<HealthArchiveRecord> result, int errorCode);

    void f(@Nullable StructureStateBean queryResult);
}
