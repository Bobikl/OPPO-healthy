// Standalone root observer: no JVM, no process scanning, no Bluetooth operations.
#include <android/binder_ibinder.h>
#include <android/binder_parcel.h>
#include <android/binder_status.h>
#include <atomic>
#include <chrono>
#include <charconv>
#include <cstdio>
#include <cstring>
#include <dlfcn.h>
#include <mutex>
#include <poll.h>
#include <stdexcept>
#include <string>
#include <vector>
#include <sys/eventfd.h>
#include <unistd.h>

static void require(bool ok,const char* stage) {if(!ok)throw std::runtime_error(stage);}
static void status(binder_status_t s,const char* stage) {require(s==STATUS_OK,stage);}
static void emit(const std::string& s) {printf("OAFMON1 %s\n",s.c_str());fflush(stdout);}
static long long number(const std::string& s) {
    long long v=0;auto p=std::from_chars(s.data(),s.data()+s.size(),v);
    require(p.ec==std::errc() && p.ptr==s.data()+s.size(),"ARGUMENT");return v;
}
static std::vector<uint8_t> unhex(const std::string& s) {
    require(!s.empty() && s.size()<=8192 && s.size()%2==0,"INTENT_SIZE");
    std::vector<uint8_t> out;
    for(size_t i=0;i<s.size();i+=2) {
        auto digit=[](char c){return c>='0'&&c<='9'?c-'0':c>='a'&&c<='f'?c-'a'+10:-1;};
        int a=digit(s[i]),b=digit(s[i+1]);require(a>=0&&b>=0,"INTENT_HEX");out.push_back(a*16+b);
    }return out;
}
struct Config {
    int schema=0,sdk=0,reg=0,unreg=0,query=0,peek=0,state=0,gone=0,flags=0,absent=0,cut=-1;
    std::vector<int32_t> uids;
    std::vector<std::vector<uint8_t>> intents;
    static Config parse(int argc,char** argv) {
        Config c;std::vector<std::string> seen;
        for(int i=1;i<argc;i+=2) {
            require(i+1<argc,"ARGUMENT");std::string key=argv[i],val=argv[i+1];
            if(key=="--intent"){c.intents.push_back(unhex(val));continue;}
            if(key=="--target"){auto n=number(val);require(n>=10000&&n<=INT32_MAX,"UID");c.uids.push_back(n);continue;}
            for(auto& k:seen)require(k!=key,"DUPLICATE_ARGUMENT");seen.push_back(key);
            auto n=number(val);require(n>=-1&&n<=INT32_MAX,"ARGUMENT_RANGE");
            if(key=="--schema")c.schema=n;else if(key=="--sdk")c.sdk=n;
            else if(key=="--register")c.reg=n;else if(key=="--unregister")c.unreg=n;
            else if(key=="--query")c.query=n;else if(key=="--peek")c.peek=n;
            else if(key=="--state")c.state=n;else if(key=="--gone")c.gone=n;
            else if(key=="--flags")c.flags=n;else if(key=="--absent")c.absent=n;
            else if(key=="--cut")c.cut=n;else require(false,"UNKNOWN_ARGUMENT");
        }
        require(c.schema==1&&c.sdk>=33&&c.reg>0&&c.unreg>0&&c.query>0&&c.peek>0&&c.state>0&&c.gone>0,"ABI_CONFIG");
        require(c.reg!=c.unreg&&c.reg!=c.query&&c.reg!=c.peek&&c.unreg!=c.query&&c.unreg!=c.peek&&c.query!=c.peek&&c.state!=c.gone,"ABI_CODES");
        require(c.absent>0&&c.absent<100&&c.flags>0&&(c.cut==-1||c.cut==c.absent-1),"ABI_STATE");
        require(c.uids.size()>0&&c.uids.size()<=2&&c.intents.size()<=4,"TARGET_COUNT");
        if(c.uids.size()==2)require(c.uids[0]!=c.uids[1],"DUPLICATE_UID");
        return c;
    }
};
struct Parcel {
    AParcel* p=nullptr;
    ~Parcel(){if(p)AParcel_delete(p);}
};
struct ReplyStatus {
    AStatus* p=nullptr;
    ~ReplyStatus(){if(p)AStatus_delete(p);}
};
struct Gate {
    std::string sent;int count=-1;bool dirty=false;
    bool invalidate(){if(dirty)return false;dirty=true;return true;}
    bool publish(long long request,const std::string& state,int n){
        bool change=request!=0||dirty||state!=sent||n!=count;
        if(change){sent=state;count=n;dirty=false;}return change;
    }
};
class Observer {
    Config cfg;
    int wake=-1;
    AIBinder* manager=nullptr;
    AIBinder* callback=nullptr;
    AIBinder* registration=nullptr;
    AIBinder_DeathRecipient* death=nullptr;
    bool registered=false;
    std::atomic<bool> closed{false},pending{false},systemDead{false},callbackBad{false};
    std::atomic<uint64_t> revision{0};
    Gate gate;
    std::string last="UNKNOWN";
    struct Link {AIBinder* binder=nullptr;uint64_t generation=0;};
    struct Cookie {Observer* owner;size_t index;uint64_t generation;};
    Link links[4];
    Cookie systemCookie{this,4,0};
    std::mutex deadMutex;
    std::vector<std::pair<size_t,uint64_t>> deaths;
    void signal(){uint64_t one=1;if(wake>=0){ssize_t n=write(wake,&one,sizeof(one));(void)n;}}
    void uidSignal(){revision.fetch_add(1);pending=true;signal();}
    static void* create(void* p){return p;}
    static void destroy(void*){}
    static binder_status_t transact(AIBinder* b,transaction_code_t code,const AParcel* in,AParcel*) {
        auto* self=static_cast<Observer*>(AIBinder_getUserData(b));
        // Only system_server may provide the authoritative UID callbacks.
        if(AIBinder_getCallingUid()!=1000)return STATUS_PERMISSION_DENIED;
        if(code!=static_cast<uint32_t>(self->cfg.state)&&code!=static_cast<uint32_t>(self->cfg.gone))return STATUS_OK;
        int32_t uid=-1;
        if(AParcel_readInt32(in,&uid)!=STATUS_OK){self->callbackBad=true;self->signal();return STATUS_BAD_VALUE;}
        for(int id:self->cfg.uids)if(uid==id&&!self->closed){self->uidSignal();break;}
        return STATUS_OK;
    }
    static binder_status_t unused(AIBinder*,transaction_code_t,const AParcel*,AParcel*){return STATUS_UNKNOWN_TRANSACTION;}
    static void died(void* ptr) {
        auto* c=static_cast<Cookie*>(ptr);auto* self=c->owner;
        if(self->closed)return;
        if(c->index==4)self->systemDead=true;
        else {std::lock_guard<std::mutex> lock(self->deadMutex);self->deaths.emplace_back(c->index,c->generation);}
        self->signal();
    }
    static void unlinked(void* ptr){auto* c=static_cast<Cookie*>(ptr);if(c->index!=4)delete c;}
    void prepare(Parcel& in) {status(AIBinder_prepareTransaction(manager,&in.p),"PREPARE");}
    void send(int code,Parcel& in,Parcel& out) {
        status(AIBinder_transact(manager,code,&in.p,&out.p,0),"TRANSACTION");
        ReplyStatus result;status(AParcel_readStatusHeader(out.p,&result.p),"REPLY_HEADER");
        require(AStatus_isOk(result.p),"REMOTE_EXCEPTION");
    }
    int count()const {int n=0;for(auto& link:links)if(link.binder)n++;return n;}
    void clearLink(size_t i) {
        auto& l=links[i];if(!l.binder)return;
        // Cookie lifetime ends in the NDK onUnlinked callback, after any death callback.
        // Find the original cookie via a separate per-slot value.
        AIBinder_unlinkToDeath(l.binder,death,cookies[i]);AIBinder_decStrong(l.binder);l.binder=nullptr;cookies[i]=nullptr;
    }
    Cookie* cookies[4]={};
    void clearLinks(){for(size_t i=0;i<4;i++)clearLink(i);}
    void invalidate(const char* reason){if(gate.invalidate())emit(std::string("DIRTY ")+reason);}
    void publish(long long request,const char* reason) {
        if(gate.publish(request,last,count()))emit("STATE "+std::to_string(request)+" "+last+" "+std::to_string(count())+" "+reason);
    }
public:
    explicit Observer(Config c):cfg(std::move(c)){}
    void init(){
        require(getuid()==0,"ROOT_REQUIRED");
        wake=eventfd(0,EFD_CLOEXEC|EFD_NONBLOCK);require(wake>=0,"EVENT_FD");
        // These platform symbols are dynamically checked, never assumed to be public app APIs.
        auto check=reinterpret_cast<AIBinder*(*)(const char*)>(dlsym(RTLD_DEFAULT,"AServiceManager_checkService"));
        auto pool=reinterpret_cast<void(*)()>(dlsym(RTLD_DEFAULT,"ABinderProcess_startThreadPool"));
        auto maxThreads=reinterpret_cast<bool(*)(uint32_t)>(dlsym(RTLD_DEFAULT,"ABinderProcess_setThreadPoolMaxThreadCount"));
        require(check&&pool&&maxThreads,"PLATFORM_SYMBOLS");
        auto amClass=AIBinder_Class_define("android.app.IActivityManager",create,destroy,unused);
        auto uidClass=AIBinder_Class_define("android.app.IUidObserver",create,destroy,transact);
        manager=check("activity");require(manager!=nullptr,"ACTIVITY_SERVICE");
        require(AIBinder_associateClass(manager,amClass),"ACTIVITY_DESCRIPTOR");
        callback=AIBinder_new(uidClass,this);require(callback!=nullptr,"UID_CALLBACK");
        require(maxThreads(1),"THREAD_POOL");pool();
        death=AIBinder_DeathRecipient_new(died);require(death!=nullptr,"DEATH_RECIPIENT");
        AIBinder_DeathRecipient_setOnUnlinked(death,unlinked);
        status(AIBinder_linkToDeath(manager,death,&systemCookie),"SYSTEM_DEATH");
        Parcel in,out;prepare(in);
        status(AParcel_writeStrongBinder(in.p,callback),"REGISTER_CALLBACK");
        status(AParcel_writeInt32(in.p,cfg.flags),"REGISTER_FLAGS");
        status(AParcel_writeInt32(in.p,cfg.cut),"REGISTER_CUT");
        status(AParcel_writeString(in.p,"com.android.shell",17),"REGISTER_PACKAGE");
        status(AParcel_writeInt32Array(in.p,cfg.uids.data(),cfg.uids.size()),"REGISTER_UIDS");
        send(cfg.reg,in,out);
        status(AParcel_readStrongBinder(out.p,&registration),"REGISTER_TOKEN");require(registration!=nullptr,"REGISTER_TOKEN");
        registered=true;
        fprintf(stderr,"OAFNATIVE1 backend=cpp abi=arm64 sdk=%d pid=%d\n",cfg.sdk,getpid());
        emit("READY");refresh(0,"INITIAL");
    }
    void supplement(){
        if(last!="ONLINE")return;
        int before=count();
        for(size_t i=0;i<cfg.intents.size();i++){
            if(links[i].binder)continue;
            try{
                Parcel in,out,serialized;prepare(in);serialized.p=AParcel_create();
                status(AParcel_unmarshal(serialized.p,cfg.intents[i].data(),cfg.intents[i].size()),"INTENT_DECODE");
                status(AParcel_appendFrom(serialized.p,in.p,0,cfg.intents[i].size()),"INTENT_APPEND");
                status(AParcel_writeString(in.p,nullptr,-1),"PEEK_TYPE");
                status(AParcel_writeString(in.p,"com.android.shell",17),"PEEK_PACKAGE");
                send(cfg.peek,in,out);AIBinder* b=nullptr;status(AParcel_readStrongBinder(out.p,&b),"PEEK_BINDER");
                if(!b)continue;
                auto& l=links[i];auto* cookie=new Cookie{this,i,++l.generation};
                // Failed links also receive onUnlinked, which owns cookie deletion.
                if(AIBinder_linkToDeath(b,death,cookie)!=STATUS_OK){AIBinder_decStrong(b);continue;}
                l.binder=b;cookies[i]=cookie;
            }catch(const std::exception&){/* Optional Binder only; UID registration remains authoritative. */}
        }
        if(before!=count())publish(0,"AUX");
    }
    void refresh(long long request,const char* reason){
        uint64_t before=revision.load();
        if(request!=0&&pending.load())invalidate("UID");
        bool online=false;
        for(int uid:cfg.uids){
            Parcel in,out;prepare(in);
            status(AParcel_writeInt32(in.p,uid),"QUERY_UID");
            status(AParcel_writeString(in.p,"com.android.shell",17),"QUERY_PACKAGE");
            send(cfg.query,in,out);int32_t state=-1;status(AParcel_readInt32(out.p,&state),"QUERY_STATE");
            require(state>=0&&state<=cfg.absent,"UID_STATE_RANGE");online|=state!=cfg.absent;
        }
        if(before!=revision.load()){invalidate("UID");return;}
        last=online?"ONLINE":"OFFLINE";if(!online)clearLinks();
        publish(request,reason);if(online)supplement();
    }
    void events(){
        if(systemDead)throw std::runtime_error("SYSTEM_SERVICE_DIED");
        if(callbackBad)throw std::runtime_error("CALLBACK_PROTOCOL");
        uint64_t n;while(read(wake,&n,sizeof(n))==sizeof(n)){}
        std::vector<std::pair<size_t,uint64_t>> dead;
        {std::lock_guard<std::mutex> lock(deadMutex);dead.swap(deaths);}
        bool needs=false;
        for(auto& d:dead)if(links[d.first].binder&&links[d.first].generation==d.second){clearLink(d.first);needs=true;}
        if(pending.exchange(false)){
            if(last!="ONLINE")invalidate("UID");refresh(0,"UID");
        }else if(needs){if(last!="ONLINE")invalidate("BINDER");refresh(0,"BINDER");}
    }
    void loop(){
        using Clock=std::chrono::steady_clock;
        auto start=Clock::now();int stage=0;std::string buffer;
        while(true){
            int timeout=-1;
            if(stage<2){auto deadline=start+std::chrono::seconds(stage==0?2:10);
                auto ms=std::chrono::duration_cast<std::chrono::milliseconds>(deadline-Clock::now()).count();
                timeout=static_cast<int>(ms>0?ms:0);}
            pollfd fds[2]={{STDIN_FILENO,POLLIN,0},{wake,POLLIN,0}};
            int rc=poll(fds,2,timeout);if(rc<0){if(errno==EINTR)continue;throw std::runtime_error("POLL");}
            if(fds[1].revents&POLLIN)events();
            if(fds[0].revents&(POLLIN|POLLHUP)){
                char bytes[1024];ssize_t n=read(STDIN_FILENO,bytes,sizeof(bytes));if(n==0)return;
                require(n>0,"STDIN");buffer.append(bytes,n);
                size_t end;
                while((end=buffer.find('\n'))!=std::string::npos){
                    std::string line=buffer.substr(0,end);buffer.erase(0,end+1);
                    require(line.size()<=40,"COMMAND_SIZE");if(line=="QUIT")return;
                    require(line.rfind("CHECK ",0)==0,"COMMAND");auto request=number(line.substr(6));require(request>0,"REQUEST");
                    refresh(request,"CONFIRM");
                }require(buffer.size()<=40,"COMMAND_SIZE");
            }
            if(fds[0].revents&(POLLERR|POLLNVAL))throw std::runtime_error("CHANNEL_CLOSED");
            if(stage<2&&Clock::now()>=start+std::chrono::seconds(stage==0?2:10)){supplement();stage++;}
        }
    }
    void cleanup(){
        closed=true;
        if(registered)try{Parcel in,out;prepare(in);status(AParcel_writeStrongBinder(in.p,callback),"UNREGISTER");send(cfg.unreg,in,out);}catch(const std::exception&){}
        clearLinks();
        if(manager&&death)AIBinder_unlinkToDeath(manager,death,&systemCookie);
        if(registration)AIBinder_decStrong(registration);
        // main exits the process immediately; the owner remains live until Binder threads stop.
    }
};
static int selfTest(){
    int checks=0;auto check=[&](bool value){checks++;require(value,"SELF_TEST");};
    Gate gate;check(gate.publish(0,"OFFLINE",0));check(!gate.publish(0,"OFFLINE",0));check(gate.publish(1,"OFFLINE",0));
    check(gate.invalidate());check(!gate.invalidate());check(gate.publish(0,"OFFLINE",0));
    check(gate.publish(0,"ONLINE",0));check(gate.publish(0,"ONLINE",2));check(!gate.publish(0,"ONLINE",2));
    check(number("9223372036854775807")==INT64_MAX);
    for(auto s:{"","1x","9223372036854775808"}){bool rejected=false;try{number(s);}catch(const std::exception&){rejected=true;}check(rejected);}
    check(unhex("0100ff")==std::vector<uint8_t>({1,0,255}));
    for(auto s:{"","0","gg"}){bool rejected=false;try{unhex(s);}catch(const std::exception&){rejected=true;}check(rejected);}
    std::vector<std::string> args={"test","--schema","1","--sdk","37","--register","4","--unregister","3","--query","8","--peek","95","--state","4","--gone","1","--flags","3","--absent","20","--cut","19","--target","10577"};
    auto parse=[&](std::vector<std::string> a){std::vector<char*> raw;for(auto& v:a)raw.push_back(v.data());return Config::parse(raw.size(),raw.data());};
    auto c=parse(args);check(c.uids.size()==1&&c.reg==4&&c.cut==19);
    for(int mode=0;mode<7;mode++){
        auto bad=args;
        if(mode==0)bad[2]="2";if(mode==1)bad[4]="32";if(mode==2)bad[6]="3";
        if(mode==3)bad[22]="18";if(mode==4)bad[24]="9999";
        if(mode==5){bad.push_back("--target");bad.push_back("10577");}
        if(mode==6){bad.push_back("--schema");bad.push_back("1");}
        bool rejected=false;try{parse(bad);}catch(const std::exception&){rejected=true;}check(rejected);
    }
    check(gate.publish(99,"ONLINE",2));check(gate.publish(0,"ONLINE",0));
    check(number("1")==1);check(number("-1")==-1);
    printf("PASS %d native policy/parser checks\n",checks);return 0;
}
int main(int argc,char** argv){
    if(argc==2&&std::string(argv[1])=="--self-test"){try{return selfTest();}catch(const std::exception&){return 2;}}
    Observer* observer=nullptr;
    try{observer=new Observer(Config::parse(argc,argv));observer->init();observer->loop();observer->cleanup();return 0;}
    catch(const std::exception& e){emit(std::string("ERROR ")+e.what());if(observer)observer->cleanup();return 2;}
}
