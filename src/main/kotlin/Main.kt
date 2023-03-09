fun main() {
    var vehicle = Car("BMW","X7","golden",4)

    vehicle.carry(10)

    vehicle.identify("brown","lamborghini","350 GT")
    vehicle.calculateParkingFees(3)

    var below = bus.maxTrip



}
open class Brand(var make: String,var model: String,var color: String,var capacity: Int){
    fun carry(people:Int){
        if (people==capacity){

            println("Carrying $people passengers")
        }
        else if (people>capacity)
            (println("Over capacity by $capacity people"))


    }
    fun identify(color: String,make: String,model: String){
        println("i am a $color $make $model")

    }
    fun calculateParkingFees(hours:Int):Int{
        var parkingFees = hours * 20
        return(parkingFees)


    }


}

class  Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x:Int =(people -capacity)
        if (people==capacity){

            println("Carrying $people passengers")
        }
        else if (people>capacity)
            (println("Over capacity by $x people"))


    }
    fun identify(color: String,make: String,model: String){
        println("i am a $color $make $model")

    }
   open fun calculateParkingFees(hours:Int):Int{
        var parkingFees = hours * 20
        return(parkingFees)


    }


}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var calc:Double = capacity*fare
        return (calc)

    }
    override fun calculateParkingFees(hours: Int):Int{
        var fee:Int = hours*capacity
        return (fee)
    }
}

