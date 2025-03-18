class BMI(val weight: Double, val height: Double) {
     fun calculate(): Pair<Double, String>{
         val cal = weight / (Math.pow(height, 2.0))
         return Pair(cal, result(cal))
     }
    //--- Lambda function
    val result: (Double) -> String = {
        when {
            it < 18.5 -> "Sottopeso"
            it in 18.5..24.9 -> "Normopeso"
            it in 25.0..29.9 -> "Sovrappeso"
            it in 30.0..34.9 -> "Obesità I"
            it in 35.0..39.9 -> "Obesità II"
            it > 40 -> "Obesità III"
            else -> "Valore non valido"
        }
    }
}