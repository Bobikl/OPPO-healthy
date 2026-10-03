package com.example.opponotificationrelay;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.*;
import java.text.SimpleDateFormat;
import java.util.*;

/** 手动预览、导入与明确确认的午休云保存。 */
public final class OfficialSettingsActivity extends Activity {
    private Button readButton,cancelButton,importButton,writeButton;
    private TextView writeStatus;
    private CheckBox chooseApps,chooseNap;
    private TextView importStatus;
    private android.app.AlertDialog confirmation;
    private Set<String> installed=Collections.emptySet();
    private boolean writing;
    private TextView status,napText,appsText;
    private Thread worker;private OfficialSettingsClient client;
    private OfficialSettingsPreview preview;private int generation;
    private final android.os.Handler ui=new android.os.Handler(android.os.Looper.getMainLooper());
    @Override protected void onCreate(Bundle state) {
        super.onCreate(state);
        setTitle("官方设置预览");
        ScrollView scroll=new ScrollView(this);LinearLayout root=new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);int pad=(int)(20*getResources().getDisplayMetrics().density);root.setPadding(pad,pad,pad,pad);
        scroll.addView(root);setContentView(scroll);
        add(root,"官方设置预览",22);
        add(root,"读取官方保存的通知应用名单和午休设置，核对与独立版的差异。读取期间请避免切换账号或修改官方设置。",15);
        add(root,"读取不会自动应用。选择导入内容并确认后，才会更新独立版。无需打开官方健康。",14);
        readButton=new Button(this);readButton.setText("读取官方设置（Root）");readButton.setOnClickListener(v->read());root.addView(readButton);
        cancelButton=new Button(this);cancelButton.setText("取消读取");cancelButton.setEnabled(false);cancelButton.setOnClickListener(v->cancel());root.addView(cancelButton);
        status=add(root,"尚未读取",14);
        chooseApps=new CheckBox(this);chooseApps.setText("导入通知应用名单");chooseApps.setChecked(true);root.addView(chooseApps);
        chooseNap=new CheckBox(this);chooseNap.setText("导入午休静默设置");chooseNap.setChecked(true);root.addView(chooseNap);
        importButton=new Button(this);importButton.setText("导入到独立版…");importButton.setEnabled(false);
        importButton.setOnClickListener(v->importSelection());root.addView(importButton);
        importStatus=add(root,"导入前会列出将要修改的内容。",14);
        writeButton=new Button(this);writeButton.setText("将午休设置写回官方…");writeButton.setEnabled(false);
        writeButton.setOnClickListener(v->reviewWriteNap());root.addView(writeButton);
        writeStatus=add(root,OfficialSettingsClient.lastWrite(this),14);
        add(root,"写回仅包含午休静默。确认后会临时连接官方数据服务，必要时创建该服务；完成后释放连接。官方需已启用且网络可用。应用名单写回尚未开放。",13);
        add(root,"午休静默",19);napText=add(root,"尚未读取官方午休配置。",15);
        add(root,"通知应用名单",19);appsText=add(root,"尚未读取官方应用名单。",15);
        add(root,"这里只比较普通应用开关。官方功能项、短信聚合等特殊项暂未纳入；官方对本独立版自身通知的允许项也单独保留。",13);
    }
    private TextView add(LinearLayout root,String text,int size) {
        TextView v=new TextView(this);v.setText(text);v.setTextSize(size);v.setTextColor(Color.rgb(35,45,60));v.setPadding(0,12,0,12);root.addView(v);return v;
    }
    private void read() {
        if(worker!=null)return;
        final int token=++generation;preview=null;
        napText.setText("正在读取…");appsText.setText("正在读取…");
        busy(true,true);status.setText("正在读取，请允许本应用的 Root 请求…");
        client=new OfficialSettingsClient(this);final OfficialSettingsClient request=client;
        worker=new Thread(()->{
            OfficialSettingsPreview result=null;Set<String> packages=null;String failure=null;
            try{result=request.read();packages=installedApps();}catch(Exception e){failure=OfficialSettingsClient.errorMessage(e);}
            final OfficialSettingsPreview value=packages==null?null:result;final Set<String> present=packages;final String message=failure;
            ui.post(()->{
                if(isDestroyed() || token!=generation)return;
                worker=null;client=null;preview=value;installed=present==null?Collections.emptySet():present;busy(false,false);
                if(value==null){status.setText(message);napText.setText("未读取，不能判断官方开关。");appsText.setText("未读取，不能判断名单差异。");}
                else {
                    FileLogger.i("SettingsPreview","只读预览完成 apps="+(value.apps==null?"unread":value.apps.size())+
                        " nap="+(value.nap==null?"unread":((value.nap.enabled?"on":"off")+" "+time(value.nap.start)+"-"+time(value.nap.end()))));
                    render();
                }
            });
        },"official-settings-preview");worker.start();
    }
    private void cancel() {
        if(writing)return;
        generation++;if(client!=null)client.cancel();if(worker!=null)worker.interrupt();client=null;worker=null;preview=null;
        busy(false,false);status.setText("读取已取消");importStatus.setText("本次操作已取消，未导入设置。");
        napText.setText("尚未读取官方午休配置。");appsText.setText("尚未读取官方应用名单。");
    }
    @Override protected void onResume(){super.onResume();if(preview!=null&&worker==null)render();}
    @Override protected void onDestroy(){generation++;if(confirmation!=null)confirmation.dismiss();if(client!=null&&!writing)client.cancel();if(worker!=null&&!writing)worker.interrupt();ui.removeCallbacksAndMessages(null);preview=null;super.onDestroy();}

    private Set<String> installedApps() {
        Set<String> names=new HashSet<>();
        for(android.content.pm.ApplicationInfo app:getPackageManager().getInstalledApplications(0)) {
            if(names.size()>=10000)throw new IllegalStateException("INSTALLED_LIMIT");
            names.add(app.packageName);
        }
        return Collections.unmodifiableSet(names);
    }
    private void importSelection() {
        if(worker!=null || preview==null)return;
        reviewImport(preview,installed,chooseApps.isChecked(),chooseNap.isChecked(),"导入官方设置");
    }
    private void reviewImport(OfficialSettingsPreview value,Set<String> present,boolean apps,boolean nap,String title) {
        try {
            SettingsImportPlan plan=new SettingsImportPlan(value,SettingsImportStore.snapshot(this),present,apps,nap,
                android.os.SystemClock.elapsedRealtime());
            if(!plan.changes()){importStatus.setText("所选范围已一致，无需导入。");return;}
            StringBuilder message=new StringBuilder("将以下设置应用到独立版：\n");
            if(apps) {
                message.append("\n通知应用：新增开启 ").append(plan.added.size()).append(" 项，关闭 ").append(plan.removed.size()).append(" 项。\n");
                for(String pkg:plan.added)message.append("开启：").append(pkg).append("\n");
                for(String pkg:plan.removed)message.append("关闭：").append(pkg).append("\n");
                message.append("保留官方没有记录的本地选择：").append(plan.preservedMissing)
                    .append(" 项；跳过未安装的官方记录：").append(plan.skippedUninstalled).append(" 项。\n");
            }
            if(nap) {
                message.append("\n午休静默：\n当前 ").append(plan.before.enabled?"开启":"关闭").append(" ")
                    .append(time(plan.before.start)).append("–").append(time(plan.before.end))
                    .append("\n导入后 ").append(value.nap.enabled?"开启":"关闭").append(" ")
                    .append(time(value.nap.start)).append("–").append(time(value.nap.end())).append("\n");
            }
            message.append("\n仅修改已勾选的独立版设置，官方设置保持原样。");
            TextView text=new TextView(this);text.setText(message.toString());text.setTextSize(16);text.setPadding(24,12,24,12);
            ScrollView scroll=new ScrollView(this);scroll.addView(text);
            if(confirmation!=null)confirmation.dismiss();
            confirmation=new android.app.AlertDialog.Builder(this).setTitle(title).setView(scroll)
                .setNegativeButton("取消",null).setPositiveButton("确认导入",(dialog,which)->verifyImport(plan)).create();
            confirmation.setOnDismissListener(dialog->confirmation=null);confirmation.show();
        } catch(Exception e){importStatus.setText(importError(e));}
    }
    private static String importError(Exception e) {
        String reason=e.getMessage();
        if("NO_SCOPE".equals(reason))return "请至少选择一项导入内容。";
        if("SOURCE_UNREAD".equals(reason))return "所选内容尚未读取成功，请先重新读取，或只勾选已读取成功的内容。";
        if("NAP_CROSS_DAY".equals(reason))return "官方午休跨日，当前独立版不支持；可以仅导入应用名单。";
        if("NAP_PROTOCOL".equals(reason))return "请先在首页选择 Watch X2 通知协议，再导入开启的午休静默；也可仅导入应用名单。";
        return "无法准备导入，请重新读取设置。";
    }
    private void busy(boolean active,boolean cancellable) {
        readButton.setEnabled(!active);importButton.setEnabled(!active&&preview!=null);
        writeButton.setEnabled(!active&&preview!=null&&preview.nap!=null&&preview.nap.revision!=null);
        cancelButton.setEnabled(active&&cancellable);chooseApps.setEnabled(!active);chooseNap.setEnabled(!active);
    }
    private void verifyImport(SettingsImportPlan plan) {
        if(worker!=null)return;
        final int token=++generation;busy(true,true);
        importStatus.setText("正在重新核对官方和本地设置…");
        client=new OfficialSettingsClient(this);final OfficialSettingsClient request=client;
        worker=new Thread(()->{
            OfficialSettingsPreview result=null;Set<String> packages=null;String failure=null;
            try{result=request.read();packages=installedApps();}catch(Exception e){failure=OfficialSettingsClient.errorMessage(e);}
            final OfficialSettingsPreview fresh=result;final Set<String> present=packages;final String message=failure;
            ui.post(()->{
                if(isDestroyed() || token!=generation)return;
                worker=null;client=null;
                if(fresh==null || present==null){busy(false,false);importStatus.setText(message+" 未导入任何设置。");return;}
                preview=fresh;installed=present;render();
                if(plan.expired(android.os.SystemClock.elapsedRealtime()) || !plan.localMatches(SettingsImportStore.snapshot(this)) ||
                    !plan.freshMatches(fresh,present)) {
                    busy(false,false);importStatus.setText("设置或确认时限已变化，请核对后重新确认。");
                    reviewImport(fresh,present,plan.importApps,plan.importNap,"重新确认导入");return;
                }
                writing=true;busy(true,false);importStatus.setText("正在保存已确认的设置…");
                final android.content.Context app=getApplicationContext();
                worker=new Thread(()->{
                    SettingsImportPlan.Result outcome;
                    try{outcome=SettingsImportStore.apply(app,plan,fresh,present,android.os.SystemClock.elapsedRealtime());}
                    catch(Exception e){outcome=SettingsImportPlan.Result.FAILED_UNCERTAIN;}
                    final SettingsImportPlan.Result saved=outcome;
                    ui.post(()->{
                        if(isDestroyed() || token!=generation)return;
                        worker=null;writing=false;busy(false,false);render();
                        switch(saved) {
                            case APPLIED:importStatus.setText("已导入到独立版，所选设置已保存。");break;
                            case NO_CHANGE:importStatus.setText("所选设置已一致，无需修改。");break;
                            case LOCAL_CHANGED:case SOURCE_CHANGED:case EXPIRED:
                                importStatus.setText("设置发生变化，本次未导入，请重新核对。");break;
                            case CANCELLED:importStatus.setText("导入已取消。");break;
                            case FAILED_RESTORED:importStatus.setText("保存失败，已恢复导入前的设置。");break;
                            default:importStatus.setText("保存未完成，恢复结果也未能确认，请检查独立版设置后重试。");
                        }
                    });
                },"official-settings-save");worker.start();
            });
        },"official-settings-recheck");worker.start();
    }

    private static String time(int minutes){return String.format(Locale.ROOT,"%02d:%02d",minutes/60,minutes%60);}
    private void render() {
        OfficialSettingsPreview p=preview;if(p==null)return;
        String captured=new SimpleDateFormat("HH:mm:ss",Locale.getDefault()).format(new Date(p.capturedAt));
        status.setText((p.apps!=null&&p.nap!=null?"读取完成":"部分设置未读取")+" · "+captured+"\n这是读取时的快照，可重新读取刷新。");
        String local=(NapQuietSettings.enabled(this)?"开启":"关闭")+"，"+time(NapQuietSettings.start(this))+"–"+time(NapQuietSettings.end(this));
        if(p.nap==null)napText.setText("官方：未读取（"+p.napError+"）\n独立版："+local);
        else {
            OfficialSettingsPreview.Nap n=p.nap;
            napText.setText("官方："+(n.enabled?"开启":"关闭")+"，"+time(n.start)+"–"+time(n.end())+(n.sameDay()?"":"（跨日）")+
                "\n独立版："+local+"\n"+(!n.sameDay()?"官方时段跨日，当前独立版尚不支持此时段。":
                n.matches(NapQuietSettings.enabled(this),NapQuietSettings.start(this),NapQuietSettings.end(this))?"两边午休设置一致。":"两边午休设置不同，尚未同步。"));
        }
        if(p.apps==null){appsText.setText("官方名单未读取（"+p.appsError+"），不能判断差异。");return;}
        Set<String> selected=RelayConfig.selectedApps(this);selected.remove(OfficialSettingsPreview.SELF);
        List<OfficialSettingsPreview.Difference> differences=p.differences(selected);
        StringBuilder text=new StringBuilder("官方普通应用：").append(p.apps.size()).append(" 项，开启 ").append(p.enabledApps())
            .append(" 项\n独立版已选：").append(selected.size()).append(" 项\n");
        if(differences.isEmpty())text.append("已比较的普通应用开关一致。");
        else {
            text.append("发现 ").append(differences.size()).append(" 项差异或缺失记录：\n");
            int count=0;
            for(OfficialSettingsPreview.Difference d:differences) {
                if(count++>=80){text.append("\n其余 ").append(differences.size()-80).append(" 项未展开。");break;}
                text.append("\n").append(d.pkg).append("\n官方：").append(d.official==null?"没有对应记录":d.official?"开启":"关闭")
                    .append("；独立版：").append(d.local?"开启":"关闭").append("\n");
            }
        }
        text.append("\n\n未比较的特殊项：").append(p.skipped).append("；独立版自身项：").append(p.selfRows).append("。");
        appsText.setText(text.toString());
    }

    private void reviewWriteNap() {
        if(worker!=null || preview==null)return;
        try {
            NapWritePolicy.Plan plan=new NapWritePolicy.Plan(preview.nap,SettingsImportStore.snapshot(this),
                android.os.SystemClock.elapsedRealtime());
            if(!plan.changes()){writeStatus.setText("两边午休设置一致，无需写回。");return;}
            String message="写回范围：午休静默。\n\n官方当前："+napLabel(plan.source.nap)+
                "\n将改为："+napLabel(plan.target.nap)+
                "\n\n请保持官方健康已启用和网络连接；保存期间请保持账号和设置不变。"+
                "\n本次会临时绑定官方数据服务，必要时创建该服务，完成后解绑。由官方保存并同步到云端，三项分别处理；中途失败时停止后续提交。";
            if(getSharedPreferences("official_nap_write_state",MODE_PRIVATE).getBoolean("pending",false))
                message+="\n\n上次写回尚未完整确认。请确认已重新读取并核对官方当前状态。";
            if(confirmation!=null)confirmation.dismiss();
            confirmation=new android.app.AlertDialog.Builder(this).setTitle("将午休设置写回官方？")
                .setMessage(message).setNegativeButton("取消",null)
                .setPositiveButton("确认写回",(dialog,which)->writeNap(plan)).create();
            confirmation.setOnDismissListener(dialog->confirmation=null);confirmation.show();
        } catch(Exception e) {
            String code=e.getMessage();
            writeStatus.setText("NAP_PROTOCOL".equals(code)?"请先选择 Watch X2 通知协议，再同步开启的午休静默。":
                "NAP_RANGE".equals(code)?"目前写回仅支持当天内的有效午休时段。":"请先重新读取完整的官方午休设置。");
        }
    }
    private static String napLabel(OfficialSettingsPreview.Nap nap) {
        return (nap.enabled?"开启 ":"关闭 ")+time(nap.start)+"–"+time(nap.end());
    }
    private void writeNap(NapWritePolicy.Plan plan) {
        if(worker!=null)return;
        if(plan.expired(android.os.SystemClock.elapsedRealtime()) || !plan.localMatches(SettingsImportStore.snapshot(this))) {
            writeStatus.setText("本地设置或确认时限已变化，请重新核对后确认。");return;
        }
        final int token=++generation;writing=true;busy(true,false);
        writeStatus.setText("正在临时连接官方、保存并读回核对…");
        client=new OfficialSettingsClient(getApplicationContext());final OfficialSettingsClient request=client;
        worker=new Thread(()->{
            NapWritePolicy.Result result=request.writeNap(plan);
            ui.post(()->{
                if(isDestroyed() || token!=generation)return;
                worker=null;client=null;writing=false;preview=null;busy(false,false);
                status.setText("本次写回检查已结束，请重新读取刷新对照。");
                napText.setText("请重新读取官方午休配置。");appsText.setText("请重新读取官方应用名单。");
                String message=OfficialSettingsClient.writeMessage(result);
                if(!plan.localMatches(SettingsImportStore.snapshot(this)))message+="\n独立版设置在操作期间又有变化，请重新比较两边。";
                writeStatus.setText(message);
                if(!isFinishing()) {
                    if(confirmation!=null)confirmation.dismiss();
                    String title=result.status==NapWritePolicy.Status.APPLIED?"午休写回已完成":
                        result.status==NapWritePolicy.Status.NO_CHANGE?"午休设置已一致":
                        result.status==NapWritePolicy.Status.REJECTED?"本次未写回":"写回结果待核对";
                    confirmation=new android.app.AlertDialog.Builder(this).setTitle(title).setMessage(message)
                        .setPositiveButton("知道了",null).create();
                    confirmation.setOnDismissListener(dialog->confirmation=null);confirmation.show();
                }
            });
        },"official-nap-write");worker.start();
    }
}
