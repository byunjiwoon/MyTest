package com.example.mytest.RxJava;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Rx_Zip {

    String[] shapes = {"원", "오각형", "별"};
    String[] number = {"2", "6", "4"};

    public Rx_Zip(){

        Observable<String> source = Observable.zip(
                Observable.fromArray(shapes).map(Shape::getSuffix),
                Observable.fromArray(number),
                (suf, color) -> suf + color
        );


        source.subscribe(System.out::println);

    }

    public void intervalTest(){
        Observable<String> source = Observable.zip(
                Observable.fromArray(shapes),
                Observable.interval(2, TimeUnit.SECONDS),
                (shape, i) -> i+1 + " : " + shape
        );

        source.subscribe(System.out::println);
    }


    public static class Shape{

        public static String getSuffix(String s){
            return s;
        }

    }


}
