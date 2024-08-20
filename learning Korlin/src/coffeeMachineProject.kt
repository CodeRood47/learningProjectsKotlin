package machine
// ingredients for coffee cups
val coffee = 15 // gram
val water = 200 // millilitre
val milk = 50 // millilitre


fun main() {
    print("Write how many cups of coffee you will need: > ")
    val input = readln().toInt()

    val cInCup = coffee * input
    val wInCup = water * input
    val mInCup = milk * input

    println("For $input cups of coffee you will need:\n" +
            "$wInCup ml of water\n" +
            "$mInCup ml of milk\n" +
            "$cInCup g of coffee beans")




    /*println("""Starting to make a coffee
Grinding coffee beans
Boiling water
Mixing boiled water with crushed coffee beans
Pouring coffee into the cup
Pouring some milk into the cup
Coffee is ready!""")*/
}