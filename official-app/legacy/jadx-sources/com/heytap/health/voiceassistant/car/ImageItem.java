package com.heytap.health.voiceassistant.car;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.heytap.health.voiceassistant.R$id;
import com.heytap.health.voiceassistant.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.x9f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J6\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00032\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010&2\f\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010(H\u0016J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006*"}, d2 = {"Lcom/heytap/health/voiceassistant/car/ImageItem;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "index", "", "place", "day", "", x9f.NIGHT, "title", "content", "(IILjava/lang/String;Ljava/lang/String;II)V", "getContent", "()I", "getDay", "()Ljava/lang/String;", "getIndex", "getNight", "getPlace", "getTitle", "bindLayout", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "onBindViewHolder", "", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", "position", "payloads", "", "viewClickListener", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "toString", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ImageItem extends JViewBean {
    private final int content;

    @NotNull
    private final String day;
    private final int index;

    @NotNull
    private final String night;
    private final int place;
    private final int title;

    public ImageItem(int i, int i2, @NotNull String day, @NotNull String night, int i3, int i4) {
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(night, "night");
        this.index = i;
        this.place = i2;
        this.day = day;
        this.night = night;
        this.title = i3;
        this.content = i4;
    }

    public static /* synthetic */ ImageItem copy$default(ImageItem imageItem, int i, int i2, String str, String str2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = imageItem.index;
        }
        if ((i5 & 2) != 0) {
            i2 = imageItem.place;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            str = imageItem.day;
        }
        String str3 = str;
        if ((i5 & 8) != 0) {
            str2 = imageItem.night;
        }
        String str4 = str2;
        if ((i5 & 16) != 0) {
            i3 = imageItem.title;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = imageItem.content;
        }
        return imageItem.copy(i, i6, str3, str4, i7, i4);
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.va_car_link_tips_vp_item;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPlace() {
        return this.place;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNight() {
        return this.night;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getContent() {
        return this.content;
    }

    @NotNull
    public final ImageItem copy(int index, int place, @NotNull String day, @NotNull String night, int title, int content) {
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(night, "night");
        return new ImageItem(index, place, day, night, title, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageItem)) {
            return false;
        }
        ImageItem imageItem = (ImageItem) other;
        return this.index == imageItem.index && this.place == imageItem.place && Intrinsics.areEqual(this.day, imageItem.day) && Intrinsics.areEqual(this.night, imageItem.night) && this.title == imageItem.title && this.content == imageItem.content;
    }

    public final int getContent() {
        return this.content;
    }

    @NotNull
    public final String getDay() {
        return this.day;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getNight() {
        return this.night;
    }

    public final int getPlace() {
        return this.place;
    }

    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.index) * 31) + Integer.hashCode(this.place)) * 31) + this.day.hashCode()) * 31) + this.night.hashCode()) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.content);
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable OnViewClickListener<?> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ImageItem imageItem = CarLinkMainActivityKt.a().get(this.index);
        String str = qe0.y(holder.getActivity()) ? imageItem.night : imageItem.day;
        Context activity = holder.getActivity();
        if (activity == null) {
            activity = b78.a();
        }
        com.bumptech.glide.a.v(activity).d().Y0(str).q(imageItem.place).h0(imageItem.place).s0(true).Q0((ImageView) holder.getView(R$id.iv));
        holder.setText(R$id.name, this.title);
        holder.setText(R$id.desc, this.content);
    }

    @NotNull
    public String toString() {
        return "ImageItem(index=" + this.index + ", place=" + this.place + ", day=" + this.day + ", night=" + this.night + ", title=" + this.title + ", content=" + this.content + ")";
    }
}
