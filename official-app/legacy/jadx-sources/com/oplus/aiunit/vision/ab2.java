package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.heytap.databaseengine.model.SpaceCardMetaData;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.operations.R$id;
import com.heytap.health.operations.R$layout;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ab2 extends gy9 {
    public SpaceInfo k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SpaceCardMetaData f9273l;

    public ab2(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        c(false, false, 0, 0, this.k);
        mmd.c().a(Uri.parse(this.f9273l.getJumpUrl()), this.f9273l.getBackupJumpUrl());
    }

    @Override // com.oplus.aiunit.vision.gy9
    public void a() {
    }

    @Override // com.oplus.aiunit.vision.gy9
    public View b(List<SpaceInfo> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("space view is null?");
        sb.append(lza.a(list));
        if (lza.a(list) || lza.a(list.get(0).getMaterielList()) || TextUtils.isEmpty(list.get(0).getMaterielList().get(0).getImageUrl())) {
            return null;
        }
        SpaceInfo spaceInfo = list.get(0);
        this.k = spaceInfo;
        this.f9273l = spaceInfo.getMaterielList().get(0);
        return f();
    }

    public final View f() {
        c(true, false, 0, 0, this.k);
        View viewInflate = LayoutInflater.from(this.i).inflate(R$layout.lib_core_operation_button, this.f11936j, false);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R$id.rl_button);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_button);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.iv_button);
        textView.setText(this.f9273l.getMaterielTitle());
        r4a.e(this.i, c5i.b(this.f9273l), imageView);
        if (!TextUtils.isEmpty(this.f9273l.getJumpUrl())) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.za2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.e(view);
                }
            });
        }
        return viewInflate;
    }
}
