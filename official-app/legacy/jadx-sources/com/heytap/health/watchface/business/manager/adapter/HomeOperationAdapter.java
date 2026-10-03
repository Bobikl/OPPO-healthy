package com.heytap.health.watchface.business.manager.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import com.heytap.health.watchface.utils.BiEventUtil;
import com.oplus.aiunit.vision.a78;
import com.oplus.aiunit.vision.ltl;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HomeOperationAdapter extends RecyclerView.Adapter<ActionHolder> {
    public static final String TAG = "HomeOperationAdapter";
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<WatchFaceHomeCard.MenuItem> f7023j;
    public a k;

    public class ActionHolder extends RecyclerView.ViewHolder {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public COUIRoundImageView f7024j;
        public TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public TextView f7025l;

        public ActionHolder(View view) {
            super(view);
            this.i = view;
            this.f7024j = (COUIRoundImageView) view.findViewById(R$id.civ_img);
            this.k = (TextView) view.findViewById(R$id.tv_action_name);
            this.f7025l = (TextView) view.findViewById(R$id.tv_small_tag);
        }
    }

    public interface a {
        void a(String str, int i, String str2);
    }

    public HomeOperationAdapter(Context context, List<WatchFaceHomeCard.MenuItem> list) {
        this.i = context;
        this.f7023j = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(WatchFaceHomeCard.MenuItem menuItem, View view) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(menuItem.getId(), menuItem.getActionType(), menuItem.getActionParam());
        }
        BiEventUtil.i(menuItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull ActionHolder actionHolder, int i) {
        List<WatchFaceHomeCard.MenuItem> list = this.f7023j;
        if (list == null || list.size() == 0) {
            ltl.i(TAG, "[onBindViewHolder] mItemList is empty.");
        } else {
            g(actionHolder, i);
        }
    }

    public final void g(@NonNull ActionHolder actionHolder, int i) {
        final WatchFaceHomeCard.MenuItem menuItem = this.f7023j.get(i);
        if (menuItem != null) {
            actionHolder.k.setText(menuItem.getName());
            String tagName = menuItem.getTagName();
            if (TextUtils.isEmpty(tagName)) {
                actionHolder.f7025l.setVisibility(8);
            } else {
                actionHolder.f7025l.setVisibility(0);
                actionHolder.f7025l.setText(tagName);
            }
            a78.f(this.i, menuItem.getIconUrl(), R$drawable.watch_face_default_bg, actionHolder.f7024j);
            actionHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ad9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.e(menuItem, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<WatchFaceHomeCard.MenuItem> list = this.f7023j;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ActionHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ActionHolder(LayoutInflater.from(this.i).inflate(R$layout.watch_face_home_item_action, viewGroup, false));
    }

    public void setOnClickListener(a aVar) {
        this.k = aVar;
    }
}
