package com.heytap.sports.record.details.cards;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.SportMetaData;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$array;
import com.heytap.sports.R$id;
import com.heytap.sports.R$layout;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/record/details/cards/q;", "Lcom/heytap/sports/record/details/cards/SportRecordCard;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, ExifInterface.LONGITUDE_EAST, "D", "Lcom/heytap/databaseengine/model/SportMetaData;", "t", "Lcom/heytap/databaseengine/model/SportMetaData;", "metaData", "Landroid/widget/ImageView;", "u", "Landroid/widget/ImageView;", "mIvGrade", "<init>", "(Lcom/heytap/databaseengine/model/SportMetaData;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMarathonGradeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarathonGradeCard.kt\ncom/heytap/sports/record/details/cards/MarathonGradeCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class q extends SportRecordCard {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final SportMetaData metaData;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public ImageView mIvGrade;

    public q(@NotNull SportMetaData metaData) {
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        this.metaData = metaData;
    }

    public final void D() {
        Resources resources;
        int recordGrade = this.metaData.getRecordGrade();
        Context mContext = getMContext();
        TypedArray typedArrayObtainTypedArray = (mContext == null || (resources = mContext.getResources()) == null) ? null : resources.obtainTypedArray(R$array.sports_record_marathon_grade);
        ImageView imageView = this.mIvGrade;
        if (imageView != null) {
            imageView.setImageDrawable(typedArrayObtainTypedArray != null ? typedArrayObtainTypedArray.getDrawable(recordGrade) : null);
        }
        if (typedArrayObtainTypedArray != null) {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public final void E(View cardView) {
        this.mIvGrade = (ImageView) cardView.findViewById(R$id.iv_marathon_card_grade);
    }

    @Override // com.heytap.sports.record.details.cards.SportRecordCard, com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.sports_activity_record_details_marathon_grade_card;
    }

    @Override // com.heytap.sports.record.details.cards.SportRecordCard, com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @Nullable View cardView) {
        super.l(context, cardView);
        if (cardView != null) {
            E(cardView);
        }
        D();
    }
}
