package com.example.mytest.Algorithm

class HeapSort {

    var data : Array<Int>

    init {
        data = arrayOf(5,2,7,3,6,1,4)
        System.out.println("byun" + data.toString())


        heap()

        System.out.println(data.toString())

    }

    fun heap(){ //히피파이
        for(i in 1..data.size-1){
            var child = i
            while(child>0){
                var parent = (child-1)/2
                if(data[child] > data[parent]){
                    var temp = data[parent]
                    data[parent] = data[child]
                    data[child] = temp
                }

                child = parent

            }
        }
    }

}