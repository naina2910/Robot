class Robot(val robotName:String) {
    fun ringTheAlarm(time:String,day:String)
    {
        val notRing= listOf("Saturday","Sunday")
        if(day !in notRing)
        {
            println("Alarm will ring on $day $time")
        }
    }

    fun makeCoffee(type:String,sugar:Int)
    {
        println("$type Coffee is ready")
    }

    fun heatTheWater(temp:Double,day: String)
    {
        val notBath= listOf("Saturday","Sunday")
        if(day !in notBath)
        {
            println("Water is ready for bath")
        }
    }

    fun packBag(day: String)
    {
        val monday=Timetable("ds","cn")
        val tuesday=Timetable("micro","eng")
        val wednesday=Timetable("dbms","os")
        val thursday=Timetable("ds","cn")
        val friday=Timetable("micro","eng")

        val list= mutableListOf(monday,tuesday,wednesday,thursday,friday)

        when(day)
        {
            "monday"-> println("packed ${list.get(0)}")
            "tuesday"-> println("packed ${list.get(1)}")
            "wednesday"-> println("packed ${list.get(2)}")
            "thursday"-> println("packed ${list.get(3)}")
            "friday"-> println("packed ${list.get(4)}")
            else->{
                println("no school today")
            }

        }
    }

    fun cook()
    {
        val lunch= mutableListOf("pizza","burger","dal")
        val breakfast= mutableListOf("maggi","bread","cearls")
        println(" For breakfast ${breakfast.random()} will be cooked")
        println(" For lunch ${lunch.random()} will be cooked")
    }

    fun ironTheClothes(clothes:String)
    {
        println("$clothes are ironed")
    }


}