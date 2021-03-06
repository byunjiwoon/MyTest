package com.example.mytest.Kotlin

class Ex_Interface(){

    fun NullInfo(){

        val str : String by lazy{
            println("초기화")
            val str1 : String? = null
            val str2 : String = str1!! // !!을 통해서 null 이라고 우겼는데 내용이 null 이니 KotlinNullPointerException 발생!!
            ""+str2
        }

        println("str2 : " + str)
    }

    fun NullInfo2(){

        var str : String? = null

        var upperCase = str?.toUpperCase()

        System.out.println("byun : " + upperCase)


    }

    fun NullInfo3(){

        val str : String? = "  "

        var upperCase = str?.toUpperCase() ?:" 초기화 필요"

        System.out.println("byun : " + upperCase)


    }

    open class A{

    }
    interface Runnable{
        fun run()

        fun fastRun() = println("byun fast Run")

    }

    interface Eatable{
        fun eat()
    }

    class Dog : A(), Runnable, Eatable {
        override fun run() {
            println("byun  Run")
        }

        override fun eat() {
            println("byun  Run")
        }
    }


}