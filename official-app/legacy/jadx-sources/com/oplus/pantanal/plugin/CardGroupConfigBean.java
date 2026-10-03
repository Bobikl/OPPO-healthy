package com.oplus.pantanal.plugin;

import androidx.annotation.Keep;
import com.oplus.pantanal.plugin.bean.ConfigBean;
import com.oplus.pantanal.plugin.bean.HashEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/oplus/pantanal/plugin/CardGroupConfigBean;", "Lcom/oplus/pantanal/plugin/bean/ConfigBean;", "hashCardGroup", "Lcom/oplus/pantanal/plugin/bean/HashEntity;", "(Lcom/oplus/pantanal/plugin/bean/HashEntity;)V", "getHashCardGroup", "()Lcom/oplus/pantanal/plugin/bean/HashEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardGroupConfigBean extends ConfigBean {

    @Nullable
    private final HashEntity hashCardGroup;

    public CardGroupConfigBean(@Nullable HashEntity hashEntity) {
        this.hashCardGroup = hashEntity;
    }

    public static /* synthetic */ CardGroupConfigBean copy$default(CardGroupConfigBean cardGroupConfigBean, HashEntity hashEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            hashEntity = cardGroupConfigBean.hashCardGroup;
        }
        return cardGroupConfigBean.copy(hashEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HashEntity getHashCardGroup() {
        return this.hashCardGroup;
    }

    @NotNull
    public final CardGroupConfigBean copy(@Nullable HashEntity hashCardGroup) {
        return new CardGroupConfigBean(hashCardGroup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardGroupConfigBean) && Intrinsics.areEqual(this.hashCardGroup, ((CardGroupConfigBean) other).hashCardGroup);
    }

    @Nullable
    public final HashEntity getHashCardGroup() {
        return this.hashCardGroup;
    }

    public int hashCode() {
        HashEntity hashEntity = this.hashCardGroup;
        if (hashEntity == null) {
            return 0;
        }
        return hashEntity.hashCode();
    }

    @NotNull
    public String toString() {
        return "CardGroupConfigBean(hashCardGroup=" + this.hashCardGroup + ")";
    }
}
