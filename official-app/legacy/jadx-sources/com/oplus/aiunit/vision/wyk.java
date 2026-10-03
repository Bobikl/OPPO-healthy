package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.base.download.resource.ResourceBean;
import com.heytap.health.watchface.R$string;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@ose({"/watch_face/main/VideoCustomActivity"})
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0014J6\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0014J,\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0014J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/wyk;", "Lcom/oplus/aiunit/vision/b5;", "Lcom/oplus/aiunit/vision/i11;", "dataManager", "", "", "", "commonParams", "", "Lcom/oplus/aiunit/vision/u36;", LogFieldKey.LEVEL_KEY, "", "position", "Lcom/heytap/health/base/download/resource/ResourceBean;", "resourceBean", "downloadTaskBeans", t04.DEVICE_UNIQUE_ID, "", "o", "Landroid/content/Context;", "context", "resourceBeanList", LogFieldKey.PROCESS_NAME_KEY, MapSchema.FIELD_NAME_KEY, "b", "Ljava/lang/String;", "videoMaterialType", "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVideoPreDownloadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPreDownloadTask.kt\ncom/heytap/health/watchface/business/creation/predownload/task/VideoPreDownloadTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public class wyk extends b5 {

    @NotNull
    public static final String OWN_VIDEO_SO_ZIP = "own_video_so.zip";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f18445c;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String videoMaterialType = "";

    @Override // com.oplus.aiunit.vision.b5
    @NotNull
    public String k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.watch_face_video_download_tip);
        Intrinsics.checkNotNullExpressionValue(string, "context!!.getString(R.st…_face_video_download_tip)");
        return string;
    }

    @Override // com.oplus.aiunit.vision.b5
    @NotNull
    public List<DownloadTaskBean> l(@NotNull i11 dataManager, @NotNull Map<String, ? extends Object> commonParams) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(commonParams, "commonParams");
        this.videoMaterialType = j1i.a() ? e36.RESOURCE_OWN_VIDEO_SO_V8 : e36.RESOURCE_OWN_VIDEO_SO_V7;
        HashMap map = new HashMap(commonParams);
        map.put("materialType", this.videoMaterialType);
        return CollectionsKt__CollectionsKt.arrayListOf(new DownloadTaskBean(new y26(j1i.SO_DIR, OWN_VIDEO_SO_ZIP, true, map), this.videoMaterialType, true));
    }

    @Override // com.oplus.aiunit.vision.b5
    public boolean o(int position, @NotNull ResourceBean resourceBean, @NotNull List<DownloadTaskBean> downloadTaskBeans, @NotNull i11 dataManager, @NotNull String deviceUniqueId) {
        Object next;
        Intrinsics.checkNotNullParameter(resourceBean, "resourceBean");
        Intrinsics.checkNotNullParameter(downloadTaskBeans, "downloadTaskBeans");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        boolean zO = super.o(position, resourceBean, downloadTaskBeans, dataManager, deviceUniqueId);
        if (zO) {
            return zO;
        }
        Iterator<T> it = downloadTaskBeans.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((DownloadTaskBean) next).getMaterialType(), this.videoMaterialType));
        DownloadTaskBean downloadTaskBean = (DownloadTaskBean) next;
        if (downloadTaskBean == null) {
            return zO;
        }
        boolean zExists = new File(downloadTaskBean.getDownloadResource().a(), "libvideosdk.so").exists();
        ltl.d(getTag(), "isShouldUpdate check videosdk.so exists:" + zExists);
        return !zExists;
    }

    @Override // com.oplus.aiunit.vision.b5
    public boolean p(@NotNull Context context, @NotNull List<? extends ResourceBean> resourceBeanList, @NotNull List<DownloadTaskBean> downloadTaskBeans) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourceBeanList, "resourceBeanList");
        Intrinsics.checkNotNullParameter(downloadTaskBeans, "downloadTaskBeans");
        if (f18445c) {
            Iterator<T> it = downloadTaskBeans.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((DownloadTaskBean) next).getMaterialType(), this.videoMaterialType));
            if (d(context, resourceBeanList, (DownloadTaskBean) next)) {
                return false;
            }
        }
        ltl.d(getTag(), "onSuccess, start to load library");
        jzk jzkVar = jzk.INSTANCE;
        String SO_DIR = j1i.SO_DIR;
        Intrinsics.checkNotNullExpressionValue(SO_DIR, "SO_DIR");
        jzkVar.d(context, SO_DIR);
        f18445c = true;
        return true;
    }
}
