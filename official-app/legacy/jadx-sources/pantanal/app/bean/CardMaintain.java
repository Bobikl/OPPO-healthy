package pantanal.app.bean;

import androidx.annotation.Keep;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lpantanal/app/bean/CardMaintain;", "", Const.Arguments.Open.STYLE, "", iim.a.f, "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getStyle", "setStyle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardMaintain {

    @NotNull
    private String description;

    @NotNull
    private String style;

    /* JADX WARN: Multi-variable type inference failed */
    public CardMaintain() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CardMaintain copy$default(CardMaintain cardMaintain, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardMaintain.style;
        }
        if ((i & 2) != 0) {
            str2 = cardMaintain.description;
        }
        return cardMaintain.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final CardMaintain copy(@NotNull String style, @NotNull String description) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(description, "description");
        return new CardMaintain(style, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardMaintain)) {
            return false;
        }
        CardMaintain cardMaintain = (CardMaintain) other;
        return Intrinsics.areEqual(this.style, cardMaintain.style) && Intrinsics.areEqual(this.description, cardMaintain.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        return (this.style.hashCode() * 31) + this.description.hashCode();
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setStyle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.style = str;
    }

    @NotNull
    public String toString() {
        return "CardMaintain(style=" + this.style + ", description=" + this.description + ")";
    }

    public CardMaintain(@NotNull String style, @NotNull String description) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(description, "description");
        this.style = style;
        this.description = description;
    }

    public /* synthetic */ CardMaintain(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
