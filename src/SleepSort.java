import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class SleepSort {
    public static void sleepSortAndPrint(int[] nums) {
        final CountDownLatch doneSignal = new CountDownLatch(nums.length);
        for (final int num : nums) {
            new Thread(new Runnable() {
                public void run() {
                    doneSignal.countDown();
                    try {
                        doneSignal.await();

                        Thread.sleep(num * 1000);
                        System.out.println(num);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public static void sleepSortAndPrintCyclicBarrier(int[] nums) {
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(nums.length);

        for (final int num : nums) {
            new Thread(new Runnable() {
                public void run() {
                    try {

                        Thread.sleep(num * 1000);
                        System.out.println(num);
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 12, 17, 10, 4, 18, 8, 7, 1, 15, 16, 14, 20, 13, 2, 19, 9, 11, 6, 5};

//        sleepSortAndPrint(numbers);
        sleepSortAndPrintCyclicBarrier(numbers);
    }
}