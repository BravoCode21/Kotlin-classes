package com.example.kotlinbasics


fun main(){

    var guy = Person("Elisha", "Doe", age = 30)
    guy.Hobby= "Unique"
    guy.age = 25
    println("${guy.age}")
    guy.stateHobby()
}


    class Person(fname: String = " John ",lname:String="Langat" ){
        //member variables
        var age: Int? = null
        var Hobby: String = "watch TV"
        var fname: String? = null


        init {
            this.fname = fname
            println(
                "The person created is $fname and $lname"
            )
        }

        //member constructor

        constructor(fname: String, lname: String, age: Int):
                this(fname = fname, lname = lname){
                    this.age = age
                println("new person initialized name is $fname " +
                        "$lname and is $age")
                }


        //member functions - Methods


        fun stateHobby(){
            println("$fname  Hobby is $Hobby")
        }


}






