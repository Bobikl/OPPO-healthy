package com.heytap.health.settings.me.thirdpartbinding.wechat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleCompat;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.settings.R$string;
import com.heytap.health.settings.me.thirdpartbinding.model.DeviceHardware;
import com.heytap.sporthealth.blib.basic.BasicRecvLoadMoreViewModel;
import com.heytap.sporthealth.blib.basic.ui.BasicRecvActivity;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.owe;
import com.oplus.aiunit.vision.qv9;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.t04;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u0000 )2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0014J\b\u0010\r\u001a\u00020\tH\u0014J\u0018\u0010\u0010\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u0014J\u001c\u0010\u0014\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\tH\u0003J\b\u0010\u001c\u001a\u00020\tH\u0002R$\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lcom/heytap/health/settings/me/thirdpartbinding/wechat/UnbindMMDevices;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicRecvActivity;", "Lcom/heytap/sporthealth/blib/basic/BasicRecvLoadMoreViewModel;", "Lcom/heytap/health/settings/me/thirdpartbinding/model/DeviceHardware;", "Lcom/oplus/aiunit/vision/qv9;", "", "j8", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "onResume", "", "result", "b8", "Landroid/view/View;", "view", "item", "i8", "doNext", "", "R7", "", "value", "e8", "f8", "g8", "u", "Lcom/heytap/health/settings/me/thirdpartbinding/model/DeviceHardware;", "h8", "()Lcom/heytap/health/settings/me/thirdpartbinding/model/DeviceHardware;", "setCitem", "(Lcom/heytap/health/settings/me/thirdpartbinding/model/DeviceHardware;)V", "citem", "v", "Z", "pendingBindCheck", "<init>", "()V", "Companion", "a", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUnbindMMDevices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnbindMMDevices.kt\ncom/heytap/health/settings/me/thirdpartbinding/wechat/UnbindMMDevices\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n155#2:195\n1#3:196\n*S KotlinDebug\n*F\n+ 1 UnbindMMDevices.kt\ncom/heytap/health/settings/me/thirdpartbinding/wechat/UnbindMMDevices\n*L\n66#1:195\n*E\n"})
public final class UnbindMMDevices extends BasicRecvActivity<BasicRecvLoadMoreViewModel<DeviceHardware>, DeviceHardware> implements qv9 {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public DeviceHardware citem;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean pendingBindCheck;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000620\u0010\u0005\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "", "Lcom/heytap/health/settings/me/thirdpartbinding/model/DeviceHardware;", "kotlin.jvm.PlatformType", "", "it", "", "a", "(Lcom/heytap/health/network/core/BaseResponse;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements o14 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull BaseResponse<List<DeviceHardware>> it) {
            Object obj;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isSuccess()) {
                List<DeviceHardware> body = it.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "it.body");
                UnbindMMDevices unbindMMDevices = UnbindMMDevices.this;
                Iterator<T> it2 = body.iterator();
                while (true) {
                    obj = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    String str = ((DeviceHardware) next).model;
                    DeviceHardware citem = unbindMMDevices.getCitem();
                    if (Intrinsics.areEqual(str, citem != null ? citem.model : null)) {
                        obj = next;
                        break;
                    }
                }
                DeviceHardware deviceHardware = (DeviceHardware) obj;
                boolean z = deviceHardware != null ? deviceHardware.isBind : false;
                a.g(" checkBindResult >> " + UnbindMMDevices.this.getCitem() + " " + it.getBody() + " " + z);
                if (z) {
                    UnbindMMDevices.this.g8();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements o14 {
        public static final c<T> INSTANCE = new c<>();

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            a.g(" checkBindResult >> error: " + error.getMessage());
        }
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicActivity
    public /* bridge */ /* synthetic */ Class I7() {
        return (Class) j8();
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicActivity
    @NotNull
    public CharSequence R7() {
        String strE = rg7.e(R$string.settings_mm_tobind_devices);
        Intrinsics.checkNotNullExpressionValue(strE, "findString(R.string.settings_mm_tobind_devices)");
        return strE;
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicRecvActivity, com.heytap.sporthealth.blib.basic.ui.BasicActivity
    /* JADX INFO: renamed from: b8 */
    public void Q7(@Nullable List<DeviceHardware> result) {
        Serializable serializableExtra = getIntent().getSerializableExtra(a.key_unbind);
        if (!(serializableExtra instanceof List)) {
            serializableExtra = null;
        }
        List list = (List) serializableExtra;
        if (list != null) {
            super.Q7(list);
        }
    }

    @Override // com.oplus.aiunit.vision.qv9
    public void doNext() {
        DeviceHardware deviceHardware = this.citem;
        if (deviceHardware != null) {
            this.pendingBindCheck = true;
            MMHardware.d(deviceHardware, this).observe(this, new a.d(new UnbindMMDevices$doNext$1$1(this)));
        }
    }

    public final void e8(boolean value) {
        a.g(" bindResult >> 查询是否绑定成功 " + value);
        if (value) {
            this.pendingBindCheck = false;
            f8();
        }
    }

    @SuppressLint({"AutoDispose", "CheckResult"})
    public final void f8() {
        MMHardware.f().b(new b(), c.INSTANCE);
    }

    public final void g8() {
        DeviceHardware deviceHardware = this.citem;
        if (deviceHardware != null) {
            if (deviceHardware.bindEver) {
                setResult(-1);
                finish();
                return;
            }
            Intent intent = new Intent();
            DeviceHardware deviceHardware2 = this.citem;
            intent.putExtra(t04.DEVICE_UNIQUE_ID, deviceHardware2 != null ? deviceHardware2.deviceUniqueId : null);
            Unit unit = Unit.INSTANCE;
            setResult(-1, intent);
            finish();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h8, reason: from getter */
    public final DeviceHardware getCitem() {
        return this.citem;
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicRecvActivity, com.heytap.sporthealth.blib.basic.ui.BasicActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicRecvActivity, com.heytap.sporthealth.blib.adapter.face.OnViewClickListener
    /* JADX INFO: renamed from: i8, reason: merged with bridge method [inline-methods] */
    public void onItemClicked(@Nullable View view, @Nullable DeviceHardware item) {
        this.citem = item;
        a.g(" onItemClicked >> " + item);
        ((qv9) owe.k(qv9.class, this)).doNext();
    }

    @Nullable
    public Void j8() {
        return null;
    }

    @Override // com.heytap.sporthealth.blib.basic.ui.BasicActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.citem = (DeviceHardware) BundleCompat.getSerializable(savedInstanceState, "key_citem", DeviceHardware.class);
            boolean z = savedInstanceState.getBoolean("key_pending_bind", false);
            this.pendingBindCheck = z;
            a.g(" onCreate >> restored citem=" + this.citem + ", pendingBindCheck=" + z);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        DeviceHardware deviceHardware;
        super.onResume();
        if (!this.pendingBindCheck || (deviceHardware = this.citem) == null) {
            return;
        }
        this.pendingBindCheck = false;
        a.g(" onResume >> pendingBindCheck, querying bind status for " + deviceHardware);
        f8();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable("key_citem", this.citem);
        outState.putBoolean("key_pending_bind", this.pendingBindCheck);
    }
}
