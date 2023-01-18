package backend.services

class Operation (private val a: Double, private val b: Double = 1.0) {

    fun sum() = if (a - a.toInt() == 0.0 && b - b.toInt() == 0.0) (a + b).toInt() else (a + b)

    fun multiply() = if (a - a.toInt() == 0.0 && b - b.toInt() == 0.0) (a * b).toInt() else (a * b)

    fun difference() = if (a - a.toInt() == 0.0 && b - b.toInt() == 0.0) (a - b).toInt() else (a - b)

    fun division() = if (a - a.toInt() == 0.0 && b - b.toInt() == 0.0) (a / b).toInt() else (a / b)

    fun sqrt() = kotlin.math.sqrt(a)

    fun square() = a * a

    fun reverse() = 1 / a
}
