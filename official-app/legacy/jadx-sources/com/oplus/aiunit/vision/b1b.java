package com.oplus.aiunit.vision;

import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watchface.business.creation.category.livephoto.LivePhotoEditActivity;
import com.heytap.health.watchface.business.creation.db.LivePhotoRecord;
import io.protostuff.MapSchema;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014R$\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/b1b;", "Lcom/oplus/aiunit/vision/z0b;", "", "Lcom/heytap/health/watchface/business/creation/db/LivePhotoRecord;", "R", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "S", "delList", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/Intent;", "intent", MapSchema.FIELD_NAME_KEY, "Landroid/os/Bundle;", "savedInstanceState", "D", "u", "Ljava/util/ArrayList;", "mDataList", "v", "mDelList", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class b1b extends z0b {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<LivePhotoRecord> mDataList = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<LivePhotoRecord> mDelList = new ArrayList<>();

    @Override // com.oplus.aiunit.vision.qa1
    public void D(@Nullable Bundle savedInstanceState) {
    }

    @Override // com.oplus.aiunit.vision.z0b
    @NotNull
    public List<LivePhotoRecord> R() {
        return this.mDataList;
    }

    @Override // com.oplus.aiunit.vision.z0b
    @NotNull
    public ArrayList<LivePhotoRecord> S() {
        return this.mDelList;
    }

    @Override // com.oplus.aiunit.vision.z0b
    public void T(@NotNull List<? extends LivePhotoRecord> delList) {
        a1b a1bVar;
        Intrinsics.checkNotNullParameter(delList, "delList");
        List<? extends LivePhotoRecord> list = delList;
        this.mDataList.removeAll(list);
        this.mDelList.addAll(list);
        Reference reference = this.i;
        if (reference == null || (a1bVar = (a1b) reference.get()) == null) {
            return;
        }
        a1bVar.R3(this.mDataList);
    }

    @Override // com.oplus.aiunit.vision.qa1, com.oplus.aiunit.vision.q11, com.oplus.aiunit.vision.ja1
    public void k(@Nullable Intent intent) {
        super.k(intent);
        ArrayList<LivePhotoRecord> arrayList = this.mDataList;
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra(LivePhotoEditActivity.TAG_EDIT_LIST) : null;
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.heytap.health.watchface.business.creation.db.LivePhotoRecord>");
        arrayList.addAll((ArrayList) serializableExtra);
    }
}
