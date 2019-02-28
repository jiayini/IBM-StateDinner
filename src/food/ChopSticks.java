package food;

import utils.Mylog4j;


public class ChopSticks extends TakeFood {

    @Override
    public void wayToTake(Food food) {
        try {
           Mylog4j.printInfoLog("服务生"+Thread.currentThread().getName()+"上了一道:"+food.getName()+", 客人要用筷子吃");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Mylog4j.printErrorLog("中断异常");
            e.printStackTrace();
        }
    }
}

