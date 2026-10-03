package com.heytap.health.wallet.bus.ui.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.coui.appcompat.edittext.COUIEditText;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.bus.R$id;
import com.heytap.health.wallet.bus.R$layout;
import com.heytap.health.wallet.bus.R$string;
import com.oplus.aiunit.vision.e1j;
import com.oplus.aiunit.vision.j1l;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.mfg;
import com.oplus.aiunit.vision.n7a;
import com.oplus.aiunit.vision.q06;
import com.oplus.aiunit.vision.v0j;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.z0k;
import com.oppo.lib.common.R$color;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/bus/carddelete/refund/backup")
public class BusRefundBackupChannelActivity extends BusBaseActivity {
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public COUIEditText F;
    public COUIEditText G;
    public COUIEditText H;
    public HealthButton I;
    public COUICheckBox J;
    public AlertDialog K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextWatcher O = new a();

    @Autowired(name = "channel")
    public String w;

    @Autowired(name = "webUrl")
    public String x;

    @Autowired(name = "booleanKey")
    public boolean y;
    public TextView z;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = BusRefundBackupChannelActivity.this;
            busRefundBackupChannelActivity.V7((!busRefundBackupChannelActivity.J.isChecked() || TextUtils.isEmpty(BusRefundBackupChannelActivity.this.F.getText()) || TextUtils.isEmpty(BusRefundBackupChannelActivity.this.G.getText()) || TextUtils.isEmpty(BusRefundBackupChannelActivity.this.H.getText())) ? false : true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (BusRefundBackupChannelActivity.this.F != null && BusRefundBackupChannelActivity.this.F.hasFocus() && BusRefundBackupChannelActivity.this.L != null && BusRefundBackupChannelActivity.this.L.getVisibility() != 8) {
                BusRefundBackupChannelActivity.this.L.setVisibility(8);
            }
            if (BusRefundBackupChannelActivity.this.G != null && BusRefundBackupChannelActivity.this.G.hasFocus() && BusRefundBackupChannelActivity.this.M != null && BusRefundBackupChannelActivity.this.M.getVisibility() != 8) {
                BusRefundBackupChannelActivity.this.M.setVisibility(8);
            }
            if (BusRefundBackupChannelActivity.this.H == null || !BusRefundBackupChannelActivity.this.H.hasFocus() || BusRefundBackupChannelActivity.this.N == null || BusRefundBackupChannelActivity.this.N.getVisibility() == 8) {
                return;
            }
            BusRefundBackupChannelActivity.this.N.setVisibility(8);
        }
    }

    public class b implements COUICheckBox.c {
        public b() {
        }

        @Override // com.coui.appcompat.checkbox.COUICheckBox.c
        public void a(@NotNull COUICheckBox cOUICheckBox, int i) {
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = BusRefundBackupChannelActivity.this;
            busRefundBackupChannelActivity.V7((!busRefundBackupChannelActivity.J.isChecked() || TextUtils.isEmpty(BusRefundBackupChannelActivity.this.F.getText()) || TextUtils.isEmpty(BusRefundBackupChannelActivity.this.G.getText()) || TextUtils.isEmpty(BusRefundBackupChannelActivity.this.H.getText())) ? false : true);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Intent intent = new Intent();
            intent.putExtra("name", "");
            intent.putExtra("account", "");
            BusRefundBackupChannelActivity.this.setResult(-1, intent);
            BusRefundBackupChannelActivity.this.finish();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public static class e extends ClickableSpan {
        public WeakReference<BusRefundBackupChannelActivity> i;

        public e(WeakReference<BusRefundBackupChannelActivity> weakReference) {
            this.i = weakReference;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            WeakReference<BusRefundBackupChannelActivity> weakReference = this.i;
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = weakReference != null ? weakReference.get() : null;
            if (busRefundBackupChannelActivity != null) {
                busRefundBackupChannelActivity.J.setChecked(!busRefundBackupChannelActivity.J.isChecked());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            WeakReference<BusRefundBackupChannelActivity> weakReference = this.i;
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = weakReference != null ? weakReference.get() : null;
            if (busRefundBackupChannelActivity != null) {
                textPaint.setColor(ContextCompat.getColor(busRefundBackupChannelActivity, R$color.color_8C000000));
                textPaint.setUnderlineText(false);
            }
        }
    }

    public static class f extends ClickableSpan {
        public WeakReference<BusRefundBackupChannelActivity> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public q06 f6144j = new q06();

        public f(WeakReference<BusRefundBackupChannelActivity> weakReference) {
            this.i = weakReference;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f6144j.a()) {
                return;
            }
            WeakReference<BusRefundBackupChannelActivity> weakReference = this.i;
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = weakReference != null ? weakReference.get() : null;
            if (busRefundBackupChannelActivity != null) {
                busRefundBackupChannelActivity.a8();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            WeakReference<BusRefundBackupChannelActivity> weakReference = this.i;
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = weakReference != null ? weakReference.get() : null;
            if (busRefundBackupChannelActivity != null) {
                textPaint.setColor(ContextCompat.getColor(busRefundBackupChannelActivity, com.heytap.health.base.R$color.lib_base_colorPrimary));
                textPaint.setUnderlineText(false);
            }
        }
    }

    public static class g extends ClickableSpan {
        public WeakReference<BusRefundBackupChannelActivity> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public q06 f6145j = new q06();

        public g(WeakReference<BusRefundBackupChannelActivity> weakReference) {
            this.i = weakReference;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f6145j.a()) {
                return;
            }
            WeakReference<BusRefundBackupChannelActivity> weakReference = this.i;
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = weakReference != null ? weakReference.get() : null;
            if (busRefundBackupChannelActivity != null) {
                busRefundBackupChannelActivity.a8();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            WeakReference<BusRefundBackupChannelActivity> weakReference = this.i;
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = weakReference != null ? weakReference.get() : null;
            if (busRefundBackupChannelActivity != null) {
                textPaint.setColor(ContextCompat.getColor(busRefundBackupChannelActivity, R$color.wallet_blue_color));
                textPaint.setUnderlineText(false);
            }
        }
    }

    public static class h extends ClickableSpan {
        public WeakReference<BusRefundBackupChannelActivity> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public q06 f6146j = new q06();

        public h(WeakReference<BusRefundBackupChannelActivity> weakReference) {
            this.i = weakReference;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (this.f6146j.a()) {
                return;
            }
            WeakReference<BusRefundBackupChannelActivity> weakReference = this.i;
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = weakReference != null ? weakReference.get() : null;
            if (busRefundBackupChannelActivity != null) {
                busRefundBackupChannelActivity.b8();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            WeakReference<BusRefundBackupChannelActivity> weakReference = this.i;
            BusRefundBackupChannelActivity busRefundBackupChannelActivity = weakReference != null ? weakReference.get() : null;
            if (busRefundBackupChannelActivity != null) {
                textPaint.setColor(ContextCompat.getColor(busRefundBackupChannelActivity, R$color.wallet_blue_color));
                textPaint.setUnderlineText(false);
            }
        }
    }

    public static boolean O7(String str) {
        return Pattern.compile("([一-龥]+|[a-zA-Z]+)").matcher(str).matches();
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public void A7() {
        if (getIntent() != null) {
            this.w = getIntent().getStringExtra("channel");
            this.x = getIntent().getStringExtra("webUrl");
            this.y = getIntent().getBooleanExtra("booleanKey", false);
        }
        S7();
        P7();
        R7();
        Q7();
    }

    public final void P7() {
        this.A = (TextView) findViewById(R$id.tv_title);
        this.z = (TextView) findViewById(R$id.agreement);
        this.B = (TextView) findViewById(R$id.tv_notice_content);
        this.C = (TextView) findViewById(R$id.tv_channle);
        this.D = (TextView) findViewById(R$id.tv_account_second_confirmation);
        this.F = (COUIEditText) findViewById(R$id.et_name);
        this.G = (COUIEditText) findViewById(R$id.et_channle);
        this.H = (COUIEditText) findViewById(R$id.et_account_second_confirmation);
        this.I = (HealthButton) findViewById(R$id.btn_submit);
        this.J = (COUICheckBox) findViewById(R$id.checkBox);
        this.E = (TextView) findViewById(R$id.tv_continue);
        this.L = (TextView) findViewById(R$id.name_error);
        this.M = (TextView) findViewById(R$id.channle_account_error);
        this.N = (TextView) findViewById(R$id.account_second_confirmation_error);
        findViewById(R$id.maintaining_relative).setVisibility(0);
        j1l.a(this.I);
    }

    public void Q7() {
        this.E.setVisibility(this.y ? 0 : 8);
        if ("ALIPAY".equalsIgnoreCase(this.w)) {
            Z7(R$string.bus_input_alipay, R$string.bus_input_alipay_tip, R$string.bus_alipay_account, R$string.bus_input_alipay_account, R$string.bus_input_alipay_account_again);
            this.G.setRawInputType(2);
            this.H.setRawInputType(2);
        } else {
            this.w = "ALIPAY";
            Z7(R$string.bus_input_alipay, R$string.bus_input_alipay_tip, R$string.bus_alipay_account, R$string.bus_input_alipay_account, R$string.bus_input_alipay_account_again);
        }
        U7(this.z);
    }

    public final void R7() {
        D7(this.I);
        D7(this.E);
        this.F.addTextChangedListener(this.O);
        this.G.addTextChangedListener(this.O);
        this.H.addTextChangedListener(this.O);
        this.J.setOnStateChangeListener(new b());
    }

    public final void S7() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(com.heytap.health.base.R$id.lib_base_toolbar);
        this.f6122n = cOUIToolbar;
        cOUIToolbar.setTitle(getString(R$string.bus_input_alipay));
        f7(this.f6122n, true);
    }

    public final void T7() {
        if (TextUtils.isEmpty(this.F.getText())) {
            z0k.f(getApplicationContext()).s(this, R$string.bus_input_name);
            return;
        }
        if (TextUtils.isEmpty(this.G.getText())) {
            Y7();
            return;
        }
        String strTrim = this.F.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim) && !O7(strTrim)) {
            this.L.setVisibility(0);
            this.L.setText(R$string.wrong_name_format);
            return;
        }
        String strTrim2 = this.G.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim2) && "ALIPAY".equalsIgnoreCase(this.w)) {
            boolean zG = k7l.g(strTrim2, e1j.REGEX_PHONE);
            boolean zG2 = k7l.g(strTrim2, e1j.REGEX_MAIL);
            if (!zG && !zG2) {
                this.M.setVisibility(0);
                this.M.setText(R$string.wrong_alipay_format);
                return;
            }
        }
        if (this.H.getText() != null && this.G.getText() != null && !TextUtils.equals(this.H.getText().toString().trim(), this.G.getText().toString().trim())) {
            this.N.setVisibility(0);
            this.N.setText(R$string.accounts_are_inconsistent);
            return;
        }
        String strA = v0j.a(strTrim, 1, 0);
        String strA2 = v0j.a(strTrim2, 3, 2);
        n7a.a(6, 6, strA);
        n7a.a(7, 6, strA2);
        Intent intent = new Intent();
        intent.putExtra("name", strTrim);
        intent.putExtra("account", strTrim2);
        setResult(-1, intent);
        finish();
    }

    public final void U7(TextView textView) {
        String string = getString(R$string.bus_refund_notice);
        String string2 = getString(com.heytap.health.base.R$string.app_protocol_personal_privacy_policy);
        String string3 = getString(com.oppo.lib.common.R$string.wallet_check_agreement_zfb, string, string2);
        SpannableString spannableString = new SpannableString(string3);
        int iIndexOf = string3.indexOf(string);
        int iIndexOf2 = string3.indexOf(string2);
        spannableString.setSpan(new g(new WeakReference(this)), iIndexOf, string.length() + iIndexOf, 33);
        spannableString.setSpan(new h(new WeakReference(this)), iIndexOf2, string2.length() + iIndexOf2, 33);
        spannableString.setSpan(new e(new WeakReference(this)), 0, iIndexOf, 33);
        textView.setText(spannableString);
        textView.setHighlightColor(0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void V7(boolean z) {
        if (z) {
            j1l.b(this.I);
        } else {
            j1l.a(this.I);
        }
    }

    public final void W7() {
        View viewInflate = LayoutInflater.from(this).inflate(R$layout.bus_dialog_refund_statement, (ViewGroup) null);
        X7((TextView) viewInflate.findViewById(R$id.tv_message));
        this.K = new HealthAlertDialogBuilder(this).setTitle(R$string.bus_refund_statement).setView(viewInflate).setNegativeButton(com.oppo.lib.common.R$string.cancel, new d()).setPositiveButton(com.oppo.lib.common.R$string.card_del_confirm_button, new c()).show();
    }

    public final void X7(TextView textView) {
        String string = getString(R$string.bus_refund_statements);
        String string2 = getString(R$string.bus_refund_notice);
        SpannableString spannableString = new SpannableString(string + string2);
        int length = string.length();
        spannableString.setSpan(new f(new WeakReference(this)), length, string2.length() + length, 33);
        textView.setText(spannableString);
        textView.setHighlightColor(0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void Y7() {
        if ("ALIPAY".equalsIgnoreCase(this.w)) {
            z0k.f(getApplicationContext()).s(this, R$string.bus_input_alipay_account);
        }
    }

    public final void Z7(int i, int i2, int i3, int i4, int i5) {
        this.A.setText(i);
        this.B.setText(i2);
        this.C.setText(i3);
        this.D.setText(getString(com.oppo.lib.common.R$string.wallet_common_ack) + getString(i3));
        this.G.setHint(i4);
        this.H.setHint(i5);
        this.F.setHint(R$string.bus_input_name);
    }

    public final void a8() {
        if (TextUtils.isEmpty(this.x)) {
            return;
        }
        mfg.i(this, this.x);
    }

    public final void b8() {
        x0.d().b("/settings/PrivacyStatementActivity").navigation();
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public int getLayoutId() {
        return R$layout.activity_delete_refund_backup;
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity, com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.btn_submit) {
            T7();
            return;
        }
        if (id == R$id.tv_continue) {
            if (this.K == null) {
                W7();
            }
            if (this.K.isShowing()) {
                return;
            }
            this.K.show();
        }
    }
}
