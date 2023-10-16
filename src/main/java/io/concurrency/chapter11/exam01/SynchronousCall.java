package io.concurrency.chapter11.exam01;

public class SynchronousCall {

    public static void main(String[] args) {
        // 동기 실행
        syncCall1();
        System.out.println("메인 스레드 종료");
    }

    public static void syncCall1() {

        try {
            // 동기 실행
            syncCall2();
            System.out.println("syncCall1 종료");
            Thread.sleep(1000); // 1초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void syncCall2() {

        try {
            System.out.println("syncCall2 종료");
            Thread.sleep(1000); // 1초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
