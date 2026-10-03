package OO0;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.accessory.connectivity.constant.ConnectConstant;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b.c {
    public b a = new b(d(), this);
    public final Binder b = new Binder();

    public static Intent d() {
        Intent intent = new Intent();
        intent.setAction("oplus.intent.action.carlink.BREENO_CONTROL_SERVICE");
        intent.setPackage("com.heytap.opluscarlink");
        return intent;
    }

    @Override // OO0.b.c
    public final void a() {
    }

    @Override // OO0.b.c
    public final void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("code", 2000004);
        bundle.putString("name", "2.0.4");
        this.a.a("breeno_control", "version", bundle);
    }

    @Nullable
    public final String c(@NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_control", str);
        bundle.putBinder("extra_binder", this.b);
        Bundle bundleA = this.a.a("breeno_control", ConnectConstant.CHANNEL_NAME_CONTROL, bundle);
        if (bundleA != null) {
            return bundleA.getString("result_control");
        }
        return null;
    }
}
