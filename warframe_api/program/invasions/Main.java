package program.invasions;

public class Main {
    public static void main(String[] args) {
        invasions inv = new invasions();

        for (int i = 0; i < inv.inv.length; i++) {
            if (inv.getnode()[i] != null) {
                System.out.println("任务地图=" + inv.getnode()[i]);
                System.out.println("防守方=" + inv.getattackingFaction()[i]);
                System.out.println("进攻方=" + inv.getdefendingFaction()[i]);
                System.out.println("进攻方胜利奖励=" + inv.getattackerreward()[i]);
                System.out.println("进攻方胜利奖励=" + inv.getattackerthumbnail()[i]);

                System.out.println("防守方胜利奖励=" + inv.getdefenderreward()[i]);
                System.out.println("防守方胜利奖励=" + inv.getdefenderthumbnail()[i]);
                System.out.println("任务进度比例=" + inv.getcompletion()[i]);
                System.out.println("eta:\t" + inv.geteta()[i] + "\n");
            }

        }
    }
}

/*
 * attackerReward att=gson.fromJson(inv[i].attackerReward,
 * attackerReward.class);
 * defenderReward def=gson.fromJson(inv[i].defenderReward,
 * defenderReward.class);
 * System.out.println("任务地图="+inv[i].node);
 * System.out.println("防守方="+inv[i].attackingFaction);
 * System.out.println("进攻方="+inv[i].defendingFaction);
 * if(inv[i].attackingFaction!="Infested")
 * System.out.println("防守方胜利奖励="+att.itemString);
 * System.out.println("进攻方胜利奖励="+def.itemString);
 * System.out.println("任务进度比例="+String.format("%.2f",inv[i].completion)+"%");
 * System.out.println(" ");
 */