package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watchface.business.creation.db.LivePhotoRecord;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007H&J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/z0b;", "Lcom/oplus/aiunit/vision/qa1;", "Lcom/oplus/aiunit/vision/a1b;", "", "Lcom/heytap/health/watchface/business/creation/db/LivePhotoRecord;", "R", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "S", "delList", "", ExifInterface.GPS_DIRECTION_TRUE, "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class z0b extends qa1<a1b> {
    @NotNull
    public abstract List<LivePhotoRecord> R();

    @NotNull
    public abstract ArrayList<LivePhotoRecord> S();

    public abstract void T(@NotNull List<? extends LivePhotoRecord> delList);
}
