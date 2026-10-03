package com.heytap.health.wallet.entrance.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.wallet.entrance.R$drawable;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.entrance.R$menu;
import com.heytap.health.wallet.network.door.rsp.CardTheme;
import com.heytap.health.wallet.network.door.rsp.CardThemeCover;
import com.heytap.health.wallet.network.door.rsp.CardThemeGroup;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import com.heytap.health.wallet.widget.NetStatusErrorView;
import com.heytap.speech.engine.EngineConfig;
import com.oplus.aiunit.vision.a94;
import com.oplus.aiunit.vision.ao6;
import com.oplus.aiunit.vision.cdk;
import com.oplus.aiunit.vision.e2c;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.p13;
import com.oplus.aiunit.vision.qvf;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.r13;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u2j;
import com.oplus.aiunit.vision.z0k;
import com.oppo.lib.common.R$string;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/theme")
public class CardThemeActivity extends EntranceBaseActivity {

    @Autowired(name = "CARD_TYPE")
    public String A;

    @Autowired(name = "aid")
    public String B;
    public String C;
    public ListView D;
    public p13 E;
    public int F;
    public int G;
    public CardThemeCover H;
    public List<CardThemeGroup> I;
    public CardTheme J;
    public NetStatusErrorView K;
    public long L;
    public COUIToolbar u;
    public CircleNetworkImageView v;
    public TextView w;

    @Autowired(name = EngineConfig.K_SOURCE)
    public int x;

    @Autowired(name = "appCode")
    public String y;

    @Autowired(name = "CARD_NAME")
    public String z;

