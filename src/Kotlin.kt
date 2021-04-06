fun main() {
numbers()
Names("Bilal","Aimal","Zahir","Kauthar")
Robot(5)
Robot(10)
Robot(15)
prime()


}
fun numbers(){
   for (y in 1..100){
   if (y%2!=0)
       println(y)

    }
}
fun Names(namei:String,nameii:String,nameiii:String,nameiv:String):Array<String> {
    var x = arrayOf(namei, nameii, nameiii,nameiv)
    for (b in x)
        if (b.length > 5) {
            println(b)
        }
    return x
}
fun Robot(age:Int) {
    if (age < 6) {
        println("Milk")
    } else if (age < 15 && age > 6) {
        println("Fanta")
    } else {
        println("Cocacola")
    }

}
fun prime() {
    for (h in 1..100){


    }
    for (h in 1..100) {
     if(h%3==0){
      println("fizz")
    }
    }
   for (h in 1..100) {
     if (h%5 ==0) {
    println("buzz")
   if (h%3==0  && h%5==0) {
     println("fizzbuzz")
     }
     }
}}