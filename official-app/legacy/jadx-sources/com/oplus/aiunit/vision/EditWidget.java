package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.vvl, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/vvl;", "Lcom/oplus/aiunit/vision/j91;", "", "toString", "", "Lcom/oplus/aiunit/vision/svl;", "d", "Ljava/util/List;", "()Ljava/util/List;", "setWidget", "(Ljava/util/List;)V", "widget", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class EditWidget extends j91 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("group")
    @NotNull
    private List<Widget> widget;

    @NotNull
    public final List<Widget> d() {
        return this.widget;
    }

    @NotNull
    public String toString() {
        return "EditWidget(category=" + getCategory() + ",x=" + getX() + ",y=" + getY() + ",widget=" + this.widget + ")";
    }
}
