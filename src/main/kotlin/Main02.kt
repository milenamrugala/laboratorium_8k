fun main() {
    val snake = Snake()
    val lion = Lion()
    val pig = Pig()

    println("The sounds of my animals are  1.${snake.speak()} 2.${lion.speak()} 3.${pig.speak()}")
    println("These animals eat - 1.${snake.eat()} 2.${lion.eat()} 3.${pig.eat()} ")

}