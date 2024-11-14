package program.fissures;

public class fissures_translate {
    String ZH_word_Hard;
    public String fissure_translate(String temp){
        
        
            switch (temp) {
                case "攔截":
                    ZH_word_Hard="拦截";
                    break;
                case "挖掘":
                    ZH_word_Hard="挖掘";
                    break;
                case "防禦":
                    ZH_word_Hard="防御";
                    break;
                case "生存":
                    ZH_word_Hard="生存";
                    break;
                case "移動防禦":
                    ZH_word_Hard="移动防御";
                    break;
                case "殲滅":
                    ZH_word_Hard="歼灭";
                    break;
                case "前哨战":
                    ZH_word_Hard="前哨站";
                    break;
                case "間諜":
                    ZH_word_Hard="间谍";
                    break;
                case "救援":
                    ZH_word_Hard="救援";
                    break;
                case "捕獲":
                    ZH_word_Hard="捕获";
                    break;
                case "中断":
                    ZH_word_Hard="中断";
                    break;
                case "破壞":
                    ZH_word_Hard="破坏";
                    break;
                case "爆发":
                    ZH_word_Hard="爆发";
                    break;
                case "强袭":
                    ZH_word_Hard="强袭";
                    break;
                default:
                    ZH_word_Hard=temp;
                    break;
            }
        

        return  ZH_word_Hard;
    }
}
