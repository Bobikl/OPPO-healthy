package com.heytap.wearable.watch.emergency.safeguard;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.heytap.wearable.watch.emergency.R$drawable;
import com.heytap.wearable.watch.emergency.R$id;
import com.heytap.wearable.watch.emergency.R$layout;
import com.heytap.wearable.watch.emergency.R$string;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/SafeGuardIntroductionFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "<init>", "()V", "Companion", "a", "b", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SafeGuardIntroductionFragment extends BaseFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Map<Integer, IntroductionBean> o;

    /* JADX INFO: renamed from: com.heytap.wearable.watch.emergency.safeguard.SafeGuardIntroductionFragment$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/SafeGuardIntroductionFragment$a;", "", "", "position", "Lcom/heytap/wearable/watch/emergency/safeguard/SafeGuardIntroductionFragment;", "a", "", "Lcom/heytap/wearable/watch/emergency/safeguard/SafeGuardIntroductionFragment$b;", "infoMap", "Ljava/util/Map;", "<init>", "()V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SafeGuardIntroductionFragment a(int position) {
            SafeGuardIntroductionFragment safeGuardIntroductionFragment = new SafeGuardIntroductionFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("tag_position", position);
            safeGuardIntroductionFragment.setArguments(bundle);
            return safeGuardIntroductionFragment;
        }
    }

    /* JADX INFO: renamed from: com.heytap.wearable.watch.emergency.safeguard.SafeGuardIntroductionFragment$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/SafeGuardIntroductionFragment$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "title", "b", "message", ResourcesUtil.ResourceType.DRAWABLE, "<init>", "(III)V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class IntroductionBean {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int drawable;

        public IntroductionBean(int i, int i2, int i3) {
            this.title = i;
            this.message = i2;
            this.drawable = i3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDrawable() {
            return this.drawable;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntroductionBean)) {
                return false;
            }
            IntroductionBean introductionBean = (IntroductionBean) other;
            return this.title == introductionBean.title && this.message == introductionBean.message && this.drawable == introductionBean.drawable;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.drawable);
        }

        @NotNull
        public String toString() {
            return "IntroductionBean(title=" + this.title + ", message=" + this.message + ", drawable=" + this.drawable + ")";
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, new IntroductionBean(R$string.watch_emergency_safe_guard_introduction_title_1, R$string.watch_emergency_safe_guard_introduction_message_1, R$drawable.watch_emergency_safe_guard_d1));
        linkedHashMap.put(1, new IntroductionBean(R$string.watch_emergency_safe_guard_introduction_title_2, R$string.watch_emergency_safe_guard_introduction_message_2, R$drawable.watch_emergency_safe_guard_d2));
        linkedHashMap.put(2, new IntroductionBean(R$string.watch_emergency_safe_guard_introduction_title_3, R$string.watch_emergency_safe_guard_introduction_message_3, R$drawable.watch_emergency_safe_guard_d3));
        linkedHashMap.put(3, new IntroductionBean(R$string.watch_emergency_safe_guard_introduction_title_4, R$string.watch_emergency_safe_guard_introduction_message_4, R$drawable.watch_emergency_safe_guard_d4));
        linkedHashMap.put(4, new IntroductionBean(R$string.watch_emergency_safe_guard_introduction_title_5, R$string.watch_emergency_safe_guard_introduction_message_5, R$drawable.watch_emergency_safe_guard_d5));
        o = linkedHashMap;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.settings_fragment_safe_gard_introduction;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        View viewW = W(R$id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewW, "findViewById(R.id.tv_title)");
        TextView textView = (TextView) viewW;
        View viewW2 = W(R$id.tv_message);
        Intrinsics.checkNotNullExpressionValue(viewW2, "findViewById(R.id.tv_message)");
        TextView textView2 = (TextView) viewW2;
        View viewW3 = W(R$id.img_drawable);
        Intrinsics.checkNotNullExpressionValue(viewW3, "findViewById(R.id.img_drawable)");
        ImageView imageView = (ImageView) viewW3;
        Bundle arguments = getArguments();
        IntroductionBean introductionBean = o.get(arguments != null ? Integer.valueOf(arguments.getInt("tag_position", 0)) : null);
        if (introductionBean != null) {
            textView.setText(getString(introductionBean.getTitle()));
            textView2.setText(getString(introductionBean.getMessage()));
            imageView.setImageResource(introductionBean.getDrawable());
        }
    }
}
