package com.example.mytest.Kotlin

class Ex_Extended{

    init {

        var str = "dreaming coworker, enjoy working life ,cool company, amazing product"
        val result = str?.let{
           // Integer.parseInt(it)

        }



        with(str){
            System.out.println("byun"+str)

        }

        System.out.println("byun"+str)

        val c = car()

        val r = c?.apply {
            c.color = "red"
        }

        System.out.println(c.color)
    }

    class car{
        var color : String
      init {
          color = "white"
      }
    }


}