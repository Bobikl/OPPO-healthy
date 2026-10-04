package com.example.opponotificationrelay;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.*;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.*;
import androidx.recyclerview.widget.*;
import com.coui.appcompat.toolbar.COUIToolbar;
import java.util.*;

/** Original editor tile XML and drag engine, with independent local ordering. */
public final class HomeCardEditActivity extends OfficialUiActivity {
    private Context ui;private List<Integer> order;private RecyclerView list;private Cards adapter;private ItemTouchHelper touch;
    private static final int MOVE_BEFORE=0x10001001,MOVE_AFTER=0x10001002;
    @Override protected void onUiCreate(Bundle saved){
        super.onUiCreate(saved);ui=OfficialUiResources.wrap(this);
        order=saved!=null&&saved.containsKey("cardOrder")?HomeCardOrder.normalize(saved.getString("cardOrder")):HomeCardOrder.load(this);
        LinearLayout root=new LinearLayout(this);root.setOrientation(1);root.setBackgroundColor(DeviceStyle.BG);
        COUIToolbar bar=(COUIToolbar)LayoutInflater.from(ui).inflate(id("layout","lib_base_toolbar"),root,false);
        bar.setTitle(ui.getString(id("string","health_home_card_edit_toolbar_title")));bar.setTitleTextColor(DeviceStyle.TEXT);
        bar.setNavigationIcon(getDrawable(R.drawable.device_back));bar.setNavigationContentDescription("保存并返回");bar.setNavigationOnClickListener(v->saveAndFinish());
        root.addView(bar,new LinearLayout.LayoutParams(-1,dp(60)));
        TextView hint=new TextView(this);hint.setText("长按并拖动小卡调整顺序，返回时自动保存");hint.setTextColor(DeviceStyle.MUTED);hint.setTextSize(13);hint.setPadding(dp(16),dp(8),dp(16),dp(20));root.addView(hint);
        list=new COUIRecyclerView(ui);list.setClipToPadding(false);list.setPadding(dp(16),0,dp(4),dp(24));list.setLayoutManager(new GridLayoutManager(ui,2));
        list.addItemDecoration(new RecyclerView$ItemDecoration(){@Override public void getItemOffsets(Rect out,View view,RecyclerView parent,RecyclerView$State state){out.right=dp(12);}});
        adapter=new Cards();list.setAdapter(adapter);
        touch=new ItemTouchHelper(new ItemTouchHelper$Callback(){
            @Override public int getMovementFlags(RecyclerView parent,RecyclerView$ViewHolder holder){return makeMovementFlags(ItemTouchHelper.UP|ItemTouchHelper.DOWN|ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT,0);}
            @Override public boolean isLongPressDragEnabled(){return false;}
            @Override public boolean isItemViewSwipeEnabled(){return false;}
            @Override public boolean onMove(RecyclerView parent,RecyclerView$ViewHolder from,RecyclerView$ViewHolder to){return move(from.getAdapterPosition(),to.getAdapterPosition());}
            @Override public void onSwiped(RecyclerView$ViewHolder holder,int direction){}
        });touch.attachToRecyclerView(list);
        root.addView(list,new LinearLayout.LayoutParams(-1,0,1));setContentView(root);DeviceStyle.insets(this,root);
    }
    private int id(String type,String name){return OfficialUiResources.id(ui,type,name);}
    private int dp(int value){return Math.round(value*OfficialUiScale.density(this));}
    private boolean move(int from,int to){
        if(from<0||to<0||from>=order.size()||to>=order.size()||from==to)return false;
        Integer item=order.remove(from);order.add(to,item);adapter.notifyItemMoved(from,to);return true;
    }
    private void saveAndFinish(){
        if(order==null){finish();return;}
        if(!HomeCardOrder.encode(order).equals(HomeCardOrder.encode(HomeCardOrder.load(this)))&&!HomeCardOrder.save(this,order)){
            Toast.makeText(this,"排序未能保存，请重试",Toast.LENGTH_SHORT).show();return;
        }
        setResult(RESULT_OK);finish();
    }
    @Override public void onBackPressed(){saveAndFinish();}
    @Override protected void onUiSaveInstanceState(Bundle out){out.putString("cardOrder",HomeCardOrder.encode(order));super.onUiSaveInstanceState(out);}
    @Override protected void onUiDestroy(){if(touch!=null)touch.attachToRecyclerView(null);if(list!=null)list.setAdapter(null);super.onUiDestroy();}
    private final class Tile extends RecyclerView$ViewHolder {
        final TextView title;
        Tile(View view){
            super(view);title=view.findViewById(id("id","card_content"));view.setFocusable(true);
            view.setOnLongClickListener(v->{if(getAdapterPosition()==RecyclerView.NO_POSITION)return false;touch.startDrag(this);return true;});
            view.setAccessibilityDelegate(new View.AccessibilityDelegate(){
                @Override public void onInitializeAccessibilityNodeInfo(View host,AccessibilityNodeInfo info){super.onInitializeAccessibilityNodeInfo(host,info);int position=getAdapterPosition();if(position>0)info.addAction(new AccessibilityNodeInfo.AccessibilityAction(MOVE_BEFORE,"向前移动"));if(position>=0&&position<order.size()-1)info.addAction(new AccessibilityNodeInfo.AccessibilityAction(MOVE_AFTER,"向后移动"));}
                @Override public boolean performAccessibilityAction(View host,int action,Bundle args){int position=getAdapterPosition();if(action==MOVE_BEFORE||action==MOVE_AFTER){boolean moved=move(position,position+(action==MOVE_BEFORE?-1:1));if(moved)host.announceForAccessibility("已移动");return moved;}return super.performAccessibilityAction(host,action,args);}
            });
            // Platform inflation does not apply AppCompat's srcCompat to an ordinary ImageView.
            if(view instanceof ViewGroup){ViewGroup group=(ViewGroup)view;for(int i=0;i<group.getChildCount();i++)if(group.getChildAt(i) instanceof ImageView)((ImageView)group.getChildAt(i)).setImageDrawable(ui.getDrawable(id("drawable","health_edit_dragdrop_move_normal")));}
        }
    }
    private final class Cards extends RecyclerView$Adapter {
        Cards(){setHasStableIds(true);}
        @Override public long getItemId(int position){return order.get(position);}
        @Override public int getItemCount(){return order.size();}
        @Override public Tile onCreateViewHolder(ViewGroup parent,int type){return new Tile(LayoutInflater.from(ui).inflate(id("layout","health_viewholder_data_card_two_span"),parent,false));}
        @Override public void onBindViewHolder(RecyclerView$ViewHolder raw,int position){Tile holder=(Tile)raw;String name=HomeCardOrder.title(order.get(position));holder.title.setText(name);holder.itemView.setContentDescription(name+"，长按拖动排序");}
    }
}
