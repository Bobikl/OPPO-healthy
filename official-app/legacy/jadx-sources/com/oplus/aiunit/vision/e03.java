package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0017\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b(\u0010)R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u001d\u0010\bR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010\"\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b!\u0010\u001aR$\u0010'\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001c\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/e03;", "", "", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "setIcon", "(Ljava/lang/Integer;)V", "icon", "b", "I", b2n.f, "()I", "setTitle", "(I)V", "title", "f", "setSubTitle", Feedback.WIDGET_SUBTITLE, "", "d", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "enable", MapSchema.FIELD_NAME_ENTRY, "setColor", "color", b2n.g, "assignment", "i", CardAction.LIFE_CIRCLE_VALUE_SHOW, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "j", "(Ljava/lang/Boolean;)V", "showRedDot", "<init>", "(Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Boolean;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public class e03 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Integer icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean enable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer color;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Integer assignment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean show;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Boolean showRedDot;

    public e03(@Nullable Integer num, int i, @Nullable Integer num2, boolean z, @Nullable Integer num3, @Nullable Integer num4, boolean z2, @Nullable Boolean bool) {
        this.icon = num;
        this.title = i;
        this.subTitle = num2;
        this.enable = z;
        this.color = num3;
        this.assignment = num4;
        this.show = z2;
        this.showRedDot = bool;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public Integer getAssignment() {
        return this.assignment;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getShowRedDot() {
        return this.showRedDot;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public Integer getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public int getTitle() {
        return this.title;
    }

    public void h(@Nullable Integer num) {
        this.assignment = num;
    }

    public final void i(boolean z) {
        this.show = z;
    }

    public final void j(@Nullable Boolean bool) {
        this.showRedDot = bool;
    }

    public /* synthetic */ e03(Integer num, int i, Integer num2, boolean z, Integer num3, Integer num4, boolean z2, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, i, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? null : num3, (i2 & 32) != 0 ? null : num4, z2, (i2 & 128) != 0 ? Boolean.FALSE : bool);
    }
}
