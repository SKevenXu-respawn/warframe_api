仲裁查询://所有 XXX 可以用其他声明;
    方法使用:arbitration XXX=new arbitration();         //arbitration at=new arbitration(); 
    XXX.arbitnode()=arbit.node;                   //任务所在地;         //该函数返回数据为String类型;
    XXX.arbitenemy()=arbit.enemy;                  //当前任务的敌人派系;    //该函数返回数据为String类型;
    XXX.arbittype()=arbit.type;                   //任务名称;           //该函数返回数据为String类型;
    XXX.arbittime()=String.valueOf(gt.gettime(arbit.expiry, arbit.activation));   //剩余分钟;   //该函数返回数据为String类型;
执行官:
    方法使用:ArchonHuntReward XXX=new ArchonHuntReward(); //ArchonHuntReward acr=new ArchonHuntReward();
    XXX.ArchonHunt();                                     //返回总数据          //该函数返回数据为String类型;
    XXX.ArchonHunt_boss();                                //返回boss名称        //该函数返回数据为String类型;
    XXX.ArchonHunt_node();                                //返回任务地图名称    //该函数返回数据为String[]类型;
    XXX.ArchonHunt_type();                                //返回任务名称        //该函数返回数据为String[]类型;    
    XXX.ArchonHunt_eta();                                 //返回轮换的具体时间   //该函数返回数据为String类型;
地球平原时间:
    方法使用:cetusCycle_details XXX = new cetusCycle_details();    //cetusCycle_details ced = new cetusCycle_details();
    XXX.cetusCycle_detail();                              //返回平原总数据      //该函数返回数据为String类型；
    XXX.cetusCycle_detail_isday();                        //返回平原是否白天    //该函数返回数据为boolean类型;
    XXX.cetusCycle_detail_timeLeft();                     //返回距离下一天气时间 //该函数返回数据为String类型;
火卫二平原时间:
    方法使用:cambionCycle_details XXX = new cambionCycle_details(); //cambionCycle_details cad = new cambionCycle_details();
    XXX.cambionCycle_detail();                            //返回平原总数据        //该函数返回数据为String类型;                      
    XXX.cambionCycle_detail_state();                      //返回平原是否为vome或者fass //该函数返回数据为String类型;
    XXX.cambionCycle_detail_timeLeft();                   //返回距离下一阶段时间    //该函数返回数据为String类型;
金星平原时间:
    方法使用: vallisCycle_details XXX = new vallisCycle_details();   //vallisCycle_details vad = new vallisCycle_details();
    XXX.vallisCycle_detail();                             //返回平原总数据        //该函数返回数据为String类型;
    XXX.vallisCycle_detail_isWarm();                      //返回平原是否温暖    //该函数返回数据为boolean类型;
    XXX.vad.vallisCycle_detail_timeLeft();                ////返回距离下一天气时间 //该函数返回数据为String类型;
虚空遗物查询:
    方法使用: fissures XXX=new fissures();                   //fissures fi=new fissures();
    注意:以下方法均需要传入一个int 类型的值以查询不同种类核桃的数据
    int num=1,2,3,4,5;              //1为古纪  2为前纪  3为中纪  4为后纪  5为安魂;
    XXX.fissure_Hardmission(int num);                       //返回钢铁裂隙的指定的任务类型    //该函数返回数据为String数组;
    XXX.fissure_Hardeta(int num);                            //返回钢铁裂隙的指定的任务的剩余时间  //该函数返回数据为String数组;
    XXX.fissure_Hardtier(int num);                           //返回钢铁裂隙的指定的任务的核桃类型  //该函数返回数据为String数组;
    XXX.fissure_Hardenemy(int num);                          //返回钢铁裂隙的指定的任务的敌人类型  //该函数返回数据为String数组;
    XXX.fissure_Hardnode(int num);                           //返回钢铁裂隙的指定的任务所在地图    //该函数返回数据为String数组;

    XXX.fissure_Stormmission(int num);                       //返回九重天的指定的任务类型    //该函数返回数据为String数组;
    XXX.fissure_Stormeta(int num);                           //返回九重天的指定的任务的剩余时间  //该函数返回数据为String数组;
    XXX.fissure_Stormtier(int num);                          //返回九重天的指定的任务的核桃类型  //该函数返回数据为String数组;
    XXX.fissure_Stormenemy(int num);                         //返回九重天的指定的任务的敌人类型  //该函数返回数据为String数组;
    XXX.fissure_Stormnode(int num);                          //返回九重天的指定的任务所在地图    //该函数返回数据为String数组;

    XXX.fissure_Commonmission(int num);                             //返回普通裂隙的指定的任务类型    //该函数返回数据为String数组;
    XXX.fissure_Commoneta(int num);                                 //返回普通裂隙的指定的任务的剩余时间  //该函数返回数据为String数组;
    XXX.fissure_Commontier(int num);                                //返回普通裂隙的指定的任务的核桃类型  //该函数返回数据为String数组;
    XXX.fissure_Commonenemy(int num);                               //返回普通裂隙的指定的任务的敌人类型  //该函数返回数据为String数组;
    XXX.fissure_Commonnode(int num);                                //返回普通裂隙的指定的任务所在地图    //该函数返回数据为String数组;
    附加:fissures_translate XXX=new fissures_translate();     //fissures_translate fi_t=new fissures_translate();
    XXX.fissure_translate(String name);                        //该方法返回输入的繁体字的简化   //该函数返回数据为String类型;
    例如:XXX.fissure_translate(xxx.fissure_Commonmission);  传出普通裂隙任务类型的简体字;
    注意:该方法只适用于 XXX.fissure_Hardmission(int num);  XXX.fissure_Stormmission(int num);XXX.fissure_Commonmission(int num);
