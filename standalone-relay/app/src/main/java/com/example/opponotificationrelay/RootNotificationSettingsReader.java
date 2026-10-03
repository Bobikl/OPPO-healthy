package com.example.opponotificationrelay;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/** 一次性 Root 查询，只打开官方通知数据库的七项开关，不读取消息/账户/密钥。 */
public final class RootNotificationSettingsReader {
    private static final String[] KEYS={"main_switch","screen_on_push","wrist_off_push","light_up","breeno","flashback","com.tencent.mm"};
    private static final int[] BITS={0x08000000,0x02000000,0x80000000,0x40000000,0x10000000,0x20000000,0x04000000};
    public static void main(String[] args) {
        Thread parent=new Thread(() -> {
            try {while(System.in.read()!=-1) { }} catch(IOException ignored) { }
            System.exit(0);
        },"CID84-reader-parent");parent.setDaemon(true);parent.start();
        Thread deadline=new Thread(() -> {
            try {Thread.sleep(8000);} catch(InterruptedException ignored) {return;}
            System.out.println("CID84BASE1 ERROR TIMEOUT");System.out.flush();System.exit(0);
        },"CID84-reader-deadline");deadline.setDaemon(true);deadline.start();
        String stage="ROOT_OR_ARGUMENT";
        try {
            if(android.os.Process.myUid()!=0 || args.length!=2
                || !("com.heytap.health".equals(args[0]) || "com.coloros.health".equals(args[0]))) throw new SecurityException();
            int uid=Integer.parseInt(args[1]);if(uid<10000) throw new SecurityException();
            stage="DIRECTORY_OWNER";
            String base="/data/user/"+(uid/100000)+"/"+args[0];
            int directoryUid=Os.stat(base).st_uid;
            if(directoryUid!=uid) {stage="OWNER_MISMATCH_"+directoryUid+"_"+uid;throw new SecurityException();}
            stage="DATABASE_OWNER";
            File file=new File(base,"databases/notification-new.db");
            if(!file.isFile() || Os.stat(file.getPath()).st_uid!=uid) throw new SecurityException();
            int bitmap=1;stage="DATABASE_OPEN";
            try(SQLiteDatabase db=SQLiteDatabase.openDatabase(file.getPath(),null,SQLiteDatabase.OPEN_READONLY | SQLiteDatabase.NO_LOCALIZED_COLLATORS)) {
                stage="QUERY_ONLY";db.execSQL("PRAGMA query_only=ON");
                for(int i=0;i<KEYS.length;i++) {
                    stage="SWITCH_ROW_"+i;
                    try(Cursor row=db.rawQuery("SELECT isOpen FROM notification_packages WHERE packageName=? LIMIT 2",new String[]{KEYS[i]})) {
                        if(!row.moveToFirst() || row.isNull(0)) throw new IOException();
                        int value=row.getInt(0);
                        if((value!=0 && value!=1) || row.moveToNext()) throw new IOException();
                        if(value==1) bitmap|=BITS[i];
                    }
                }
            }
            System.out.println(String.format(Locale.ROOT,"CID84BASE1 OK %08x",bitmap));
        } catch(Exception failure) {
            if(failure instanceof android.system.ErrnoException) stage+="_ERRNO_"+((android.system.ErrnoException)failure).errno;
            System.out.println("CID84BASE1 ERROR "+stage);
        }
        finally {System.out.flush();System.exit(0);}
    }
}
