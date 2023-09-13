import kotlin.math.pow
const val PI = 3.1416f
const val PHI = 1.618f

fun main( ) {
   
   //val coord1: Array<int> = arrayOf(4, 3)
   //val coord2: Array<int> = arrayOf(-3, -2)
    
   //val m = (y2 - y1) / (x2 - x1)
   
   //println(coord1[0])
   
   val radius = 4f
    val area = circleArea(radius)
    println("El area del circulo es $area")
    
   
}
fun circleArea(radius:Float): Float{
    return PI*radius.pow(2)
}
fun circleArea(radius:Float): Float{
    return PI*radius.pow(2)
}