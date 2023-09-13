import kotlin.math.pow
const val PI = 3.1416f
const val PHI = 1.618f

fun main( ) {
   
   //val coord1: Array<int> = arrayOf(4, 3)
   //val coord2: Array<int> = arrayOf(-3, -2)
   	val x1 = 4
    val y1 = 3
    val x2 = -3
    val y2 = -2
   	val m = (y2 - y1) / (x2 - x1)
   
   	println(m)
   
  	val radius = 4f
  	val area = circleArea(radius)
  	println("El area del circulo es $area")
   
   	val pi = getPI()
	println(pi)
    printPHI()
}

fun circleArea(radius:Float): Float{
    return PI*radius.pow(2)
}

fun getPI(): Float{
    return PI
}
fun printPHI(){
    println("El numero aureo vale $PHI")
}