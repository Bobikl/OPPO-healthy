package com.heytap.health.health_archives.autosync;

import com.heytap.databaseengine.model.healtharchive.HealthArchiveFile;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.health_archives.bean.AutoStructureRequestBean;
import com.heytap.health.health_archives.bean.UploadPictureBean;
import com.oplus.aiunit.vision.vik;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J6\u0010\r\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0016J\u001e\u0010\u0012\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H\u0016¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/health_archives/autosync/c;", "", "", "Lcom/heytap/health/health_archives/bean/UploadPictureBean;", "pictureBeans", "", "c", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveFile;", "requestFileList", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "result", "", "errorCode", "d", "Lcom/heytap/health/health_archives/bean/AutoStructureRequestBean;", "autoStructureList", "", "isSuccess", "a", "", "deleteClientIdList", "b", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public interface c {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull c cVar, @NotNull List<AutoStructureRequestBean> autoStructureList, boolean z) {
            Intrinsics.checkNotNullParameter(autoStructureList, "autoStructureList");
            String strE = GsonUtil.e(autoStructureList);
            StringBuilder sb = new StringBuilder();
            sb.append("onAsyncStruct isSuccess = ");
            sb.append(z);
            sb.append(", autoStructureList = ");
            sb.append(strE);
        }

        public static void b(@NotNull c cVar, @NotNull List<String> deleteClientIdList) {
            Intrinsics.checkNotNullParameter(deleteClientIdList, "deleteClientIdList");
        }

        public static void c(@NotNull c cVar, @Nullable List<HealthArchiveFile> list, @Nullable List<HealthArchiveRecord> list2, int i) {
            if (i > 0) {
                com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("type", Integer.valueOf(i)).b();
            }
        }

        public static void d(@NotNull c cVar, @NotNull List<UploadPictureBean> pictureBeans) {
            Intrinsics.checkNotNullParameter(pictureBeans, "pictureBeans");
        }
    }

    void a(@NotNull List<AutoStructureRequestBean> autoStructureList, boolean isSuccess);

    void b(@NotNull List<String> deleteClientIdList);

    void c(@NotNull List<UploadPictureBean> pictureBeans);

    void d(@Nullable List<HealthArchiveFile> requestFileList, @Nullable List<HealthArchiveRecord> result, int errorCode);
}
