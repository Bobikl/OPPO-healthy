package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.watchface.R$string;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@ose({"/watch_face/main/FlexibleHomeActivity", "/watch_face/main/LivePhotoHomeActivity", "/watch_face/main/DOFHomeActivity", "/watch_face/main/DOFTemplateActivity"})
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0014¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/ts7;", "Lcom/oplus/aiunit/vision/wyk;", "Lcom/oplus/aiunit/vision/i11;", "dataManager", "", "", "", "commonParams", "", "Lcom/oplus/aiunit/vision/u36;", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", MapSchema.FIELD_NAME_KEY, "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class ts7 extends wyk {

    @NotNull
    public static final String MATERIAL_TYPE = "creation_v2_style_template";

    @NotNull
    public static final String ZIP_FILE = "temp.zip";

    @Override // com.oplus.aiunit.vision.wyk, com.oplus.aiunit.vision.b5
    @NotNull
    public String k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.watch_face_main_loading_resource);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.he…ce_main_loading_resource)");
        return string;
    }

    @Override // com.oplus.aiunit.vision.wyk, com.oplus.aiunit.vision.b5
    @NotNull
    public List<DownloadTaskBean> l(@NotNull i11 dataManager, @NotNull Map<String, ? extends Object> commonParams) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(commonParams, "commonParams");
        HashMap map = new HashMap(commonParams);
        map.put("materialType", MATERIAL_TYPE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DownloadTaskBean(new y26(ZIP_FILE, true, (Map<String, Object>) map), MATERIAL_TYPE, false));
        arrayList.addAll(super.l(dataManager, commonParams));
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.b5
    @NotNull
    public String m() {
        return kvi.FLEXIBLE_RES_ROOT_DIR_NAME;
    }
}
