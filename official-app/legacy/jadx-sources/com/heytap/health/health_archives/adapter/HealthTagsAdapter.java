package com.heytap.health.health_archives.adapter;

import android.content.Context;
import android.widget.TextView;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.bean.HealthTags;
import com.heytap.health.health_archives.bean.UserInfoBean;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.x05;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/health_archives/adapter/HealthTagsAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/heytap/health/health_archives/bean/HealthTags;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "", "source", LogFieldKey.LEVEL_KEY, "Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "n", "Ljava/util/ArrayList;", "data", "", "o", "Z", "displayTime", LogFieldKey.PROCESS_NAME_KEY, "Ljava/lang/String;", "dateType", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;ZLjava/lang/String;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class HealthTagsAdapter extends BaseRecyclerAdapter<HealthTags> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ArrayList<HealthTags> data;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final boolean displayTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public final String dateType;

    public /* synthetic */ HealthTagsAdapter(Context context, ArrayList arrayList, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, arrayList, z, (i & 8) != 0 ? null : str);
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Collection collection = this.i;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        HealthTags healthTags = (HealthTags) this.i.get(position);
        TextView textView = (TextView) holder.getView(R$id.tv_health_tags_title);
        TextView textView2 = (TextView) holder.getView(R$id.tv_health_tags_onset_time);
        TextView textView3 = (TextView) holder.getView(R$id.tv_health_tags_source);
        String time = healthTags != null ? healthTags.getTime() : null;
        if ((time == null || time.length() == 0) || !this.displayTime) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (Intrinsics.areEqual(this.dateType, UserInfoBean.PAST_MEDICAL_HISTORY)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = this.context.getString(R$string.health_archives_tag_onset_time);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_archives_tag_onset_time)");
                Object[] objArr = new Object[1];
                String time2 = healthTags != null ? healthTags.getTime() : null;
                Intrinsics.checkNotNull(time2);
                objArr[0] = x05.a(Long.parseLong(time2), "yyyy-MM-dd");
                String str = String.format(string, Arrays.copyOf(objArr, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView2.setText(str);
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = this.context.getString(R$string.health_archives_tag_medication_time);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ives_tag_medication_time)");
                Object[] objArr2 = new Object[1];
                String time3 = healthTags != null ? healthTags.getTime() : null;
                Intrinsics.checkNotNull(time3);
                objArr2[0] = x05.a(Long.parseLong(time3), "yyyy-MM-dd");
                String str2 = String.format(string2, Arrays.copyOf(objArr2, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textView2.setText(str2);
            }
        }
        textView.setText(healthTags != null ? healthTags.getName() : null);
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String string3 = this.context.getString(R$string.health_archives_tag_from);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…health_archives_tag_from)");
        Object[] objArr3 = new Object[1];
        objArr3[0] = l(healthTags != null ? healthTags.getSource() : null);
        String str3 = String.format(string3, Arrays.copyOf(objArr3, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        textView3.setText(str3);
    }

    public final String l(String source) {
        if (Intrinsics.areEqual(source, qtf.l(R$string.health_archives_cloud_source_user))) {
            return qtf.l(R$string.health_archives_manual_editing);
        }
        if (Intrinsics.areEqual(source, qtf.l(R$string.health_archives_cloud_source_document))) {
            return qtf.l(R$string.health_home_archives_title);
        }
        return Intrinsics.areEqual(source, qtf.l(R$string.health_archives_cloud_source_assist)) ? qtf.l(R$string.health_archives_source_assist) : qtf.l(R$string.health_archives_other_category);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthTagsAdapter(@NotNull Context context, @Nullable ArrayList<HealthTags> arrayList, boolean z, @Nullable String str) {
        super(arrayList, R$layout.health_archives_user_info_item);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.data = arrayList;
        this.displayTime = z;
        this.dateType = str;
    }
}
