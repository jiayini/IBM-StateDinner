package thread;

import food.*;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;


public class ServeFood implements Runnable {
    private PriorityBlockingQueue priorityBlockingQueue;
    private Map<Integer, Class<? extends TakeFood>> takeFoodMap = new HashMap<>();
    Semaphore semaphore = new Semaphore(2);

    public ServeFood(PriorityBlockingQueue priorityBlockingQueue) {

        this.priorityBlockingQueue = priorityBlockingQueue;
        takeFoodMap.put(0, ChopSticks.class);
        takeFoodMap.put(1, ForkKnife.class);
    }

    public void run() {
        try {
            semaphore.acquire();
            Food food = (Food) this.priorityBlockingQueue.take();
            Random random = new Random();
            int rand = random.nextInt(2);
            Class<? extends TakeFood> cls = takeFoodMap.get(rand);
            TakeFood takeFood = cls.newInstance();
            takeFood.wayToTake(food);
            semaphore.release();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
