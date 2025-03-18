fun main(){
    println("Inserisci peso")
    val peso = readLine()?.toDouble()
    println("Inserisci altezza")
    val altezza = readLine()?.toDouble()
    if(peso!=null&&altezza!=null){
        val bmi = BMI(peso, altezza)
        val (bmiValue, categoria) = bmi.calculate()
        println("Il tuo BMI è: %.2f e sei $categoria".format(bmiValue))    }
}