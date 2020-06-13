package com.example.mytest.RxJava;

import android.util.Log;
import android.util.Pair;

import java.text.DecimalFormat;

import io.reactivex.Observable;

public class Rx_Zip_Ex3 {

    public Rx_Zip_Ex3(){



        source.map(val -> Pair.create(val.first,
                new DecimalFormat(" #,###").format(val.second)
                )).subscribe(val ->{
                    StringBuilder sb = new StringBuilder();
                    sb.append(val.first).append(val.second);
                    Log.d("byun",sb.toString());
                    //주석추가1


        });



    }

    String[] data = {
            "100","300"
    };

    Observable<Integer> basePrice = Observable.fromArray(data)
            .map(Integer::parseInt)
            .map(
                    val ->{
                        if(val<=200) return 910;
                        if(val<=400) return 1600;
                        return 7300;
                    }
            );

    Observable<Integer> userPrice = Observable.fromArray(data)
            .map(Integer::parseInt)
            .map(
                    val -> {
                        double s1 = Math.min(200, val) * 93.3;
                        double s2 = Math.min(200, Math.max(val-200,0)) * 187.9;
                        return (int)(s1+s2);
                    }
            );

    Observable<Pair<String,Integer>> source = Observable.zip(
            basePrice,
            userPrice,
            Observable.fromArray(data),
            (v1,v2, i) -> Pair.create(i, v1+v2)
    );



}