入侵查询:
    方法使用:invasions XXX=new invasions();                 //invasions inv=new invasions();
    注意:因为该数据特性,每个数据分为数组并且具有空数据(null),使用时请加上if判断语句区分数据和空数据。
    XXX.getattackerreward()                 //返回入侵进攻方胜利奖励        //该函数返回数据为String[]类型
    XXX.getdefenderreward()                 //返回入侵防守方胜利奖励        //该函数返回数据为String[]类型
    XXX.getnode()                           //返回入侵任务所在的地图        //该函数返回数据为String[]类型
    XXX.getattackingFaction()               //返回入侵进攻方派系            //该函数返回数据为String[]类型
    XXX.getdefendingFaction()               //返回入侵防守方派系            //该函数返回数据为String[]类型
    XXX.getcompletion()                     //返回任务进度比例              //该函数返回数据为String[]类型
突击查询:
    方法使用:sortie XXX=new sortie();                       //sortie so=new sortie();
    方法一:
        返回一个length=4的数组,数组中包含{"任务地点","任务名称","任务限制","任务限制描述"};
    XXX.sortie_1();                         //返回任务一的总数据            //该函数返回数据为String[]类型
    XXX.sortie_2();                         //返回任务二的总数据            //该函数返回数据为String[]类型
    XXX.sortie_3();                         //返回任务三的总数据            //该函数返回数据为String[]类型
    方法二:
        返回一个length=3的数组,数组中包含{"任务一","任务二","任务三"}:
    XXX.getmissions();                       //返回三个任务的任务名称           //该函数返回数据为String[]类型
    XXX.getnodes();                          //返回三个任务的任务地点数据        //该函数返回数据为String[]类型
    XXX.getmodifiers();                      //返回三个任务的任务限制            //该函数返回数据为String[]类型
    XXX.getmodifierDescriptions();           //返回三个任务的任务限制描述        //-该函数返回数据为String[]类型
    其他方法:
    XXX.getSortieEta();                      //返回本次突击距离结束的时间         //该函数返回数据为String类型;
钢铁之路奖励查询:
    方法使用:steelPath XXX=new steelPath();   //steelPath st=new steelPath();
    XXX.curr_name();                         //返回钢铁之路轮换奖励的名称         //该函数返回数据为String类型;
    XXX.curr_cost();                         //返回钢铁之路轮换奖励所需要的钢铁精华 //该函数返回数据为int类型;
    XXX.steel_remaining();                   //返回距离钢铁之路奖励轮换的时间       //该函数返回数据为String类型;
平原赏金查询:
    方法使用:CetusSyndicate XXX=new CetusSyndicate(); //CetusSyndicate ce=new CetusSyndicate();
    XXX.CetusSyndicatesList()                //返回地球平原赏金任务             //该函数返回数据为String[]类型;
    XXX.cambionSyndicatesList()              //返回火卫二平原赏金任务           //该函数返回数据为String[]类型;
    XXX.vallisSyndicatesList()               //返回金星平原赏金任务              //该函数返回数据为String[]类型;
    XXX.SyndicatesList(int num)              //按照num返回三大平原之一的赏金任务(上三函数的结合体)  //该函数返回数据为String[]类型;
    XXX.atleasttime(int num)                //按照num返回三大平原之一的距离结束的时间   //该函数返回数据为long类型;
    XXX.activationTime(int num)             //按照num返回三大平原之一的开始时间戳       //该函数返回数据为String类型;
    XXX.expiryTime(int num)                 //按照num返回三大平原之一的结束时间戳       //该函数返回数据为String类型;
    XXX.StartTime(int num)                  //按照num返回三大平原之一的持续时间         //该函数返回数据为String类型;
    其他方法:tra XXX=new tra();             //tra tr=new tra();
    XXX.Cetustran(String word)              //按照word返回地球平原赏金任务的中文翻译    //该函数返回数据为String类型;
    XXX.Cambiontran(String word)            //按照word返回地球平原赏金任务的中文翻译    //该函数返回数据为String类型;
    XXX.vallistran(String word)             //按照word返回地球平原赏金任务的中文翻译    //该函数返回数据为String类型;
    注意:tra方法只适用于三大平原,word为三大平原赏金任务名称的借口(XXX.CetusSyndicatesList(),XXX.cambionSyndicatesList(),XXX.vallisSyndicatesList())
            平原任务需要放到相同的word
