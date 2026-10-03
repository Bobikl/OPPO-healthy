package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.health.wallet.model.db.DatabaseCard;
import io.protostuff.MapSchema;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Dao
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H'J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H'J\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H'J \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H'J(\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H'J \u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H'J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H'¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/lz2;", "", "", j7l.KEY_CPLC, "", "Lcom/heytap/health/wallet/model/db/DatabaseCard;", "a", "aid", "b", "detail", "", "f", b2n.g, "", "includes", "i", "balance", "", MapSchema.FIELD_NAME_ENTRY, "cardNo", "j", "cardStatus", "order", "d", "", "isActive", b2n.f, "c", "commonlib_release"}, k = 1, mv = {1, 8, 0})
public interface lz2 {
    @Query("SELECT * FROM card WHERE id = :cplc")
    @NotNull
    List<DatabaseCard> a(@NotNull String cplc);

    @Query("SELECT * FROM card WHERE id = :cplc AND aid = :aid")
    @Nullable
    DatabaseCard b(@NotNull String cplc, @NotNull String aid);

    @Query("UPDATE card SET status = :cardStatus WHERE id = :cplc AND aid = :aid")
    int c(@NotNull String cplc, @NotNull String aid, @NotNull String cardStatus);

    @Query("UPDATE card SET status = :cardStatus, orderNo = :order WHERE id = :cplc AND aid = :aid")
    void d(@NotNull String cplc, @NotNull String aid, @NotNull String cardStatus, @NotNull String order);

    @Query("UPDATE card SET balance = :balance WHERE id = :cplc AND aid = :aid")
    int e(@NotNull String cplc, @NotNull String aid, @NotNull String balance);

    @Insert(onConflict = 1)
    void f(@NotNull DatabaseCard detail);

    @Query("UPDATE card SET isDefault = :isActive WHERE id = :cplc AND aid = :aid")
    void g(@NotNull String cplc, @NotNull String aid, boolean isActive);

    @Query("DELETE FROM card WHERE id = :cplc AND aid = :aid")
    void h(@NotNull String cplc, @NotNull String aid);

    @Query("DELETE FROM card WHERE id = :cplc AND cardType IN (:includes)")
    void i(@NotNull String cplc, @NotNull Collection<String> includes);

    @Query("UPDATE card SET cardNo = :cardNo WHERE id = :cplc AND aid = :aid")
    int j(@NotNull String cplc, @NotNull String aid, @NotNull String cardNo);
}
