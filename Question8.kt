fun main() {
    for(i in 1..5){
        for(j in 5 downTo i step 1 )
            print("  ")
        for(k in 1..i)
            print("* ")
        println()

    }
}