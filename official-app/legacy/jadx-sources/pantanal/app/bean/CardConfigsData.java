package pantanal.app.bean;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u001bJ\u001c\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001e\u001a\u00020\u0006J\b\u0010\u001f\u001a\u00020\u001bH\u0016R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lpantanal/app/bean/CardConfigsData;", "", "cardConfigList", "", "Lpantanal/app/bean/CardConfigInfo;", "cardConfigStatus", "", "(Ljava/util/List;I)V", "getCardConfigList", "()Ljava/util/List;", "setCardConfigList", "(Ljava/util/List;)V", "getCardConfigStatus", "()I", "setCardConfigStatus", "(I)V", "originBundle", "Landroid/os/Bundle;", "getOriginBundle", "()Landroid/os/Bundle;", "setOriginBundle", "(Landroid/os/Bundle;)V", "getCardConfigByCardType", "cardType", "getCardConfigSize", "getCardConfigsByServiceId", "serviceId", "", "resetData", "", "newStatus", "toString", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardConfigsData {

    @NotNull
    private volatile List<CardConfigInfo> cardConfigList;
    private volatile int cardConfigStatus;

    @Nullable
    private Bundle originBundle;

    public CardConfigsData(@NotNull List<CardConfigInfo> cardConfigList, int i) {
        Intrinsics.checkNotNullParameter(cardConfigList, "cardConfigList");
        this.cardConfigList = cardConfigList;
        this.cardConfigStatus = i;
    }

    @Nullable
    public final CardConfigInfo getCardConfigByCardType(int cardType) {
        Object next;
        Iterator<T> it = this.cardConfigList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((CardConfigInfo) next).getType() == cardType) {
                return (CardConfigInfo) next;
            }
        }
        next = null;
        return (CardConfigInfo) next;
    }

    @NotNull
    public final List<CardConfigInfo> getCardConfigList() {
        return this.cardConfigList;
    }

    public final int getCardConfigSize() {
        return this.cardConfigList.size();
    }

    public final int getCardConfigStatus() {
        return this.cardConfigStatus;
    }

    @NotNull
    public final List<CardConfigInfo> getCardConfigsByServiceId(@NotNull String serviceId) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        ArrayList arrayList = new ArrayList();
        for (CardConfigInfo cardConfigInfo : this.cardConfigList) {
            if (Intrinsics.areEqual(cardConfigInfo.getServiceId(), serviceId)) {
                arrayList.add(cardConfigInfo);
            }
        }
        return arrayList;
    }

    @Nullable
    public final Bundle getOriginBundle() {
        return this.originBundle;
    }

    public final void resetData(@NotNull List<CardConfigInfo> cardConfigList, int newStatus) {
        Intrinsics.checkNotNullParameter(cardConfigList, "cardConfigList");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(cardConfigList);
        this.cardConfigList = arrayList;
        this.cardConfigStatus = newStatus;
    }

    public final void setCardConfigList(@NotNull List<CardConfigInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cardConfigList = list;
    }

    public final void setCardConfigStatus(int i) {
        this.cardConfigStatus = i;
    }

    public final void setOriginBundle(@Nullable Bundle bundle) {
        this.originBundle = bundle;
    }

    @NotNull
    public String toString() {
        return StringsKt__IndentKt.trimIndent("CardConfigsData:\n            cardConfigList size  = " + this.cardConfigList.size() + "\n            cardConfigStatus = " + this.cardConfigStatus + "\n        ");
    }
}