    public class a extends ie7<Boolean> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            z0k.f(CardThemeActivity.this).t(CardThemeActivity.this, String.valueOf(str2));
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(Boolean bool) {
            CardThemeActivity.this.I7();
            Context context = qz0.mContext;
            z0k.f(context).t(context, context.getResources().getString(R$string.set_default_success));
            Intent intent = new Intent();
            intent.putExtra(CardDetailActivity.KEY_THEME_IMG, CardThemeActivity.this.J.getCardImg());
            CardThemeActivity.this.setResult(900, intent);
            CardThemeActivity.this.finish();
        }
    }

    public class b implements cdk<Integer, Integer> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.cdk
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Integer num, Integer num2) {
            CardThemeActivity.this.N7(num.intValue(), num2.intValue());
        }
    }

    public class c extends ie7<CardThemeCover> {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            CardThemeActivity.this.u7(str2);
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(CardThemeCover cardThemeCover) {
            CardThemeActivity.this.l7();
            if (cardThemeCover != null) {
                CardThemeActivity.this.H = cardThemeCover;
                CardThemeActivity.this.P7();
            }
        }
    }

    public CardThemeActivity() {
        super(R$layout.activity_card_theme);
        this.F = -1;
        this.G = -1;
        this.L = 0L;
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void A7() {
        this.E.b(new b());
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void C7() {
        Q7(this.C);
        if (!TextUtils.isEmpty(this.z)) {
            this.w.setText(this.z);
        }
        this.D.setAdapter((ListAdapter) this.E);
        p7(this.K);
        R7();
        L7();
    }

    public final void I7() {
        ao6 ao6Var = new ao6();
        ao6Var.d(ao6.REVISE_CARD_DETAIL);
        sr6.c().l(ao6Var);
    }

    public final void L7() {
        r7();
        r13.a(this.x, this.y, this.A, this.B, new c());
    }

    public final void M7() {
        this.J = this.H.getCurrentTheme();
        List<CardThemeGroup> cardGroups = this.H.getCardGroups();
        for (int i = 0; i < cardGroups.size(); i++) {
            List<CardTheme> cardThemes = cardGroups.get(i).getCardThemes();
            if (cardThemes != null) {
                for (int i2 = 0; i2 < cardThemes.size(); i2++) {
                    if (this.J.getCardThemeId() == cardThemes.get(i2).getCardThemeId()) {
                        cardThemes.get(i2).setSelected(1);
                        this.F = i;
                        this.G = i2;
                        return;
                    }
                    cardThemes.get(i2).setSelected(0);
                }
            }
        }
    }

    public final void N7(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return;
        }
        int i3 = this.F;
        if (i == i3 && i2 == this.G) {
            return;
        }
        if (i3 >= 0 && this.G >= 0) {
            CardTheme cardTheme = this.I.get(i3).getCardThemes().get(this.G);
            this.J = cardTheme;
            cardTheme.setSelected(0);
        }
        CardTheme cardTheme2 = this.I.get(i).getCardThemes().get(i2);
        cardTheme2.setSelected(1);
        this.J = cardTheme2;
        this.F = i;
        this.G = i2;
        this.E.notifyDataSetChanged();
        if (!TextUtils.isEmpty(this.J.getCardImg())) {
            Q7(this.J.getCardImg());
        }
        if (TextUtils.isEmpty(this.z)) {
            return;
        }
        this.w.setText(this.z);
    }

    public final void O7() {
        r13.b(this.y, this.J.getCardThemeId(), this.A, this.B, new a());
    }

    public final void P7() {
        CardThemeCover cardThemeCover = this.H;
        if (cardThemeCover == null || cardThemeCover.getCurrentTheme() == null || this.H.getCardGroups() == null) {
            return;
        }
        CardTheme currentTheme = this.H.getCurrentTheme();
        this.J = currentTheme;
        if (!TextUtils.isEmpty(currentTheme.getCardImg())) {
            Q7(this.J.getCardImg());
        }
        if (!TextUtils.isEmpty(this.z)) {
            this.w.setText(this.z);
        }
        this.I.clear();
        this.I.addAll(this.H.getCardGroups());
        M7();
        this.E.notifyDataSetChanged();
    }

    public final void Q7(String str) {
        if (a94.a(this)) {
            this.v.setPlaceHolderDrawable(R$drawable.img_card_defaul_bg);
            this.v.setImageUrl(str);
        }
    }

    public final void R7() {
        this.u.setTitle(getResources().getString(com.heytap.health.wallet.entrance.R$string.card_theme));
        this.u.setIsTitleCenterStyle(true);
        R1(this, this.u, false);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(e2c.c().a(), e2c.c().b());
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        q7(true);
        super.onCreate(bundle);
        v7();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R$menu.entrance_menu_card_theme, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w7();
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R$id.cancel_select) {
            finish();
        } else if (menuItem.getItemId() == R$id.select_all) {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            if (timeInMillis - this.L > 2000) {
                this.L = timeInMillis;
                if (this.J != null && k7l.a()) {
                    O7();
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public void retryQuery(qvf qvfVar) {
        if (a94.a(this)) {
            n7();
            L7();
        }
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void y7() {
        this.u = (COUIToolbar) findViewById(com.heytap.health.base.R$id.lib_base_toolbar);
        this.v = (CircleNetworkImageView) findViewById(R$id.themeImg);
        this.w = (TextView) findViewById(R$id.themeTitle);
        this.D = (ListView) findViewById(R$id.cardThemeLv);
        this.K = (NetStatusErrorView) findViewById(R$id.contentLoading);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void z7() {
        if (getIntent() == null) {
            finish();
            return;
        }
        try {
            this.C = getIntent().getStringExtra("imgUrl");
            this.z = getIntent().getStringExtra("CARD_NAME");
            this.A = getIntent().getStringExtra("CARD_TYPE");
            this.B = getIntent().getStringExtra("aid");
            this.y = getIntent().getStringExtra("appCode");
        } catch (Exception e2) {
            t6b.d(this.s, "initData intent handle exception: " + e2.getMessage());
        }
        int intExtra = getIntent().getIntExtra(EngineConfig.K_SOURCE, 0);
        this.x = intExtra;
        if (intExtra == 0 && getIntent().hasExtra(EngineConfig.K_SOURCE)) {
            try {
                this.x = Integer.valueOf(getIntent().getStringExtra(EngineConfig.K_SOURCE)).intValue();
            } catch (Exception unused) {
                this.x = 0;
            }
        }
        this.I = new ArrayList();
        this.E = new p13(this, this.I);
    }
}