奸商查询:
    方法使用:voidTrader XXX=new voidTrader();   //voidTrader vt=new voidTrader();
    XXX.voidLocation()                      //返回奸商位置(中继站)              //该函数返回数据为String类型;
    XXX.voidEndString()                     //返回奸商离开时间                  //该函数返回数据为String类型;
    XXX.item()                              //返回奸商携带的物品                //该函数返回数据为String[]类型;
    XXX.item_ducats()                       //返回物品所需要的杜卡德金币         //该函数返回数据为int[]类型;   
    XXX.item_credits()                      //返回物品所需要的现金              //该函数返回数据为int[]类型;
    XXX.voidtrader_active()                 //返回奸商是否活动                  //该函数返回数据为boolean类型;
    XXX.getexpiry()                         //返回开始时的时间戳                //该函数返回数值为String类型;
    XXX.getstartString()                    //返回距离开始的时间                //该函数返回数值为String类型;
紫卡查询:
    方法使用: weaponname XXX=new weaponname();      //weaponname XXX=new weaponname();
    XXX.ReadGsonTest(String ZH_name,Sting weapon.json);       //输入指定中文名武器的url_name(英文名); //该函数返回数据为String类型;
    使用建议:
        建议嵌套在riven_search函数中使用,可以达到输入中文查询的效果;
        例:ri.riven_search(wea.ReadGsonTest("String"));
    方法使用:rivrenSearch xxx=new rivrenSearch();  //rivrenSearch ri=new rivrenSearch();
    ri.riven_search(String WeaponName );   //输入英文武器的url返回所有符合武器名字并且在线或者在游戏的玩家的紫卡    //该函数返回一个String[][]二维数组类型;
    使用建议:定义一个String类型的二维数组并使用clone()将数组返回值传出到新数组,否则每调用一次该函数,函数就会访问一次wm,消耗时间;
        String[][]temp= ri.riven_search(wea.ReadGsonTest(readname(),String weapon.json) ).clone()
    数组内数据:
        temp[i][0]=in game name;       //卖家在游戏中的名字;
        temp[i][1]=buyout_price;       //买断价格;
        temp[i][2]= item url_name;      //武器的url名称;
        temp[i][3]=item name;           //武器紫卡的后缀名称;
        temp[i][4]=is offline;          //卖家是否在线;
        temp[i][5]=want buy;            //向卖家在游戏中复制的语句;
    注意:
        该方法返回的是全部的指定紫卡玩家,如需输出限定范围的紫卡,建议从temp[i][1](此为买断价格)以及temp[i][4](此为卖家是否在线)这两个数组入手
        例:if(temp[i][4].hashCode()!=-1548612125&&Integer.valueOf(temp[i][1])<921)  
        "游戏中"的hashCode=-1184153961  "不在线"的hashCode=-1548612125
        temp[i][1](买断价格)为String[][]类型,判断时建议转int类型;
        Integer.valueOf(temp[i][1]);
        ReadGsonTest()方法使用时需要附加上所需要的weapon.json文件路径,建议放在项目根目录下.
舰队建造查询:
    方法使用:construction XXX =new construction();      //  construction con =new construction();
        XXX.getFomorian()              //获取豺狼舰队建造进度               //该函数返回数据为float类型;
        XXX.get0()              //获取豺狼舰队建造进度              //该函数返回数据为float类型;
武器倾向以及描述查询:
    方法使用:weapondisposition XXX=new weapondisposition(); //weapondisposition we=new weapondisposition();
        XXX.getdisposition(String num)            //获取指定的武器倾向      //该函数返回数据为int类型;
        XXX.getdescription(String num)            //获取指定的武器描述      //该函数返回数据为String类型;
        XXX.getName(String num)                   //获取指定的武器名称      //该函数返回数据为String类型;
        
