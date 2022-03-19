import javax.management.MBeanRegistration

fun main(){
    var toyota = Car("Toyota","Prado","KCT 138",0)
    println(toyota.registration)
    toyota.start()
    println(toyota.accelarete(50))
    println(toyota.accelarete(70))
    toyota.speed
    toyota.hoot()
    println(toyota.decelerate(50))
    println(toyota.stop())
    var nancy = student("nancy",30,"Anita B")
    var mery = student("MERY",20,"lISA lab")
    println(nancy.name)
    println(nancy.age)
    println(nancy.stream)

    println(mery.name)
    println(mery.age)
    println(mery.stream)



}
//A class has a name
//the body of a class is denoted by a pair of curly braces


class Car(var make:String,var model:String,var registration:String,var speed:Int){
    fun start(){
        println("chogio gio gio")
    }
    fun accelarete(acceleration:Int):Int{
        speed+=acceleration
       // println("current speed is $30")
        return speed
    }
    fun hoot(){
        println("peeeeeeeeb")
    }
    fun decelerate(deceleration:Int):Int{
        speed-=deceleration
        return speed
    }
    fun stop(){
       speed-=speed

    }



}
data class student(var name:String, val age:Int, var stream:String)

