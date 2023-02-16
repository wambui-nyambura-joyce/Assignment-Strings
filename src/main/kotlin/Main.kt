fun main() {
    val schoolName = "akirachix"
    println(schoolName[0])
    println(schoolName[2])
    println(schoolName[3])
    schoolName("Joyce" ,20)
    hobby("")
    nameword("Nyambura")
}
fun schoolName (name:String,age:Int) :String{
    val details="Hi,my name is $name and I am $age years old"
    return details
}
fun hobby(name: String) :Int {
    val name="I love singing"
    return name.length
}
fun nameword(name:String){
    if (name == "Nyambura"){
    println("That's me!") }
    else {
        println("I don't know who that is")

    }    }
